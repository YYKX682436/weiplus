package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_addtab_disable extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
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
                canvas.saveLayerAlpha(null, 76, 31);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.2071068f, 11.207107f);
                instancePath.cubicTo(0.8165825f, 10.816583f, 0.8165825f, 10.183417f, 1.2071068f, 9.792893f);
                instancePath.lineTo(10.707107f, 0.29289323f);
                instancePath.cubicTo(10.894643f, 0.10535684f, 11.148997f, 1.073389E-14f, 11.414213f, 1.0214052E-14f);
                instancePath.lineTo(18.0f, 0.0f);
                instancePath.cubicTo(18.552284f, -1.0145306E-16f, 19.0f, 0.44771525f, 19.0f, 1.0f);
                instancePath.lineTo(19.0f, 7.5857863f);
                instancePath.cubicTo(19.0f, 7.8510027f, 18.894644f, 8.105357f, 18.707108f, 8.292893f);
                instancePath.lineTo(9.207107f, 17.792892f);
                instancePath.cubicTo(8.816583f, 18.183418f, 8.183417f, 18.183418f, 7.7928934f, 17.792892f);
                instancePath.lineTo(1.2071068f, 11.207107f);
                instancePath.close();
                instancePath.moveTo(17.8f, 7.5029435f);
                instancePath.lineTo(17.8f, 1.2f);
                instancePath.lineTo(11.497056f, 1.2f);
                instancePath.lineTo(2.1970563f, 10.5f);
                instancePath.lineTo(8.5f, 16.802944f);
                instancePath.lineTo(17.8f, 7.5029435f);
                instancePath.close();
                instancePath.moveTo(14.0f, 6.5f);
                instancePath.cubicTo(13.171573f, 6.5f, 12.5f, 5.8284273f, 12.5f, 5.0f);
                instancePath.cubicTo(12.5f, 4.1715727f, 13.171573f, 3.5f, 14.0f, 3.5f);
                instancePath.cubicTo(14.828427f, 3.5f, 15.5f, 4.1715727f, 15.5f, 5.0f);
                instancePath.cubicTo(15.5f, 5.8284273f, 14.828427f, 6.5f, 14.0f, 6.5f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
