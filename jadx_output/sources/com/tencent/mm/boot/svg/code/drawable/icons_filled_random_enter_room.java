package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_random_enter_room extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.5152f, 6.72578f);
        instancePath.cubicTo(13.6578f, 6.72578f, 11.5197f, 8.85593f, 9.95841f, 10.3658f);
        instancePath.cubicTo(7.59132f, 12.6553f, 5.35537f, 14.8799f, 3.56577f, 14.8799f);
        instancePath.lineTo(2.46503f, 14.8799f);
        instancePath.cubicTo(2.01514f, 14.8799f, 1.65039f, 14.5146f, 1.65039f, 14.0645f);
        instancePath.cubicTo(1.65039f, 13.6144f, 2.01512f, 13.2491f, 2.465f, 13.2491f);
        instancePath.lineTo(3.56577f, 13.2491f);
        instancePath.cubicTo(4.69666f, 13.2491f, 6.98634f, 10.9724f, 8.82613f, 9.19301f);
        instancePath.cubicTo(11.0653f, 7.02742f, 12.999f, 5.09493f, 14.5152f, 5.09493f);
        instancePath.lineTo(15.5658f, 5.09493f);
        instancePath.lineTo(14.451f, 4.013f);
        instancePath.cubicTo(14.1326f, 3.69505f, 14.1321f, 3.2103f, 14.4499f, 2.89173f);
        instancePath.cubicTo(14.7677f, 2.57307f, 15.2835f, 2.57244f, 15.6019f, 2.8905f);
        instancePath.lineTo(18.1105f, 5.39529f);
        instancePath.cubicTo(18.1863f, 5.47091f, 18.2464f, 5.56074f, 18.2875f, 5.65963f);
        instancePath.cubicTo(18.3285f, 5.75853f, 18.3496f, 5.86455f, 18.3496f, 5.97163f);
        instancePath.cubicTo(18.3496f, 6.18798f, 18.2636f, 6.39456f, 18.1105f, 6.54747f);
        instancePath.lineTo(15.6019f, 9.05059f);
        instancePath.cubicTo(15.4429f, 9.20936f, 15.2347f, 9.28487f, 15.0265f, 9.28487f);
        instancePath.cubicTo(14.8177f, 9.28487f, 14.609f, 9.19739f, 14.4499f, 9.0379f);
        instancePath.cubicTo(14.1321f, 8.71937f, 14.1327f, 8.18786f, 14.451f, 7.86992f);
        instancePath.lineTo(15.5658f, 6.72576f);
        instancePath.lineTo(14.5152f, 6.72576f);
        instancePath.lineTo(14.5152f, 6.72578f);
        instancePath.close();
        instancePath.moveTo(15.6019f, 10.9204f);
        instancePath.cubicTo(15.2835f, 10.6023f, 14.7677f, 10.6028f, 14.4499f, 10.9215f);
        instancePath.cubicTo(14.1321f, 11.24f, 14.1327f, 11.787f, 14.451f, 12.1049f);
        instancePath.lineTo(15.5658f, 13.2491f);
        instancePath.lineTo(14.5152f, 13.2491f);
        instancePath.cubicTo(13.8461f, 13.2491f, 12.7285f, 12.2584f, 11.6203f, 11.2214f);
        instancePath.cubicTo(11.2918f, 10.9139f, 10.7762f, 10.9156f, 10.469f, 11.2443f);
        instancePath.cubicTo(10.1617f, 11.573f, 10.1789f, 12.1124f, 10.5074f, 12.4198f);
        instancePath.cubicTo(12.1956f, 14.0f, 13.3344f, 14.8799f, 14.5152f, 14.8799f);
        instancePath.lineTo(15.5658f, 14.8799f);
        instancePath.lineTo(14.451f, 15.9618f);
        instancePath.cubicTo(14.1326f, 16.2797f, 14.1321f, 16.7801f, 14.4499f, 17.0986f);
        instancePath.cubicTo(14.609f, 17.2581f, 14.8177f, 17.3301f, 15.0265f, 17.3301f);
        instancePath.cubicTo(15.2347f, 17.3301f, 15.4429f, 17.2468f, 15.6019f, 17.088f);
        instancePath.lineTo(18.1105f, 14.581f);
        instancePath.cubicTo(18.2636f, 14.4281f, 18.3496f, 14.2196f, 18.3496f, 14.0032f);
        instancePath.cubicTo(18.3496f, 13.896f, 18.3285f, 13.7898f, 18.2874f, 13.6908f);
        instancePath.cubicTo(18.2464f, 13.5917f, 18.1863f, 13.5017f, 18.1105f, 13.4259f);
        instancePath.lineTo(15.6019f, 10.9204f);
        instancePath.close();
        instancePath.moveTo(2.465f, 6.72578f);
        instancePath.lineTo(3.56577f, 6.72578f);
        instancePath.cubicTo(4.42429f, 6.72578f, 5.70408f, 7.81949f, 6.72302f, 8.74538f);
        instancePath.cubicTo(6.87911f, 8.88715f, 7.07504f, 8.97255f, 7.27052f, 8.97255f);
        instancePath.cubicTo(7.49208f, 8.97255f, 7.713f, 8.89033f, 7.87371f, 8.71327f);
        instancePath.cubicTo(8.1762f, 8.38009f, 8.15145f, 7.83719f, 7.81841f, 7.53457f);
        instancePath.cubicTo(6.22503f, 6.08674f, 4.89206f, 5.09495f, 3.56577f, 5.09495f);
        instancePath.lineTo(2.465f, 5.09495f);
        instancePath.cubicTo(2.01512f, 5.09495f, 1.65039f, 5.46033f, 1.65039f, 5.91038f);
        instancePath.cubicTo(1.65039f, 6.36044f, 2.01514f, 6.72578f, 2.465f, 6.72578f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
