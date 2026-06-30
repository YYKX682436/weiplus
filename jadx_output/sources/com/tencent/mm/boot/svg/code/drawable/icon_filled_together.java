package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_together extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(67.90188f, 21.421822f);
                instancePath.cubicTo(69.491455f, 22.47241f, 69.92839f, 24.612684f, 68.8778f, 26.20226f);
                instancePath.cubicTo(67.227196f, 28.699675f, 65.290016f, 30.88808f, 63.074318f, 32.762383f);
                instancePath.lineTo(61.45235f, 50.172375f);
                instancePath.cubicTo(61.308754f, 51.71482f, 59.991024f, 52.578396f, 58.236137f, 53.09513f);
                instancePath.cubicTo(56.48125f, 53.611862f, 53.225822f, 54.239975f, 50.80698f, 54.58777f);
                instancePath.lineTo(50.80698f, 54.58777f);
                instancePath.lineTo(51.710526f, 39.384796f);
                instancePath.cubicTo(51.7179f, 39.236496f, 51.720898f, 39.088955f, 51.71963f, 38.942303f);
                instancePath.cubicTo(50.188885f, 39.466248f, 48.660007f, 39.913094f, 47.13222f, 40.284023f);
                instancePath.lineTo(46.034107f, 57.854275f);
                instancePath.cubicTo(45.95181f, 59.17108f, 45.01885f, 60.279552f, 43.735416f, 60.585415f);
                instancePath.cubicTo(41.176933f, 61.195137f, 38.662457f, 61.5f, 36.191986f, 61.5f);
                instancePath.cubicTo(33.684364f, 61.5f, 31.050997f, 61.1859f, 28.291885f, 60.5577f);
                instancePath.cubicTo(26.994522f, 60.262314f, 26.04673f, 59.14767f, 25.963732f, 57.819695f);
                instancePath.lineTo(24.868345f, 40.28426f);
                instancePath.cubicTo(23.339401f, 39.913074f, 21.80935f, 39.465862f, 20.278484f, 38.94285f);
                instancePath.cubicTo(20.276175f, 39.13352f, 20.28177f, 39.326195f, 20.294859f, 39.5201f);
                instancePath.lineTo(21.190474f, 54.58777f);
                instancePath.cubicTo(18.004883f, 54.259583f, 15.703903f, 53.566284f, 13.761316f, 53.09513f);
                instancePath.cubicTo(11.818728f, 52.623974f, 10.6887f, 51.71482f, 10.545103f, 50.172375f);
                instancePath.lineTo(8.922301f, 32.759842f);
                instancePath.cubicTo(6.7078543f, 30.886105f, 4.771679f, 28.698545f, 3.1218214f, 26.20226f);
                instancePath.cubicTo(2.071233f, 24.612684f, 2.5081673f, 22.47241f, 4.0977416f, 21.421822f);
                instancePath.cubicTo(5.6873155f, 20.371233f, 7.8275905f, 20.808167f, 8.878179f, 22.397741f);
                instancePath.cubicTo(11.700674f, 26.668268f, 15.551849f, 29.745806f, 20.516367f, 31.683895f);
                instancePath.cubicTo(25.642632f, 33.685127f, 30.696373f, 34.699028f, 35.694088f, 34.738785f);
                instancePath.lineTo(35.999622f, 34.74f);
                instancePath.cubicTo(41.097004f, 34.74f, 46.252373f, 33.725967f, 51.483253f, 31.683895f);
                instancePath.cubicTo(56.447773f, 29.745806f, 60.298946f, 26.668268f, 63.12144f, 22.397741f);
                instancePath.cubicTo(64.17203f, 20.808167f, 66.3123f, 20.371233f, 67.90188f, 21.421822f);
                instancePath.close();
                instancePath.moveTo(36.0f, 16.8f);
                instancePath.cubicTo(39.97645f, 16.8f, 43.2f, 20.02355f, 43.2f, 24.0f);
                instancePath.cubicTo(43.2f, 27.97645f, 39.97645f, 31.2f, 36.0f, 31.2f);
                instancePath.cubicTo(32.02355f, 31.2f, 28.8f, 27.97645f, 28.8f, 24.0f);
                instancePath.cubicTo(28.8f, 20.02355f, 32.02355f, 16.8f, 36.0f, 16.8f);
                instancePath.close();
                instancePath.moveTo(18.3f, 12.6f);
                instancePath.cubicTo(21.613708f, 12.6f, 24.3f, 15.286291f, 24.3f, 18.6f);
                instancePath.cubicTo(24.3f, 21.913708f, 21.613708f, 24.6f, 18.3f, 24.6f);
                instancePath.cubicTo(14.986292f, 24.6f, 12.3f, 21.913708f, 12.3f, 18.6f);
                instancePath.cubicTo(12.3f, 15.286291f, 14.986292f, 12.6f, 18.3f, 12.6f);
                instancePath.close();
                instancePath.moveTo(53.7f, 12.6f);
                instancePath.cubicTo(57.01371f, 12.6f, 59.7f, 15.286291f, 59.7f, 18.6f);
                instancePath.cubicTo(59.7f, 21.913708f, 57.01371f, 24.6f, 53.7f, 24.6f);
                instancePath.cubicTo(50.38629f, 24.6f, 47.7f, 21.913708f, 47.7f, 18.6f);
                instancePath.cubicTo(47.7f, 15.286291f, 50.38629f, 12.6f, 53.7f, 12.6f);
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
