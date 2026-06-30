package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_ipad extends l95.c {
    private final int width = 104;
    private final int height = 104;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 104;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.409714f, 0.4f);
        instancePath.lineTo(84.59029f, 0.4f);
        instancePath.cubicTo(86.7058f, 0.4f, 87.47856f, 0.6061306f, 88.25347f, 1.020557f);
        instancePath.cubicTo(88.99755f, 1.4184934f, 89.581505f, 2.002449f, 89.97945f, 2.7465253f);
        instancePath.cubicTo(90.39387f, 3.5214353f, 90.6f, 4.294195f, 90.6f, 6.409713f);
        instancePath.lineTo(90.6f, 6.409713f);
        instancePath.lineTo(90.6f, 97.59029f);
        instancePath.cubicTo(90.6f, 99.7058f, 90.39387f, 100.47856f, 89.97945f, 101.25347f);
        instancePath.cubicTo(89.581505f, 101.99755f, 88.99755f, 102.581505f, 88.25347f, 102.97945f);
        instancePath.cubicTo(87.47856f, 103.39387f, 86.7058f, 103.6f, 84.59029f, 103.6f);
        instancePath.lineTo(84.59029f, 103.6f);
        instancePath.lineTo(19.409714f, 103.6f);
        instancePath.cubicTo(17.294195f, 103.6f, 16.521435f, 103.39387f, 15.746526f, 102.97945f);
        instancePath.cubicTo(15.002449f, 102.581505f, 14.418493f, 101.99755f, 14.020557f, 101.25347f);
        instancePath.cubicTo(13.606131f, 100.47856f, 13.4f, 99.7058f, 13.4f, 97.59029f);
        instancePath.lineTo(13.4f, 97.59029f);
        instancePath.lineTo(13.4f, 6.409713f);
        instancePath.cubicTo(13.4f, 4.294195f, 13.606131f, 3.5214353f, 14.020557f, 2.7465253f);
        instancePath.cubicTo(14.418493f, 2.002449f, 15.002449f, 1.4184934f, 15.746526f, 1.020557f);
        instancePath.cubicTo(16.521435f, 0.6061306f, 17.294195f, 0.4f, 19.409714f, 0.4f);
        instancePath.lineTo(19.409714f, 0.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.8f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.4f, 10.4f);
        instancePath2.lineTo(85.6f, 10.4f);
        instancePath2.lineTo(85.6f, 91.6f);
        instancePath2.lineTo(18.4f, 91.6f);
        instancePath2.lineTo(18.4f, 10.4f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(52.0f, 4.25f);
        instancePath3.cubicTo(52.552284f, 4.25f, 53.0f, 4.6977153f, 53.0f, 5.25f);
        instancePath3.cubicTo(53.0f, 5.8022847f, 52.552284f, 6.25f, 52.0f, 6.25f);
        instancePath3.cubicTo(51.447716f, 6.25f, 51.0f, 5.8022847f, 51.0f, 5.25f);
        instancePath3.cubicTo(51.0f, 4.6977153f, 51.447716f, 4.25f, 52.0f, 4.25f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(0.8f);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(52.0f, 95.0f);
        instancePath4.cubicTo(53.38071f, 95.0f, 54.5f, 96.119286f, 54.5f, 97.5f);
        instancePath4.cubicTo(54.5f, 98.880714f, 53.38071f, 100.0f, 52.0f, 100.0f);
        instancePath4.cubicTo(50.61929f, 100.0f, 49.5f, 98.880714f, 49.5f, 97.5f);
        instancePath4.cubicTo(49.5f, 96.119286f, 50.61929f, 95.0f, 52.0f, 95.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
