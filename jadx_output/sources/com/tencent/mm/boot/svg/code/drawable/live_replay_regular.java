package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_replay_regular extends l95.c {
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(6.09961f, 2.0f);
            instancePath.lineTo(6.09961f, 3.9248f);
            instancePath.cubicTo(7.75331f, 2.71461f, 9.7938f, 2.0f, 12.0f, 2.0f);
            instancePath.cubicTo(17.5228f, 2.0f, 21.9999f, 6.4772f, 22.0f, 12.0f);
            instancePath.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
            instancePath.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
            instancePath.lineTo(3.2002f, 12.0f);
            instancePath.cubicTo(3.2002f, 16.8601f, 7.13989f, 20.7998f, 12.0f, 20.7998f);
            instancePath.cubicTo(16.8601f, 20.7998f, 20.7998f, 16.8601f, 20.7998f, 12.0f);
            instancePath.cubicTo(20.7998f, 7.13994f, 16.8601f, 3.2002f, 12.0f, 3.2002f);
            instancePath.cubicTo(9.63899f, 3.2002f, 7.49604f, 4.12892f, 5.91504f, 5.64258f);
            instancePath.cubicTo(5.74155f, 5.80869f, 5.48558f, 5.85591f, 5.26465f, 5.76172f);
            instancePath.cubicTo(5.04375f, 5.6674f, 4.90053f, 5.45013f, 4.90039f, 5.20996f);
            instancePath.lineTo(4.90039f, 2.0f);
            instancePath.lineTo(6.09961f, 2.0f);
            instancePath.close();
            instancePath.moveTo(9.57617f, 8.14844f);
            instancePath.cubicTo(9.93194f, 7.94573f, 10.3682f, 7.95141f, 10.7188f, 8.16309f);
            instancePath.lineTo(15.4492f, 11.0195f);
            instancePath.cubicTo(15.7911f, 11.2261f, 16.0f, 11.5986f, 16.0f, 12.0f);
            instancePath.cubicTo(16.0f, 12.4014f, 15.7911f, 12.7739f, 15.4492f, 12.9805f);
            instancePath.lineTo(10.7188f, 15.8369f);
            instancePath.cubicTo(10.3682f, 16.0486f, 9.93194f, 16.0543f, 9.57617f, 15.8516f);
            instancePath.cubicTo(9.22038f, 15.6487f, 9.0001f, 15.2691f, 9.0f, 14.8574f);
            instancePath.lineTo(9.0f, 9.14258f);
            instancePath.cubicTo(9.0001f, 8.73095f, 9.22038f, 8.35125f, 9.57617f, 8.14844f);
            instancePath.close();
            instancePath.moveTo(10.1348f, 14.8574f);
            instancePath.lineTo(14.8652f, 12.0f);
            instancePath.lineTo(10.1348f, 9.14258f);
            instancePath.lineTo(10.1348f, 14.8574f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
