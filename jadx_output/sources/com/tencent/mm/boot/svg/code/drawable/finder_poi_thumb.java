package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_poi_thumb extends l95.c {
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
                instancePath.moveTo(46.9637f, 20.3917f);
                instancePath.lineTo(46.4321f, 28.664f);
                instancePath.lineTo(58.459f, 28.664f);
                instancePath.cubicTo(62.4994f, 28.664f, 65.5369f, 32.82f, 64.9258f, 36.954f);
                instancePath.lineTo(64.8462f, 37.3966f);
                instancePath.lineTo(60.5598f, 57.6285f);
                instancePath.cubicTo(59.9241f, 60.6059f, 57.4993f, 62.7675f, 54.6293f, 62.9762f);
                instancePath.lineTo(54.1726f, 62.9927f);
                instancePath.lineTo(13.0508f, 62.9773f);
                instancePath.cubicTo(11.3944f, 62.9756f, 10.0519f, 61.6326f, 10.0508f, 59.9762f);
                instancePath.lineTo(10.0508f, 34.2355f);
                instancePath.cubicTo(10.0508f, 32.5786f, 11.3939f, 31.2355f, 13.0508f, 31.2355f);
                instancePath.lineTo(20.3744f, 31.2355f);
                instancePath.lineTo(24.1602f, 31.1463f);
                instancePath.lineTo(25.4116f, 31.0911f);
                instancePath.lineTo(25.915f, 31.0478f);
                instancePath.lineTo(25.9999f, 31.033f);
                instancePath.cubicTo(30.0654f, 30.0872f, 33.1702f, 23.8136f, 33.7403f, 18.2037f);
                instancePath.lineTo(33.7713f, 17.7238f);
                instancePath.lineTo(33.8365f, 16.0066f);
                instancePath.lineTo(33.9029f, 15.1814f);
                instancePath.cubicTo(34.1228f, 13.0577f, 34.8002f, 10.5613f, 37.1442f, 9.53244f);
                instancePath.cubicTo(43.3055f, 6.82815f, 47.3019f, 15.037f, 46.9637f, 20.3917f);
                instancePath.close();
                instancePath.moveTo(38.9528f, 13.653f);
                instancePath.cubicTo(38.8007f, 13.7198f, 38.5781f, 14.1547f, 38.4372f, 15.1446f);
                instancePath.lineTo(38.3884f, 15.5423f);
                instancePath.lineTo(38.3333f, 16.1774f);
                instancePath.lineTo(38.2619f, 18.0134f);
                instancePath.lineTo(38.2173f, 18.6587f);
                instancePath.cubicTo(37.425f, 26.4546f, 33.1465f, 33.9906f, 27.0195f, 35.4159f);
                instancePath.lineTo(26.6512f, 35.4852f);
                instancePath.lineTo(26.3012f, 35.5312f);
                instancePath.lineTo(25.5008f, 35.592f);
                instancePath.lineTo(25.5008f, 58.482f);
                instancePath.lineTo(54.0095f, 58.4957f);
                instancePath.lineTo(54.3029f, 58.488f);
                instancePath.cubicTo(55.0633f, 58.4327f, 55.7636f, 57.8732f, 56.0642f, 57.0264f);
                instancePath.lineTo(56.1575f, 56.6959f);
                instancePath.lineTo(60.4172f, 36.6005f);
                instancePath.lineTo(60.4741f, 36.2958f);
                instancePath.cubicTo(60.695f, 34.8017f, 59.7082f, 33.382f, 58.6932f, 33.1868f);
                instancePath.lineTo(58.459f, 33.164f);
                instancePath.lineTo(41.6337f, 33.164f);
                instancePath.lineTo(42.4727f, 20.108f);
                instancePath.cubicTo(42.7116f, 16.3247f, 40.3359f, 13.0459f, 38.9528f, 13.653f);
                instancePath.close();
                instancePath.moveTo(21.0008f, 35.718f);
                instancePath.lineTo(20.3744f, 35.7355f);
                instancePath.lineTo(14.5478f, 35.733f);
                instancePath.lineTo(14.5478f, 58.476f);
                instancePath.lineTo(21.0008f, 58.479f);
                instancePath.lineTo(21.0008f, 35.718f);
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
