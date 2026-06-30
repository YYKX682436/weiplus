package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class favorites_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePath.moveTo(20.1991f, 6.40021f);
                instancePath.lineTo(12.0f, 11.134f);
                instancePath.lineTo(3.80086f, 6.4002f);
                instancePath.cubicTo(3.80086f, 6.4002f, 8.85382f, 3.50937f, 11.137f, 2.20425f);
                instancePath.cubicTo(11.6136f, 1.93182f, 12.3867f, 1.93202f, 12.863f, 2.20425f);
                instancePath.cubicTo(15.0845f, 3.4741f, 20.1991f, 6.40021f, 20.1991f, 6.40021f);
                instancePath.close();
                instancePath.moveTo(20.9896f, 7.67586f);
                instancePath.cubicTo(20.9896f, 7.67586f, 20.9896f, 13.5f, 21.0f, 16.1673f);
                instancePath.cubicTo(21.0f, 16.707f, 20.6133f, 17.3656f, 20.137f, 17.6378f);
                instancePath.cubicTo(17.7706f, 18.9905f, 12.75f, 21.8529f, 12.75f, 21.8529f);
                instancePath.lineTo(12.75f, 12.433f);
                instancePath.lineTo(20.9896f, 7.67586f);
                instancePath.close();
                instancePath.moveTo(11.25f, 21.8529f);
                instancePath.cubicTo(11.25f, 21.8529f, 6.27728f, 18.9727f, 3.86296f, 17.6378f);
                instancePath.cubicTo(3.38636f, 17.3654f, 3.0f, 16.7024f, 3.0f, 16.1673f);
                instancePath.cubicTo(3.0f, 13.4078f, 3.01026f, 7.6758f, 3.01026f, 7.6758f);
                instancePath.lineTo(11.25f, 12.433f);
                instancePath.lineTo(11.25f, 21.8529f);
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
