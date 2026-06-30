package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_weixin_pay extends l95.c {
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
            instancePath.moveTo(12.0f, 3.0f);
            instancePath.cubicTo(17.5228f, 3.0f, 22.0f, 6.80185f, 22.0f, 11.4912f);
            instancePath.cubicTo(21.9998f, 16.1804f, 17.5227f, 19.9814f, 12.0f, 19.9814f);
            instancePath.cubicTo(10.871f, 19.9814f, 9.7857f, 19.8231f, 8.77344f, 19.5303f);
            instancePath.lineTo(5.80664f, 20.9512f);
            instancePath.cubicTo(5.71902f, 20.993f, 5.6207f, 21.0089f, 5.52441f, 20.9961f);
            instancePath.cubicTo(5.25084f, 20.9595f, 5.05921f, 20.7079f, 5.0957f, 20.4346f);
            instancePath.lineTo(5.43457f, 17.8955f);
            instancePath.cubicTo(3.33037f, 16.339f, 2.00013f, 14.0469f, 2.0f, 11.4912f);
            instancePath.cubicTo(2.0f, 6.80185f, 6.47715f, 3.0f, 12.0f, 3.0f);
            instancePath.close();
            instancePath.moveTo(12.0f, 4.2002f);
            instancePath.cubicTo(7.10034f, 4.2002f, 3.2002f, 7.51209f, 3.2002f, 11.4912f);
            instancePath.cubicTo(3.20032f, 13.5823f, 4.2755f, 15.5458f, 6.14746f, 16.9307f);
            instancePath.lineTo(6.71777f, 17.3516f);
            instancePath.lineTo(6.45605f, 19.3096f);
            instancePath.lineTo(8.66797f, 18.25f);
            instancePath.lineTo(9.10645f, 18.377f);
            instancePath.cubicTo(10.0278f, 18.6435f, 11.0021f, 18.7812f, 12.0f, 18.7812f);
            instancePath.cubicTo(16.8995f, 18.7812f, 20.7996f, 15.4702f, 20.7998f, 11.4912f);
            instancePath.cubicTo(20.7998f, 9.94034f, 20.2056f, 8.49236f, 19.1924f, 7.30078f);
            instancePath.lineTo(9.34668f, 14.3506f);
            instancePath.lineTo(9.27344f, 14.3936f);
            instancePath.cubicTo(9.18316f, 14.4396f, 9.08135f, 14.4668f, 8.97363f, 14.4668f);
            instancePath.cubicTo(8.72372f, 14.4667f, 8.50672f, 14.3263f, 8.39258f, 14.1191f);
            instancePath.lineTo(8.34863f, 14.0215f);
            instancePath.lineTo(6.52734f, 9.94629f);
            instancePath.cubicTo(6.50778f, 9.90202f, 6.49609f, 9.85148f, 6.49609f, 9.80273f);
            instancePath.cubicTo(6.49623f, 9.61527f, 6.6453f, 9.46296f, 6.8291f, 9.46289f);
            instancePath.cubicTo(6.90445f, 9.46289f, 6.97334f, 9.48886f, 7.0293f, 9.53125f);
            instancePath.lineTo(9.17676f, 11.0908f);
            instancePath.cubicTo(9.33327f, 11.1954f, 9.52197f, 11.2568f, 9.72363f, 11.2568f);
            instancePath.cubicTo(9.84353f, 11.2568f, 9.95882f, 11.2342f, 10.0654f, 11.1943f);
            instancePath.lineTo(19.0732f, 7.16113f);
            instancePath.cubicTo(17.4767f, 5.37309f, 14.9154f, 4.2002f, 12.0f, 4.2002f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
