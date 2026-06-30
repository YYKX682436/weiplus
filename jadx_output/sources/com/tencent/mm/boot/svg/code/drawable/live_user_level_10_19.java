package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_user_level_10_19 extends l95.c {
    private final int width = 20;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 20;
        }
        if (i17 == 1) {
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
        instancePath.moveTo(4.6f, 4.8f);
        instancePath.cubicTo(5.5941124f, 4.8f, 6.3999996f, 5.6058874f, 6.3999996f, 6.6f);
        instancePath.cubicTo(6.3999996f, 7.5941124f, 5.5941124f, 8.4f, 4.6f, 8.4f);
        instancePath.cubicTo(3.6058874f, 8.4f, 2.8f, 7.5941124f, 2.8f, 6.6f);
        instancePath.cubicTo(2.8f, 5.6058874f, 3.6058874f, 4.8f, 4.6f, 4.8f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.4f, 15.599999f);
        instancePath2.cubicTo(16.394112f, 15.599999f, 17.199999f, 16.405888f, 17.199999f, 17.4f);
        instancePath2.cubicTo(17.199999f, 18.394112f, 16.394112f, 19.199999f, 15.4f, 19.199999f);
        instancePath2.cubicTo(14.405887f, 19.199999f, 13.599999f, 18.394112f, 13.599999f, 17.4f);
        instancePath2.cubicTo(13.599999f, 16.405888f, 14.405887f, 15.599999f, 15.4f, 15.599999f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 11.414213f, 0.70710677f, 0.70710677f, -3.5563488f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(10.0f, 14.4f);
        instancePath3.lineTo(6.6876235f, 15.8386135f);
        instancePath3.cubicTo(6.4849954f, 15.926618f, 6.249391f, 15.833697f, 6.1613865f, 15.631068f);
        instancePath3.cubicTo(6.117241f, 15.529425f, 6.117241f, 15.414021f, 6.1613865f, 15.312377f);
        instancePath3.lineTo(7.6f, 12.0f);
        instancePath3.lineTo(7.6f, 12.0f);
        instancePath3.lineTo(6.1613865f, 8.687623f);
        instancePath3.cubicTo(6.0733824f, 8.484995f, 6.166303f, 8.249391f, 6.3689313f, 8.1613865f);
        instancePath3.cubicTo(6.470576f, 8.117241f, 6.585979f, 8.117241f, 6.6876235f, 8.1613865f);
        instancePath3.lineTo(10.0f, 9.6f);
        instancePath3.lineTo(10.0f, 9.6f);
        instancePath3.lineTo(13.312377f, 8.1613865f);
        instancePath3.cubicTo(13.515005f, 8.073382f, 13.750609f, 8.166303f, 13.8386135f, 8.368932f);
        instancePath3.cubicTo(13.882759f, 8.470575f, 13.882759f, 8.585979f, 13.8386135f, 8.687623f);
        instancePath3.lineTo(12.4f, 12.0f);
        instancePath3.lineTo(12.4f, 12.0f);
        instancePath3.lineTo(13.8386135f, 15.312377f);
        instancePath3.cubicTo(13.926618f, 15.515005f, 13.833697f, 15.750609f, 13.631068f, 15.8386135f);
        instancePath3.cubicTo(13.529425f, 15.882759f, 13.414021f, 15.882759f, 13.312377f, 15.8386135f);
        instancePath3.lineTo(10.0f, 14.4f);
        instancePath3.lineTo(10.0f, 14.4f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-2565928);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(0.0f, 0.0f);
        instancePath4.lineTo(20.0f, 0.0f);
        instancePath4.lineTo(20.0f, 24.0f);
        instancePath4.lineTo(0.0f, 24.0f);
        instancePath4.lineTo(0.0f, 0.0f);
        instancePath4.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath4, l95.c.instancePaint(instancePaint6, looper));
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
