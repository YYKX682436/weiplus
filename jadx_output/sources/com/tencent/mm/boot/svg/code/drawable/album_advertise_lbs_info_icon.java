package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_advertise_lbs_info_icon extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(5.9998f, 2.92505f);
                instancePath.cubicTo(4.85381f, 2.92505f, 3.9248f, 3.85406f, 3.9248f, 5.00005f);
                instancePath.cubicTo(3.9248f, 6.14604f, 4.85381f, 7.07505f, 5.9998f, 7.07505f);
                instancePath.cubicTo(7.1458f, 7.07505f, 8.0748f, 6.14604f, 8.0748f, 5.00005f);
                instancePath.cubicTo(8.0748f, 3.85406f, 7.1458f, 2.92505f, 5.9998f, 2.92505f);
                instancePath.close();
                instancePath.moveTo(4.6748f, 5.00005f);
                instancePath.cubicTo(4.6748f, 4.26827f, 5.26803f, 3.67505f, 5.9998f, 3.67505f);
                instancePath.cubicTo(6.73158f, 3.67505f, 7.3248f, 4.26827f, 7.3248f, 5.00005f);
                instancePath.cubicTo(7.3248f, 5.73183f, 6.73158f, 6.32505f, 5.9998f, 6.32505f);
                instancePath.cubicTo(5.26803f, 6.32505f, 4.6748f, 5.73183f, 4.6748f, 5.00005f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(6.41552f, 11.1261f);
                instancePath2.lineTo(6.17568f, 10.8378f);
                instancePath2.cubicTo(6.41552f, 11.1261f, 6.41552f, 11.1261f, 6.41552f, 11.1261f);
                instancePath2.lineTo(6.41596f, 11.1257f);
                instancePath2.lineTo(6.41671f, 11.1251f);
                instancePath2.lineTo(6.41918f, 11.123f);
                instancePath2.lineTo(6.42787f, 11.1157f);
                instancePath2.cubicTo(6.4353f, 11.1094f, 6.44598f, 11.1004f, 6.45969f, 11.0886f);
                instancePath2.cubicTo(6.48709f, 11.065f, 6.52663f, 11.0307f, 6.57656f, 10.9862f);
                instancePath2.cubicTo(6.67638f, 10.8972f, 6.81795f, 10.7678f, 6.98734f, 10.6036f);
                instancePath2.cubicTo(7.32567f, 10.2756f, 7.77739f, 9.80677f, 8.23004f, 9.24356f);
                instancePath2.cubicTo(9.12168f, 8.13415f, 10.0748f, 6.58815f, 10.0748f, 5.00005f);
                instancePath2.cubicTo(10.0748f, 3.87487f, 9.61828f, 2.85561f, 8.88126f, 2.11859f);
                instancePath2.cubicTo(8.14425f, 1.38157f, 7.12498f, 0.925049f, 5.9998f, 0.925049f);
                instancePath2.cubicTo(4.87463f, 0.925049f, 3.85536f, 1.38157f, 3.11834f, 2.11859f);
                instancePath2.cubicTo(2.38133f, 2.85561f, 1.9248f, 3.87487f, 1.9248f, 5.00005f);
                instancePath2.cubicTo(1.9248f, 6.58976f, 2.87888f, 8.13607f, 3.81923f, 9.25047f);
                instancePath2.cubicTo(4.29591f, 9.81538f, 4.78452f, 10.2876f, 5.17995f, 10.621f);
                instancePath2.cubicTo(5.37723f, 10.7873f, 5.55573f, 10.9229f, 5.70154f, 11.0191f);
                instancePath2.cubicTo(5.77386f, 11.0669f, 5.84423f, 11.109f, 5.90878f, 11.1407f);
                instancePath2.cubicTo(5.95468f, 11.1633f, 6.05853f, 11.2128f, 6.17568f, 11.2128f);
                instancePath2.lineTo(6.31128f, 11.2128f);
                instancePath2.lineTo(6.41552f, 11.1261f);
                instancePath2.close();
                instancePath2.moveTo(3.64867f, 2.64892f);
                instancePath2.cubicTo(4.25079f, 2.0468f, 5.08153f, 1.67505f, 5.9998f, 1.67505f);
                instancePath2.cubicTo(6.91808f, 1.67505f, 7.74882f, 2.0468f, 8.35093f, 2.64892f);
                instancePath2.cubicTo(8.95305f, 3.25104f, 9.3248f, 4.08177f, 9.3248f, 5.00005f);
                instancePath2.cubicTo(9.3248f, 6.31781f, 8.51587f, 7.6907f, 7.64545f, 8.77372f);
                instancePath2.cubicTo(7.21707f, 9.30672f, 6.78776f, 9.75249f, 6.46532f, 10.0651f);
                instancePath2.cubicTo(6.32455f, 10.2015f, 6.20461f, 10.3121f, 6.11459f, 10.3931f);
                instancePath2.cubicTo(6.00036f, 10.3177f, 5.8459f, 10.2015f, 5.66341f, 10.0476f);
                instancePath2.cubicTo(5.29914f, 9.74049f, 4.84076f, 9.29811f, 4.39244f, 8.7668f);
                instancePath2.cubicTo(3.48279f, 7.68879f, 2.6748f, 6.3162f, 2.6748f, 5.00005f);
                instancePath2.cubicTo(2.6748f, 4.08177f, 3.04656f, 3.25104f, 3.64867f, 2.64892f);
                instancePath2.close();
                instancePath2.moveTo(6.25254f, 10.4737f);
                instancePath2.cubicTo(6.25681f, 10.4751f, 6.25919f, 10.4762f, 6.25919f, 10.4762f);
                instancePath2.cubicTo(6.25919f, 10.4762f, 6.25714f, 10.4757f, 6.25254f, 10.4737f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
