package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_bubble_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePath.moveTo(18.0f, 13.6504f);
            instancePath.cubicTo(20.5373f, 13.6505f, 22.7666f, 15.417f, 22.7666f, 17.792f);
            instancePath.cubicTo(22.7664f, 20.1668f, 20.5372f, 21.9334f, 18.0f, 21.9336f);
            instancePath.cubicTo(17.5572f, 21.9336f, 17.1274f, 21.8779f, 16.7188f, 21.7793f);
            instancePath.lineTo(15.6719f, 22.2822f);
            instancePath.cubicTo(15.5343f, 22.3481f, 15.38f, 22.3741f, 15.2285f, 22.3564f);
            instancePath.cubicTo(14.7855f, 22.3046f, 14.4682f, 21.9031f, 14.5195f, 21.46f);
            instancePath.lineTo(14.6074f, 20.7012f);
            instancePath.cubicTo(13.7725f, 19.966f, 13.2335f, 18.9443f, 13.2334f, 17.792f);
            instancePath.cubicTo(13.2334f, 15.417f, 15.4627f, 13.6505f, 18.0f, 13.6504f);
            instancePath.close();
            instancePath.moveTo(18.0f, 14.8496f);
            instancePath.cubicTo(15.9352f, 14.8498f, 14.4326f, 16.2552f, 14.4326f, 17.792f);
            instancePath.cubicTo(14.4327f, 18.6311f, 14.8643f, 19.4127f, 15.6016f, 19.9668f);
            instancePath.lineTo(15.877f, 20.1729f);
            instancePath.lineTo(15.8369f, 20.5156f);
            instancePath.lineTo(15.793f, 20.8926f);
            instancePath.lineTo(16.3955f, 20.6035f);
            instancePath.lineTo(16.6025f, 20.5049f);
            instancePath.lineTo(16.8223f, 20.5684f);
            instancePath.cubicTo(17.1896f, 20.6747f, 17.5861f, 20.7334f, 18.0f, 20.7334f);
            instancePath.cubicTo(20.0646f, 20.7333f, 21.5662f, 19.3287f, 21.5664f, 17.792f);
            instancePath.cubicTo(21.5664f, 16.2552f, 20.0648f, 14.8498f, 18.0f, 14.8496f);
            instancePath.close();
            instancePath.moveTo(20.5498f, 3.39941f);
            instancePath.cubicTo(21.0745f, 3.39941f, 21.5f, 3.82592f, 21.5f, 4.35059f);
            instancePath.lineTo(21.5f, 12.001f);
            instancePath.lineTo(20.3604f, 12.001f);
            instancePath.lineTo(20.3604f, 4.54004f);
            instancePath.lineTo(3.63965f, 4.54004f);
            instancePath.lineTo(3.63965f, 17.46f);
            instancePath.lineTo(11.0f, 17.46f);
            instancePath.lineTo(11.0f, 18.6006f);
            instancePath.lineTo(3.4502f, 18.6006f);
            instancePath.cubicTo(2.92569f, 18.6006f, 2.50026f, 18.1748f, 2.5f, 17.6504f);
            instancePath.lineTo(2.5f, 4.35059f);
            instancePath.cubicTo(2.5f, 3.82592f, 2.92552f, 3.39941f, 3.4502f, 3.39941f);
            instancePath.lineTo(20.5498f, 3.39941f);
            instancePath.close();
            instancePath.moveTo(9.94238f, 7.2002f);
            instancePath.cubicTo(10.0742f, 7.20022f, 10.2061f, 7.2267f, 10.3379f, 7.30566f);
            instancePath.lineTo(15.8838f, 10.501f);
            instancePath.cubicTo(16.2533f, 10.7123f, 16.385f, 11.2144f, 16.1738f, 11.584f);
            instancePath.cubicTo(16.0948f, 11.7155f, 16.0155f, 11.795f, 15.8838f, 11.874f);
            instancePath.lineTo(10.3379f, 15.0693f);
            instancePath.cubicTo(9.96838f, 15.28f, 9.46711f, 15.1475f, 9.25586f, 14.7783f);
            instancePath.cubicTo(9.17683f, 14.6466f, 9.1505f, 14.5145f, 9.15039f, 14.3828f);
            instancePath.lineTo(9.15039f, 7.99219f);
            instancePath.cubicTo(9.15057f, 7.54348f, 9.49358f, 7.2002f, 9.94238f, 7.2002f);
            instancePath.close();
            instancePath.moveTo(10.29f, 13.7812f);
            instancePath.lineTo(14.792f, 11.1875f);
            instancePath.lineTo(10.29f, 8.59375f);
            instancePath.lineTo(10.29f, 13.7812f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
