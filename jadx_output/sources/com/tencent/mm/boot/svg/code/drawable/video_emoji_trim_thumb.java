package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_emoji_trim_thumb extends l95.c {
    private final int width = 16;
    private final int height = 56;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 56;
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(12.0f, 0.0f);
        instancePath.cubicTo(14.2091f, 0.0f, 16.0f, 1.79086f, 16.0f, 4.0f);
        instancePath.lineTo(16.0f, 52.0f);
        instancePath.cubicTo(16.0f, 54.2091f, 14.2091f, 56.0f, 12.0f, 56.0f);
        instancePath.lineTo(0.0f, 56.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(1275068416);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.0f, 24.0f);
        instancePath2.cubicTo(5.0f, 23.447716f, 5.4477153f, 23.0f, 6.0f, 23.0f);
        instancePath2.lineTo(6.0f, 23.0f);
        instancePath2.cubicTo(6.5522847f, 23.0f, 7.0f, 23.447716f, 7.0f, 24.0f);
        instancePath2.lineTo(7.0f, 32.0f);
        instancePath2.cubicTo(7.0f, 32.552284f, 6.5522847f, 33.0f, 6.0f, 33.0f);
        instancePath2.lineTo(6.0f, 33.0f);
        instancePath2.cubicTo(5.4477153f, 33.0f, 5.0f, 32.552284f, 5.0f, 32.0f);
        instancePath2.lineTo(5.0f, 24.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(1275068416);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(9.0f, 24.0f);
        instancePath3.cubicTo(9.0f, 23.447716f, 9.447715f, 23.0f, 10.0f, 23.0f);
        instancePath3.lineTo(10.0f, 23.0f);
        instancePath3.cubicTo(10.552285f, 23.0f, 11.0f, 23.447716f, 11.0f, 24.0f);
        instancePath3.lineTo(11.0f, 32.0f);
        instancePath3.cubicTo(11.0f, 32.552284f, 10.552285f, 33.0f, 10.0f, 33.0f);
        instancePath3.lineTo(10.0f, 33.0f);
        instancePath3.cubicTo(9.447715f, 33.0f, 9.0f, 32.552284f, 9.0f, 32.0f);
        instancePath3.lineTo(9.0f, 24.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
