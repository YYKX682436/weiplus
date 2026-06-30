package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_profile_publish_article_icon extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePath.moveTo(2.5f, 3.36339f);
                instancePath.cubicTo(2.5f, 2.88655f, 2.89576f, 2.5f, 3.38396f, 2.5f);
                instancePath.lineTo(13.9915f, 2.5f);
                instancePath.cubicTo(14.4797f, 2.5f, 14.8754f, 2.88655f, 14.8754f, 3.36339f);
                instancePath.lineTo(14.8754f, 10.2705f);
                instancePath.lineTo(6.9198f, 18.041f);
                instancePath.lineTo(3.38396f, 18.041f);
                instancePath.cubicTo(2.89576f, 18.041f, 2.5f, 17.6544f, 2.5f, 17.1776f);
                instancePath.lineTo(2.5f, 3.36339f);
                instancePath.close();
                instancePath.moveTo(4.7099f, 5.02108f);
                instancePath.lineTo(10.0137f, 5.02108f);
                instancePath.lineTo(10.0137f, 6.31616f);
                instancePath.lineTo(4.7099f, 6.31616f);
                instancePath.lineTo(4.7099f, 5.02108f);
                instancePath.close();
                instancePath.moveTo(10.0137f, 7.62852f);
                instancePath.lineTo(4.7099f, 7.62852f);
                instancePath.lineTo(4.7099f, 8.92361f);
                instancePath.lineTo(10.0137f, 8.92361f);
                instancePath.lineTo(10.0137f, 7.62852f);
                instancePath.close();
                instancePath.moveTo(16.2947f, 10.8815f);
                instancePath.cubicTo(16.4567f, 10.7363f, 16.7086f, 10.747f, 16.8572f, 10.9053f);
                instancePath.lineTo(17.3953f, 11.4786f);
                instancePath.cubicTo(17.5439f, 11.6369f, 17.533f, 11.8829f, 17.3709f, 12.028f);
                instancePath.lineTo(11.8206f, 17.3775f);
                instancePath.lineTo(9.92815f, 18.3083f);
                instancePath.cubicTo(9.81031f, 18.3663f, 9.66668f, 18.32f, 9.60734f, 18.2049f);
                instancePath.cubicTo(9.56965f, 18.1318f, 9.57392f, 18.0448f, 9.61859f, 17.9755f);
                instancePath.lineTo(10.7444f, 16.2308f);
                instancePath.lineTo(16.2947f, 10.8815f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
