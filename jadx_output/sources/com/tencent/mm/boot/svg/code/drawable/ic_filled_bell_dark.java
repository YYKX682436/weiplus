package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ic_filled_bell_dark extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-14671840);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(44.0f, 0.0f);
        instancePath.cubicTo(46.20914f, 0.0f, 48.0f, 1.7908609f, 48.0f, 4.0f);
        instancePath.lineTo(48.0f, 44.0f);
        instancePath.cubicTo(48.0f, 46.20914f, 46.20914f, 48.0f, 44.0f, 48.0f);
        instancePath.lineTo(4.0f, 48.0f);
        instancePath.cubicTo(1.7908609f, 48.0f, 0.0f, 46.20914f, 0.0f, 44.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15683841);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha(null, 204, 31);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.75f, 22.5f);
        instancePath2.lineTo(1.4833834f, 22.5f);
        instancePath2.cubicTo(1.217157f, 22.5f, 0.95788467f, 22.414997f, 0.7433345f, 22.257376f);
        instancePath2.cubicTo(0.18700047f, 21.848658f, 0.06733385f, 21.06633f, 0.4760516f, 20.509995f);
        instancePath2.lineTo(0.47601607f, 20.50997f);
        instancePath2.cubicTo(1.8253387f, 18.673313f, 2.5f, 16.836657f, 2.5f, 15.0f);
        instancePath2.lineTo(2.5f, 10.0f);
        instancePath2.cubicTo(2.5f, 6.72167f, 4.60339f, 3.9346135f, 7.534246f, 2.914754f);
        instancePath2.cubicTo(7.5117216f, 2.7798533f, 7.5f, 2.6412954f, 7.5f, 2.5f);
        instancePath2.cubicTo(7.5f, 1.1192881f, 8.619288f, 0.0f, 10.0f, 0.0f);
        instancePath2.cubicTo(11.380712f, 0.0f, 12.5f, 1.1192881f, 12.5f, 2.5f);
        instancePath2.cubicTo(12.5f, 2.6412954f, 12.488278f, 2.7798533f, 12.4657545f, 2.914754f);
        instancePath2.cubicTo(15.39661f, 3.9346135f, 17.5f, 6.72167f, 17.5f, 10.0f);
        instancePath2.lineTo(17.5f, 15.0f);
        instancePath2.cubicTo(17.5f, 16.836636f, 18.174646f, 18.673273f, 19.52394f, 20.509909f);
        instancePath2.cubicTo(19.68157f, 20.724472f, 19.766575f, 20.983759f, 19.766575f, 21.25f);
        instancePath2.cubicTo(19.766575f, 21.940376f, 19.206917f, 22.500036f, 18.51654f, 22.500036f);
        instancePath2.lineTo(11.25f, 22.5f);
        instancePath2.lineTo(11.25f, 22.75f);
        instancePath2.cubicTo(11.25f, 23.440355f, 10.690356f, 24.0f, 10.0f, 24.0f);
        instancePath2.cubicTo(9.309644f, 24.0f, 8.75f, 23.440355f, 8.75f, 22.75f);
        instancePath2.lineTo(8.75f, 22.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
