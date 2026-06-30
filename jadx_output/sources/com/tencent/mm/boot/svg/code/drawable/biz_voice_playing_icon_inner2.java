package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_voice_playing_icon_inner2 extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(21.434671f, 15.5f);
                instancePath.cubicTo(23.081448f, 17.163496f, 24.1f, 19.461592f, 24.1f, 22.0f);
                instancePath.cubicTo(24.1f, 24.538408f, 23.081448f, 26.836504f, 21.434671f, 28.5f);
                instancePath.lineTo(19.949747f, 27.0f);
                instancePath.cubicTo(21.255392f, 25.681099f, 22.0f, 23.902777f, 22.0f, 22.0f);
                instancePath.cubicTo(22.0f, 20.097223f, 21.255392f, 18.318901f, 19.949747f, 17.0f);
                instancePath.lineTo(21.434671f, 15.5f);
                instancePath.close();
                instancePath.moveTo(17.969849f, 19.0f);
                instancePath.cubicTo(18.729898f, 19.767767f, 19.2f, 20.828426f, 19.2f, 22.0f);
                instancePath.cubicTo(19.2f, 23.171574f, 18.729898f, 24.232233f, 17.969849f, 25.0f);
                instancePath.lineTo(17.969849f, 25.0f);
                instancePath.lineTo(15.0f, 22.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
