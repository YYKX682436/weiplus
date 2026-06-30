package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ask_filled extends l95.c {
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
            instancePath.moveTo(4.5f, 7.52611f);
            instancePath.cubicTo(4.5f, 4.19826f, 7.86224f, 1.5f, 12.005f, 1.5f);
            instancePath.lineTo(11.995f, 1.5f);
            instancePath.cubicTo(16.1378f, 1.5f, 19.5f, 4.20825f, 19.5f, 7.52611f);
            instancePath.cubicTo(19.5f, 9.19504f, 18.6394f, 10.7141f, 16.9383f, 12.0632f);
            instancePath.cubicTo(16.9365f, 12.065f, 16.9267f, 12.0729f, 16.9099f, 12.0864f);
            instancePath.cubicTo(16.7415f, 12.2221f, 15.8669f, 12.9269f, 15.2572f, 13.7721f);
            instancePath.cubicTo(14.937f, 14.2218f, 14.6868f, 15.0912f, 14.5367f, 15.9007f);
            instancePath.cubicTo(14.4166f, 16.5303f, 13.8863f, 17.0f, 13.2358f, 17.0f);
            instancePath.lineTo(11.1007f, 17.0f);
            instancePath.cubicTo(10.4903f, 17.0f, 10.0f, 16.5103f, 10.0f, 15.9007f);
            instancePath.cubicTo(10.0f, 15.2911f, 10.4903f, 14.8014f, 11.1007f, 14.8014f);
            instancePath.lineTo(11.7849f, 14.8014f);
            instancePath.cubicTo(12.025f, 14.8014f, 12.8055f, 14.9014f, 12.8055f, 14.9014f);
            instancePath.cubicTo(12.9256f, 13.922f, 13.3059f, 13.0525f, 13.6261f, 12.6028f);
            instancePath.cubicTo(14.4388f, 11.4665f, 15.5621f, 10.5948f, 15.7042f, 10.4846f);
            instancePath.cubicTo(15.7108f, 10.4795f, 15.7153f, 10.476f, 15.7175f, 10.4742f);
            instancePath.cubicTo(16.9183f, 9.53482f, 17.5087f, 8.55545f, 17.5087f, 7.51612f);
            instancePath.cubicTo(17.5087f, 5.57737f, 15.4073f, 3.48872f, 12.005f, 3.48872f);
            instancePath.cubicTo(8.60273f, 3.48872f, 6.50133f, 5.57737f, 6.50133f, 7.51612f);
            instancePath.cubicTo(6.50133f, 8.87524f, 7.49199f, 10.1844f, 9.09306f, 10.9339f);
            instancePath.cubicTo(9.5934f, 11.1738f, 9.80354f, 11.7634f, 9.57338f, 12.2631f);
            instancePath.cubicTo(9.34323f, 12.7627f, 8.74283f, 12.9826f, 8.24249f, 12.7427f);
            instancePath.cubicTo(5.93095f, 11.6734f, 4.5f, 9.66473f, 4.5f, 7.52611f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(14.3f, 21.15f);
            instancePath2.cubicTo(14.3f, 22.0613f, 13.4046f, 22.8f, 12.3f, 22.8f);
            instancePath2.cubicTo(11.1954f, 22.8f, 10.3f, 22.0613f, 10.3f, 21.15f);
            instancePath2.cubicTo(10.3f, 20.2387f, 11.1954f, 19.5f, 12.3f, 19.5f);
            instancePath2.cubicTo(13.4046f, 19.5f, 14.3f, 20.2387f, 14.3f, 21.15f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
