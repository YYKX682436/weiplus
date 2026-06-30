package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_goforward_10 extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(30.7696f, 4.48911f);
                instancePath.cubicTo(30.6034f, 4.73637f, 30.5147f, 5.02748f, 30.5147f, 5.32533f);
                instancePath.lineTo(30.5143f, 10.3051f);
                instancePath.cubicTo(17.8214f, 12.8566f, 8.26172f, 24.0649f, 8.26172f, 37.5053f);
                instancePath.cubicTo(8.26172f, 52.8285f, 20.6875f, 65.2504f, 36.0155f, 65.2504f);
                instancePath.cubicTo(51.3434f, 65.2504f, 63.7692f, 52.8285f, 63.7692f, 37.5053f);
                instancePath.cubicTo(63.7692f, 29.6271f, 60.4643f, 22.2743f, 54.7702f, 17.0533f);
                instancePath.cubicTo(53.8543f, 16.2136f, 52.4308f, 16.275f, 51.5908f, 17.1906f);
                instancePath.cubicTo(50.7507f, 18.1063f, 50.8122f, 19.5293f, 51.7281f, 20.3691f);
                instancePath.cubicTo(56.5023f, 24.7466f, 59.2686f, 30.9012f, 59.2686f, 37.5053f);
                instancePath.cubicTo(59.2686f, 50.3437f, 48.8578f, 60.7512f, 36.0155f, 60.7512f);
                instancePath.cubicTo(23.1731f, 60.7512f, 12.7623f, 50.3437f, 12.7623f, 37.5053f);
                instancePath.cubicTo(12.7623f, 26.5615f, 20.3271f, 17.384f, 30.5143f, 14.9136f);
                instancePath.lineTo(30.5147f, 20.6937f);
                instancePath.cubicTo(30.5147f, 21.522f, 31.1864f, 22.1934f, 32.0149f, 22.1934f);
                instancePath.cubicTo(32.3129f, 22.1934f, 32.6041f, 22.1047f, 32.8514f, 21.9387f);
                instancePath.lineTo(44.2951f, 14.2545f);
                instancePath.cubicTo(44.9829f, 13.7926f, 45.1659f, 12.8609f, 44.704f, 12.1733f);
                instancePath.cubicTo(44.5955f, 12.0118f, 44.4566f, 11.873f, 44.2951f, 11.7645f);
                instancePath.lineTo(32.8514f, 4.08037f);
                instancePath.cubicTo(32.1636f, 3.61853f, 31.2316f, 3.80153f, 30.7696f, 4.48911f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(29.1689f, 26.81f);
                instancePath2.cubicTo(29.842f, 27.1785f, 30.2606f, 27.8847f, 30.2606f, 28.6521f);
                instancePath2.lineTo(30.2606f, 46.5798f);
                instancePath2.cubicTo(30.2606f, 47.7395f, 29.3204f, 48.6798f, 28.1606f, 48.6798f);
                instancePath2.cubicTo(27.0008f, 48.6798f, 26.0606f, 47.7395f, 26.0606f, 46.5798f);
                instancePath2.lineTo(26.0606f, 32.4883f);
                instancePath2.lineTo(23.4936f, 34.1303f);
                instancePath2.cubicTo(22.5166f, 34.7552f, 21.2179f, 34.4699f, 20.5929f, 33.4928f);
                instancePath2.cubicTo(19.968f, 32.5158f, 20.2534f, 31.2172f, 21.2304f, 30.5922f);
                instancePath2.lineTo(27.029f, 26.883f);
                instancePath2.cubicTo(27.6754f, 26.4696f, 28.4958f, 26.4416f, 29.1689f, 26.81f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(40.4159f, 31.7942f);
                instancePath3.cubicTo(39.4882f, 33.1444f, 38.8558f, 35.1096f, 38.8558f, 37.3702f);
                instancePath3.cubicTo(38.8558f, 39.6308f, 39.4882f, 41.596f, 40.4159f, 42.9462f);
                instancePath3.cubicTo(41.3461f, 44.3001f, 42.4622f, 44.9089f, 43.4997f, 44.9089f);
                instancePath3.cubicTo(44.5371f, 44.9089f, 45.6532f, 44.3001f, 46.5835f, 42.9462f);
                instancePath3.cubicTo(47.5112f, 41.596f, 48.1436f, 39.6308f, 48.1436f, 37.3702f);
                instancePath3.cubicTo(48.1436f, 35.1096f, 47.5112f, 33.1444f, 46.5835f, 31.7942f);
                instancePath3.cubicTo(45.6532f, 30.4402f, 44.5371f, 29.8315f, 43.4997f, 29.8315f);
                instancePath3.cubicTo(42.4622f, 29.8315f, 41.3461f, 30.4402f, 40.4159f, 31.7942f);
                instancePath3.close();
                instancePath3.moveTo(37.3644f, 29.5281f);
                instancePath3.cubicTo(38.7935f, 27.4481f, 40.9369f, 25.9329f, 43.4997f, 25.9329f);
                instancePath3.cubicTo(46.0625f, 25.9329f, 48.2058f, 27.4481f, 49.635f, 29.5281f);
                instancePath3.cubicTo(51.0667f, 31.6119f, 51.8936f, 34.3907f, 51.8936f, 37.3702f);
                instancePath3.cubicTo(51.8936f, 40.3497f, 51.0667f, 43.1285f, 49.635f, 45.2122f);
                instancePath3.cubicTo(48.2058f, 47.2923f, 46.0625f, 48.8075f, 43.4997f, 48.8075f);
                instancePath3.cubicTo(40.9369f, 48.8075f, 38.7935f, 47.2923f, 37.3644f, 45.2122f);
                instancePath3.cubicTo(35.9327f, 43.1285f, 35.1058f, 40.3497f, 35.1058f, 37.3702f);
                instancePath3.cubicTo(35.1058f, 34.3907f, 35.9327f, 31.6119f, 37.3644f, 29.5281f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
