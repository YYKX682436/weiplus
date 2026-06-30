package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class login_auth_state_radar_default_select extends l95.c {
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
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 2.4f, 0.0f, 0.0f, 0.0f, 2.4f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15028967);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 10.123457f);
        instancePath.cubicTo(20.0f, 4.477037f, 15.522963f, 0.0f, 9.876543f, 0.0f);
        instancePath.cubicTo(4.477037f, 0.0f, 0.0f, 4.477037f, 0.0f, 10.123457f);
        instancePath.cubicTo(0.0f, 15.522963f, 4.477037f, 20.0f, 9.876543f, 20.0f);
        instancePath.cubicTo(15.522963f, 20.0f, 20.0f, 15.522963f, 20.0f, 10.123457f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.456435f, 10.368831f);
        instancePath2.lineTo(5.506938f, 10.300112f);
        instancePath2.cubicTo(5.663359f, 10.087274f, 5.962703f, 10.041537f, 6.1755424f, 10.197958f);
        instancePath2.cubicTo(6.1781316f, 10.199862f, 6.1807017f, 10.201791f, 6.1832523f, 10.203745f);
        instancePath2.lineTo(8.341835f, 11.858175f);
        instancePath2.cubicTo(8.519238f, 11.994144f, 8.767159f, 11.989105f, 8.938891f, 11.846039f);
        instancePath2.lineTo(15.01762f, 6.7819657f);
        instancePath2.cubicTo(15.194826f, 6.634339f, 15.455153f, 6.645353f, 15.619257f, 6.8074207f);
        instancePath2.lineTo(15.619257f, 6.8074207f);
        instancePath2.cubicTo(15.776759f, 6.9629693f, 15.778342f, 7.2167473f, 15.622794f, 7.3742495f);
        instancePath2.cubicTo(15.621458f, 7.375602f, 15.620112f, 7.376945f, 15.618758f, 7.3782783f);
        instancePath2.lineTo(8.9890175f, 13.902933f);
        instancePath2.cubicTo(8.800759f, 14.088207f, 8.497951f, 14.085789f, 8.312676f, 13.897531f);
        instancePath2.cubicTo(8.311649f, 13.896486f, 8.310627f, 13.895438f, 8.309609f, 13.894385f);
        instancePath2.lineTo(5.497875f, 10.98438f);
        instancePath2.cubicTo(5.3358793f, 10.816722f, 5.318373f, 10.556688f, 5.456435f, 10.368831f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
