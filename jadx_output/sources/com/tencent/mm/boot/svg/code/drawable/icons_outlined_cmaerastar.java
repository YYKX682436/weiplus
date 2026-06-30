package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_cmaerastar extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(18.7315f, 0.977695f);
                instancePath.lineTo(19.3938f, 2.60087f);
                instancePath.cubicTo(19.8073f, 3.61429f, 20.1638f, 4.22871f, 20.4435f, 4.53235f);
                instancePath.cubicTo(20.7197f, 4.83218f, 21.2774f, 5.21393f, 22.204f, 5.65942f);
                instancePath.lineTo(23.5449f, 6.30407f);
                instancePath.lineTo(22.2116f, 6.96432f);
                instancePath.cubicTo(21.2521f, 7.43953f, 20.6961f, 7.82088f, 20.4435f, 8.0951f);
                instancePath.cubicTo(20.1872f, 8.3733f, 19.8313f, 8.9859f, 19.3909f, 10.0336f);
                instancePath.lineTo(18.724f, 11.6204f);
                instancePath.lineTo(18.053f, 10.0353f);
                instancePath.cubicTo(17.606f, 8.97915f, 17.2503f, 8.36704f, 16.9997f, 8.0951f);
                instancePath.cubicTo(16.7529f, 7.82718f, 16.1974f, 7.44599f, 15.2298f, 6.96342f);
                instancePath.lineTo(13.9223f, 6.31139f);
                instancePath.lineTo(15.2317f, 5.66311f);
                instancePath.cubicTo(16.191f, 5.18812f, 16.7469f, 4.80676f, 16.9997f, 4.53235f);
                instancePath.cubicTo(17.2562f, 4.25397f, 17.6121f, 3.64135f, 18.0523f, 2.5939f);
                instancePath.lineTo(18.7315f, 0.977695f);
                instancePath.close();
                instancePath.moveTo(17.8986f, 5.3078f);
                instancePath.cubicTo(18.1729f, 5.0101f, 18.4453f, 4.60827f, 18.7183f, 4.11745f);
                instancePath.cubicTo(18.9877f, 4.59876f, 19.2629f, 4.99976f, 19.5466f, 5.3078f);
                instancePath.cubicTo(19.8659f, 5.65437f, 20.2938f, 5.98978f, 20.8128f, 6.31765f);
                instancePath.cubicTo(20.2837f, 6.65089f, 19.8547f, 6.9833f, 19.5466f, 7.31764f);
                instancePath.cubicTo(19.2706f, 7.61723f, 18.9964f, 8.02244f, 18.7215f, 8.51777f);
                instancePath.cubicTo(18.4457f, 8.01996f, 18.1721f, 7.61453f, 17.8986f, 7.31764f);
                instancePath.cubicTo(17.5916f, 6.98441f, 17.1589f, 6.65071f, 16.6228f, 6.31398f);
                instancePath.cubicTo(17.1562f, 5.97873f, 17.5886f, 5.64428f, 17.8986f, 5.3078f);
                instancePath.close();
                instancePath.moveTo(15.1484f, 4.22265f);
                instancePath.lineTo(15.2151f, 4.32273f);
                instancePath.cubicTo(14.8147f, 4.58436f, 14.3038f, 4.87741f, 13.6684f, 5.2f);
                instancePath.lineTo(9.64222f, 5.2f);
                instancePath.lineTo(7.64222f, 8.2f);
                instancePath.lineTo(3.2f, 8.2f);
                instancePath.lineTo(3.2f, 18.8f);
                instancePath.lineTo(20.8f, 18.8f);
                instancePath.lineTo(20.8f, 10.0267f);
                instancePath.cubicTo(21.051f, 9.58153f, 21.2704f, 9.2663f, 21.456f, 9.06489f);
                instancePath.cubicTo(21.5845f, 8.9254f, 21.764f, 8.76789f, 22.0f, 8.59313f);
                instancePath.lineTo(22.0f, 19.0f);
                instancePath.cubicTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f);
                instancePath.lineTo(3.0f, 20.0f);
                instancePath.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
                instancePath.lineTo(2.0f, 8.0f);
                instancePath.cubicTo(2.0f, 7.44772f, 2.44772f, 7.0f, 3.0f, 7.0f);
                instancePath.lineTo(7.0f, 7.0f);
                instancePath.lineTo(8.85157f, 4.22265f);
                instancePath.cubicTo(8.9443f, 4.08355f, 9.10042f, 4.0f, 9.26759f, 4.0f);
                instancePath.lineTo(14.7324f, 4.0f);
                instancePath.cubicTo(14.8996f, 4.0f, 15.0557f, 4.08355f, 15.1484f, 4.22265f);
                instancePath.close();
                instancePath.moveTo(16.0f, 13.0f);
                instancePath.cubicTo(16.0f, 15.2091f, 14.2091f, 17.0f, 12.0f, 17.0f);
                instancePath.cubicTo(9.79086f, 17.0f, 8.0f, 15.2091f, 8.0f, 13.0f);
                instancePath.cubicTo(8.0f, 10.7909f, 9.79086f, 9.0f, 12.0f, 9.0f);
                instancePath.cubicTo(14.2091f, 9.0f, 16.0f, 10.7909f, 16.0f, 13.0f);
                instancePath.close();
                instancePath.moveTo(14.8f, 13.0f);
                instancePath.cubicTo(14.8f, 14.5464f, 13.5464f, 15.8f, 12.0f, 15.8f);
                instancePath.cubicTo(10.4536f, 15.8f, 9.2f, 14.5464f, 9.2f, 13.0f);
                instancePath.cubicTo(9.2f, 11.4536f, 10.4536f, 10.2f, 12.0f, 10.2f);
                instancePath.cubicTo(13.5464f, 10.2f, 14.8f, 11.4536f, 14.8f, 13.0f);
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
