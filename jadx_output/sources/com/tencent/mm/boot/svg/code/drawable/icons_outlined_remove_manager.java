package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_remove_manager extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(22.933332f, 16.266666f);
        instancePath.cubicTo(26.615232f, 16.266666f, 29.6f, 19.251434f, 29.6f, 22.933332f);
        instancePath.cubicTo(29.6f, 26.615232f, 26.615232f, 29.6f, 22.933332f, 29.6f);
        instancePath.cubicTo(19.251434f, 29.6f, 16.266666f, 26.615232f, 16.266666f, 22.933332f);
        instancePath.cubicTo(16.266666f, 19.251434f, 19.251434f, 16.266666f, 22.933332f, 16.266666f);
        instancePath.close();
        instancePath.moveTo(18.829641f, 19.961042f);
        instancePath.lineTo(18.70343f, 20.143225f);
        instancePath.cubicTo(18.174568f, 20.943384f, 17.866667f, 21.902401f, 17.866667f, 22.933332f);
        instancePath.cubicTo(17.866667f, 25.731577f, 20.13509f, 28.0f, 22.933332f, 28.0f);
        instancePath.cubicTo(23.964266f, 28.0f, 24.923283f, 27.692097f, 25.723442f, 27.163237f);
        instancePath.lineTo(25.905624f, 27.037025f);
        instancePath.lineTo(18.829641f, 19.961042f);
        instancePath.close();
        instancePath.moveTo(16.0f, 2.6666667f);
        instancePath.cubicTo(18.945518f, 2.6666667f, 21.333334f, 5.057307f, 21.333334f, 8.000277f);
        instancePath.lineTo(21.333334f, 10.280248f);
        instancePath.cubicTo(21.333334f, 11.799062f, 20.534576f, 13.977147f, 19.55745f, 15.13543f);
        instancePath.lineTo(19.20533f, 15.553006f);
        instancePath.cubicTo(18.393812f, 15.963737f, 17.659203f, 16.504377f, 17.028854f, 17.14758f);
        instancePath.cubicTo(16.953522f, 16.310932f, 17.216484f, 15.429029f, 17.85245f, 14.675158f);
        instancePath.lineTo(18.334492f, 14.103745f);
        instancePath.cubicTo(19.069593f, 13.232358f, 19.733334f, 11.419188f, 19.733334f, 10.280248f);
        instancePath.lineTo(19.733334f, 8.000277f);
        instancePath.cubicTo(19.733334f, 5.9398856f, 18.060787f, 4.266667f, 16.0f, 4.266667f);
        instancePath.cubicTo(13.941745f, 4.266667f, 12.266666f, 5.9402704f, 12.266666f, 7.9994407f);
        instancePath.lineTo(12.266666f, 10.279054f);
        instancePath.cubicTo(12.266666f, 11.420885f, 12.927662f, 13.227312f, 13.665438f, 14.101749f);
        instancePath.lineTo(14.147481f, 14.673083f);
        instancePath.cubicTo(15.608849f, 16.405148f, 15.100286f, 18.804867f, 13.067626f, 19.796783f);
        instancePath.lineTo(5.5204883f, 23.479702f);
        instancePath.cubicTo(5.2493563f, 23.612011f, 4.9333334f, 24.118237f, 4.9333334f, 24.420618f);
        instancePath.lineTo(4.9333334f, 25.066668f);
        instancePath.lineTo(14.944733f, 25.067314f);
        instancePath.cubicTo(15.093629f, 25.626137f, 15.299602f, 26.161674f, 15.556028f, 26.667301f);
        instancePath.lineTo(4.6666665f, 26.666666f);
        instancePath.cubicTo(3.930287f, 26.666666f, 3.3333333f, 26.069714f, 3.3333333f, 25.333334f);
        instancePath.lineTo(3.3333333f, 24.420618f);
        instancePath.cubicTo(3.3333333f, 23.507166f, 3.9975345f, 22.442543f, 4.8187966f, 22.041777f);
        instancePath.lineTo(12.365934f, 18.358858f);
        instancePath.cubicTo(13.460503f, 17.82472f, 13.715013f, 16.641684f, 12.924594f, 15.704852f);
        instancePath.lineTo(12.442551f, 15.133517f);
        instancePath.cubicTo(11.461757f, 13.971046f, 10.666667f, 11.799329f, 10.666667f, 10.279054f);
        instancePath.lineTo(10.666667f, 7.9994407f);
        instancePath.cubicTo(10.666667f, 5.0542307f, 13.060475f, 2.6666667f, 16.0f, 2.6666667f);
        instancePath.close();
        instancePath.moveTo(22.933332f, 17.866667f);
        instancePath.cubicTo(21.902401f, 17.866667f, 20.943384f, 18.174568f, 20.143225f, 18.70343f);
        instancePath.lineTo(19.961042f, 18.829641f);
        instancePath.lineTo(27.037025f, 25.905624f);
        instancePath.lineTo(27.163237f, 25.723442f);
        instancePath.cubicTo(27.692097f, 24.923283f, 28.0f, 23.964266f, 28.0f, 22.933332f);
        instancePath.cubicTo(28.0f, 20.13509f, 25.731577f, 17.866667f, 22.933332f, 17.866667f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
