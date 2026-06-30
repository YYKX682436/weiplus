package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class arrow_heavy_large extends l95.c {
    private final int width = 48;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 48;
        }
        if (i17 == 1) {
            return 24;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(26.1584f, 17.574f);
            instancePath.cubicTo(24.4325f, 18.142f, 22.5698f, 18.142f, 20.8439f, 17.574f);
            instancePath.lineTo(2.96989f, 11.6912f);
            instancePath.cubicTo(1.6585f, 11.2596f, 0.944752f, 9.84636f, 1.37614f, 8.53495f);
            instancePath.cubicTo(1.78085f, 7.30528f, 3.04869f, 6.60108f, 4.2863f, 6.87382f);
            instancePath.lineTo(4.53239f, 6.94121f);
            instancePath.lineTo(22.4074f, 12.824f);
            instancePath.cubicTo(23.1179f, 13.0578f, 23.8844f, 13.0578f, 24.5949f, 12.824f);
            instancePath.lineTo(42.4699f, 6.94121f);
            instancePath.cubicTo(43.7813f, 6.50982f, 45.1945f, 7.22357f, 45.6261f, 8.53496f);
            instancePath.cubicTo(46.0575f, 9.84637f, 45.3438f, 11.2596f, 44.0324f, 11.6912f);
            instancePath.lineTo(26.1584f, 17.574f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
