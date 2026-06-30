package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ipcall_conpous_bg extends l95.c {
    private final int width = com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX;
    private final int height = 384;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX;
        }
        if (i17 == 1) {
            return 384;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -638.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(1080.0f, 0.0f);
        instancePath.lineTo(1080.0f, 384.0f);
        instancePath.lineTo(0.0f, 384.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(700.6798f, 213.73169f);
        instancePath2.cubicTo(697.973f, 173.42755f, 710.4088f, 134.17123f, 738.70874f, 105.26089f);
        instancePath2.cubicTo(796.09906f, 46.63267f, 896.9981f, 52.75353f, 964.07306f, 118.932205f);
        instancePath2.cubicTo(1031.1481f, 185.11089f, 1038.999f, 286.28687f, 981.6087f, 344.91507f);
        instancePath2.cubicTo(950.7191f, 376.47092f, 907.22516f, 389.26904f, 863.185f, 384.04095f);
        instancePath2.cubicTo(858.7008f, 393.6198f, 852.6391f, 402.50076f, 844.97217f, 410.33347f);
        instancePath2.cubicTo(803.2441f, 452.9637f, 729.76733f, 448.40085f, 680.8573f, 400.142f);
        instancePath2.cubicTo(631.94727f, 351.88315f, 626.1251f, 278.20294f, 667.8532f, 235.5727f);
        instancePath2.cubicTo(677.36743f, 225.85278f, 688.53217f, 218.58626f, 700.6798f, 213.73169f);
        instancePath2.close();
        instancePath2.moveTo(700.6798f, 213.73169f);
        instancePath2.cubicTo(703.4623f, 255.16158f, 722.245f, 297.69867f, 756.2444f, 331.24374f);
        instancePath2.cubicTo(787.21716f, 361.80264f, 825.4021f, 379.55566f, 863.185f, 384.04095f);
        instancePath2.cubicTo(883.1062f, 341.486f, 871.8916f, 285.15613f, 831.9681f, 245.76416f);
        instancePath2.cubicTo(794.2098f, 208.50858f, 741.8103f, 197.29474f, 700.6798f, 213.73169f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 7, 31);
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
