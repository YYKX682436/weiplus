package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class pages_unfinished extends l95.c {
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
        instancePaint3.setColor(-7842528);
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
        instancePaint4.setColor(-3954033);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(33.0f, 37.0f);
        instancePath2.lineTo(18.0f, 37.0f);
        instancePath2.lineTo(19.0f, 36.0f);
        instancePath2.lineTo(33.0f, 36.0f);
        instancePath2.lineTo(33.0f, 37.0f);
        instancePath2.close();
        instancePath2.moveTo(16.498f, 36.288f);
        instancePath2.lineTo(15.6189995f, 36.580997f);
        instancePath2.cubicTo(15.48437f, 36.62566f, 15.3360615f, 36.590534f, 15.235763f, 36.490234f);
        instancePath2.cubicTo(15.135463f, 36.38994f, 15.100339f, 36.24163f, 15.1449995f, 36.107f);
        instancePath2.lineTo(15.438f, 35.226997f);
        instancePath2.lineTo(16.498f, 36.287f);
        instancePath2.close();
        instancePath2.moveTo(23.574f, 29.928f);
        instancePath2.lineTo(20.206f, 33.295998f);
        instancePath2.cubicTo(19.032999f, 34.468998f, 18.067f, 35.218f, 17.34f, 35.598f);
        instancePath2.cubicTo(16.995f, 35.778f, 16.587f, 35.67f, 16.312f, 35.394f);
        instancePath2.cubicTo(16.036001f, 35.118f, 15.927f, 34.711002f, 16.108f, 34.366f);
        instancePath2.cubicTo(16.487999f, 33.639f, 17.236f, 32.672f, 18.409f, 31.499f);
        instancePath2.lineTo(21.778f, 28.132f);
        instancePath2.lineTo(23.574f, 29.928f);
        instancePath2.close();
        instancePath2.moveTo(26.729f, 23.182f);
        instancePath2.cubicTo(28.877f, 21.033998f, 30.313f, 20.401999f, 30.809f, 20.897999f);
        instancePath2.cubicTo(31.305f, 21.394f, 30.672f, 22.829998f, 28.525f, 24.977999f);
        instancePath2.lineTo(24.282999f, 29.22f);
        instancePath2.lineTo(22.487f, 27.424f);
        instancePath2.lineTo(26.729f, 23.182f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-9156581);
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
