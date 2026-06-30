package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_filled_topic extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15132391);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 6.0f);
        instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
        instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
        instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
        instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(33.3f, 21.0f);
        instancePath.lineTo(28.8f, 21.0f);
        instancePath.lineTo(28.08f, 26.999f);
        instancePath.lineTo(21.0f, 27.0f);
        instancePath.lineTo(21.0f, 31.5f);
        instancePath.lineTo(27.54f, 31.499f);
        instancePath.lineTo(26.46f, 40.499f);
        instancePath.lineTo(21.0f, 40.5f);
        instancePath.lineTo(21.0f, 45.0f);
        instancePath.lineTo(25.92f, 44.999f);
        instancePath.lineTo(25.2f, 51.0f);
        instancePath.lineTo(29.7f, 51.0f);
        instancePath.lineTo(30.42f, 44.999f);
        instancePath.lineTo(39.42f, 44.999f);
        instancePath.lineTo(38.7f, 51.0f);
        instancePath.lineTo(43.2f, 51.0f);
        instancePath.lineTo(43.92f, 44.999f);
        instancePath.lineTo(51.0f, 45.0f);
        instancePath.lineTo(51.0f, 40.5f);
        instancePath.lineTo(44.46f, 40.499f);
        instancePath.lineTo(45.54f, 31.499f);
        instancePath.lineTo(51.0f, 31.5f);
        instancePath.lineTo(51.0f, 27.0f);
        instancePath.lineTo(46.08f, 26.999f);
        instancePath.lineTo(46.8f, 21.0f);
        instancePath.lineTo(42.3f, 21.0f);
        instancePath.lineTo(41.58f, 26.999f);
        instancePath.lineTo(32.58f, 26.999f);
        instancePath.lineTo(33.3f, 21.0f);
        instancePath.close();
        instancePath.moveTo(41.04f, 31.499f);
        instancePath.lineTo(39.96f, 40.499f);
        instancePath.lineTo(30.96f, 40.499f);
        instancePath.lineTo(32.04f, 31.499f);
        instancePath.lineTo(41.04f, 31.499f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
