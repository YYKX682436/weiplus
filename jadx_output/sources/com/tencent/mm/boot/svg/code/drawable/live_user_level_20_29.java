package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_user_level_20_29 extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.6f, 15.599999f);
        instancePath.cubicTo(7.5941124f, 15.599999f, 8.4f, 16.405888f, 8.4f, 17.4f);
        instancePath.cubicTo(8.4f, 18.394112f, 7.5941124f, 19.199999f, 6.6f, 19.199999f);
        instancePath.cubicTo(5.6058874f, 19.199999f, 4.8f, 18.394112f, 4.8f, 17.4f);
        instancePath.cubicTo(4.8f, 16.405888f, 5.6058874f, 15.599999f, 6.6f, 15.599999f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.4f, 15.599999f);
        instancePath2.cubicTo(18.394112f, 15.599999f, 19.199999f, 16.405888f, 19.199999f, 17.4f);
        instancePath2.cubicTo(19.199999f, 18.394112f, 18.394112f, 19.199999f, 17.4f, 19.199999f);
        instancePath2.cubicTo(16.405888f, 19.199999f, 15.599999f, 18.394112f, 15.599999f, 17.4f);
        instancePath2.cubicTo(15.599999f, 16.405888f, 16.405888f, 15.599999f, 17.4f, 15.599999f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 12.0f, 0.70710677f, 0.70710677f, -4.970562f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.0f, 14.4f);
        instancePath3.lineTo(8.687623f, 15.8386135f);
        instancePath3.cubicTo(8.484995f, 15.926618f, 8.249391f, 15.833697f, 8.1613865f, 15.631068f);
        instancePath3.cubicTo(8.117241f, 15.529425f, 8.117241f, 15.414021f, 8.1613865f, 15.312377f);
        instancePath3.lineTo(9.6f, 12.0f);
        instancePath3.lineTo(9.6f, 12.0f);
        instancePath3.lineTo(8.1613865f, 8.687623f);
        instancePath3.cubicTo(8.073382f, 8.484995f, 8.166303f, 8.249391f, 8.368932f, 8.1613865f);
        instancePath3.cubicTo(8.470575f, 8.117241f, 8.585979f, 8.117241f, 8.687623f, 8.1613865f);
        instancePath3.lineTo(12.0f, 9.6f);
        instancePath3.lineTo(12.0f, 9.6f);
        instancePath3.lineTo(15.312377f, 8.1613865f);
        instancePath3.cubicTo(15.515005f, 8.073382f, 15.750609f, 8.166303f, 15.8386135f, 8.368932f);
        instancePath3.cubicTo(15.882759f, 8.470575f, 15.882759f, 8.585979f, 15.8386135f, 8.687623f);
        instancePath3.lineTo(14.4f, 12.0f);
        instancePath3.lineTo(14.4f, 12.0f);
        instancePath3.lineTo(15.8386135f, 15.312377f);
        instancePath3.cubicTo(15.926618f, 15.515005f, 15.833697f, 15.750609f, 15.631068f, 15.8386135f);
        instancePath3.cubicTo(15.529425f, 15.882759f, 15.414021f, 15.882759f, 15.312377f, 15.8386135f);
        instancePath3.lineTo(12.0f, 14.4f);
        instancePath3.lineTo(12.0f, 14.4f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(6.6f, 4.8f);
        instancePath4.cubicTo(7.5941124f, 4.8f, 8.4f, 5.6058874f, 8.4f, 6.6f);
        instancePath4.cubicTo(8.4f, 7.5941124f, 7.5941124f, 8.4f, 6.6f, 8.4f);
        instancePath4.cubicTo(5.6058874f, 8.4f, 4.8f, 7.5941124f, 4.8f, 6.6f);
        instancePath4.cubicTo(4.8f, 5.6058874f, 5.6058874f, 4.8f, 6.6f, 4.8f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(17.4f, 4.8f);
        instancePath5.cubicTo(18.394112f, 4.8f, 19.199999f, 5.6058874f, 19.199999f, 6.6f);
        instancePath5.cubicTo(19.199999f, 7.5941124f, 18.394112f, 8.4f, 17.4f, 8.4f);
        instancePath5.cubicTo(16.405888f, 8.4f, 15.599999f, 7.5941124f, 15.599999f, 6.6f);
        instancePath5.cubicTo(15.599999f, 5.6058874f, 16.405888f, 4.8f, 17.4f, 4.8f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
