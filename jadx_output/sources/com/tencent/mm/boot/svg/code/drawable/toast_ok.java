package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class toast_ok extends l95.c {
    private final int width = be1.r0.CTRL_INDEX;
    private final int height = be1.r0.CTRL_INDEX;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = be1.r0.CTRL_INDEX;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-983041);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.46822503f, 59.37996f);
                instancePath.cubicTo(-0.09250131f, 58.791977f, -0.15752915f, 57.7783f, 0.31603217f, 57.12543f);
                instancePath.lineTo(6.444848f, 48.676014f);
                instancePath.cubicTo(6.9215207f, 48.018856f, 7.825557f, 47.88808f, 8.465721f, 48.38521f);
                instancePath.lineTo(44.8357f, 76.628586f);
                instancePath.cubicTo(45.475124f, 77.12514f, 46.492798f, 77.10621f, 47.11644f, 76.57981f);
                instancePath.lineTo(135.63168f, 1.8662949f);
                instancePath.cubicTo(136.25188f, 1.3428068f, 137.22249f, 1.3865731f, 137.79367f, 1.95812f);
                instancePath.lineTo(143.57062f, 7.7387013f);
                instancePath.cubicTo(144.14445f, 8.312903f, 144.14244f, 9.244253f, 143.56883f, 9.816216f);
                instancePath.lineTo(47.031418f, 106.07728f);
                instancePath.cubicTo(46.456593f, 106.65046f, 45.5375f, 106.63998f, 44.975323f, 106.050476f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
