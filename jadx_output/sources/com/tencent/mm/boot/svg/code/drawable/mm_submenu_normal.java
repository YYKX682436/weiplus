package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mm_submenu_normal extends l95.c {
    private final int width = 18;
    private final int height = 38;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 18;
        }
        if (i17 == 1) {
            return 38;
        }
        if (i17 == 2) {
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-6710887);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(6.0f, 0.0f);
            instancePath.cubicTo(10.03f, 6.2841287f, 13.99f, 12.663152f, 18.0f, 19.0f);
            instancePath.cubicTo(13.97f, 25.305216f, 10.03f, 31.673697f, 6.0f, 38.0f);
            instancePath.lineTo(0.0f, 38.0f);
            instancePath.cubicTo(3.97f, 31.642065f, 8.0f, 25.326303f, 12.0f, 19.0f);
            instancePath.cubicTo(8.01f, 12.673696f, 4.04f, 6.336848f, 0.0f, 0.0f);
            instancePath.lineTo(6.0f, 0.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
