package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class shrink_content_regular extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePath.moveTo(20.7f, 31.6998f);
        instancePath.lineTo(20.7f, 41.4998f);
        instancePath.lineTo(18.3f, 41.4998f);
        instancePath.lineTo(18.3f, 31.6998f);
        instancePath.cubicTo(18.3f, 31.12f, 18.2991f, 30.7572f, 18.2768f, 30.4839f);
        instancePath.cubicTo(18.2556f, 30.2247f, 18.2213f, 30.153f, 18.2129f, 30.1365f);
        instancePath.cubicTo(18.1362f, 29.986f, 18.0138f, 29.8636f, 17.8633f, 29.7869f);
        instancePath.cubicTo(17.8467f, 29.7784f, 17.7751f, 29.7442f, 17.5158f, 29.723f);
        instancePath.cubicTo(17.2425f, 29.7007f, 16.8798f, 29.6998f, 16.3f, 29.6998f);
        instancePath.lineTo(6.50001f, 29.6998f);
        instancePath.lineTo(6.50001f, 27.2998f);
        instancePath.lineTo(16.3f, 27.2998f);
        instancePath.cubicTo(16.8403f, 27.2998f, 17.3176f, 27.2988f, 17.7113f, 27.331f);
        instancePath.cubicTo(18.119f, 27.3643f, 18.5415f, 27.439f, 18.9527f, 27.6486f);
        instancePath.cubicTo(19.5549f, 27.9554f, 20.0444f, 28.4449f, 20.3512f, 29.047f);
        instancePath.cubicTo(20.5607f, 29.4583f, 20.6354f, 29.8807f, 20.6688f, 30.2884f);
        instancePath.cubicTo(20.7009f, 30.6821f, 20.7f, 31.1595f, 20.7f, 31.6998f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(27.2998f, 16.3f);
        instancePath2.lineTo(27.2998f, 6.50001f);
        instancePath2.lineTo(29.6998f, 6.50001f);
        instancePath2.lineTo(29.6998f, 16.3f);
        instancePath2.cubicTo(29.6998f, 16.8798f, 29.7007f, 17.2425f, 29.723f, 17.5158f);
        instancePath2.cubicTo(29.7442f, 17.7751f, 29.7784f, 17.8467f, 29.7869f, 17.8633f);
        instancePath2.cubicTo(29.8636f, 18.0138f, 29.986f, 18.1362f, 30.1365f, 18.2129f);
        instancePath2.cubicTo(30.153f, 18.2213f, 30.2247f, 18.2556f, 30.4839f, 18.2768f);
        instancePath2.cubicTo(30.7572f, 18.2991f, 31.12f, 18.3f, 31.6998f, 18.3f);
        instancePath2.lineTo(41.4996f, 18.3f);
        instancePath2.lineTo(41.4996f, 20.7f);
        instancePath2.lineTo(31.6998f, 20.7f);
        instancePath2.cubicTo(31.1595f, 20.7f, 30.6821f, 20.7009f, 30.2884f, 20.6688f);
        instancePath2.cubicTo(29.8807f, 20.6354f, 29.4583f, 20.5607f, 29.047f, 20.3512f);
        instancePath2.cubicTo(28.4449f, 20.0444f, 27.9554f, 19.5549f, 27.6486f, 18.9527f);
        instancePath2.cubicTo(27.439f, 18.5415f, 27.3643f, 18.119f, 27.331f, 17.7113f);
        instancePath2.cubicTo(27.2988f, 17.3176f, 27.2998f, 16.8403f, 27.2998f, 16.3f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
