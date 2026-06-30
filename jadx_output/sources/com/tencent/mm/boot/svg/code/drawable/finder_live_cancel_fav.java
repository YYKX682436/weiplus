package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_cancel_fav extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.2677f, 2.5f);
        instancePath.lineTo(7.78438f, 6.01667f);
        instancePath.lineTo(9.25265f, 3.04329f);
        instancePath.cubicTo(9.45634f, 2.63057f, 9.95602f, 2.46113f, 10.3687f, 2.66481f);
        instancePath.cubicTo(10.5331f, 2.74592f, 10.6661f, 2.87894f, 10.7472f, 3.04329f);
        instancePath.lineTo(12.6939f, 6.9878f);
        instancePath.lineTo(17.047f, 7.62034f);
        instancePath.cubicTo(17.5024f, 7.68652f, 17.818f, 8.10939f, 17.7518f, 8.56484f);
        instancePath.cubicTo(17.7255f, 8.7462f, 17.6401f, 8.91382f, 17.5088f, 9.04175f);
        instancePath.lineTo(14.3589f, 12.1121f);
        instancePath.lineTo(14.4577f, 12.69f);
        instancePath.lineTo(18.4098f, 16.6421f);
        instancePath.lineTo(17.5259f, 17.526f);
        instancePath.lineTo(3.38381f, 3.38388f);
        instancePath.lineTo(4.2677f, 2.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.745f, 7.5f);
        instancePath2.lineTo(15.3359f, 17.089f);
        instancePath2.cubicTo(15.2442f, 17.3757f, 14.9998f, 17.6026f, 14.6827f, 17.657f);
        instancePath2.cubicTo(14.502f, 17.688f, 14.3162f, 17.6586f, 14.154f, 17.5733f);
        instancePath2.lineTo(10.2606f, 15.5264f);
        instancePath2.lineTo(6.36708f, 17.5733f);
        instancePath2.cubicTo(5.95971f, 17.7875f, 5.45585f, 17.6309f, 5.24169f, 17.2235f);
        instancePath2.cubicTo(5.1564f, 17.0613f, 5.12697f, 16.8755f, 5.15795f, 16.6948f);
        instancePath2.lineTo(5.90154f, 12.3594f);
        instancePath2.lineTo(2.75166f, 9.28901f);
        instancePath2.cubicTo(2.42209f, 8.96776f, 2.41534f, 8.44016f, 2.7366f, 8.11059f);
        instancePath2.cubicTo(2.86452f, 7.97936f, 3.03214f, 7.89395f, 3.2135f, 7.8676f);
        instancePath2.lineTo(5.745f, 7.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
