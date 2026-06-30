package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_star2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(37.327698f, 9.593318f);
                instancePath.cubicTo(37.919334f, 9.885308f, 38.398216f, 10.364191f, 38.69021f, 10.955829f);
                instancePath.lineTo(45.698456f, 25.156092f);
                instancePath.lineTo(61.369377f, 27.433208f);
                instancePath.cubicTo(63.00901f, 27.671463f, 64.14506f, 29.19379f, 63.906803f, 30.833426f);
                instancePath.cubicTo(63.811928f, 31.486336f, 63.504467f, 32.089764f, 63.032017f, 32.55029f);
                instancePath.lineTo(51.692432f, 43.603653f);
                instancePath.lineTo(54.369347f, 59.21125f);
                instancePath.cubicTo(54.64943f, 60.84426f, 53.552666f, 62.395126f, 51.919655f, 62.675213f);
                instancePath.cubicTo(51.269382f, 62.786743f, 50.60048f, 62.680798f, 50.0165f, 62.37378f);
                instancePath.lineTo(36.0f, 55.00487f);
                instancePath.lineTo(21.983503f, 62.37378f);
                instancePath.cubicTo(20.51697f, 63.144783f, 18.703089f, 62.580944f, 17.932085f, 61.11441f);
                instancePath.cubicTo(17.625069f, 60.53043f, 17.519125f, 59.861523f, 17.630655f, 59.21125f);
                instancePath.lineTo(20.307568f, 43.603653f);
                instancePath.lineTo(8.967983f, 32.55029f);
                instancePath.cubicTo(7.781533f, 31.393785f, 7.7572556f, 29.494446f, 8.913759f, 28.307995f);
                instancePath.cubicTo(9.374285f, 27.835545f, 9.977713f, 27.528084f, 10.630624f, 27.433208f);
                instancePath.lineTo(26.301544f, 25.156092f);
                instancePath.lineTo(33.30979f, 10.955829f);
                instancePath.cubicTo(34.04306f, 9.470068f, 35.841938f, 8.860051f, 37.327698f, 9.593318f);
                instancePath.close();
                instancePath.moveTo(43.30782f, 28.44652f);
                instancePath.lineTo(36.0f, 13.641f);
                instancePath.lineTo(28.692179f, 28.44652f);
                instancePath.lineTo(12.348f, 30.819f);
                instancePath.lineTo(24.175697f, 42.34682f);
                instancePath.lineTo(21.381f, 58.623f);
                instancePath.lineTo(36.0f, 50.93768f);
                instancePath.lineTo(50.616f, 58.623f);
                instancePath.lineTo(47.824303f, 42.34682f);
                instancePath.lineTo(59.649f, 30.819f);
                instancePath.lineTo(43.30782f, 28.44652f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
