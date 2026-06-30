package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_living_tag extends l95.c {
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
        instancePath.moveTo(17.5f, 12.0f);
        instancePath.cubicTo(17.5f, 8.96243f, 15.0376f, 6.5f, 12.0f, 6.5f);
        instancePath.cubicTo(8.96243f, 6.5f, 6.5f, 8.96243f, 6.5f, 12.0f);
        instancePath.cubicTo(6.5f, 15.0376f, 8.96243f, 17.5f, 12.0f, 17.5f);
        instancePath.cubicTo(15.0376f, 17.5f, 17.5f, 15.0376f, 17.5f, 12.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(22.0f, 12.0f);
        instancePath2.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
        instancePath2.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
        instancePath2.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
        instancePath2.cubicTo(17.5228f, 2.0f, 22.0f, 6.47715f, 22.0f, 12.0f);
        instancePath2.close();
        instancePath2.moveTo(20.0f, 12.0f);
        instancePath2.cubicTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f);
        instancePath2.cubicTo(7.58172f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f);
        instancePath2.cubicTo(4.0f, 7.58172f, 7.58172f, 4.0f, 12.0f, 4.0f);
        instancePath2.cubicTo(16.4183f, 4.0f, 20.0f, 7.58172f, 20.0f, 12.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
