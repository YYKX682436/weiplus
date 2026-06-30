package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_add_to_cart_icon extends l95.c {
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
        instancePath.moveTo(12.4002f, 8.19983f);
        instancePath.lineTo(13.6002f, 8.19983f);
        instancePath.lineTo(13.6002f, 10.5997f);
        instancePath.lineTo(16.0f, 10.5997f);
        instancePath.lineTo(16.0f, 11.7997f);
        instancePath.lineTo(13.6002f, 11.7997f);
        instancePath.lineTo(13.6002f, 14.1998f);
        instancePath.lineTo(12.4002f, 14.1998f);
        instancePath.lineTo(12.4002f, 11.7997f);
        instancePath.lineTo(10.0f, 11.7997f);
        instancePath.lineTo(10.0f, 10.5997f);
        instancePath.lineTo(12.4002f, 10.5997f);
        instancePath.lineTo(12.4002f, 8.19983f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.36477f, 4.15908f);
        instancePath2.lineTo(3.87468f, 6.33647f);
        instancePath2.cubicTo(3.87917f, 6.37417f, 3.88585f, 6.4121f, 3.89482f, 6.45014f);
        instancePath2.lineTo(6.31135f, 16.6996f);
        instancePath2.cubicTo(6.42099f, 17.1646f, 6.84424f, 17.4871f, 7.32167f, 17.4694f);
        instancePath2.lineTo(19.1906f, 17.0298f);
        instancePath2.cubicTo(19.6625f, 17.0123f, 20.0579f, 16.6671f, 20.1388f, 16.2018f);
        instancePath2.lineTo(21.7997f, 6.65199f);
        instancePath2.cubicTo(21.9049f, 6.04688f, 21.4449f, 5.49079f, 20.8308f, 5.48078f);
        instancePath2.lineTo(4.88443f, 5.2208f);
        instancePath2.cubicTo(4.87152f, 5.22058f, 4.85868f, 5.22062f, 4.8459f, 5.22088f);
        instancePath2.lineTo(4.51667f, 3.81506f);
        instancePath2.cubicTo(4.40843f, 3.35286f, 4.01589f, 3.01223f, 3.54305f, 2.9702f);
        instancePath2.lineTo(1.65316f, 2.8022f);
        instancePath2.cubicTo(1.3231f, 2.77286f, 1.03174f, 3.01664f, 1.00239f, 3.34671f);
        instancePath2.cubicTo(0.973052f, 3.67678f, 1.21684f, 3.96814f, 1.54691f, 3.99748f);
        instancePath2.lineTo(3.36477f, 4.15908f);
        instancePath2.close();
        instancePath2.moveTo(7.44159f, 16.2641f);
        instancePath2.lineTo(5.81232f, 9.35377f);
        instancePath2.cubicTo(5.8101f, 9.34022f, 5.80741f, 9.32664f, 5.80423f, 9.31307f);
        instancePath2.lineTo(5.12787f, 6.42492f);
        instancePath2.lineTo(20.5773f, 6.67681f);
        instancePath2.lineTo(18.9843f, 15.8366f);
        instancePath2.lineTo(7.44159f, 16.2641f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(6.00003f, 19.9998f);
        instancePath3.cubicTo(6.00003f, 20.5521f, 5.55232f, 20.9998f, 5.00003f, 20.9998f);
        instancePath3.cubicTo(4.44775f, 20.9998f, 4.00003f, 20.5521f, 4.00003f, 19.9998f);
        instancePath3.cubicTo(4.00003f, 19.4475f, 4.44775f, 18.9998f, 5.00003f, 18.9998f);
        instancePath3.cubicTo(5.55232f, 18.9998f, 6.00003f, 19.4475f, 6.00003f, 19.9998f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(19.0f, 20.9998f);
        instancePath4.cubicTo(19.5523f, 20.9998f, 20.0f, 20.5521f, 20.0f, 19.9998f);
        instancePath4.cubicTo(20.0f, 19.4475f, 19.5523f, 18.9998f, 19.0f, 18.9998f);
        instancePath4.cubicTo(18.4478f, 18.9998f, 18.0f, 19.4475f, 18.0f, 19.9998f);
        instancePath4.cubicTo(18.0f, 20.5521f, 18.4478f, 20.9998f, 19.0f, 20.9998f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
