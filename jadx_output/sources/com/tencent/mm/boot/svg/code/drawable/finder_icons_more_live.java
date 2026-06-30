package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_more_live extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-855638017);
        instancePaint3.setStrokeWidth(1.2f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.6f, 4.2f);
        instancePath.cubicTo(3.6f, 3.868629f, 3.868629f, 3.6f, 4.2f, 3.6f);
        instancePath.lineTo(9.799999f, 3.6f);
        instancePath.cubicTo(10.131371f, 3.6f, 10.4f, 3.868629f, 10.4f, 4.2f);
        instancePath.lineTo(10.4f, 9.799999f);
        instancePath.cubicTo(10.4f, 10.131371f, 10.131371f, 10.4f, 9.799999f, 10.4f);
        instancePath.lineTo(4.2f, 10.4f);
        instancePath.cubicTo(3.868629f, 10.4f, 3.6f, 10.131371f, 3.6f, 9.799999f);
        instancePath.lineTo(3.6f, 4.2f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint4.setColor(-855638017);
        instancePaint4.setStrokeWidth(1.2f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.6f, 14.200001f);
        instancePath2.cubicTo(3.6f, 13.868629f, 3.868629f, 13.6f, 4.2f, 13.6f);
        instancePath2.lineTo(9.799999f, 13.6f);
        instancePath2.cubicTo(10.131371f, 13.6f, 10.4f, 13.868629f, 10.4f, 14.200001f);
        instancePath2.lineTo(10.4f, 19.800001f);
        instancePath2.cubicTo(10.4f, 20.131372f, 10.131371f, 20.400002f, 9.799999f, 20.400002f);
        instancePath2.lineTo(4.2f, 20.400002f);
        instancePath2.cubicTo(3.868629f, 20.400002f, 3.6f, 20.131372f, 3.6f, 19.800001f);
        instancePath2.lineTo(3.6f, 14.200001f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint5.setColor(-855638017);
        instancePaint5.setStrokeWidth(1.2f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(13.6f, 4.2f);
        instancePath3.cubicTo(13.6f, 3.868629f, 13.868629f, 3.6f, 14.200001f, 3.6f);
        instancePath3.lineTo(19.800001f, 3.6f);
        instancePath3.cubicTo(20.131372f, 3.6f, 20.400002f, 3.868629f, 20.400002f, 4.2f);
        instancePath3.lineTo(20.400002f, 9.799999f);
        instancePath3.cubicTo(20.400002f, 10.131371f, 20.131372f, 10.4f, 19.800001f, 10.4f);
        instancePath3.lineTo(14.200001f, 10.4f);
        instancePath3.cubicTo(13.868629f, 10.4f, 13.6f, 10.131371f, 13.6f, 9.799999f);
        instancePath3.lineTo(13.6f, 4.2f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-855638017);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(13.25f, 16.982f);
        instancePath4.cubicTo(13.25f, 14.6433f, 15.157f, 12.75f, 17.5063f, 12.75f);
        instancePath4.cubicTo(19.8555f, 12.75f, 21.7625f, 14.6433f, 21.7625f, 16.982f);
        instancePath4.cubicTo(21.7625f, 17.9519f, 21.4341f, 18.8459f, 20.8824f, 19.5595f);
        instancePath4.lineTo(23.2546f, 21.9174f);
        instancePath4.lineTo(22.4144f, 22.7526f);
        instancePath4.lineTo(20.0344f, 20.387f);
        instancePath4.cubicTo(19.3274f, 20.9067f, 18.4526f, 21.214f, 17.5063f, 21.214f);
        instancePath4.cubicTo(15.157f, 21.214f, 13.25f, 19.3207f, 13.25f, 16.982f);
        instancePath4.close();
        instancePath4.moveTo(17.5062f, 13.9326f);
        instancePath4.cubicTo(15.8096f, 13.9326f, 14.4368f, 15.2993f, 14.4368f, 16.982f);
        instancePath4.cubicTo(14.4368f, 18.6647f, 15.8096f, 20.0314f, 17.5062f, 20.0314f);
        instancePath4.cubicTo(19.2029f, 20.0314f, 20.5757f, 18.6647f, 20.5757f, 16.982f);
        instancePath4.cubicTo(20.5757f, 15.2993f, 19.2029f, 13.9326f, 17.5062f, 13.9326f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
