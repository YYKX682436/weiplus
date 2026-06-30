package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_promotion_mini_app extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 3.0f);
        instancePath.cubicTo(20.552284f, 3.0f, 21.0f, 3.4477153f, 21.0f, 4.0f);
        instancePath.lineTo(21.0f, 20.0f);
        instancePath.cubicTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.4477153f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 4.0f);
        instancePath.cubicTo(3.0f, 3.4477153f, 3.4477153f, 3.0f, 4.0f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        instancePath.close();
        instancePath.moveTo(19.8f, 4.2f);
        instancePath.lineTo(4.2f, 4.2f);
        instancePath.lineTo(4.2f, 19.8f);
        instancePath.lineTo(19.8f, 19.8f);
        instancePath.lineTo(19.8f, 4.2f);
        instancePath.close();
        instancePath.moveTo(17.4f, 8.0f);
        instancePath.cubicTo(17.698235f, 8.0f, 17.945646f, 8.217589f, 17.992147f, 8.502677f);
        instancePath.lineTo(18.0f, 8.6f);
        instancePath.lineTo(18.0f, 12.1f);
        instancePath.lineTo(16.8f, 12.1f);
        instancePath.lineTo(16.798737f, 10.048f);
        instancePath.lineTo(12.924264f, 13.924264f);
        instancePath.cubicTo(12.715984f, 14.132544f, 12.392675f, 14.155685f, 12.1588335f, 13.9936905f);
        instancePath.lineTo(12.075736f, 13.924264f);
        instancePath.lineTo(10.5f, 12.349f);
        instancePath.lineTo(6.424264f, 16.424265f);
        instancePath.lineTo(5.575736f, 15.575736f);
        instancePath.lineTo(10.075736f, 11.075736f);
        instancePath.cubicTo(10.284016f, 10.867456f, 10.607325f, 10.844315f, 10.8411665f, 11.0063095f);
        instancePath.lineTo(10.924264f, 11.075736f);
        instancePath.lineTo(12.5f, 12.651f);
        instancePath.lineTo(15.9517355f, 9.199f);
        instancePath.lineTo(13.9f, 9.2f);
        instancePath.lineTo(13.9f, 8.0f);
        instancePath.lineTo(17.4f, 8.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
