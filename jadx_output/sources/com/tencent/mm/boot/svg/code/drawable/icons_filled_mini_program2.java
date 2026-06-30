package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mini_program2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 66.0f);
            instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(45.536026f, 38.159416f);
            instancePath.cubicTo(50.24942f, 37.3397f, 53.645454f, 33.62253f, 53.645454f, 29.181818f);
            instancePath.cubicTo(53.645454f, 24.142166f, 49.159824f, 20.1f, 43.654545f, 20.1f);
            instancePath.cubicTo(38.149265f, 20.1f, 33.663635f, 24.142166f, 33.663635f, 29.181818f);
            instancePath.lineTo(33.663635f, 42.81818f);
            instancePath.cubicTo(33.663635f, 45.311462f, 31.248707f, 47.372726f, 28.199999f, 47.372726f);
            instancePath.cubicTo(25.15129f, 47.372726f, 22.736362f, 45.311462f, 22.736362f, 42.81818f);
            instancePath.cubicTo(22.736362f, 40.836388f, 24.303173f, 39.063953f, 26.592993f, 38.51124f);
            instancePath.cubicTo(27.61693f, 38.255287f, 28.55695f, 37.51245f, 28.93632f, 36.627254f);
            instancePath.cubicTo(28.997086f, 36.50983f, 29.04934f, 36.355717f, 29.07639f, 36.193413f);
            instancePath.cubicTo(29.095797f, 36.07697f, 29.100494f, 35.987602f, 29.099997f, 35.816437f);
            instancePath.cubicTo(29.099998f, 34.69665f, 28.163311f, 33.918182f, 26.92727f, 33.918182f);
            instancePath.lineTo(26.563635f, 33.918182f);
            instancePath.cubicTo(21.77835f, 34.635788f, 18.3f, 38.397312f, 18.3f, 42.81818f);
            instancePath.cubicTo(18.3f, 47.857834f, 22.78563f, 51.9f, 28.290909f, 51.9f);
            instancePath.cubicTo(33.796185f, 51.9f, 38.28182f, 47.857834f, 38.28182f, 42.81818f);
            instancePath.lineTo(38.28182f, 29.181818f);
            instancePath.cubicTo(38.28182f, 26.688538f, 40.696747f, 24.627274f, 43.745453f, 24.627274f);
            instancePath.cubicTo(46.794163f, 24.627274f, 49.20909f, 26.688538f, 49.20909f, 29.181818f);
            instancePath.cubicTo(49.20909f, 31.239927f, 47.659065f, 33.022903f, 45.35246f, 33.57967f);
            instancePath.cubicTo(44.305294f, 33.81221f, 43.41064f, 34.5268f, 43.009132f, 35.463654f);
            instancePath.cubicTo(42.373043f, 36.894634f, 43.38685f, 38.172726f, 45.01818f, 38.172726f);
            instancePath.lineTo(45.536026f, 38.159416f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
