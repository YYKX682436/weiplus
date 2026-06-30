package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class poi_navigation_ad_tips_arrow_down extends l95.c {
    private final int width = 10;
    private final int height = 5;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 10;
        }
        if (i17 == 1) {
            return 5;
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
            instancePaint3.setColor(1275068416);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(7.25801f, 1.02258f);
            instancePath.lineTo(7.69995f, 1.46452f);
            instancePath.lineTo(5.29208f, 3.8724f);
            instancePath.cubicTo(5.12953f, 4.03495f, 4.86742f, 4.03639f, 4.70342f, 3.8724f);
            instancePath.lineTo(2.29555f, 1.46452f);
            instancePath.lineTo(2.73749f, 1.02258f);
            instancePath.lineTo(4.99775f, 3.28284f);
            instancePath.lineTo(7.25801f, 1.02258f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
