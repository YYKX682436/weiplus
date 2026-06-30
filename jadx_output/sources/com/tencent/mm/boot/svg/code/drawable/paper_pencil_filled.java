package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class paper_pencil_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.0f, 4.03607f);
                instancePath.cubicTo(3.0f, 3.46386f, 3.47491f, 3.0f, 4.06075f, 3.0f);
                instancePath.lineTo(16.7898f, 3.0f);
                instancePath.cubicTo(17.3756f, 3.0f, 17.8505f, 3.46386f, 17.8505f, 4.03606f);
                instancePath.lineTo(17.8505f, 12.3246f);
                instancePath.lineTo(8.30376f, 21.6492f);
                instancePath.lineTo(4.06075f, 21.6492f);
                instancePath.cubicTo(3.47492f, 21.6492f, 3.0f, 21.1853f, 3.0f, 20.6131f);
                instancePath.lineTo(3.0f, 4.03607f);
                instancePath.close();
                instancePath.moveTo(5.65188f, 6.02529f);
                instancePath.lineTo(12.0164f, 6.02529f);
                instancePath.lineTo(12.0164f, 7.57939f);
                instancePath.lineTo(5.65188f, 7.57939f);
                instancePath.lineTo(5.65188f, 6.02529f);
                instancePath.close();
                instancePath.moveTo(12.0164f, 9.15423f);
                instancePath.lineTo(5.65188f, 9.15423f);
                instancePath.lineTo(5.65188f, 10.7083f);
                instancePath.lineTo(12.0164f, 10.7083f);
                instancePath.lineTo(12.0164f, 9.15423f);
                instancePath.close();
                instancePath.moveTo(19.5536f, 13.0578f);
                instancePath.cubicTo(19.7481f, 12.8836f, 20.0503f, 12.8964f, 20.2286f, 13.0864f);
                instancePath.lineTo(20.8744f, 13.7743f);
                instancePath.cubicTo(21.0527f, 13.9643f, 21.0396f, 14.2595f, 20.8451f, 14.4336f);
                instancePath.lineTo(14.1847f, 20.853f);
                instancePath.lineTo(11.9138f, 21.97f);
                instancePath.cubicTo(11.7724f, 22.0396f, 11.6f, 21.984f, 11.5288f, 21.8459f);
                instancePath.cubicTo(11.4836f, 21.7582f, 11.4887f, 21.6537f, 11.5423f, 21.5707f);
                instancePath.lineTo(12.8933f, 19.477f);
                instancePath.lineTo(19.5536f, 13.0578f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
