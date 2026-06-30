package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_poi_more extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            instancePaint3.setColor(-2565928);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
            canvas.restore();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2565928);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(72.0f, 0.0f);
            instancePath2.lineTo(72.0f, 72.0f);
            instancePath2.lineTo(0.0f, 72.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint4, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(18.0f, 18.0f);
            instancePath3.lineTo(54.0f, 18.0f);
            instancePath3.lineTo(54.0f, 24.0f);
            instancePath3.lineTo(18.0f, 24.0f);
            instancePath3.lineTo(18.0f, 18.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-16777216);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(18.0f, 33.0f);
            instancePath4.lineTo(54.0f, 33.0f);
            instancePath4.lineTo(54.0f, 39.0f);
            instancePath4.lineTo(18.0f, 39.0f);
            instancePath4.lineTo(18.0f, 33.0f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint6);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
            instancePaint7.setColor(-16777216);
            android.graphics.Path instancePath5 = l95.c.instancePath(looper);
            instancePath5.moveTo(18.0f, 48.0f);
            instancePath5.lineTo(54.0f, 48.0f);
            instancePath5.lineTo(54.0f, 54.0f);
            instancePath5.lineTo(18.0f, 54.0f);
            instancePath5.lineTo(18.0f, 48.0f);
            instancePath5.close();
            canvas.drawPath(instancePath5, instancePaint7);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
