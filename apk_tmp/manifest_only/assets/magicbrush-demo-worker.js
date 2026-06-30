/**
 * Created by stevecai on 2026/3/19.
 * Worker Demo - Worker 线程脚本
 * 该文件通过 mb.Worker('magicbrush-demo-worker.js') 加载
 */

// Worker 中的离屏 canvas 和 context
var offscreenCanvas = null;
var ctx = null;

// 动画相关变量
var x = 0;
var y = 0;
var advanceX = 5;
var advanceY = 5;
var blockWidth = 100;
var blockHeight = 100;
var animationId = null;

// 绘制动画
function draw() {
    if (!ctx || !offscreenCanvas) return;

    ctx.fillStyle = 'blue';
    ctx.clearRect(0, 0, offscreenCanvas.width, offscreenCanvas.height);
    ctx.fillRect(x, y, blockWidth, blockHeight);

    // 边界检测
    x += advanceX;
    y += advanceY;
    if (x + blockWidth >= offscreenCanvas.width || x <= 0) {
        advanceX = -advanceX;
    }
    if (y + blockHeight >= offscreenCanvas.height || y <= 0) {
        advanceY = -advanceY;
    }

    animationId = requestAnimationFrame(draw);
}

// 初始化 canvas
function initCanvas(width, height) {
    if (offscreenCanvas) {
        offscreenCanvas.width = width;
        offscreenCanvas.height = height;
    }
}

// 监听主线程消息
globalThis.onmessage = function(e) {
    var data = e.data;

    switch (data.type) {
        case 'init':
            // 初始化：接收离屏 canvas
            offscreenCanvas = data.canvas;
            ctx = offscreenCanvas.getContext('2d');
            console.log('Worker: canvas received, width:', offscreenCanvas.width, 'height:', offscreenCanvas.height);
            draw();
            // 向主线程发送初始化完成消息
            globalThis.postMessage({ type: 'ready' });
            break;

        case 'resize':
            // 调整 canvas 尺寸
            if (offscreenCanvas) {
                offscreenCanvas.width = data.width;
                offscreenCanvas.height = data.height;
                console.log('Worker: canvas resized to', data.width, 'x', data.height);
            }
            break;

        case 'stop':
            // 停止动画
            if (animationId != null) {
                cancelAnimationFrame(animationId);
                animationId = null;
                console.log('Worker: animation stopped');
            }
            break;

        case 'changeColor':
            // 动态改变颜色（可选功能）
            ctx.fillStyle = data.color;
            break;

        default:
            console.log('Worker: unknown message type:', data.type);
    }
};

// Worker 初始化完成
console.log('Worker: script loaded');