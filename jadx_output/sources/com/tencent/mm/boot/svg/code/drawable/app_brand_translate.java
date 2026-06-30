package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_translate extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(18.6665f, 18.6666f);
                instancePath.lineTo(18.6665f, 27.9967f);
                instancePath.cubicTo(18.6665f, 28.7256f, 18.0681f, 29.3333f, 17.3299f, 29.3333f);
                instancePath.lineTo(4.00314f, 29.3333f);
                instancePath.cubicTo(3.27419f, 29.3333f, 2.6665f, 28.7349f, 2.6665f, 27.9967f);
                instancePath.lineTo(2.6665f, 14.6699f);
                instancePath.cubicTo(2.6665f, 13.941f, 3.26493f, 13.3333f, 4.00314f, 13.3333f);
                instancePath.lineTo(13.3332f, 13.3333f);
                instancePath.lineTo(13.3332f, 4.00326f);
                instancePath.cubicTo(13.3332f, 3.27431f, 13.9316f, 2.66663f, 14.6698f, 2.66663f);
                instancePath.lineTo(27.9965f, 2.66663f);
                instancePath.cubicTo(28.7255f, 2.66663f, 29.3332f, 3.26506f, 29.3332f, 4.00326f);
                instancePath.lineTo(29.3332f, 17.33f);
                instancePath.cubicTo(29.3332f, 18.0589f, 28.7347f, 18.6666f, 27.9965f, 18.6666f);
                instancePath.lineTo(18.6665f, 18.6666f);
                instancePath.close();
                instancePath.moveTo(14.9332f, 13.3333f);
                instancePath.lineTo(17.3299f, 13.3333f);
                instancePath.cubicTo(17.6532f, 13.3333f, 17.9527f, 13.451f, 18.1859f, 13.6465f);
                instancePath.lineTo(20.6092f, 6.66663f);
                instancePath.lineTo(22.4582f, 6.66663f);
                instancePath.lineTo(25.0728f, 14.1823f);
                instancePath.lineTo(23.4009f, 14.1823f);
                instancePath.lineTo(22.828f, 12.3593f);
                instancePath.lineTo(20.1873f, 12.3593f);
                instancePath.lineTo(19.6144f, 14.1823f);
                instancePath.lineTo(18.5736f, 14.1823f);
                instancePath.cubicTo(18.6335f, 14.3333f, 18.6665f, 14.4978f, 18.6665f, 14.6699f);
                instancePath.lineTo(18.6665f, 17.0666f);
                instancePath.lineTo(27.7332f, 17.0666f);
                instancePath.lineTo(27.7332f, 4.26663f);
                instancePath.lineTo(14.9332f, 4.26663f);
                instancePath.lineTo(14.9332f, 13.3333f);
                instancePath.close();
                instancePath.moveTo(4.2665f, 27.7333f);
                instancePath.lineTo(4.2665f, 14.9333f);
                instancePath.lineTo(17.0665f, 14.9333f);
                instancePath.lineTo(17.0665f, 27.7333f);
                instancePath.lineTo(4.2665f, 27.7333f);
                instancePath.close();
                instancePath.moveTo(13.5098f, 19.5958f);
                instancePath.lineTo(14.9672f, 19.5958f);
                instancePath.lineTo(14.9672f, 18.2253f);
                instancePath.lineTo(10.9134f, 18.2253f);
                instancePath.lineTo(11.6952f, 17.984f);
                instancePath.cubicTo(11.5987f, 17.5786f, 11.3284f, 16.9705f, 11.0871f, 16.5169f);
                instancePath.lineTo(9.58146f, 16.9609f);
                instancePath.cubicTo(9.76484f, 17.3469f, 9.93857f, 17.8392f, 10.0351f, 18.2253f);
                instancePath.lineTo(6.05853f, 18.2253f);
                instancePath.lineTo(6.05853f, 19.5958f);
                instancePath.lineTo(7.58352f, 19.5958f);
                instancePath.cubicTo(8.08542f, 20.8988f, 8.70314f, 22.0088f, 9.50424f, 22.9354f);
                instancePath.cubicTo(8.5294f, 23.6496f, 7.32292f, 24.1515f, 5.84619f, 24.4797f);
                instancePath.cubicTo(6.11644f, 24.8078f, 6.54112f, 25.4641f, 6.69555f, 25.802f);
                instancePath.cubicTo(8.22054f, 25.3773f, 9.49459f, 24.7692f, 10.5466f, 23.9392f);
                instancePath.cubicTo(11.5408f, 24.7403f, 12.7473f, 25.3387f, 14.2336f, 25.7247f);
                instancePath.cubicTo(14.446f, 25.3387f, 14.861f, 24.721f, 15.1795f, 24.4121f);
                instancePath.cubicTo(13.78f, 24.1032f, 12.6121f, 23.5917f, 11.6469f, 22.8968f);
                instancePath.cubicTo(12.4384f, 21.9991f, 13.0561f, 20.9085f, 13.5098f, 19.5958f);
                instancePath.close();
                instancePath.moveTo(9.04097f, 19.5958f);
                instancePath.lineTo(11.9269f, 19.5958f);
                instancePath.cubicTo(11.5987f, 20.5224f, 11.1451f, 21.3042f, 10.5756f, 21.9605f);
                instancePath.cubicTo(9.92894f, 21.2752f, 9.4174f, 20.4838f, 9.04097f, 19.5958f);
                instancePath.close();
                instancePath.moveTo(21.4894f, 8.10413f);
                instancePath.lineTo(20.5259f, 11.1823f);
                instancePath.lineTo(22.4894f, 11.1823f);
                instancePath.lineTo(21.5259f, 8.10413f);
                instancePath.lineTo(21.4894f, 8.10413f);
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
