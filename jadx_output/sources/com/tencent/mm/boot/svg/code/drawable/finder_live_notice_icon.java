package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_notice_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
        if (i17 == 2) {
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(16.0f, 0.0f);
            instancePath.lineTo(16.0f, 16.0f);
            instancePath.lineTo(0.0f, 16.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(8.0f, 1.3333334f);
            instancePath2.cubicTo(11.681898f, 1.3333334f, 14.666667f, 4.318102f, 14.666667f, 8.0f);
            instancePath2.cubicTo(14.666667f, 11.681898f, 11.681898f, 14.666667f, 8.0f, 14.666667f);
            instancePath2.cubicTo(4.318102f, 14.666667f, 1.3333334f, 11.681898f, 1.3333334f, 8.0f);
            instancePath2.cubicTo(1.3333334f, 4.318102f, 4.318102f, 1.3333334f, 8.0f, 1.3333334f);
            instancePath2.close();
            instancePath2.moveTo(8.0f, 2.3333333f);
            instancePath2.cubicTo(4.8703866f, 2.3333333f, 2.3333333f, 4.8703866f, 2.3333333f, 8.0f);
            instancePath2.cubicTo(2.3333333f, 11.129614f, 4.8703866f, 13.666667f, 8.0f, 13.666667f);
            instancePath2.cubicTo(11.129614f, 13.666667f, 13.666667f, 11.129614f, 13.666667f, 8.0f);
            instancePath2.cubicTo(13.666667f, 4.8703866f, 11.129614f, 2.3333333f, 8.0f, 2.3333333f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(8.0f, 4.333333f);
            instancePath3.cubicTo(10.025044f, 4.333333f, 11.666667f, 5.9749556f, 11.666667f, 8.0f);
            instancePath3.cubicTo(11.666667f, 10.025044f, 10.025044f, 11.666667f, 8.0f, 11.666667f);
            instancePath3.cubicTo(5.9749556f, 11.666667f, 4.333333f, 10.025044f, 4.333333f, 8.0f);
            instancePath3.cubicTo(4.333333f, 5.9749556f, 5.9749556f, 4.333333f, 8.0f, 4.333333f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
