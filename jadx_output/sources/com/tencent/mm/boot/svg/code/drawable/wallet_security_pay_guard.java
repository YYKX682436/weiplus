package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_security_pay_guard extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                instancePaint4.setColor(-15432210);
                instancePaint4.setStrokeWidth(1.7333333f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(15.999968f, 4.866667f);
                instancePath.cubicTo(20.150236f, 4.866667f, 23.993862f, 6.177216f, 27.13068f, 8.403519f);
                instancePath.cubicTo(27.133333f, 12.910462f, 26.011505f, 16.810717f, 24.051256f, 20.172611f);
                instancePath.cubicTo(22.102459f, 23.51487f, 19.32558f, 26.325237f, 15.999294f, 28.327726f);
                instancePath.cubicTo(12.673649f, 26.32453f, 9.897253f, 23.514467f, 7.948724f, 20.172653f);
                instancePath.cubicTo(5.9884806f, 16.810747f, 4.866667f, 12.910479f, 4.866667f, 8.75285f);
                instancePath.cubicTo(8.006618f, 6.1770535f, 11.850019f, 4.866667f, 15.999968f, 4.866667f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-15432210);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(16.007088f, 19.410448f);
                instancePath2.lineTo(5.032304f, 8.867483f);
                instancePath2.lineTo(5.032304f, 7.8929935f);
                instancePath2.lineTo(16.007088f, 15.516818f);
                instancePath2.lineTo(26.98192f, 7.8929935f);
                instancePath2.lineTo(26.98192f, 8.867483f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(0.0f, 0.0f);
                instancePath3.lineTo(32.0f, 0.0f);
                instancePath3.lineTo(32.0f, 32.0f);
                instancePath3.lineTo(0.0f, 32.0f);
                instancePath3.lineTo(0.0f, 0.0f);
                instancePath3.close();
                android.graphics.Path instancePath4 = l95.c.instancePath(looper);
                instancePath4.moveTo(0.0f, 0.0f);
                instancePath4.lineTo(32.0f, 0.0f);
                instancePath4.lineTo(32.0f, 32.0f);
                instancePath4.lineTo(0.0f, 32.0f);
                instancePath4.lineTo(0.0f, 0.0f);
                instancePath4.close();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
