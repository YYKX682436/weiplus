package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_clip_slider_normal extends l95.c {
    private final int width = 24;
    private final int height = 150;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 150;
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
            instancePaint3.setColor(-1644826);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 150.0f);
            instancePath.lineTo(0.0f, 150.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(7.0f, 66.0f);
            instancePath2.lineTo(10.0f, 66.0f);
            instancePath2.lineTo(10.0f, 84.0f);
            instancePath2.lineTo(7.0f, 84.0f);
            instancePath2.lineTo(7.0f, 66.0f);
            instancePath2.close();
            instancePath2.moveTo(14.0f, 66.0f);
            instancePath2.lineTo(17.0f, 66.0f);
            instancePath2.lineTo(17.0f, 84.0f);
            instancePath2.lineTo(14.0f, 84.0f);
            instancePath2.lineTo(14.0f, 66.0f);
            instancePath2.close();
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
