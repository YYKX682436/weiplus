package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_note extends l95.c {
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
                instancePaint3.setColor(-15432210);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.199f, 6.40021f);
                instancePath.lineTo(11.9999f, 11.134f);
                instancePath.lineTo(3.80078f, 6.4002f);
                instancePath.cubicTo(3.82129f, 6.38682f, 3.842f, 6.37414f, 3.86288f, 6.36221f);
                instancePath.lineTo(11.137f, 2.20425f);
                instancePath.cubicTo(11.6136f, 1.93182f, 12.3866f, 1.93202f, 12.8629f, 2.20425f);
                instancePath.lineTo(20.137f, 6.36221f);
                instancePath.cubicTo(20.1578f, 6.37414f, 20.1785f, 6.38682f, 20.199f, 6.40021f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-372399);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(20.9896f, 7.67578f);
                instancePath2.cubicTo(20.9965f, 7.72894f, 21.0f, 7.78138f, 21.0f, 7.83264f);
                instancePath2.lineTo(21.0f, 16.1672f);
                instancePath2.cubicTo(21.0f, 16.7069f, 20.6133f, 17.3655f, 20.137f, 17.6377f);
                instancePath2.lineTo(12.863f, 21.7957f);
                instancePath2.cubicTo(12.8269f, 21.8163f, 12.7892f, 21.8353f, 12.75f, 21.8528f);
                instancePath2.lineTo(12.75f, 12.4329f);
                instancePath2.lineTo(20.9896f, 7.67578f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-15616);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(11.25f, 21.8529f);
                instancePath3.cubicTo(11.2108f, 21.8354f, 11.1731f, 21.8163f, 11.137f, 21.7957f);
                instancePath3.lineTo(3.86296f, 17.6378f);
                instancePath3.cubicTo(3.38636f, 17.3654f, 3.0f, 16.7024f, 3.0f, 16.1673f);
                instancePath3.lineTo(3.0f, 7.83271f);
                instancePath3.cubicTo(3.0f, 7.78133f, 3.0035f, 7.72888f, 3.01026f, 7.67578f);
                instancePath3.lineTo(11.25f, 12.433f);
                instancePath3.lineTo(11.25f, 21.8529f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
