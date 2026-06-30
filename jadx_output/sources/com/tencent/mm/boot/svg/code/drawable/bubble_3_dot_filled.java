package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bubble_3_dot_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePath.moveTo(22.0f, 11.5f);
                instancePath.cubicTo(22.0f, 6.80558f, 17.5228f, 3.0f, 12.0f, 3.0f);
                instancePath.cubicTo(6.47715f, 3.0f, 2.0f, 6.80558f, 2.0f, 11.5f);
                instancePath.cubicTo(2.0f, 14.0364f, 3.307f, 16.3133f, 5.37976f, 17.8707f);
                instancePath.lineTo(5.07766f, 20.4696f);
                instancePath.lineTo(5.07528f, 20.5598f);
                instancePath.cubicTo(5.0904f, 20.7964f, 5.27276f, 20.9957f, 5.51658f, 21.024f);
                instancePath.cubicTo(5.61038f, 21.0349f, 5.70535f, 21.019f, 5.7905f, 20.9782f);
                instancePath.lineTo(8.77345f, 19.5478f);
                instancePath.lineTo(9.15642f, 19.6514f);
                instancePath.cubicTo(10.0577f, 19.8782f, 11.0121f, 20.0f, 12.0f, 20.0f);
                instancePath.cubicTo(17.5228f, 20.0f, 22.0f, 16.1944f, 22.0f, 11.5f);
                instancePath.close();
                instancePath.moveTo(7.5f, 12.751f);
                instancePath.cubicTo(8.1909f, 12.751f, 8.75098f, 12.1909f, 8.75098f, 11.5f);
                instancePath.cubicTo(8.75098f, 10.8091f, 8.1909f, 10.249f, 7.5f, 10.249f);
                instancePath.cubicTo(6.8091f, 10.249f, 6.24902f, 10.8091f, 6.24902f, 11.5f);
                instancePath.cubicTo(6.24902f, 12.1909f, 6.8091f, 12.751f, 7.5f, 12.751f);
                instancePath.close();
                instancePath.moveTo(13.251f, 11.5f);
                instancePath.cubicTo(13.251f, 12.1909f, 12.6909f, 12.751f, 12.0f, 12.751f);
                instancePath.cubicTo(11.3091f, 12.751f, 10.749f, 12.1909f, 10.749f, 11.5f);
                instancePath.cubicTo(10.749f, 10.8091f, 11.3091f, 10.249f, 12.0f, 10.249f);
                instancePath.cubicTo(12.6909f, 10.249f, 13.251f, 10.8091f, 13.251f, 11.5f);
                instancePath.close();
                instancePath.moveTo(17.751f, 11.5f);
                instancePath.cubicTo(17.751f, 12.1909f, 17.1909f, 12.751f, 16.5f, 12.751f);
                instancePath.cubicTo(15.8091f, 12.751f, 15.249f, 12.1909f, 15.249f, 11.5f);
                instancePath.cubicTo(15.249f, 10.8091f, 15.8091f, 10.249f, 16.5f, 10.249f);
                instancePath.cubicTo(17.1909f, 10.249f, 17.751f, 10.8091f, 17.751f, 11.5f);
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
