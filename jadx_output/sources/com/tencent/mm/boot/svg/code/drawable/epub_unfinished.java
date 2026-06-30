package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class epub_unfinished extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePaint3.setColor(-8873932);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.6f, 48.0f);
        instancePath.lineTo(37.4f, 48.0f);
        instancePath.cubicTo(39.36f, 48.0f, 40.34f, 48.0f, 41.089f, 47.618f);
        instancePath.cubicTo(41.747646f, 47.282665f, 42.283234f, 46.74743f, 42.619f, 46.089f);
        instancePath.cubicTo(43.0f, 45.34f, 43.0f, 44.36f, 43.0f, 42.4f);
        instancePath.lineTo(43.0f, 15.32f);
        instancePath.cubicTo(43.0f, 14.462999f, 43.0f, 14.035999f, 42.903f, 13.632999f);
        instancePath.cubicTo(42.81731f, 13.275766f, 42.67591f, 12.934253f, 42.484f, 12.620999f);
        instancePath.cubicTo(42.268f, 12.268f, 41.965f, 11.964999f, 41.36f, 11.36f);
        instancePath.lineTo(31.64f, 1.6399994f);
        instancePath.cubicTo(31.035f, 1.0349994f, 30.731998f, 0.7319994f, 30.379f, 0.51599944f);
        instancePath.cubicTo(30.065811f, 0.3237381f, 29.724293f, 0.18200183f, 29.367f, 0.09599945f);
        instancePath.cubicTo(28.965f, 0.0f, 28.537f, 0.0f, 27.68f, 0.0f);
        instancePath.lineTo(10.6f, 0.0f);
        instancePath.cubicTo(8.64f, 0.0f, 7.66f, 0.0f, 6.911f, 0.381f);
        instancePath.cubicTo(6.2521996f, 0.7165971f, 5.7165966f, 1.2522001f, 5.3809996f, 1.911f);
        instancePath.cubicTo(5.0f, 2.66f, 5.0f, 3.64f, 5.0f, 5.6f);
        instancePath.lineTo(5.0f, 42.399998f);
        instancePath.cubicTo(5.0f, 44.359997f, 5.0f, 45.339996f, 5.381f, 46.088997f);
        instancePath.cubicTo(5.7165976f, 46.7478f, 6.2522006f, 47.2834f, 6.9110003f, 47.618996f);
        instancePath.cubicTo(7.66f, 48.0f, 8.64f, 48.0f, 10.6f, 48.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-4469863);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.5f, 23.252f);
        instancePath2.cubicTo(20.967f, 23.252f, 22.288f, 23.846f, 22.917f, 24.794f);
        instancePath2.cubicTo(23.056f, 24.994001f, 23.077f, 25.071001f, 23.077f, 25.257f);
        instancePath2.lineTo(23.077f, 35.197f);
        instancePath2.cubicTo(23.080315f, 35.279495f, 23.049482f, 35.35971f, 22.991766f, 35.418755f);
        instancePath2.cubicTo(22.93405f, 35.477795f, 22.854551f, 35.510437f, 22.772f, 35.509f);
        instancePath2.cubicTo(22.661728f, 35.50818f, 22.555763f, 35.46608f, 22.474998f, 35.391f);
        instancePath2.cubicTo(21.746866f, 34.797546f, 20.834303f, 34.47709f, 19.894999f, 34.485f);
        instancePath2.cubicTo(18.925999f, 34.485f, 17.957998f, 34.79f, 17.189999f, 35.364002f);
        instancePath2.cubicTo(16.899998f, 35.544003f, 16.725998f, 35.627003f, 16.442999f, 35.627003f);
        instancePath2.cubicTo(15.957999f, 35.627003f, 15.667999f, 35.357002f, 15.667999f, 34.866f);
        instancePath2.lineTo(15.667999f, 25.735f);
        instancePath2.cubicTo(15.667999f, 25.389f, 15.695999f, 25.265001f, 15.82f, 25.050001f);
        instancePath2.cubicTo(16.456f, 23.957f, 18.0f, 23.251001f, 19.5f, 23.251001f);
        instancePath2.close();
        instancePath2.moveTo(27.67f, 23.252f);
        instancePath2.cubicTo(29.17f, 23.252f, 30.72f, 23.957f, 31.356f, 25.050001f);
        instancePath2.cubicTo(31.474f, 25.257002f, 31.502f, 25.389002f, 31.502f, 25.735f);
        instancePath2.lineTo(31.502f, 34.865f);
        instancePath2.cubicTo(31.502f, 35.357002f, 31.212f, 35.626003f, 30.727001f, 35.626003f);
        instancePath2.cubicTo(30.45f, 35.626003f, 30.27f, 35.544003f, 29.987001f, 35.364002f);
        instancePath2.cubicTo(29.19944f, 34.79013f, 28.249462f, 34.48223f, 27.275002f, 34.485f);
        instancePath2.cubicTo(26.335695f, 34.47709f, 25.423132f, 34.797546f, 24.695002f, 35.391f);
        instancePath2.cubicTo(24.616173f, 35.464718f, 24.512903f, 35.506737f, 24.405f, 35.509f);
        instancePath2.cubicTo(24.3216f, 35.511803f, 24.240759f, 35.479973f, 24.181658f, 35.421062f);
        instancePath2.cubicTo(24.122557f, 35.36215f, 24.090466f, 35.28141f, 24.093f, 35.197998f);
        instancePath2.lineTo(24.093f, 25.258f);
        instancePath2.cubicTo(24.093f, 25.071f, 24.121f, 24.994999f, 24.253f, 24.793999f);
        instancePath2.cubicTo(24.889f, 23.845999f, 26.203001f, 23.251f, 27.669f, 23.251f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-10059476);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(28.55f, 0.0f);
        instancePath3.cubicTo(29.478281f, -6.723404E-5f, 30.36857f, 0.3686378f, 31.025f, 1.025f);
        instancePath3.lineTo(41.975f, 11.974999f);
        instancePath3.cubicTo(42.631737f, 12.631179f, 43.000507f, 13.521628f, 43.0f, 14.45f);
        instancePath3.lineTo(43.0f, 14.5f);
        instancePath3.cubicTo(43.00001f, 13.674687f, 42.3333f, 13.004402f, 41.508f, 13.0f);
        instancePath3.lineTo(31.733f, 13.0f);
        instancePath3.cubicTo(30.775892f, 13.0f, 30.000002f, 12.22411f, 30.0f, 11.267f);
        instancePath3.lineTo(30.0f, 1.5f);
        instancePath3.cubicTo(30.0f, 0.6715728f, 29.328426f, 0.0f, 28.5f, 0.0f);
        instancePath3.lineTo(28.55f, 0.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
