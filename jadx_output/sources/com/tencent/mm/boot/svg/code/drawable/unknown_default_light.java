package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class unknown_default_light extends l95.c {
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
        instancePaint3.setColor(-2235926);
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
        instancePaint4.setColor(-8877910);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.881f, 26.343f);
        instancePath2.cubicTo(19.798f, 23.588001f, 21.969f, 22.577f, 24.056f, 22.577f);
        instancePath2.cubicTo(26.218f, 22.577f, 28.129f, 23.681f, 28.129f, 25.944f);
        instancePath2.cubicTo(28.129f, 27.549f, 27.182f, 28.292f, 26.292f, 28.932f);
        instancePath2.cubicTo(25.206f, 29.72f, 24.798f, 30.016998f, 24.798f, 31.037998f);
        instancePath2.lineTo(24.798f, 31.528997f);
        instancePath2.lineTo(22.581001f, 31.528997f);
        instancePath2.lineTo(22.571001f, 30.962997f);
        instancePath2.cubicTo(22.479002f, 29.571997f, 23.184002f, 28.689997f, 24.223001f, 27.975998f);
        instancePath2.cubicTo(25.095001f, 27.363998f, 25.652002f, 26.955997f, 25.652002f, 26.073997f);
        instancePath2.cubicTo(25.652002f, 24.978998f, 24.817003f, 24.515997f, 23.917002f, 24.515997f);
        instancePath2.cubicTo(22.747002f, 24.515997f, 22.136002f, 25.313997f, 22.136002f, 26.342997f);
        instancePath2.lineTo(19.88f, 26.342997f);
        instancePath2.close();
        instancePath2.moveTo(22.145f, 34.257f);
        instancePath2.cubicTo(22.145f, 33.394f, 22.795f, 32.81f, 23.759f, 32.81f);
        instancePath2.cubicTo(24.761002f, 32.81f, 25.41f, 33.394f, 25.41f, 34.257f);
        instancePath2.cubicTo(25.41f, 35.092f, 24.761f, 35.685f, 23.76f, 35.685f);
        instancePath2.cubicTo(22.804f, 35.685f, 22.145f, 35.092003f, 22.145f, 34.257f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-3420201);
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
