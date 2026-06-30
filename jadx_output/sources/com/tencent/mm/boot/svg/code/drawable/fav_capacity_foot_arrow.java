package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_capacity_foot_arrow extends l95.c {
    private final int width = 24;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 30;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(22.0f, 14.999688f);
            instancePath.lineTo(7.130435f, 29.999374f);
            instancePath.lineTo(3.826087f, 26.666111f);
            instancePath.lineTo(15.391304f, 14.999688f);
            instancePath.lineTo(3.0f, 3.3332639f);
            instancePath.lineTo(6.304348f, 0.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(24.0f, 0.0f);
            instancePath2.lineTo(24.0f, 30.0f);
            instancePath2.lineTo(0.0f, 30.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            l95.c.done(looper);
        }
        return 0;
    }
}
