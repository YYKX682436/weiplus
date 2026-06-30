package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_shop_license extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-16777216);
        instancePaint3.setStrokeWidth(1.2f);
        instancePaint3.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint3.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint3.setStrokeMiter(4.0f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 3.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.60026f, 2.60026f);
        instancePath.lineTo(20.39974f, 2.60026f);
        instancePath.cubicTo(20.951822f, 2.60026f, 21.39974f, 3.048177f, 21.39974f, 3.60026f);
        instancePath.lineTo(21.39974f, 20.39974f);
        instancePath.cubicTo(21.39974f, 20.951822f, 20.951822f, 21.39974f, 20.39974f, 21.39974f);
        instancePath.lineTo(3.60026f, 21.39974f);
        instancePath.cubicTo(3.048177f, 21.39974f, 2.60026f, 20.951822f, 2.60026f, 20.39974f);
        instancePath.lineTo(2.60026f, 3.60026f);
        instancePath.cubicTo(2.60026f, 3.048177f, 3.048177f, 2.60026f, 3.60026f, 2.60026f);
        instancePath.close();
        instancePath.moveTo(3.60026f, 2.60026f);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.5f, 36.0f);
        instancePath2.lineTo(55.5f, 36.0f);
        instancePath2.lineTo(55.5f, 39.601562f);
        instancePath2.lineTo(16.5f, 39.601562f);
        instancePath2.close();
        instancePath2.moveTo(16.5f, 36.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.5f, 45.601562f);
        instancePath3.lineTo(55.5f, 45.601562f);
        instancePath3.lineTo(55.5f, 49.19922f);
        instancePath3.lineTo(16.5f, 49.19922f);
        instancePath3.close();
        instancePath3.moveTo(16.5f, 45.601562f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(36.0f, 20.398438f);
        instancePath4.cubicTo(38.484375f, 20.398438f, 40.5f, 22.414062f, 40.5f, 24.898438f);
        instancePath4.cubicTo(40.5f, 27.386719f, 38.484375f, 29.398438f, 36.0f, 29.398438f);
        instancePath4.cubicTo(33.515625f, 29.398438f, 31.5f, 27.386719f, 31.5f, 24.898438f);
        instancePath4.cubicTo(31.5f, 22.414062f, 33.515625f, 20.398438f, 36.0f, 20.398438f);
        instancePath4.close();
        instancePath4.moveTo(36.0f, 20.398438f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
