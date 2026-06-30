package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fans_greet_holder_avatar extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePaint3.setColor(-16728976);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(40.0f, 0.0f);
        instancePath.lineTo(40.0f, 40.0f);
        instancePath.lineTo(0.0f, 40.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.4262f, 12.1393f);
        instancePath2.cubicTo(13.9164f, 13.4253f, 12.2002f, 16.0397f, 12.2002f, 19.0394f);
        instancePath2.cubicTo(12.2002f, 21.7142f, 13.5543f, 24.0788f, 15.619f, 25.4701f);
        instancePath2.lineTo(14.5014f, 27.1287f);
        instancePath2.cubicTo(11.9061f, 25.3799f, 10.2002f, 22.4045f, 10.2002f, 19.0394f);
        instancePath2.cubicTo(10.2002f, 15.259f, 12.364f, 11.9735f, 15.5142f, 10.3594f);
        instancePath2.lineTo(16.4262f, 12.1393f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(27.7962f, 19.0394f);
        instancePath3.cubicTo(27.7962f, 16.0397f, 26.08f, 13.4253f, 23.5702f, 12.1393f);
        instancePath3.lineTo(24.4822f, 10.3594f);
        instancePath3.cubicTo(27.6324f, 11.9735f, 29.7962f, 15.259f, 29.7962f, 19.0394f);
        instancePath3.cubicTo(29.7962f, 22.3942f, 28.1008f, 25.3577f, 25.5191f, 27.1159f);
        instancePath3.lineTo(24.3933f, 25.4628f);
        instancePath3.cubicTo(26.4516f, 24.0611f, 27.7962f, 21.7045f, 27.7962f, 19.0394f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(21.1776f, 20.5004f);
        instancePath4.lineTo(18.8231f, 20.5004f);
        instancePath4.cubicTo(17.9159f, 20.5004f, 17.1758f, 21.3023f, 17.2562f, 22.2097f);
        instancePath4.lineTo(18.2936f, 29.1892f);
        instancePath4.cubicTo(18.3629f, 29.6548f, 18.7626f, 29.9995f, 19.2333f, 29.9995f);
        instancePath4.lineTo(20.7663f, 29.9995f);
        instancePath4.cubicTo(21.2371f, 29.9995f, 21.6368f, 29.6548f, 21.706f, 29.1892f);
        instancePath4.lineTo(22.7434f, 22.2097f);
        instancePath4.cubicTo(22.8463f, 21.3061f, 22.072f, 20.5004f, 21.1776f, 20.5004f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(22.5f, 16.4995f);
        instancePath5.cubicTo(22.5f, 17.8802f, 21.3807f, 18.9995f, 20.0f, 18.9995f);
        instancePath5.cubicTo(18.6193f, 18.9995f, 17.5f, 17.8802f, 17.5f, 16.4995f);
        instancePath5.cubicTo(17.5f, 15.1188f, 18.6193f, 13.9995f, 20.0f, 13.9995f);
        instancePath5.cubicTo(21.3807f, 13.9995f, 22.5f, 15.1188f, 22.5f, 16.4995f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
