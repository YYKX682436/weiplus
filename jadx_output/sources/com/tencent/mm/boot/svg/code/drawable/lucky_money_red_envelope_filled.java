package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_red_envelope_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(20.25f, 13.1272f);
        instancePath.lineTo(18.0467f, 13.1272f);
        instancePath.cubicTo(18.2028f, 12.8162f, 18.2907f, 12.4647f, 18.2907f, 12.092f);
        instancePath.cubicTo(18.2907f, 10.8213f, 17.2681f, 9.7949f, 16.0111f, 9.7949f);
        instancePath.cubicTo(15.3886f, 9.7949f, 14.804f, 10.0487f, 14.3776f, 10.4898f);
        instancePath.cubicTo(13.0888f, 11.7836f, 12.5097f, 12.3653f, 12.0f, 12.8769f);
        instancePath.lineTo(9.57089f, 10.4384f);
        instancePath.cubicTo(9.14049f, 10.0246f, 8.5817f, 9.7949f, 7.98911f, 9.7949f);
        instancePath.cubicTo(6.73209f, 9.7949f, 5.70929f, 10.8213f, 5.70929f, 12.092f);
        instancePath.cubicTo(5.70929f, 12.4647f, 5.79742f, 12.8162f, 5.95337f, 13.1272f);
        instancePath.lineTo(3.75002f, 13.1272f);
        instancePath.lineTo(3.75002f, 4.44942f);
        instancePath.cubicTo(3.75002f, 3.86798f, 4.15447f, 3.1843f, 4.6718f, 2.92677f);
        instancePath.cubicTo(4.6718f, 2.92677f, 4.71486f, 2.9028f, 4.8533f, 2.84379f);
        instancePath.cubicTo(6.7834f, 2.02059f, 9.27289f, 1.5f, 12.0f, 1.5f);
        instancePath.cubicTo(14.7237f, 1.5f, 17.2172f, 2.00236f, 19.1393f, 2.84052f);
        instancePath.cubicTo(19.2554f, 2.89112f, 19.3222f, 2.9239f, 19.3222f, 2.9239f);
        instancePath.cubicTo(19.8347f, 3.18512f, 20.25f, 3.86818f, 20.25f, 4.44942f);
        instancePath.lineTo(20.25f, 13.1272f);
        instancePath.close();
        instancePath.moveTo(20.25f, 14.3872f);
        instancePath.lineTo(20.25f, 21.4499f);
        instancePath.cubicTo(20.25f, 22.0312f, 19.7914f, 22.4999f, 19.2179f, 22.4999f);
        instancePath.lineTo(4.78205f, 22.4999f);
        instancePath.cubicTo(4.212f, 22.4999f, 3.75f, 22.031f, 3.75f, 21.4499f);
        instancePath.lineTo(3.75f, 14.3872f);
        instancePath.lineTo(7.8921f, 14.3872f);
        instancePath.cubicTo(7.9243f, 14.3886f, 7.9567f, 14.3892f, 7.98909f, 14.3892f);
        instancePath.lineTo(10.4933f, 14.3892f);
        instancePath.cubicTo(9.62018f, 15.2579f, 8.27724f, 16.3964f, 6.46888f, 17.7988f);
        instancePath.lineTo(7.21862f, 18.8011f);
        instancePath.cubicTo(9.09982f, 17.3421f, 10.4959f, 16.1561f, 11.4118f, 15.2368f);
        instancePath.lineTo(12.0f, 14.6464f);
        instancePath.cubicTo(12.1743f, 14.8213f, 12.37f, 15.0178f, 12.601f, 15.2495f);
        instancePath.cubicTo(13.514f, 16.1661f, 14.9058f, 17.3481f, 16.7816f, 18.8013f);
        instancePath.lineTo(17.5309f, 17.7986f);
        instancePath.cubicTo(15.7195f, 16.395f, 14.3766f, 15.2567f, 13.5067f, 14.3892f);
        instancePath.lineTo(16.0111f, 14.3892f);
        instancePath.cubicTo(16.0437f, 14.3892f, 16.0759f, 14.3886f, 16.1081f, 14.3872f);
        instancePath.lineTo(20.25f, 14.3872f);
        instancePath.close();
        instancePath.moveTo(16.0776f, 13.1272f);
        instancePath.lineTo(13.5137f, 13.1272f);
        instancePath.lineTo(15.2536f, 11.3804f);
        instancePath.cubicTo(15.4559f, 11.1712f, 15.7235f, 11.0548f, 16.0116f, 11.0548f);
        instancePath.cubicTo(16.5891f, 11.0548f, 17.0535f, 11.5213f, 17.0535f, 12.0919f);
        instancePath.cubicTo(17.0535f, 12.641f, 16.6241f, 13.0931f, 16.0776f, 13.1272f);
        instancePath.lineTo(16.0776f, 13.1272f);
        instancePath.close();
        instancePath.moveTo(7.92316f, 13.1272f);
        instancePath.cubicTo(7.37665f, 13.0931f, 6.94705f, 12.6408f, 6.94705f, 12.0919f);
        instancePath.cubicTo(6.94705f, 11.5213f, 7.41166f, 11.0548f, 7.98916f, 11.0548f);
        instancePath.cubicTo(8.26342f, 11.0548f, 8.51917f, 11.1599f, 8.71194f, 11.3451f);
        instancePath.cubicTo(9.53513f, 12.1714f, 10.0726f, 12.7112f, 10.4869f, 13.1272f);
        instancePath.lineTo(7.92316f, 13.1272f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
