package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class camera_transfer_regular extends l95.c {
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
        instancePath.moveTo(8.0f, 12.8293f);
        instancePath.lineTo(9.2f, 12.8293f);
        instancePath.cubicTo(9.2f, 11.3032f, 10.4536f, 10.0661f, 12.0f, 10.0661f);
        instancePath.cubicTo(12.6436f, 10.0661f, 13.2489f, 10.2817f, 13.7325f, 10.6579f);
        instancePath.lineTo(12.5f, 10.6579f);
        instancePath.lineTo(12.5f, 11.8421f);
        instancePath.lineTo(15.0f, 11.8421f);
        instancePath.cubicTo(15.2761f, 11.8421f, 15.5f, 11.6182f, 15.5f, 11.3421f);
        instancePath.lineTo(15.5f, 8.88157f);
        instancePath.lineTo(14.3f, 8.88157f);
        instancePath.lineTo(14.3f, 9.59934f);
        instancePath.cubicTo(13.6494f, 9.14734f, 12.8561f, 8.88193f, 12.0f, 8.88193f);
        instancePath.cubicTo(9.79086f, 8.88193f, 8.0f, 10.6492f, 8.0f, 12.8293f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.9999f, 12.8292f);
        instancePath2.cubicTo(15.9999f, 15.0093f, 14.2091f, 16.7766f, 11.9999f, 16.7766f);
        instancePath2.cubicTo(11.1439f, 16.7766f, 10.3506f, 16.5112f, 9.7f, 16.0592f);
        instancePath2.lineTo(9.7f, 16.776f);
        instancePath2.lineTo(8.5f, 16.776f);
        instancePath2.lineTo(8.5f, 14.3155f);
        instancePath2.cubicTo(8.5f, 14.0394f, 8.72386f, 13.8155f, 9.0f, 13.8155f);
        instancePath2.lineTo(11.5f, 13.8155f);
        instancePath2.lineTo(11.5f, 14.9997f);
        instancePath2.lineTo(10.2664f, 14.9997f);
        instancePath2.cubicTo(10.7508f, 15.3771f, 11.3565f, 15.5924f, 11.9999f, 15.5924f);
        instancePath2.cubicTo(13.5463f, 15.5924f, 14.7999f, 14.3552f, 14.7999f, 12.8292f);
        instancePath2.lineTo(15.9999f, 12.8292f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(14.7324f, 3.94736f);
        instancePath3.cubicTo(14.8996f, 3.94736f, 15.0557f, 4.02981f, 15.1484f, 4.16708f);
        instancePath3.lineTo(17.0f, 6.90788f);
        instancePath3.lineTo(21.0f, 6.90788f);
        instancePath3.cubicTo(21.5523f, 6.90788f, 22.0f, 7.34971f, 22.0f, 7.89473f);
        instancePath3.lineTo(22.0f, 18.75f);
        instancePath3.cubicTo(22.0f, 19.295f, 21.5523f, 19.7368f, 21.0f, 19.7368f);
        instancePath3.lineTo(3.0f, 19.7368f);
        instancePath3.cubicTo(2.44772f, 19.7368f, 2.0f, 19.295f, 2.0f, 18.75f);
        instancePath3.lineTo(2.0f, 7.89473f);
        instancePath3.cubicTo(2.0f, 7.34971f, 2.44772f, 6.90788f, 3.0f, 6.90788f);
        instancePath3.lineTo(7.0f, 6.90788f);
        instancePath3.lineTo(8.85157f, 4.16708f);
        instancePath3.cubicTo(8.9443f, 4.02981f, 9.10042f, 3.94736f, 9.26759f, 3.94736f);
        instancePath3.lineTo(14.7324f, 3.94736f);
        instancePath3.close();
        instancePath3.moveTo(7.64222f, 8.09209f);
        instancePath3.lineTo(3.2f, 8.09209f);
        instancePath3.lineTo(3.2f, 18.5526f);
        instancePath3.lineTo(20.8f, 18.5526f);
        instancePath3.lineTo(20.8f, 8.09209f);
        instancePath3.lineTo(16.3578f, 8.09209f);
        instancePath3.lineTo(14.3578f, 5.13157f);
        instancePath3.lineTo(9.64222f, 5.13157f);
        instancePath3.lineTo(7.64222f, 8.09209f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
