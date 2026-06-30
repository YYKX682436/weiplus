package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_colorful_handoff_success extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
        }
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
            instancePaint3.setColor(-1184275);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(52.21949f, 61.344994f);
            instancePath.lineTo(56.907486f, 74.229965f);
            instancePath.cubicTo(57.357132f, 75.466484f, 56.719242f, 76.8334f, 55.48272f, 77.283035f);
            instancePath.cubicTo(55.221767f, 77.37793f, 54.946236f, 77.42647f, 54.668568f, 77.42647f);
            instancePath.lineTo(25.735844f, 77.42647f);
            instancePath.cubicTo(24.420107f, 77.42647f, 23.35349f, 76.359856f, 23.35349f, 75.04412f);
            instancePath.cubicTo(23.35349f, 74.76645f, 23.402033f, 74.49091f, 23.496925f, 74.229965f);
            instancePath.lineTo(28.18049f, 61.344994f);
            instancePath.lineTo(52.21949f, 61.344994f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(76.23529f, 0.0f);
            instancePath2.cubicTo(78.537834f, 0.0f, 80.40441f, 1.8665775f, 80.40441f, 4.1691175f);
            instancePath2.lineTo(80.40441f, 52.411766f);
            instancePath2.cubicTo(80.40441f, 54.714306f, 78.537834f, 56.580883f, 76.23529f, 56.580883f);
            instancePath2.lineTo(4.1691175f, 56.580883f);
            instancePath2.cubicTo(1.8665775f, 56.580883f, 0.0f, 54.714306f, 0.0f, 52.411766f);
            instancePath2.lineTo(0.0f, 4.1691175f);
            instancePath2.cubicTo(0.0f, 1.8665775f, 1.8665775f, 0.0f, 4.1691175f, 0.0f);
            instancePath2.lineTo(76.23529f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(52.69254f, 17.867647f);
            instancePath2.lineTo(37.491932f, 33.456367f);
            instancePath2.lineTo(30.730364f, 26.289095f);
            instancePath2.lineTo(28.290442f, 28.860275f);
            instancePath2.lineTo(35.253075f, 36.242847f);
            instancePath2.lineTo(35.525486f, 36.50045f);
            instancePath2.cubicTo(36.751408f, 37.532043f, 38.53785f, 37.46258f, 39.689095f, 36.281616f);
            instancePath2.lineTo(39.689095f, 36.281616f);
            instancePath2.lineTo(55.09191f, 20.481117f);
            instancePath2.lineTo(52.69254f, 17.867647f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
