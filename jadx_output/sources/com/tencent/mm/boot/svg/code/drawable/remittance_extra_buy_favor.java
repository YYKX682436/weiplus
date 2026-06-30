package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class remittance_extra_buy_favor extends l95.c {
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
        canvas.saveLayerAlpha(null, 230, 31);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.25f, 16.25f);
        instancePath2.cubicTo(16.57879f, 16.250807f, 16.851986f, 15.996735f, 16.875f, 15.66875f);
        instancePath2.lineTo(16.25f, 4.375f);
        instancePath2.cubicTo(16.25f, 4.029822f, 15.970178f, 3.75f, 15.625f, 3.75f);
        instancePath2.lineTo(4.375f, 3.75f);
        instancePath2.cubicTo(4.029822f, 3.75f, 3.75f, 4.029822f, 3.75f, 4.375f);
        instancePath2.lineTo(3.125f, 15.625f);
        instancePath2.cubicTo(3.125f, 15.970178f, 3.404822f, 16.25f, 3.75f, 16.25f);
        instancePath2.lineTo(16.25f, 16.25f);
        instancePath2.close();
        instancePath2.moveTo(16.25f, 17.5f);
        instancePath2.lineTo(3.75f, 17.5f);
        instancePath2.cubicTo(2.714466f, 17.5f, 1.875f, 16.660534f, 1.875f, 15.625f);
        instancePath2.lineTo(2.5f, 4.375f);
        instancePath2.cubicTo(2.5f, 3.339466f, 3.339466f, 2.5f, 4.375f, 2.5f);
        instancePath2.lineTo(15.625f, 2.5f);
        instancePath2.cubicTo(16.643686f, 2.4997227f, 17.47623f, 3.312841f, 17.5f, 4.33125f);
        instancePath2.lineTo(18.125f, 15.625f);
        instancePath2.cubicTo(18.125f, 16.660534f, 17.285534f, 17.5f, 16.25f, 17.5f);
        instancePath2.lineTo(16.25f, 17.5f);
        instancePath2.close();
        instancePath2.moveTo(12.5f, 6.25f);
        instancePath2.cubicTo(12.5f, 5.904822f, 12.779822f, 5.625f, 13.125f, 5.625f);
        instancePath2.cubicTo(13.470178f, 5.625f, 13.75f, 5.904822f, 13.75f, 6.25f);
        instancePath2.cubicTo(13.75f, 8.321068f, 12.071068f, 10.0f, 10.0f, 10.0f);
        instancePath2.cubicTo(7.928932f, 10.0f, 6.25f, 8.321068f, 6.25f, 6.25f);
        instancePath2.cubicTo(6.25f, 5.904822f, 6.529822f, 5.625f, 6.875f, 5.625f);
        instancePath2.cubicTo(7.220178f, 5.625f, 7.5f, 5.904822f, 7.5f, 6.25f);
        instancePath2.cubicTo(7.5f, 7.630712f, 8.619288f, 8.75f, 10.0f, 8.75f);
        instancePath2.cubicTo(11.380712f, 8.75f, 12.5f, 7.630712f, 12.5f, 6.25f);
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
