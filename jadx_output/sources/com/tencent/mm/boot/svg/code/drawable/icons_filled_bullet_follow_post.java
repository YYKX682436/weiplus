package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_bullet_follow_post extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(34.89f, 43.794f);
            instancePath2.lineTo(24.9f, 43.794f);
            instancePath2.lineTo(24.9f, 53.784f);
            instancePath2.lineTo(18.042f, 53.784f);
            instancePath2.lineTo(18.042f, 43.794f);
            instancePath2.lineTo(8.052f, 43.794f);
            instancePath2.lineTo(8.052f, 36.99f);
            instancePath2.lineTo(18.042f, 36.99f);
            instancePath2.lineTo(18.042f, 27.0f);
            instancePath2.lineTo(24.9f, 27.0f);
            instancePath2.lineTo(24.9f, 36.99f);
            instancePath2.lineTo(34.89f, 36.99f);
            instancePath2.lineTo(34.89f, 43.794f);
            instancePath2.close();
            instancePath2.moveTo(50.94f, 24.48f);
            instancePath2.lineTo(43.26f, 29.94f);
            instancePath2.lineTo(39.0f, 23.7f);
            instancePath2.lineTo(51.66f, 14.28f);
            instancePath2.lineTo(58.8f, 14.28f);
            instancePath2.lineTo(58.8f, 57.0f);
            instancePath2.lineTo(50.94f, 57.0f);
            instancePath2.lineTo(50.94f, 24.48f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
