package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_pc extends l95.c {
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
        instancePath.moveTo(98.718056f, 16.4f);
        instancePath.cubicTo(99.05054f, 16.4f, 99.17673f, 16.420479f, 99.29978f, 16.486292f);
        instancePath.cubicTo(99.57952f, 16.823275f, 99.6f, 16.949463f, 99.6f, 17.281942f);
        instancePath.lineTo(99.6f, 17.281942f);
        instancePath.lineTo(99.6f, 74.718056f);
        instancePath.cubicTo(99.6f, 75.05054f, 99.57952f, 75.17673f, 99.51371f, 75.29978f);
        instancePath.cubicTo(99.17673f, 75.57952f, 99.05054f, 75.6f, 98.718056f, 75.6f);
        instancePath.lineTo(98.718056f, 75.6f);
        instancePath.lineTo(5.2819424f, 75.6f);
        instancePath.cubicTo(4.949462f, 75.6f, 4.823275f, 75.57952f, 4.700217f, 75.51371f);
        instancePath.cubicTo(4.4204793f, 75.17673f, 4.4f, 75.05054f, 4.4f, 74.718056f);
        instancePath.lineTo(4.4f, 74.718056f);
        instancePath.lineTo(4.4f, 17.281942f);
        instancePath.cubicTo(4.4f, 16.949463f, 4.4204793f, 16.823275f, 4.4862914f, 16.700216f);
        instancePath.cubicTo(4.823275f, 16.420479f, 4.949462f, 16.4f, 5.2819424f, 16.4f);
        instancePath.lineTo(5.2819424f, 16.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.8f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(57.0f, 80.0f);
        instancePath2.lineTo(57.0f, 87.59501f);
        instancePath2.cubicTo(57.0f, 88.108765f, 57.389294f, 88.53893f, 57.900497f, 88.59005f);
        instancePath2.lineTo(71.0995f, 89.90995f);
        instancePath2.cubicTo(71.6107f, 89.96107f, 72.0f, 90.391235f, 72.0f, 90.90499f);
        instancePath2.lineTo(72.0f, 91.0f);
        instancePath2.cubicTo(72.0f, 91.552284f, 71.552284f, 92.0f, 71.0f, 92.0f);
        instancePath2.lineTo(33.0f, 92.0f);
        instancePath2.cubicTo(32.447716f, 92.0f, 32.0f, 91.552284f, 32.0f, 91.0f);
        instancePath2.lineTo(32.0f, 90.90499f);
        instancePath2.cubicTo(32.0f, 90.391235f, 32.389294f, 89.96107f, 32.900497f, 89.90995f);
        instancePath2.lineTo(46.099503f, 88.59005f);
        instancePath2.cubicTo(46.610706f, 88.53893f, 47.0f, 88.108765f, 47.0f, 87.59501f);
        instancePath2.lineTo(47.0f, 80.0f);
        instancePath2.lineTo(47.0f, 80.0f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(0.8f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(98.87223f, 12.4f);
        instancePath3.cubicTo(100.541985f, 12.4f, 101.15311f, 12.559718f, 101.76505f, 12.886991f);
        instancePath3.cubicTo(102.34617f, 13.197774f, 102.80222f, 13.653834f, 103.11301f, 14.234948f);
        instancePath3.cubicTo(103.440285f, 14.846895f, 103.6f, 15.458012f, 103.6f, 17.12777f);
        instancePath3.lineTo(103.6f, 17.12777f);
        instancePath3.lineTo(103.6f, 74.87223f);
        instancePath3.cubicTo(103.6f, 76.541985f, 103.440285f, 77.15311f, 103.11301f, 77.76505f);
        instancePath3.cubicTo(102.80222f, 78.34617f, 102.34617f, 78.80222f, 101.76505f, 79.11301f);
        instancePath3.cubicTo(101.15311f, 79.440285f, 100.541985f, 79.6f, 98.87223f, 79.6f);
        instancePath3.lineTo(98.87223f, 79.6f);
        instancePath3.lineTo(5.1277704f, 79.6f);
        instancePath3.cubicTo(3.4580119f, 79.6f, 2.8468952f, 79.440285f, 2.2349482f, 79.11301f);
        instancePath3.cubicTo(1.6538347f, 78.80222f, 1.1977736f, 78.34617f, 0.88699067f, 77.76505f);
        instancePath3.cubicTo(0.55971783f, 77.15311f, 0.4f, 76.541985f, 0.4f, 74.87223f);
        instancePath3.lineTo(0.4f, 74.87223f);
        instancePath3.lineTo(0.4f, 17.12777f);
        instancePath3.cubicTo(0.4f, 15.458012f, 0.55971783f, 14.846895f, 0.88699067f, 14.234948f);
        instancePath3.cubicTo(1.1977736f, 13.653834f, 1.6538347f, 13.197774f, 2.2349482f, 12.886991f);
        instancePath3.cubicTo(2.8468952f, 12.559718f, 3.4580119f, 12.4f, 5.1277704f, 12.4f);
        instancePath3.lineTo(5.1277704f, 12.4f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
