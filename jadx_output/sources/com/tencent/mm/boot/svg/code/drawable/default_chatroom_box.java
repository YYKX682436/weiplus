package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_chatroom_box extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        l95.c.instanceMatrix(looper);
        l95.c.instanceMatrixArray(looper);
        android.graphics.Paint instancePaint = l95.c.instancePaint(looper);
        instancePaint.setFlags(385);
        instancePaint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint2 = l95.c.instancePaint(looper);
        instancePaint2.setFlags(385);
        instancePaint2.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint.setColor(-16777216);
        instancePaint2.setStrokeWidth(1.0f);
        instancePaint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint2.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint2.setStrokeMiter(4.0f);
        instancePaint2.setPathEffect(null);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-526345);
        instancePaint3.setColor(-526345);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.4855f, 0.0f);
        instancePath.lineTo(172.514f, 0.0f);
        instancePath.cubicTo(179.29f, 0.0f, 181.747f, 0.705475f, 184.224f, 2.03021f);
        instancePath.cubicTo(186.701f, 3.35494f, 188.645f, 5.29894f, 189.97f, 7.77597f);
        instancePath.cubicTo(191.295f, 10.253f, 192.0f, 12.71f, 192.0f, 19.4855f);
        instancePath.lineTo(192.0f, 172.514f);
        instancePath.cubicTo(192.0f, 179.29f, 191.295f, 181.747f, 189.97f, 184.224f);
        instancePath.cubicTo(188.645f, 186.701f, 186.701f, 188.645f, 184.224f, 189.97f);
        instancePath.cubicTo(181.747f, 191.295f, 179.29f, 192.0f, 172.514f, 192.0f);
        instancePath.lineTo(19.4855f, 192.0f);
        instancePath.cubicTo(12.71f, 192.0f, 10.253f, 191.295f, 7.77597f, 189.97f);
        instancePath.cubicTo(5.29894f, 188.645f, 3.35494f, 186.701f, 2.03021f, 184.224f);
        instancePath.cubicTo(0.705475f, 181.747f, 0.0f, 179.29f, 0.0f, 172.514f);
        instancePath.lineTo(0.0f, 19.4855f);
        instancePath.cubicTo(0.0f, 12.71f, 0.705475f, 10.253f, 2.03021f, 7.77597f);
        instancePath.cubicTo(3.35494f, 5.29894f, 5.29894f, 3.35494f, 7.77597f, 2.03021f);
        instancePath.cubicTo(10.253f, 0.705475f, 12.71f, 0.0f, 19.4855f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-352965);
        instancePaint4.setColor(-352965);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(96.0f, 138.667f);
        instancePath2.cubicTo(98.7863f, 138.667f, 101.523f, 138.485f, 104.194f, 138.135f);
        instancePath2.cubicTo(104.066f, 136.997f, 104.0f, 135.839f, 104.0f, 134.667f);
        instancePath2.cubicTo(104.0f, 117.73f, 117.73f, 104.0f, 134.667f, 104.0f);
        instancePath2.cubicTo(139.061f, 104.0f, 143.239f, 104.924f, 147.017f, 106.589f);
        instancePath2.cubicTo(148.523f, 102.396f, 149.333f, 97.945f, 149.333f, 93.3333f);
        instancePath2.cubicTo(149.333f, 68.2964f, 125.455f, 48.0f, 96.0f, 48.0f);
        instancePath2.cubicTo(66.5448f, 48.0f, 42.6666f, 68.2964f, 42.6666f, 93.3333f);
        instancePath2.cubicTo(42.6666f, 106.861f, 49.6373f, 119.004f, 60.692f, 127.311f);
        instancePath2.lineTo(59.0808f, 141.171f);
        instancePath2.cubicTo(58.9108f, 142.634f, 59.9588f, 143.958f, 61.4217f, 144.128f);
        instancePath2.cubicTo(61.922f, 144.186f, 62.4285f, 144.101f, 62.8826f, 143.884f);
        instancePath2.lineTo(78.7917f, 136.255f);
        instancePath2.cubicTo(84.1905f, 137.819f, 89.9787f, 138.667f, 96.0f, 138.667f);
        instancePath2.close();
        instancePath2.moveTo(134.667f, 157.333f);
        instancePath2.cubicTo(147.185f, 157.333f, 157.333f, 147.185f, 157.333f, 134.667f);
        instancePath2.cubicTo(157.333f, 122.148f, 147.185f, 112.0f, 134.667f, 112.0f);
        instancePath2.cubicTo(122.148f, 112.0f, 112.0f, 122.148f, 112.0f, 134.667f);
        instancePath2.cubicTo(112.0f, 147.185f, 122.148f, 157.333f, 134.667f, 157.333f);
        instancePath2.close();
        instancePath2.moveTo(148.0f, 137.867f);
        instancePath2.lineTo(148.0f, 131.467f);
        instancePath2.lineTo(121.333f, 131.467f);
        instancePath2.lineTo(121.333f, 137.867f);
        instancePath2.lineTo(148.0f, 137.867f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
