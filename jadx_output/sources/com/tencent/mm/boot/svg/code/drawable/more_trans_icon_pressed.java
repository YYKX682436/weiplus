package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class more_trans_icon_pressed extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePath.moveTo(51.0113f, 20.9941f);
                instancePath.cubicTo(51.802f, 20.9941f, 52.5607f, 21.3063f, 53.1225f, 21.8627f);
                instancePath.lineTo(74.6364f, 43.1725f);
                instancePath.cubicTo(75.723f, 44.2487f, 75.8143f, 45.95f, 74.9048f, 47.1312f);
                instancePath.lineTo(74.6364f, 47.4353f);
                instancePath.lineTo(53.1225f, 68.745f);
                instancePath.cubicTo(51.9453f, 69.911f, 50.0459f, 69.9019f, 48.8799f, 68.7248f);
                instancePath.cubicTo(48.3235f, 68.163f, 48.0113f, 67.4043f, 48.0113f, 66.6136f);
                instancePath.lineTo(48.0113f, 56.7648f);
                instancePath.cubicTo(40.9954f, 57.3287f, 30.7551f, 61.4741f, 25.4278f, 74.4655f);
                instancePath.cubicTo(24.5427f, 76.6239f, 22.3715f, 76.6053f, 21.899f, 73.8077f);
                instancePath.cubicTo(18.1595f, 51.6684f, 30.7551f, 36.6444f, 48.0113f, 33.9252f);
                instancePath.lineTo(48.0113f, 23.9941f);
                instancePath.cubicTo(48.0113f, 22.3373f, 49.3544f, 20.9941f, 51.0113f, 20.9941f);
                instancePath.close();
                instancePath.moveTo(51.6092f, 25.4341f);
                instancePath.lineTo(51.6113f, 37.0023f);
                instancePath.lineTo(48.5717f, 37.4813f);
                instancePath.cubicTo(34.095f, 39.7626f, 24.6432f, 51.0402f, 24.8504f, 66.7583f);
                instancePath.lineTo(24.8702f, 67.6201f);
                instancePath.cubicTo(29.6516f, 59.7813f, 37.6764f, 54.27f, 46.8655f, 53.258f);
                instancePath.lineTo(51.6113f, 52.8638f);
                instancePath.lineTo(51.6092f, 65.1721f);
                instancePath.lineTo(71.6732f, 45.3031f);
                instancePath.lineTo(51.6092f, 25.4341f);
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
