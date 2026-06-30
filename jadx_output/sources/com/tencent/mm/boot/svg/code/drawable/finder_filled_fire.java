package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_filled_fire extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(11.875f, 21.5f);
            instancePath.cubicTo(16.224243f, 21.5f, 19.75f, 18.477922f, 19.75f, 14.75f);
            instancePath.cubicTo(19.75f, 12.579542f, 18.554852f, 10.648348f, 16.69787f, 9.413545f);
            instancePath.cubicTo(16.3116f, 11.465161f, 15.224228f, 12.390485f, 14.618286f, 12.736572f);
            instancePath.cubicTo(17.311035f, 5.655957f, 11.27872f, 2.0f, 10.050639f, 2.0f);
            instancePath.cubicTo(11.5f, 5.9606447f, 7.5165544f, 8.84056f, 6.077288f, 10.181915f);
            instancePath.cubicTo(4.7875156f, 11.383947f, 4.0f, 12.988145f, 4.0f, 14.75f);
            instancePath.cubicTo(4.0f, 18.477922f, 7.525758f, 21.5f, 11.875f, 21.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2565928);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(24.0f, 0.0f);
            instancePath2.lineTo(24.0f, 24.0f);
            instancePath2.lineTo(0.0f, 24.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint4, looper));
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
