package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class card_home_member_card_icon extends l95.c {
    private final int width = 66;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 66;
        }
        if (i17 == 1) {
            return 48;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15683841);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.1875f, 2.88f);
            instancePath.cubicTo(0.1875f, 1.2894199f, 1.4769199f, 0.0f, 3.0675f, 0.0f);
            instancePath.lineTo(62.9325f, 0.0f);
            instancePath.cubicTo(64.52308f, 0.0f, 65.8125f, 1.2894199f, 65.8125f, 2.88f);
            instancePath.lineTo(65.8125f, 45.12f);
            instancePath.cubicTo(65.8125f, 46.71058f, 64.52308f, 48.0f, 62.9325f, 48.0f);
            instancePath.lineTo(3.0675f, 48.0f);
            instancePath.cubicTo(1.4769199f, 48.0f, 0.1875f, 46.71058f, 0.1875f, 45.12f);
            instancePath.lineTo(0.1875f, 2.88f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(14.4375f, 9.081081f);
            instancePath2.cubicTo(17.854763f, 9.081081f, 20.625f, 11.69477f, 20.625f, 14.918919f);
            instancePath2.cubicTo(20.625f, 18.143068f, 17.854763f, 20.756756f, 14.4375f, 20.756756f);
            instancePath2.cubicTo(11.020238f, 20.756756f, 8.25f, 18.143068f, 8.25f, 14.918919f);
            instancePath2.cubicTo(8.25f, 11.69477f, 11.020238f, 9.081081f, 14.4375f, 9.081081f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-1);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(8.25f, 29.837837f);
            instancePath3.lineTo(55.0f, 29.837837f);
            instancePath3.lineTo(55.0f, 36.705883f);
            instancePath3.lineTo(8.25f, 36.705883f);
            instancePath3.lineTo(8.25f, 29.837837f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
