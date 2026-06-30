package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_change_size extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.0f, 4.5f);
        instancePath.cubicTo(4.7238574f, 4.5f, 4.5f, 4.7238574f, 4.5f, 5.0f);
        instancePath.lineTo(4.5f, 8.75f);
        instancePath.lineTo(3.0f, 8.75f);
        instancePath.lineTo(3.0f, 4.0f);
        instancePath.cubicTo(3.0f, 3.4477153f, 3.4477153f, 3.0f, 4.0f, 3.0f);
        instancePath.lineTo(8.75f, 3.0f);
        instancePath.lineTo(8.75f, 4.5f);
        instancePath.lineTo(5.0f, 4.5f);
        instancePath.close();
        instancePath.moveTo(5.0f, 19.5f);
        instancePath.lineTo(8.75f, 19.5f);
        instancePath.lineTo(8.75f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.4477153f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 15.25f);
        instancePath.lineTo(4.5f, 15.25f);
        instancePath.lineTo(4.5f, 19.0f);
        instancePath.cubicTo(4.5f, 19.276142f, 4.7238574f, 19.5f, 5.0f, 19.5f);
        instancePath.close();
        instancePath.moveTo(19.0f, 4.5f);
        instancePath.lineTo(15.25f, 4.5f);
        instancePath.lineTo(15.25f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        instancePath.cubicTo(20.552284f, 3.0f, 21.0f, 3.4477153f, 21.0f, 4.0f);
        instancePath.lineTo(21.0f, 8.75f);
        instancePath.lineTo(19.5f, 8.75f);
        instancePath.lineTo(19.5f, 5.0f);
        instancePath.cubicTo(19.5f, 4.7238574f, 19.276142f, 4.5f, 19.0f, 4.5f);
        instancePath.close();
        instancePath.moveTo(19.0f, 19.5f);
        instancePath.cubicTo(19.276142f, 19.5f, 19.5f, 19.276142f, 19.5f, 19.0f);
        instancePath.lineTo(19.5f, 15.25f);
        instancePath.lineTo(21.0f, 15.25f);
        instancePath.lineTo(21.0f, 20.0f);
        instancePath.cubicTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(15.25f, 21.0f);
        instancePath.lineTo(15.25f, 19.5f);
        instancePath.lineTo(19.0f, 19.5f);
        instancePath.close();
        instancePath.moveTo(8.0f, 7.0f);
        instancePath.lineTo(16.0f, 7.0f);
        instancePath.cubicTo(16.552284f, 7.0f, 17.0f, 7.4477153f, 17.0f, 8.0f);
        instancePath.lineTo(17.0f, 16.0f);
        instancePath.cubicTo(17.0f, 16.552284f, 16.552284f, 17.0f, 16.0f, 17.0f);
        instancePath.lineTo(8.0f, 17.0f);
        instancePath.cubicTo(7.4477153f, 17.0f, 7.0f, 16.552284f, 7.0f, 16.0f);
        instancePath.lineTo(7.0f, 8.0f);
        instancePath.cubicTo(7.0f, 7.4477153f, 7.4477153f, 7.0f, 8.0f, 7.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
