package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_role_change extends l95.c {
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
        instancePath.moveTo(13.2181f, 15.0642f);
        instancePath.lineTo(11.8811f, 17.916f);
        instancePath.cubicTo(11.8071f, 18.0739f, 11.8245f, 18.2596f, 11.9267f, 18.4009f);
        instancePath.cubicTo(12.0819f, 18.6158f, 12.382f, 18.6641f, 12.5969f, 18.5088f);
        instancePath.lineTo(18.357f, 14.3461f);
        instancePath.cubicTo(18.5131f, 14.2333f, 18.6056f, 14.0524f, 18.6056f, 13.8598f);
        instancePath.cubicTo(18.6056f, 13.5285f, 18.337f, 13.2598f, 18.0056f, 13.2598f);
        instancePath.lineTo(14.0641f, 13.2598f);
        instancePath.lineTo(14.062f, 13.2642f);
        instancePath.lineTo(6.00006f, 13.2642f);
        instancePath.lineTo(6.00006f, 15.0642f);
        instancePath.lineTo(13.2181f, 15.0642f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.0515f, 8.93571f);
        instancePath2.lineTo(12.3885f, 6.08393f);
        instancePath2.cubicTo(12.4626f, 5.92602f, 12.4451f, 5.74037f, 12.343f, 5.59902f);
        instancePath2.cubicTo(12.1877f, 5.38416f, 11.8876f, 5.33585f, 11.6728f, 5.49112f);
        instancePath2.lineTo(5.91259f, 9.65382f);
        instancePath2.cubicTo(5.75649f, 9.76663f, 5.66403f, 9.94752f, 5.66403f, 10.1401f);
        instancePath2.cubicTo(5.66403f, 10.4715f, 5.93265f, 10.7401f, 6.26403f, 10.7401f);
        instancePath2.lineTo(10.2056f, 10.7401f);
        instancePath2.lineTo(10.2076f, 10.7357f);
        instancePath2.lineTo(18.264f, 10.7357f);
        instancePath2.lineTo(18.264f, 8.93571f);
        instancePath2.lineTo(11.0515f, 8.93571f);
        instancePath2.lineTo(11.0515f, 8.93571f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
