package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_location_regular extends l95.c {
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
            instancePath.moveTo(12.0652f, 21.2432f);
            instancePath.cubicTo(12.063f, 21.2412f, 12.0609f, 21.2393f, 12.0587f, 21.2375f);
            instancePath.lineTo(12.0652f, 21.2432f);
            instancePath.close();
            instancePath.moveTo(12.2468f, 20.9686f);
            instancePath.cubicTo(12.4829f, 20.7558f, 12.7473f, 20.5078f, 13.0328f, 20.2279f);
            instancePath.cubicTo(13.8506f, 19.4261f, 14.6689f, 18.5335f, 15.4302f, 17.5769f);
            instancePath.cubicTo(17.4693f, 15.0144f, 18.7114f, 12.4871f, 18.7955f, 10.2397f);
            instancePath.cubicTo(18.7985f, 10.1593f, 18.8f, 10.0794f, 18.8f, 10.0f);
            instancePath.cubicTo(18.8f, 6.24446f, 15.7555f, 3.2f, 12.0f, 3.2f);
            instancePath.cubicTo(8.24446f, 3.2f, 5.2f, 6.24446f, 5.2f, 10.0f);
            instancePath.cubicTo(5.2f, 10.0794f, 5.20151f, 10.1593f, 5.20451f, 10.2397f);
            instancePath.cubicTo(5.28861f, 12.4871f, 6.53066f, 15.0144f, 8.56983f, 17.5769f);
            instancePath.cubicTo(9.33111f, 18.5335f, 10.1494f, 19.4261f, 10.9672f, 20.2279f);
            instancePath.cubicTo(11.2527f, 20.5078f, 11.5171f, 20.7558f, 11.7532f, 20.9686f);
            instancePath.cubicTo(11.8635f, 21.0681f, 11.947f, 21.1414f, 12.0f, 21.187f);
            instancePath.cubicTo(12.053f, 21.1414f, 12.1365f, 21.0681f, 12.2468f, 20.9686f);
            instancePath.close();
            instancePath.moveTo(11.2617f, 22.1345f);
            instancePath.cubicTo(11.2617f, 22.1345f, 4.0f, 16.0183f, 4.0f, 10.0f);
            instancePath.cubicTo(4.0f, 5.58172f, 7.58172f, 2.0f, 12.0f, 2.0f);
            instancePath.cubicTo(16.4183f, 2.0f, 20.0f, 5.58172f, 20.0f, 10.0f);
            instancePath.cubicTo(20.0f, 16.0183f, 12.7383f, 22.1345f, 12.7383f, 22.1345f);
            instancePath.cubicTo(12.3336f, 22.506f, 11.6695f, 22.502f, 11.2617f, 22.1345f);
            instancePath.close();
            instancePath.moveTo(12.0f, 12.8f);
            instancePath.cubicTo(13.5464f, 12.8f, 14.8f, 11.5464f, 14.8f, 10.0f);
            instancePath.cubicTo(14.8f, 8.4536f, 13.5464f, 7.2f, 12.0f, 7.2f);
            instancePath.cubicTo(10.4536f, 7.2f, 9.2f, 8.4536f, 9.2f, 10.0f);
            instancePath.cubicTo(9.2f, 11.5464f, 10.4536f, 12.8f, 12.0f, 12.8f);
            instancePath.close();
            instancePath.moveTo(12.0f, 14.0f);
            instancePath.cubicTo(9.79086f, 14.0f, 8.0f, 12.2091f, 8.0f, 10.0f);
            instancePath.cubicTo(8.0f, 7.79086f, 9.79086f, 6.0f, 12.0f, 6.0f);
            instancePath.cubicTo(14.2091f, 6.0f, 16.0f, 7.79086f, 16.0f, 10.0f);
            instancePath.cubicTo(16.0f, 12.2091f, 14.2091f, 14.0f, 12.0f, 14.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
