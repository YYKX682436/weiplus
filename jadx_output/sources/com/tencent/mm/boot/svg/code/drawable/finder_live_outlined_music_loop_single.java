package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_outlined_music_loop_single extends l95.c {
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
        instancePath.moveTo(18.1894f, 7.25006f);
        instancePath.lineTo(8.25f, 7.25006f);
        instancePath.cubicTo(6.45507f, 7.25006f, 5.0f, 8.70514f, 5.0f, 10.5001f);
        instancePath.lineTo(5.0f, 11.5001f);
        instancePath.cubicTo(5.0f, 11.9143f, 4.66421f, 12.2501f, 4.25f, 12.2501f);
        instancePath.cubicTo(3.83579f, 12.2501f, 3.5f, 11.9143f, 3.5f, 11.5001f);
        instancePath.lineTo(3.5f, 10.5001f);
        instancePath.cubicTo(3.5f, 7.87671f, 5.62665f, 5.75006f, 8.25f, 5.75006f);
        instancePath.lineTo(18.1894f, 5.75006f);
        instancePath.lineTo(16.4698f, 4.03039f);
        instancePath.lineTo(17.5304f, 2.96973f);
        instancePath.lineTo(20.5304f, 5.96973f);
        instancePath.cubicTo(20.8233f, 6.26262f, 20.8233f, 6.73749f, 20.5304f, 7.03039f);
        instancePath.lineTo(17.5304f, 10.0304f);
        instancePath.lineTo(16.4698f, 8.96973f);
        instancePath.lineTo(18.1894f, 7.25006f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.53033f, 19.9697f);
        instancePath2.lineTo(5.81066f, 18.2501f);
        instancePath2.lineTo(15.75f, 18.2501f);
        instancePath2.cubicTo(18.3734f, 18.2501f, 20.5f, 16.1234f, 20.5f, 13.5001f);
        instancePath2.lineTo(20.5f, 12.5001f);
        instancePath2.cubicTo(20.5f, 12.0859f, 20.1642f, 11.7501f, 19.75f, 11.7501f);
        instancePath2.cubicTo(19.3358f, 11.7501f, 19.0f, 12.0859f, 19.0f, 12.5001f);
        instancePath2.lineTo(19.0f, 13.5001f);
        instancePath2.cubicTo(19.0f, 15.295f, 17.5449f, 16.7501f, 15.75f, 16.7501f);
        instancePath2.lineTo(5.81066f, 16.7501f);
        instancePath2.lineTo(7.53033f, 15.0304f);
        instancePath2.lineTo(6.46967f, 13.9697f);
        instancePath2.lineTo(3.46967f, 16.9697f);
        instancePath2.cubicTo(3.17678f, 17.2626f, 3.17678f, 17.7375f, 3.46967f, 18.0304f);
        instancePath2.lineTo(6.46967f, 21.0304f);
        instancePath2.lineTo(7.53033f, 19.9697f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(13.003f, 9.01949f);
        instancePath3.cubicTo(13.1989f, 9.12365f, 13.3213f, 9.32739f, 13.3213f, 9.54922f);
        instancePath3.lineTo(13.3213f, 14.0119f);
        instancePath3.cubicTo(13.3213f, 14.3433f, 13.0527f, 14.6119f, 12.7213f, 14.6119f);
        instancePath3.cubicTo(12.3899f, 14.6119f, 12.1213f, 14.3433f, 12.1213f, 14.0119f);
        instancePath3.lineTo(12.1213f, 10.6773f);
        instancePath3.lineTo(11.6147f, 11.0189f);
        instancePath3.cubicTo(11.3399f, 11.2041f, 10.967f, 11.1315f, 10.7818f, 10.8568f);
        instancePath3.cubicTo(10.5965f, 10.582f, 10.6691f, 10.2091f, 10.9439f, 10.0239f);
        instancePath3.lineTo(12.3859f, 9.05172f);
        instancePath3.cubicTo(12.5698f, 8.92771f, 12.8072f, 8.91532f, 13.003f, 9.01949f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
