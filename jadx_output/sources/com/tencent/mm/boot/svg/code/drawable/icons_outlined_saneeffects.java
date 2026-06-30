package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_saneeffects extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(31.1368f, 34.7774f);
                instancePath.lineTo(20.8546f, 30.6763f);
                instancePath.cubicTo(20.7132f, 30.6199f, 20.5594f, 30.6013f, 20.4086f, 30.6225f);
                instancePath.cubicTo(19.9301f, 30.6898f, 19.5967f, 31.1322f, 19.6639f, 31.6108f);
                instancePath.lineTo(21.1927f, 42.4883f);
                instancePath.cubicTo(21.2139f, 42.6391f, 21.2741f, 42.7818f, 21.3673f, 42.9022f);
                instancePath.cubicTo(21.6631f, 43.2843f, 22.2127f, 43.3543f, 22.5948f, 43.0584f);
                instancePath.lineTo(31.3483f, 36.282f);
                instancePath.cubicTo(31.4718f, 36.1864f, 31.5675f, 36.0594f, 31.6254f, 35.9143f);
                instancePath.cubicTo(31.8044f, 35.4654f, 31.5857f, 34.9564f, 31.1368f, 34.7774f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(44.7561f, 53.8706f);
                instancePath2.lineTo(45.1089f, 56.3811f);
                instancePath2.cubicTo(45.3335f, 57.9791f, 44.2228f, 59.4562f, 42.6282f, 59.6803f);
                instancePath2.lineTo(15.724f, 63.4614f);
                instancePath2.cubicTo(14.1294f, 63.6856f, 12.6546f, 62.5718f, 12.43f, 60.9738f);
                instancePath2.lineTo(6.1455f, 16.257f);
                instancePath2.cubicTo(5.92091f, 14.659f, 7.03153f, 13.1819f, 8.62614f, 12.9578f);
                instancePath2.lineTo(35.5304f, 9.17663f);
                instancePath2.cubicTo(37.125f, 8.95252f, 38.5998f, 10.0663f, 38.8243f, 11.6643f);
                instancePath2.lineTo(39.2386f, 14.6122f);
                instancePath2.lineTo(39.7367f, 13.3794f);
                instancePath2.cubicTo(40.1851f, 12.2696f, 41.5816f, 11.7872f, 42.8557f, 12.302f);
                instancePath2.lineTo(64.3539f, 20.9879f);
                instancePath2.cubicTo(65.6281f, 21.5027f, 66.2975f, 22.8197f, 65.8491f, 23.9295f);
                instancePath2.lineTo(53.3016f, 54.9857f);
                instancePath2.cubicTo(52.8532f, 56.0955f, 51.4567f, 56.5779f, 50.1826f, 56.0631f);
                instancePath2.lineTo(44.7561f, 53.8706f);
                instancePath2.close();
                instancePath2.moveTo(9.80484f, 16.4275f);
                instancePath2.lineTo(35.3538f, 12.8368f);
                instancePath2.lineTo(41.4495f, 56.2106f);
                instancePath2.lineTo(15.9006f, 59.8014f);
                instancePath2.lineTo(9.80484f, 16.4275f);
                instancePath2.close();
                instancePath2.moveTo(42.5379f, 16.0564f);
                instancePath2.lineTo(61.9745f, 23.9093f);
                instancePath2.lineTo(50.5004f, 52.3088f);
                instancePath2.lineTo(44.1775f, 49.7542f);
                instancePath2.lineTo(40.2407f, 21.7421f);
                instancePath2.lineTo(42.5379f, 16.0564f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
