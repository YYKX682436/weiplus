package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_outlined_tag extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(30.6f, 10.5f);
        instancePath.lineTo(28.835f, 25.499f);
        instancePath.lineTo(42.635f, 25.499f);
        instancePath.lineTo(44.4f, 10.5f);
        instancePath.lineTo(48.0f, 10.5f);
        instancePath.lineTo(46.235f, 25.499f);
        instancePath.lineTo(60.0f, 25.5f);
        instancePath.lineTo(60.0f, 29.1f);
        instancePath.lineTo(45.812f, 29.099f);
        instancePath.lineTo(44.188f, 42.899f);
        instancePath.lineTo(60.0f, 42.9f);
        instancePath.lineTo(60.0f, 46.5f);
        instancePath.lineTo(43.765f, 46.499f);
        instancePath.lineTo(42.0f, 61.5f);
        instancePath.lineTo(38.4f, 61.5f);
        instancePath.lineTo(40.165f, 46.499f);
        instancePath.lineTo(26.365f, 46.499f);
        instancePath.lineTo(24.6f, 61.5f);
        instancePath.lineTo(21.0f, 61.5f);
        instancePath.lineTo(22.765f, 46.499f);
        instancePath.lineTo(9.0f, 46.5f);
        instancePath.lineTo(9.0f, 42.9f);
        instancePath.lineTo(23.188f, 42.899f);
        instancePath.lineTo(24.812f, 29.099f);
        instancePath.lineTo(9.0f, 29.1f);
        instancePath.lineTo(9.0f, 25.5f);
        instancePath.lineTo(25.235f, 25.499f);
        instancePath.lineTo(27.0f, 10.5f);
        instancePath.lineTo(30.6f, 10.5f);
        instancePath.close();
        instancePath.moveTo(40.588f, 42.899f);
        instancePath.lineTo(42.212f, 29.099f);
        instancePath.lineTo(28.412f, 29.099f);
        instancePath.lineTo(26.788f, 42.899f);
        instancePath.lineTo(40.588f, 42.899f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
