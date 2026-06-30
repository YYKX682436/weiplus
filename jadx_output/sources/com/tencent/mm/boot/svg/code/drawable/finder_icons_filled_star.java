package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_filled_star extends l95.c {
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
        l95.c.instanceMatrix(looper);
        l95.c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 55.5f);
        instancePath.lineTo(21.983503f, 62.868908f);
        instancePath.cubicTo(20.51697f, 63.63991f, 18.703089f, 63.076073f, 17.932085f, 61.60954f);
        instancePath.cubicTo(17.625069f, 61.025555f, 17.519125f, 60.35665f, 17.630655f, 59.70638f);
        instancePath.lineTo(20.307568f, 44.09878f);
        instancePath.lineTo(8.967983f, 33.045418f);
        instancePath.cubicTo(7.781533f, 31.888914f, 7.7572556f, 29.989574f, 8.913759f, 28.803123f);
        instancePath.cubicTo(9.374285f, 28.330673f, 9.977713f, 28.02321f, 10.630624f, 27.928337f);
        instancePath.lineTo(26.301544f, 25.65122f);
        instancePath.lineTo(33.30979f, 11.450957f);
        instancePath.cubicTo(34.04306f, 9.965197f, 35.841938f, 9.355179f, 37.327698f, 10.088447f);
        instancePath.cubicTo(37.919334f, 10.380437f, 38.398216f, 10.85932f, 38.69021f, 11.450957f);
        instancePath.lineTo(45.698456f, 25.65122f);
        instancePath.lineTo(61.369377f, 27.928337f);
        instancePath.cubicTo(63.00901f, 28.16659f, 64.14506f, 29.68892f, 63.906803f, 31.328554f);
        instancePath.cubicTo(63.811928f, 31.981464f, 63.504467f, 32.584892f, 63.032017f, 33.045418f);
        instancePath.lineTo(51.692432f, 44.09878f);
        instancePath.lineTo(54.369347f, 59.70638f);
        instancePath.cubicTo(54.64943f, 61.33939f, 53.552666f, 62.890255f, 51.919655f, 63.170338f);
        instancePath.cubicTo(51.269382f, 63.281868f, 50.60048f, 63.175926f, 50.0165f, 62.868908f);
        instancePath.lineTo(36.0f, 55.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
