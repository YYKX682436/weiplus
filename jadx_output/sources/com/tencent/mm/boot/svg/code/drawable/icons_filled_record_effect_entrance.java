package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_record_effect_entrance extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(25.5f, 42.0f);
        instancePath.cubicTo(30.257812f, 42.0f, 34.273438f, 45.164062f, 35.566406f, 49.5f);
        instancePath.lineTo(66.0f, 49.5f);
        instancePath.lineTo(66.0f, 55.5f);
        instancePath.lineTo(35.5625f, 55.503906f);
        instancePath.cubicTo(34.273438f, 59.839844f, 30.253906f, 63.0f, 25.5f, 63.0f);
        instancePath.cubicTo(20.746094f, 63.0f, 16.726562f, 59.839844f, 15.4375f, 55.503906f);
        instancePath.lineTo(6.0f, 55.5f);
        instancePath.lineTo(6.0f, 49.5f);
        instancePath.lineTo(15.433594f, 49.5f);
        instancePath.cubicTo(16.726562f, 45.164062f, 20.742188f, 42.0f, 25.5f, 42.0f);
        instancePath.close();
        instancePath.moveTo(25.5f, 48.0f);
        instancePath.cubicTo(23.015625f, 48.0f, 21.0f, 50.015625f, 21.0f, 52.5f);
        instancePath.cubicTo(21.0f, 54.984375f, 23.015625f, 57.0f, 25.5f, 57.0f);
        instancePath.cubicTo(27.984375f, 57.0f, 30.0f, 54.984375f, 30.0f, 52.5f);
        instancePath.cubicTo(30.0f, 50.015625f, 27.984375f, 48.0f, 25.5f, 48.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 9.0f);
        instancePath.cubicTo(52.92578f, 9.0f, 58.30078f, 13.488281f, 59.664062f, 19.5f);
        instancePath.lineTo(66.0f, 19.5f);
        instancePath.lineTo(66.0f, 25.5f);
        instancePath.lineTo(59.664062f, 25.503906f);
        instancePath.cubicTo(58.30078f, 31.511719f, 52.921875f, 36.0f, 46.5f, 36.0f);
        instancePath.cubicTo(40.078125f, 36.0f, 34.69922f, 31.511719f, 33.335938f, 25.503906f);
        instancePath.lineTo(6.0f, 25.5f);
        instancePath.lineTo(6.0f, 19.5f);
        instancePath.lineTo(33.335938f, 19.5f);
        instancePath.cubicTo(34.69922f, 13.488281f, 40.07422f, 9.0f, 46.5f, 9.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 15.0f);
        instancePath.cubicTo(42.359375f, 15.0f, 39.0f, 18.359375f, 39.0f, 22.5f);
        instancePath.cubicTo(39.0f, 26.640625f, 42.359375f, 30.0f, 46.5f, 30.0f);
        instancePath.cubicTo(50.640625f, 30.0f, 54.0f, 26.640625f, 54.0f, 22.5f);
        instancePath.cubicTo(54.0f, 18.359375f, 50.640625f, 15.0f, 46.5f, 15.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 15.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
