package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_servicebrand_contact extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-40634);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 10.0f);
        instancePath.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath.lineTo(110.0f, 0.0f);
        instancePath.cubicTo(115.52285f, 0.0f, 120.0f, 4.4771523f, 120.0f, 10.0f);
        instancePath.lineTo(120.0f, 110.0f);
        instancePath.cubicTo(120.0f, 115.52285f, 115.52285f, 120.0f, 110.0f, 120.0f);
        instancePath.lineTo(10.0f, 120.0f);
        instancePath.cubicTo(4.4771523f, 120.0f, 0.0f, 115.52285f, 0.0f, 110.0f);
        instancePath.lineTo(0.0f, 10.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(87.5069f, 42.8262f);
        instancePath2.lineTo(72.0313f, 42.8262f);
        instancePath2.lineTo(72.0313f, 56.4455f);
        instancePath2.lineTo(83.6981f, 56.4455f);
        instancePath2.lineTo(83.6981f, 59.0237f);
        instancePath2.lineTo(83.6981f, 61.6018f);
        instancePath2.lineTo(72.0313f, 61.6018f);
        instancePath2.lineTo(72.0313f, 67.2187f);
        instancePath2.lineTo(80.5494f, 67.2187f);
        instancePath2.lineTo(80.5494f, 72.3749f);
        instancePath2.lineTo(72.0313f, 72.3749f);
        instancePath2.lineTo(72.0313f, 73.7499f);
        instancePath2.cubicTo(72.0313f, 75.173f, 71.6806f, 76.5068f, 71.0688f, 77.6893f);
        instancePath2.cubicTo(71.0688f, 77.6893f, 70.9931f, 77.8405f, 70.9931f, 77.8474f);
        instancePath2.lineTo(65.6719f, 87.3693f);
        instancePath2.cubicTo(64.7781f, 88.9712f, 65.9331f, 90.9512f, 67.7756f, 90.9512f);
        instancePath2.lineTo(87.5069f, 90.9512f);
        instancePath2.cubicTo(89.4044f, 90.9512f, 90.9444f, 89.4112f, 90.9444f, 87.5137f);
        instancePath2.lineTo(90.9444f, 46.2637f);
        instancePath2.cubicTo(90.9444f, 44.3662f, 89.4044f, 42.8262f, 87.5069f, 42.8262f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(63.4375f, 29.0625f);
        instancePath3.lineTo(32.5f, 29.0625f);
        instancePath3.cubicTo(30.6025f, 29.0625f, 29.0625f, 30.6025f, 29.0625f, 32.5f);
        instancePath3.lineTo(29.0625f, 73.75f);
        instancePath3.cubicTo(29.0625f, 75.6475f, 30.6025f, 77.1875f, 32.5f, 77.1875f);
        instancePath3.lineTo(63.4375f, 77.1875f);
        instancePath3.cubicTo(65.335f, 77.1875f, 66.875f, 75.6475f, 66.875f, 73.75f);
        instancePath3.lineTo(66.875f, 32.5f);
        instancePath3.cubicTo(66.875f, 30.6025f, 65.335f, 29.0625f, 63.4375f, 29.0625f);
        instancePath3.close();
        instancePath3.moveTo(59.4844f, 40.0075f);
        instancePath3.cubicTo(59.4844f, 40.0075f, 59.4844f, 40.0625f, 59.4844f, 40.09f);
        instancePath3.cubicTo(59.3812f, 43.2869f, 57.9719f, 46.3806f, 55.6069f, 48.5806f);
        instancePath3.cubicTo(53.5169f, 50.5263f, 50.925f, 51.585f, 48.2781f, 51.585f);
        instancePath3.cubicTo(48.1613f, 51.585f, 48.0444f, 51.585f, 47.9206f, 51.585f);
        instancePath3.cubicTo(41.5956f, 51.5575f, 36.46f, 46.3806f, 36.46f, 40.0213f);
        instancePath3.lineTo(36.46f, 38.2475f);
        instancePath3.lineTo(41.6162f, 38.2475f);
        instancePath3.lineTo(41.6162f, 40.0213f);
        instancePath3.cubicTo(41.6162f, 43.555f, 44.4694f, 46.4288f, 47.9756f, 46.4288f);
        instancePath3.cubicTo(48.01f, 46.4288f, 48.0444f, 46.4288f, 48.0787f, 46.4288f);
        instancePath3.cubicTo(49.4812f, 46.4906f, 50.9112f, 45.9131f, 52.0938f, 44.8131f);
        instancePath3.cubicTo(53.4481f, 43.555f, 54.2662f, 41.7881f, 54.3281f, 39.9731f);
        instancePath3.lineTo(54.3281f, 38.2475f);
        instancePath3.lineTo(59.4844f, 38.2475f);
        instancePath3.lineTo(59.4844f, 40.0213f);
        instancePath3.lineTo(59.4844f, 40.0075f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
