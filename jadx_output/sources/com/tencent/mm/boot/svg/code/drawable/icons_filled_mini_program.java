package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mini_program extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(51.012886f, 38.97225f);
            instancePath.lineTo(50.30511f, 38.983707f);
            instancePath.cubicTo(48.16505f, 38.983707f, 46.91978f, 37.41382f, 47.724277f, 35.603878f);
            instancePath.cubicTo(48.275196f, 34.3184f, 49.518124f, 33.325638f, 50.986015f, 32.999577f);
            instancePath.cubicTo(54.913383f, 32.05159f, 57.58179f, 28.98215f, 57.58179f, 25.413738f);
            instancePath.cubicTo(57.58179f, 21.087517f, 53.451355f, 17.561981f, 48.29233f, 17.561981f);
            instancePath.cubicTo(43.13331f, 17.561981f, 39.002876f, 21.087517f, 39.002876f, 25.413738f);
            instancePath.lineTo(39.002876f, 46.979233f);
            instancePath.cubicTo(39.002876f, 54.57499f, 32.21369f, 60.69297f, 23.851439f, 60.69297f);
            instancePath.cubicTo(15.489182f, 60.69297f, 8.7f, 54.57499f, 8.7f, 46.979233f);
            instancePath.cubicTo(8.7f, 40.318993f, 13.957028f, 34.633987f, 21.119808f, 33.553036f);
            instancePath.lineTo(21.69489f, 33.553036f);
            instancePath.cubicTo(23.315079f, 33.553036f, 24.48211f, 34.522938f, 24.482107f, 35.908073f);
            instancePath.cubicTo(24.482798f, 36.145412f, 24.477034f, 36.25509f, 24.4536f, 36.395687f);
            instancePath.cubicTo(24.42201f, 36.58522f, 24.360502f, 36.766632f, 24.27572f, 36.93286f);
            instancePath.cubicTo(23.759354f, 38.137722f, 22.439314f, 39.18086f, 21.013983f, 39.537167f);
            instancePath.cubicTo(17.11499f, 40.478302f, 14.418211f, 43.529003f, 14.418211f, 46.979233f);
            instancePath.cubicTo(14.418211f, 51.305454f, 18.548643f, 54.83099f, 23.707668f, 54.83099f);
            instancePath.cubicTo(28.866692f, 54.83099f, 32.997124f, 51.305454f, 32.997124f, 46.979233f);
            instancePath.lineTo(32.997124f, 25.413738f);
            instancePath.cubicTo(32.997124f, 17.817982f, 39.78631f, 11.7f, 48.148563f, 11.7f);
            instancePath.cubicTo(56.51082f, 11.7f, 63.3f, 17.817982f, 63.3f, 25.413738f);
            instancePath.cubicTo(63.3f, 32.109337f, 58.16663f, 37.728123f, 51.012886f, 38.97225f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
