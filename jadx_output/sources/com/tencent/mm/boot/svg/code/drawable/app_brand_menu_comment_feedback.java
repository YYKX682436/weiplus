package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_menu_comment_feedback extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.6519f, 3.94979f);
                instancePath.cubicTo(21.4681f, 5.15218f, 21.6873f, 6.42072f, 21.6873f, 9.08755f);
                instancePath.cubicTo(21.6873f, 9.34232f, 21.6634f, 9.5301f, 21.6436f, 9.68628f);
                instancePath.cubicTo(21.6068f, 9.97619f, 21.5838f, 10.1572f, 21.7529f, 10.4555f);
                instancePath.cubicTo(22.2994f, 10.4644f, 25.0666f, 10.6502f, 25.8227f, 10.9231f);
                instancePath.cubicTo(26.7617f, 11.2621f, 27.4819f, 11.8072f, 27.8481f, 12.623f);
                instancePath.cubicTo(29.1549f, 15.535f, 27.5142f, 23.3943f, 24.4449f, 25.9209f);
                instancePath.cubicTo(23.7129f, 26.5237f, 22.3831f, 26.5884f, 21.1504f, 26.6484f);
                instancePath.lineTo(21.1504f, 26.6484f);
                instancePath.cubicTo(20.8323f, 26.6638f, 20.5207f, 26.679f, 20.2275f, 26.703f);
                instancePath.cubicTo(19.3372f, 26.7757f, 14.7787f, 26.7661f, 6.63358f, 26.7141f);
                instancePath.cubicTo(5.49897f, 26.7074f, 4.58008f, 25.7962f, 4.58008f, 24.668f);
                instancePath.lineTo(4.58008f, 14.9607f);
                instancePath.cubicTo(4.58008f, 13.8276f, 5.50924f, 12.9146f, 6.64903f, 12.9146f);
                instancePath.lineTo(9.14858f, 12.9146f);
                instancePath.cubicTo(9.77115f, 12.9146f, 10.3534f, 12.8562f, 11.048f, 12.7033f);
                instancePath.cubicTo(11.5381f, 12.5954f, 11.9453f, 12.4014f, 12.6934f, 11.9628f);
                instancePath.cubicTo(13.5319f, 11.4711f, 14.026f, 10.9132f, 14.3969f, 9.93241f);
                instancePath.cubicTo(14.6067f, 9.37699f, 14.6779f, 8.83213f, 14.7541f, 7.21994f);
                instancePath.cubicTo(14.7643f, 7.00646f, 14.7668f, 6.93929f, 14.784f, 6.4547f);
                instancePath.cubicTo(14.8619f, 4.25698f, 15.0949f, 3.47394f, 16.3121f, 2.90872f);
                instancePath.cubicTo(17.9388f, 2.15321f, 19.882f, 2.81536f, 20.6519f, 3.94979f);
                instancePath.close();
                instancePath.moveTo(19.3281f, 4.84846f);
                instancePath.cubicTo(18.9443f, 4.28285f, 17.8125f, 3.97605f, 16.986f, 4.35991f);
                instancePath.cubicTo(16.5093f, 4.58128f, 16.4459f, 4.73712f, 16.383f, 6.51144f);
                instancePath.cubicTo(16.3652f, 7.0142f, 16.3627f, 7.07899f, 16.3524f, 7.29556f);
                instancePath.cubicTo(16.2683f, 9.0726f, 16.1809f, 9.73736f, 15.8935f, 10.4984f);
                instancePath.cubicTo(15.4009f, 11.8011f, 14.6755f, 12.6554f, 13.5028f, 13.343f);
                instancePath.cubicTo(12.8555f, 13.7226f, 12.4025f, 13.9535f, 11.9546f, 14.1084f);
                instancePath.lineTo(11.9546f, 25.1438f);
                instancePath.cubicTo(17.0606f, 25.1668f, 19.5176f, 25.1557f, 20.097f, 25.1084f);
                instancePath.cubicTo(20.4162f, 25.0822f, 20.7718f, 25.0809f, 21.1323f, 25.0796f);
                instancePath.cubicTo(22.03f, 25.0763f, 22.9578f, 25.0728f, 23.4281f, 24.6856f);
                instancePath.cubicTo(25.6389f, 22.8657f, 27.5857f, 15.9461f, 26.3883f, 13.2781f);
                instancePath.cubicTo(26.232f, 12.9298f, 25.8864f, 12.6472f, 25.2795f, 12.4281f);
                instancePath.cubicTo(24.7726f, 12.2452f, 22.2264f, 12.1515f, 21.8087f, 12.1438f);
                instancePath.cubicTo(21.3689f, 12.151f, 20.8649f, 12.0364f, 20.4432f, 11.7767f);
                instancePath.cubicTo(19.8643f, 11.4202f, 19.932f, 10.816f, 20.0172f, 10.057f);
                instancePath.cubicTo(20.0509f, 9.75624f, 20.0873f, 9.43116f, 20.0873f, 9.08758f);
                instancePath.cubicTo(20.0873f, 6.63828f, 19.9025f, 5.6946f, 19.3281f, 4.84846f);
                instancePath.close();
                instancePath.moveTo(10.3546f, 25.136f);
                instancePath.lineTo(10.3546f, 14.4443f);
                instancePath.cubicTo(9.95512f, 14.4923f, 9.56122f, 14.5146f, 9.14862f, 14.5146f);
                instancePath.lineTo(6.64907f, 14.5146f);
                instancePath.cubicTo(6.38623f, 14.5146f, 6.18012f, 14.718f, 6.18012f, 14.9607f);
                instancePath.lineTo(6.18012f, 24.6681f);
                instancePath.cubicTo(6.18012f, 24.9108f, 6.38298f, 25.1126f, 6.64382f, 25.1142f);
                instancePath.cubicTo(7.99354f, 25.1228f, 9.22844f, 25.1301f, 10.3546f, 25.136f);
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
