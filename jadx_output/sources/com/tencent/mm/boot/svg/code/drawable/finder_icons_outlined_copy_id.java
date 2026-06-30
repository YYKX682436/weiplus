package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_copy_id extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(49.5f, 63.0f);
        instancePath.cubicTo(49.5f, 64.65685f, 48.156853f, 66.0f, 46.5f, 66.0f);
        instancePath.lineTo(16.5f, 66.0f);
        instancePath.cubicTo(14.843145f, 66.0f, 13.5f, 64.65685f, 13.5f, 63.0f);
        instancePath.lineTo(13.5f, 21.0f);
        instancePath.cubicTo(13.5f, 19.343145f, 14.843145f, 18.0f, 16.5f, 18.0f);
        instancePath.lineTo(25.5f, 18.0f);
        instancePath.lineTo(25.5f, 9.0f);
        instancePath.cubicTo(25.5f, 7.343146f, 26.843145f, 6.0f, 28.5f, 6.0f);
        instancePath.lineTo(49.8f, 6.0f);
        instancePath.lineTo(49.799f, 6.112f);
        instancePath.lineTo(61.379f, 17.7f);
        instancePath.lineTo(61.5f, 17.7f);
        instancePath.lineTo(61.499f, 17.82f);
        instancePath.lineTo(61.5f, 17.821234f);
        instancePath.lineTo(61.5f, 51.0f);
        instancePath.cubicTo(61.5f, 52.656853f, 60.156853f, 54.0f, 58.5f, 54.0f);
        instancePath.lineTo(49.5f, 54.0f);
        instancePath.lineTo(49.5f, 63.0f);
        instancePath.close();
        instancePath.moveTo(46.2f, 9.6f);
        instancePath.lineTo(29.1f, 9.6f);
        instancePath.lineTo(29.1f, 50.4f);
        instancePath.lineTo(57.9f, 50.4f);
        instancePath.lineTo(57.9f, 21.3f);
        instancePath.lineTo(51.0f, 21.3f);
        instancePath.cubicTo(48.349033f, 21.3f, 46.2f, 19.150967f, 46.2f, 16.5f);
        instancePath.lineTo(46.2f, 9.6f);
        instancePath.close();
        instancePath.moveTo(49.799f, 11.205f);
        instancePath.lineTo(49.8f, 16.5f);
        instancePath.cubicTo(49.8f, 17.162743f, 50.337257f, 17.7f, 51.0f, 17.7f);
        instancePath.lineTo(56.291f, 17.7f);
        instancePath.lineTo(49.799f, 11.205f);
        instancePath.close();
        instancePath.moveTo(28.5f, 54.0f);
        instancePath.cubicTo(26.843145f, 54.0f, 25.5f, 52.656853f, 25.5f, 51.0f);
        instancePath.lineTo(25.5f, 21.599f);
        instancePath.lineTo(17.1f, 21.6f);
        instancePath.lineTo(17.1f, 62.4f);
        instancePath.lineTo(45.9f, 62.4f);
        instancePath.lineTo(45.9f, 54.0f);
        instancePath.lineTo(28.5f, 54.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
