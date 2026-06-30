package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class approve_highlight extends l95.c {
    private final int width = 15;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 15;
        }
        if (i17 == 1) {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-11048043);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(7.624182f, 0.028621675f);
            instancePath.cubicTo(8.509319f, 0.16048354f, 9.499581f, 1.0177877f, 9.499581f, 2.6104255f);
            instancePath.cubicTo(9.499581f, 3.7757175f, 9.310068f, 4.4710493f, 9.25998f, 5.0160246f);
            instancePath.lineTo(9.250553f, 5.149321f);
            instancePath.lineTo(13.112538f, 5.149321f);
            instancePath.cubicTo(13.726087f, 5.149321f, 14.986115f, 5.921881f, 14.769511f, 7.332844f);
            instancePath.cubicTo(14.381703f, 9.8590355f, 13.046923f, 12.510862f, 12.854087f, 12.918297f);
            instancePath.cubicTo(12.250458f, 14.193681f, 11.325146f, 15.007201f, 10.553953f, 15.093657f);
            instancePath.lineTo(10.419558f, 15.101312f);
            instancePath.lineTo(1.116654f, 15.101312f);
            instancePath.cubicTo(0.5391967f, 15.101312f, 0.059571058f, 14.221435f, 0.005142627f, 13.623581f);
            instancePath.lineTo(-9.094947E-13f, 13.515072f);
            instancePath.lineTo(-9.094947E-13f, 6.9973793f);
            instancePath.cubicTo(-9.094947E-13f, 6.2707405f, 0.56460977f, 5.710601f, 1.141133f, 5.643422f);
            instancePath.lineTo(1.2564327f, 5.636656f);
            instancePath.lineTo(1.9645185f, 5.636656f);
            instancePath.cubicTo(1.9645185f, 5.636656f, 3.9314516f, 5.946601f, 4.789839f, 4.5230713f);
            instancePath.cubicTo(5.600806f, 3.1786008f, 5.620325f, 2.1474245f, 5.620325f, 1.1710285f);
            instancePath.cubicTo(5.620325f, 0.19463253f, 6.757516f, -0.10048854f, 7.624182f, 0.028621675f);
            instancePath.close();
            instancePath.moveTo(2.6656635f, 6.079402f);
            instancePath.cubicTo(2.3895211f, 6.079402f, 2.1656635f, 6.3032594f, 2.1656635f, 6.579402f);
            instancePath.lineTo(2.1656635f, 6.579402f);
            instancePath.lineTo(2.1656635f, 14.04999f);
            instancePath.cubicTo(2.1656635f, 14.326133f, 2.3895211f, 14.54999f, 2.6656635f, 14.54999f);
            instancePath.cubicTo(2.9418058f, 14.54999f, 3.1656635f, 14.326133f, 3.1656635f, 14.04999f);
            instancePath.lineTo(3.1656635f, 14.04999f);
            instancePath.lineTo(3.1656635f, 6.579402f);
            instancePath.cubicTo(3.1656635f, 6.3032594f, 2.9418058f, 6.079402f, 2.6656635f, 6.079402f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
