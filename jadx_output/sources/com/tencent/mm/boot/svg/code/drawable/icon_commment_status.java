package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_commment_status extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.5f, 11.4502f);
                instancePath.cubicTo(7.5f, 10.9324f, 7.91973f, 10.5127f, 8.4375f, 10.5127f);
                instancePath.lineTo(51.5625f, 10.5127f);
                instancePath.cubicTo(52.0803f, 10.5127f, 52.5f, 10.9324f, 52.5f, 11.4502f);
                instancePath.lineTo(52.5f, 42.0752f);
                instancePath.cubicTo(52.5f, 42.593f, 52.0803f, 43.0127f, 51.5625f, 43.0127f);
                instancePath.lineTo(27.5f, 43.0127f);
                instancePath.lineTo(18.5669f, 51.9458f);
                instancePath.cubicTo(18.1732f, 52.3395f, 17.5f, 52.0606f, 17.5f, 51.5038f);
                instancePath.lineTo(17.5f, 43.0127f);
                instancePath.lineTo(8.4375f, 43.0127f);
                instancePath.cubicTo(7.91973f, 43.0127f, 7.5f, 42.593f, 7.5f, 42.0752f);
                instancePath.lineTo(7.5f, 11.4502f);
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
