package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_fav extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.05762f, 1.39941f);
        instancePath.cubicTo(7.57819f, 0.879356f, 8.4218f, 0.87938f, 8.94238f, 1.39941f);
        instancePath.lineTo(14.5996f, 7.05664f);
        instancePath.cubicTo(15.1201f, 7.57719f, 15.1208f, 8.42168f, 14.6006f, 8.94238f);
        instancePath.lineTo(8.94336f, 14.5996f);
        instancePath.cubicTo(8.42268f, 15.1201f, 7.5773f, 15.1202f, 7.05664f, 14.5996f);
        instancePath.lineTo(1.40039f, 8.94238f);
        instancePath.cubicTo(0.879965f, 8.42171f, 0.879899f, 7.57727f, 1.40039f, 7.05664f);
        instancePath.lineTo(7.05762f, 1.39941f);
        instancePath.close();
        instancePath.moveTo(10.9639f, 8.46582f);
        instancePath.cubicTo(10.7579f, 9.78568f, 9.69155f, 10.8194f, 8.35645f, 10.9775f);
        instancePath.cubicTo(8.37074f, 10.9758f, 8.38518f, 10.9755f, 8.39941f, 10.9736f);
        instancePath.lineTo(8.39941f, 14.0107f);
        instancePath.lineTo(13.9443f, 8.46582f);
        instancePath.lineTo(10.9639f, 8.46582f);
        instancePath.close();
        instancePath.moveTo(2.05566f, 8.46582f);
        instancePath.lineTo(7.59961f, 14.0098f);
        instancePath.lineTo(7.59961f, 10.9736f);
        instancePath.cubicTo(7.61438f, 10.9756f, 7.62969f, 10.9758f, 7.64453f, 10.9775f);
        instancePath.cubicTo(6.309f, 10.8198f, 5.24211f, 9.78598f, 5.03613f, 8.46582f);
        instancePath.lineTo(2.05566f, 8.46582f);
        instancePath.close();
        instancePath.moveTo(8.0f, 5.7998f);
        instancePath.cubicTo(6.78499f, 5.79982f, 5.79981f, 6.78499f, 5.7998f, 8.0f);
        instancePath.cubicTo(5.8f, 9.21485f, 6.78511f, 10.2002f, 8.0f, 10.2002f);
        instancePath.cubicTo(9.2149f, 10.2002f, 10.2f, 9.21486f, 10.2002f, 8.0f);
        instancePath.cubicTo(10.2002f, 6.78498f, 9.21502f, 5.7998f, 8.0f, 5.7998f);
        instancePath.close();
        instancePath.moveTo(8.39941f, 5.02539f);
        instancePath.cubicTo(9.75867f, 5.20617f, 10.83f, 6.29769f, 10.9814f, 7.66602f);
        instancePath.lineTo(14.0723f, 7.66602f);
        instancePath.cubicTo(14.0704f, 7.66364f, 14.0693f, 7.66055f, 14.0674f, 7.6582f);
        instancePath.lineTo(14.0342f, 7.62207f);
        instancePath.lineTo(8.39941f, 1.9873f);
        instancePath.lineTo(8.39941f, 5.02539f);
        instancePath.close();
        instancePath.moveTo(1.96582f, 7.62207f);
        instancePath.cubicTo(1.95224f, 7.63566f, 1.94149f, 7.6514f, 1.92969f, 7.66602f);
        instancePath.lineTo(5.01855f, 7.66602f);
        instancePath.cubicTo(5.17053f, 6.29251f, 6.24963f, 5.19896f, 7.61621f, 5.02441f);
        instancePath.cubicTo(7.61081f, 5.0251f, 7.605f, 5.02565f, 7.59961f, 5.02637f);
        instancePath.lineTo(7.59961f, 1.98828f);
        instancePath.lineTo(1.96582f, 7.62207f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
