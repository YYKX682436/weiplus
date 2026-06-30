package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class launch_regular extends l95.c {
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
        instancePath.moveTo(9.67988f, 9.79263f);
        instancePath.lineTo(7.71523f, 9.79263f);
        instancePath.cubicTo(7.04443f, 9.79263f, 6.50002f, 10.3365f, 6.5f, 11.0073f);
        instancePath.lineTo(6.5f, 16.7506f);
        instancePath.cubicTo(6.50033f, 17.4407f, 7.06024f, 18.0004f, 7.75039f, 18.0004f);
        instancePath.lineTo(13.4932f, 18.0004f);
        instancePath.cubicTo(14.1638f, 18.0003f, 14.7082f, 17.4564f, 14.7084f, 16.7858f);
        instancePath.lineTo(14.7084f, 14.8206f);
        instancePath.lineTo(16.2084f, 14.8206f);
        instancePath.lineTo(16.2084f, 16.7858f);
        instancePath.cubicTo(16.2082f, 18.2848f, 14.9922f, 19.5003f, 13.4932f, 19.5004f);
        instancePath.lineTo(7.75039f, 19.5004f);
        instancePath.cubicTo(6.23181f, 19.5004f, 5.00033f, 18.2691f, 5.0f, 16.7506f);
        instancePath.lineTo(5.0f, 11.0073f);
        instancePath.cubicTo(5.00002f, 9.50804f, 6.216f, 8.29263f, 7.71523f, 8.29263f);
        instancePath.lineTo(9.67988f, 8.29263f);
        instancePath.lineTo(9.67988f, 9.79263f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.0002f, 5.75024f);
        instancePath2.cubicTo(18.0395f, 5.75026f, 18.078f, 5.75378f, 18.1156f, 5.75962f);
        instancePath2.cubicTo(18.1264f, 5.76129f, 18.1372f, 5.76276f, 18.1479f, 5.76489f);
        instancePath2.cubicTo(18.188f, 5.77293f, 18.2269f, 5.78413f, 18.2645f, 5.79829f);
        instancePath2.cubicTo(18.2717f, 5.80101f, 18.279f, 5.80355f, 18.2861f, 5.80649f);
        instancePath2.cubicTo(18.2985f, 5.81161f, 18.3104f, 5.81774f, 18.3225f, 5.82349f);
        instancePath2.cubicTo(18.3325f, 5.82825f, 18.3425f, 5.8329f, 18.3523f, 5.83813f);
        instancePath2.cubicTo(18.3754f, 5.85045f, 18.3981f, 5.8634f, 18.4197f, 5.87798f);
        instancePath2.lineTo(18.4736f, 5.91841f);
        instancePath2.cubicTo(18.4932f, 5.93437f, 18.5122f, 5.95173f, 18.5305f, 5.96997f);
        instancePath2.cubicTo(18.6137f, 6.05326f, 18.6721f, 6.15158f, 18.708f, 6.25591f);
        instancePath2.cubicTo(18.7108f, 6.26414f, 18.7142f, 6.27216f, 18.7168f, 6.28052f);
        instancePath2.cubicTo(18.72f, 6.29114f, 18.7222f, 6.30201f, 18.725f, 6.31274f);
        instancePath2.cubicTo(18.7287f, 6.32711f, 18.7327f, 6.34142f, 18.7355f, 6.3561f);
        instancePath2.cubicTo(18.7448f, 6.4037f, 18.7502f, 6.45193f, 18.7502f, 6.50024f);
        instancePath2.lineTo(18.7502f, 11.1233f);
        instancePath2.cubicTo(18.7499f, 11.5371f, 18.414f, 11.8731f, 18.0002f, 11.8733f);
        instancePath2.cubicTo(17.5862f, 11.8733f, 17.2505f, 11.5372f, 17.2502f, 11.1233f);
        instancePath2.lineTo(17.2502f, 8.31021f);
        instancePath2.lineTo(11.1336f, 14.4268f);
        instancePath2.cubicTo(10.8407f, 14.7194f, 10.3659f, 14.7195f, 10.073f, 14.4268f);
        instancePath2.cubicTo(9.78037f, 14.134f, 9.78047f, 13.6591f, 10.073f, 13.3663f);
        instancePath2.lineTo(16.1896f, 7.25024f);
        instancePath2.lineTo(13.3771f, 7.25024f);
        instancePath2.cubicTo(12.963f, 7.25024f, 12.6273f, 6.91435f, 12.6271f, 6.50024f);
        instancePath2.cubicTo(12.6271f, 6.08603f, 12.9629f, 5.75024f, 13.3771f, 5.75024f);
        instancePath2.lineTo(18.0002f, 5.75024f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
