package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_icon_in_gird extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 80;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.6294041f);
                instancePath.lineTo(44.081802f, 0.6294054f);
                instancePath.lineTo(44.081802f, 41.746845f);
                instancePath.lineTo(0.0f, 41.74684f);
                instancePath.lineTo(0.0f, 0.6294041f);
                instancePath.close();
                instancePath.moveTo(5.0f, 5.629404f);
                instancePath.lineTo(39.0f, 5.6294045f);
                instancePath.lineTo(39.0f, 36.629406f);
                instancePath.lineTo(5.0f, 36.629402f);
                instancePath.lineTo(5.0f, 5.629404f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 47.88276f, 0.0f, 1.0f, 1.922839f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(17.238659f, 3.8456779f);
                instancePath2.lineTo(21.276552f, 3.8456774f);
                instancePath2.lineTo(21.276552f, 34.611103f);
                instancePath2.lineTo(17.238659f, 34.611107f);
                instancePath2.lineTo(17.238659f, 3.8456779f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(0.2687733f, 13.459874f);
                instancePath3.lineTo(4.221509f, 13.459874f);
                instancePath3.lineTo(4.221509f, 24.99691f);
                instancePath3.lineTo(0.2687733f, 24.99691f);
                instancePath3.lineTo(0.2687733f, 13.459874f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint6);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath4 = l95.c.instancePath(looper);
                instancePath4.moveTo(0.0f, 13.459874f);
                instancePath4.lineTo(21.388449f, 0.0f);
                instancePath4.lineTo(21.388449f, 5.171436f);
                instancePath4.lineTo(0.0f, 18.63131f);
                instancePath4.lineTo(0.0f, 13.459874f);
                instancePath4.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint7);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath5 = l95.c.instancePath(looper);
                instancePath5.moveTo(21.388449f, 33.285347f);
                instancePath5.lineTo(0.0f, 19.825474f);
                instancePath5.lineTo(0.0f, 24.99691f);
                instancePath5.lineTo(21.388449f, 38.456783f);
                instancePath5.lineTo(21.388449f, 33.285347f);
                instancePath5.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
                canvas.drawPath(instancePath5, instancePaint8);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
