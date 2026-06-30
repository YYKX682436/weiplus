package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_note_voiceinput extends l95.c {
    private final int width = 36;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 36;
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 0.8660254f, -0.5f, 14.9359455f, 0.5f, 0.8660254f, 0.10608125f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.891014f, 0.13735998f);
                instancePath.cubicTo(12.829758f, 0.13735998f, 15.212079f, 2.519682f, 15.212079f, 5.4584246f);
                instancePath.lineTo(15.212079f, 14.341406f);
                instancePath.cubicTo(15.212079f, 17.28015f, 12.829758f, 19.662472f, 9.891014f, 19.662472f);
                instancePath.cubicTo(6.9522715f, 19.662472f, 4.5699496f, 17.28015f, 4.5699496f, 14.341406f);
                instancePath.lineTo(4.5699496f, 5.4584246f);
                instancePath.cubicTo(4.5699496f, 2.519682f, 6.9522715f, 0.13735998f, 9.891014f, 0.13735998f);
                instancePath.close();
                instancePath.moveTo(10.955227f, 23.942928f);
                instancePath.lineTo(10.955227f, 26.170841f);
                instancePath.lineTo(8.826801f, 26.170841f);
                instancePath.lineTo(8.826801f, 23.942928f);
                instancePath.cubicTo(4.0378957f, 23.413542f, 0.31309772f, 19.35349f, 0.31309772f, 14.423468f);
                instancePath.lineTo(0.31309772f, 10.984644f);
                instancePath.lineTo(2.4415236f, 10.984644f);
                instancePath.lineTo(2.4415236f, 14.382437f);
                instancePath.cubicTo(2.4415236f, 18.496677f, 5.7767744f, 21.831928f, 9.891014f, 21.831928f);
                instancePath.cubicTo(14.005255f, 21.831928f, 17.340506f, 18.496677f, 17.340506f, 14.382437f);
                instancePath.lineTo(17.340506f, 10.984644f);
                instancePath.lineTo(19.468931f, 10.984644f);
                instancePath.lineTo(19.468931f, 14.423468f);
                instancePath.cubicTo(19.468931f, 19.35349f, 15.744133f, 23.413542f, 10.955227f, 23.942928f);
                instancePath.close();
                instancePath.moveTo(8.826801f, 27.25557f);
                instancePath.lineTo(10.955227f, 27.25557f);
                instancePath.lineTo(10.192827f, 29.059793f);
                instancePath.cubicTo(10.122392f, 29.22648f, 9.930165f, 29.304506f, 9.763479f, 29.234072f);
                instancePath.cubicTo(9.684918f, 29.200874f, 9.622398f, 29.138353f, 9.589202f, 29.059793f);
                instancePath.lineTo(8.826801f, 27.25557f);
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
