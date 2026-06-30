package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_task_home_btn extends l95.c {
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
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 12.5f);
        instancePath.cubicTo(11.3807f, 12.5f, 12.5f, 11.3807f, 12.5f, 10.0f);
        instancePath.cubicTo(12.5f, 8.61929f, 11.3807f, 7.5f, 10.0f, 7.5f);
        instancePath.cubicTo(8.61929f, 7.5f, 7.5f, 8.61929f, 7.5f, 10.0f);
        instancePath.cubicTo(7.5f, 11.3807f, 8.61929f, 12.5f, 10.0f, 12.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.5f, 10.0f);
        instancePath2.cubicTo(17.5f, 14.1421f, 14.1421f, 17.5f, 10.0f, 17.5f);
        instancePath2.cubicTo(5.85786f, 17.5f, 2.5f, 14.1421f, 2.5f, 10.0f);
        instancePath2.cubicTo(2.5f, 5.85786f, 5.85786f, 2.5f, 10.0f, 2.5f);
        instancePath2.cubicTo(14.1421f, 2.5f, 17.5f, 5.85786f, 17.5f, 10.0f);
        instancePath2.close();
        instancePath2.moveTo(15.8333f, 10.0f);
        instancePath2.cubicTo(15.8333f, 13.2217f, 13.2217f, 15.8333f, 10.0f, 15.8333f);
        instancePath2.cubicTo(6.77834f, 15.8333f, 4.16667f, 13.2217f, 4.16667f, 10.0f);
        instancePath2.cubicTo(4.16667f, 6.77834f, 6.77834f, 4.16667f, 10.0f, 4.16667f);
        instancePath2.cubicTo(13.2217f, 4.16667f, 15.8333f, 6.77834f, 15.8333f, 10.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
