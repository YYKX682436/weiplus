package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_task_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.3332f, 12.6308f);
            instancePath.cubicTo(12.2266f, 12.6582f, 12.1149f, 12.6728f, 11.9998f, 12.6728f);
            instancePath.lineTo(3.6665f, 12.6728f);
            instancePath.lineTo(3.6665f, 13.6666f);
            instancePath.lineTo(11.9998f, 13.6666f);
            instancePath.cubicTo(12.1839f, 13.6666f, 12.3332f, 13.5173f, 12.3332f, 13.3333f);
            instancePath.lineTo(12.3332f, 12.6308f);
            instancePath.close();
            instancePath.moveTo(2.6665f, 1.33325f);
            instancePath.lineTo(11.9998f, 1.33325f);
            instancePath.cubicTo(12.7362f, 1.33325f, 13.3332f, 1.93021f, 13.3332f, 2.66659f);
            instancePath.lineTo(13.3332f, 13.3333f);
            instancePath.cubicTo(13.3332f, 14.0696f, 12.7362f, 14.6666f, 11.9998f, 14.6666f);
            instancePath.lineTo(2.6665f, 14.6666f);
            instancePath.lineTo(2.6665f, 1.33325f);
            instancePath.close();
            instancePath.moveTo(4.6665f, 2.33325f);
            instancePath.lineTo(4.6665f, 11.6666f);
            instancePath.lineTo(5.6665f, 11.6666f);
            instancePath.lineTo(5.6665f, 2.33325f);
            instancePath.lineTo(4.6665f, 2.33325f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
