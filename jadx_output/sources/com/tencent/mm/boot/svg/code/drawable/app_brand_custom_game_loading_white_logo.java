package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_custom_game_loading_white_logo extends l95.c {
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
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(15.5517f, 7.85772f);
            instancePath.cubicTo(12.0137f, 4.59614f, 6.88074f, 4.48022f, 4.08826f, 7.5969f);
            instancePath.cubicTo(1.29578f, 10.7136f, 1.89844f, 15.8984f, 5.44943f, 19.1468f);
            instancePath.cubicTo(9.00043f, 22.3952f, 14.1204f, 22.5243f, 16.9155f, 19.4102f);
            instancePath.cubicTo(19.7106f, 16.2962f, 19.0897f, 11.1193f, 15.5517f, 7.85772f);
            instancePath.close();
            instancePath.moveTo(15.3205f, 12.5551f);
            instancePath.cubicTo(14.6477f, 13.8303f, 12.8761f, 14.1965f, 11.3669f, 13.3771f);
            instancePath.cubicTo(9.85766f, 12.5578f, 9.17707f, 10.8558f, 9.86545f, 9.57545f);
            instancePath.cubicTo(10.5538f, 8.29505f, 12.3098f, 7.93149f, 13.8191f, 8.75347f);
            instancePath.cubicTo(15.3283f, 9.57545f, 15.9907f, 11.28f, 15.3205f, 12.5551f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(18.5324f, 3.07323f);
            instancePath2.cubicTo(19.9396f, 2.70085f, 21.4421f, 3.78582f, 21.8785f, 5.48428f);
            instancePath2.cubicTo(22.315f, 7.18273f, 21.5373f, 8.89457f, 20.1301f, 9.26159f);
            instancePath2.cubicTo(18.7229f, 9.6286f, 17.2204f, 8.55167f, 16.7866f, 6.85054f);
            instancePath2.cubicTo(16.3528f, 5.14941f, 17.1305f, 3.4456f, 18.5324f, 3.07323f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
