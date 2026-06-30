package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_user_level_1_9 extends l95.c {
    private final int width = 16;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 10.828426f, 0.70710677f, 0.70710677f, -2.1421351f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.0f, 14.4f);
        instancePath.lineTo(4.6876235f, 15.8386135f);
        instancePath.cubicTo(4.4849954f, 15.926618f, 4.249391f, 15.833697f, 4.1613865f, 15.631068f);
        instancePath.cubicTo(4.117241f, 15.529425f, 4.117241f, 15.414021f, 4.1613865f, 15.312377f);
        instancePath.lineTo(5.6f, 12.0f);
        instancePath.lineTo(5.6f, 12.0f);
        instancePath.lineTo(4.1613865f, 8.687623f);
        instancePath.cubicTo(4.0733824f, 8.484995f, 4.166303f, 8.249391f, 4.3689313f, 8.1613865f);
        instancePath.cubicTo(4.470576f, 8.117241f, 4.585979f, 8.117241f, 4.6876235f, 8.1613865f);
        instancePath.lineTo(8.0f, 9.6f);
        instancePath.lineTo(8.0f, 9.6f);
        instancePath.lineTo(11.312377f, 8.1613865f);
        instancePath.cubicTo(11.515005f, 8.073382f, 11.750609f, 8.166303f, 11.8386135f, 8.368932f);
        instancePath.cubicTo(11.882759f, 8.470575f, 11.882759f, 8.585979f, 11.8386135f, 8.687623f);
        instancePath.lineTo(10.4f, 12.0f);
        instancePath.lineTo(10.4f, 12.0f);
        instancePath.lineTo(11.8386135f, 15.312377f);
        instancePath.cubicTo(11.926618f, 15.515005f, 11.833697f, 15.750609f, 11.631068f, 15.8386135f);
        instancePath.cubicTo(11.529425f, 15.882759f, 11.414021f, 15.882759f, 11.312377f, 15.8386135f);
        instancePath.lineTo(8.0f, 14.4f);
        instancePath.lineTo(8.0f, 14.4f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-2565928);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(16.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint4, looper));
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
