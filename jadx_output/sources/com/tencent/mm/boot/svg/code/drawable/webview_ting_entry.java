package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class webview_ting_entry extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.60509f, 12.2674f);
                instancePath.cubicTo(4.65582f, 10.4426f, 5.14541f, 8.77261f, 5.98087f, 7.4265f);
                instancePath.cubicTo(7.25773f, 5.3692f, 9.34844f, 4.0501f, 12.0008f, 4.0501f);
                instancePath.cubicTo(14.6736f, 4.0501f, 16.7582f, 5.2674f, 18.0247f, 7.25277f);
                instancePath.cubicTo(18.8799f, 8.59346f, 19.3752f, 10.3079f, 19.3999f, 12.2686f);
                instancePath.cubicTo(19.1346f, 12.1059f, 18.8306f, 11.9958f, 18.5002f, 11.9552f);
                instancePath.cubicTo(17.3233f, 11.8107f, 16.2368f, 12.6063f, 16.0191f, 13.7719f);
                instancePath.lineTo(15.3738f, 17.2278f);
                instancePath.cubicTo(15.1361f, 18.5011f, 16.022f, 19.711f, 17.3076f, 19.8689f);
                instancePath.cubicTo(18.4846f, 20.0134f, 19.5711f, 19.2179f, 19.7888f, 18.0522f);
                instancePath.lineTo(20.2513f, 15.5747f);
                instancePath.lineTo(20.2554f, 15.5756f);
                instancePath.cubicTo(20.3259f, 15.2462f, 20.3854f, 14.9195f, 20.4341f, 14.5961f);
                instancePath.cubicTo(20.4457f, 14.5338f, 20.4546f, 14.4716f, 20.461f, 14.4097f);
                instancePath.cubicTo(20.878f, 11.3913f, 20.3492f, 8.66553f, 19.0364f, 6.60743f);
                instancePath.cubicTo(17.5471f, 4.2728f, 15.079f, 2.8501f, 12.0008f, 2.8501f);
                instancePath.cubicTo(8.90222f, 2.8501f, 6.44009f, 4.411f, 4.96128f, 6.7937f);
                instancePath.cubicTo(3.4913f, 9.16217f, 2.99932f, 12.3237f, 3.74588f, 15.5748f);
                instancePath.lineTo(4.20905f, 18.0554f);
                instancePath.cubicTo(4.42671f, 19.2211f, 5.51321f, 20.0166f, 6.69019f, 19.8721f);
                instancePath.cubicTo(7.97586f, 19.7143f, 8.86174f, 18.5044f, 8.62399f, 17.2311f);
                instancePath.lineTo(7.97872f, 13.7752f);
                instancePath.cubicTo(7.76106f, 12.6095f, 6.67457f, 11.814f, 5.49758f, 11.9585f);
                instancePath.cubicTo(5.17017f, 11.9987f, 4.86869f, 12.1071f, 4.60509f, 12.2674f);
                instancePath.close();
                instancePath.moveTo(19.2684f, 14.2738f);
                instancePath.cubicTo(19.2628f, 14.3141f, 19.2569f, 14.3544f, 19.2509f, 14.3948f);
                instancePath.lineTo(18.6091f, 17.8319f);
                instancePath.cubicTo(18.5078f, 18.3747f, 18.0019f, 18.7451f, 17.4539f, 18.6778f);
                instancePath.cubicTo(16.8552f, 18.6043f, 16.4427f, 18.041f, 16.5534f, 17.4481f);
                instancePath.lineTo(17.1987f, 13.9922f);
                instancePath.cubicTo(17.3001f, 13.4494f, 17.806f, 13.079f, 18.354f, 13.1463f);
                instancePath.cubicTo(18.9181f, 13.2156f, 19.3169f, 13.7198f, 19.2684f, 14.2738f);
                instancePath.close();
                instancePath.moveTo(6.7991f, 13.9954f);
                instancePath.lineTo(7.44438f, 17.4513f);
                instancePath.cubicTo(7.55508f, 18.0442f, 7.14259f, 18.6076f, 6.54395f, 18.6811f);
                instancePath.cubicTo(5.99591f, 18.7483f, 5.49001f, 18.3779f, 5.38867f, 17.8352f);
                instancePath.lineTo(4.74339f, 14.3793f);
                instancePath.cubicTo(4.63269f, 13.7864f, 5.04518f, 13.223f, 5.64382f, 13.1495f);
                instancePath.cubicTo(6.19186f, 13.0822f, 6.69776f, 13.4527f, 6.7991f, 13.9954f);
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
