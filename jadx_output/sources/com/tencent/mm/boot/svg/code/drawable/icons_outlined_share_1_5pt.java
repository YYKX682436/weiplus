package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_share_1_5pt extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(-16777216);
            instancePaint3.setStrokeWidth(1.5f);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.7537f, 14.9216f);
            instancePath.lineTo(12.7537f, 14.1089f);
            instancePath.lineTo(11.9436f, 14.174f);
            instancePath.cubicTo(9.46173f, 14.3735f, 5.92828f, 15.7999f, 3.97771f, 20.0844f);
            instancePath.cubicTo(3.49887f, 16.7414f, 4.21122f, 13.987f, 5.64017f, 11.9601f);
            instancePath.cubicTo(7.12717f, 9.85081f, 9.42886f, 8.47338f, 12.1204f, 8.04924f);
            instancePath.lineTo(12.7537f, 7.94945f);
            instancePath.lineTo(12.7537f, 7.30838f);
            instancePath.lineTo(12.7537f, 3.99803f);
            instancePath.cubicTo(12.7537f, 3.85996f, 12.8656f, 3.74803f, 13.0037f, 3.74803f);
            instancePath.cubicTo(13.0696f, 3.74803f, 13.1328f, 3.77404f, 13.1796f, 3.82041f);
            instancePath.lineTo(20.3509f, 10.9237f);
            instancePath.cubicTo(20.437f, 11.0089f, 20.4483f, 11.1422f, 20.3837f, 11.2393f);
            instancePath.lineTo(20.3331f, 11.2965f);
            instancePath.lineTo(13.1796f, 18.3821f);
            instancePath.cubicTo(13.0815f, 18.4793f, 12.9232f, 18.4785f, 12.8261f, 18.3804f);
            instancePath.cubicTo(12.7797f, 18.3336f, 12.7537f, 18.2704f, 12.7537f, 18.2045f);
            instancePath.lineTo(12.7537f, 14.9216f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
