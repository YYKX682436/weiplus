package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio_panel_default_cover extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
            instancePaint3.setColor(134217727);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(60.0f, 0.0f);
            instancePath.lineTo(60.0f, 60.0f);
            instancePath.lineTo(0.0f, 60.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(1291845631);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(30.8152f, 20.5527f);
            instancePath2.cubicTo(30.263f, 20.5527f, 29.8152f, 21.0004f, 29.8152f, 21.5527f);
            instancePath2.lineTo(29.8152f, 31.88f);
            instancePath2.lineTo(29.8123f, 32.3254f);
            instancePath2.cubicTo(29.8123f, 33.479f, 29.4739f, 33.6789f, 28.1667f, 33.7836f);
            instancePath2.cubicTo(27.7108f, 33.8201f, 27.2323f, 33.8384f, 26.7544f, 33.9664f);
            instancePath2.cubicTo(24.4872f, 34.5739f, 23.0368f, 36.513f, 23.515f, 38.2974f);
            instancePath2.cubicTo(23.9931f, 40.0819f, 26.2187f, 41.036f, 28.4859f, 40.4285f);
            instancePath2.cubicTo(30.4959f, 39.8899f, 31.8639f, 38.3048f, 31.8152f, 36.7087f);
            instancePath2.lineTo(31.8152f, 25.9899f);
            instancePath2.cubicTo(31.8152f, 25.877f, 31.9086f, 25.7858f, 32.0212f, 25.7945f);
            instancePath2.cubicTo(32.6402f, 25.8421f, 33.4846f, 26.0437f, 34.0985f, 26.8458f);
            instancePath2.cubicTo(34.7075f, 27.6416f, 34.6671f, 28.4165f, 34.6282f, 29.1646f);
            instancePath2.cubicTo(34.6217f, 29.2885f, 34.6153f, 29.4117f, 34.6119f, 29.5341f);
            instancePath2.cubicTo(34.6097f, 29.6104f, 34.6899f, 29.6568f, 34.7495f, 29.6091f);
            instancePath2.cubicTo(35.5639f, 28.9584f, 36.3519f, 26.6377f, 35.4679f, 24.7156f);
            instancePath2.cubicTo(34.6881f, 23.02f, 33.1267f, 22.2949f, 32.1403f, 21.9853f);
            instancePath2.cubicTo(31.9497f, 21.9255f, 31.8152f, 21.7524f, 31.8152f, 21.5527f);
            instancePath2.lineTo(31.8152f, 21.5527f);
            instancePath2.cubicTo(31.8152f, 21.0004f, 31.3675f, 20.5527f, 30.8152f, 20.5527f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
