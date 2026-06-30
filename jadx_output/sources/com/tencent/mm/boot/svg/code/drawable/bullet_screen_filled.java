package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bullet_screen_filled extends l95.c {
    private final int width = 72;
    private final int height = 73;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 72;
        }
        if (i17 == 1) {
            return 73;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(37.1089f, 9.02557f);
        instancePath.lineTo(42.1354f, 18.1648f);
        instancePath.lineTo(45.1868f, 18.1648f);
        instancePath.lineTo(50.2134f, 9.02557f);
        instancePath.lineTo(55.4707f, 11.9171f);
        instancePath.lineTo(52.0345f, 18.1648f);
        instancePath.lineTo(54.3694f, 18.1648f);
        instancePath.cubicTo(56.7904f, 18.1648f, 58.7531f, 20.1274f, 58.7531f, 22.5485f);
        instancePath.lineTo(58.7531f, 38.599f);
        instancePath.cubicTo(58.7531f, 41.0201f, 56.7904f, 42.9827f, 54.3694f, 42.9827f);
        instancePath.lineTo(46.6641f, 42.9827f);
        instancePath.lineTo(46.6641f, 46.3917f);
        instancePath.lineTo(55.2414f, 46.3917f);
        instancePath.lineTo(50.2068f, 52.3917f);
        instancePath.lineTo(46.6641f, 52.3917f);
        instancePath.lineTo(46.6641f, 60.1423f);
        instancePath.lineTo(40.6641f, 60.1445f);
        instancePath.lineTo(40.6641f, 52.3917f);
        instancePath.lineTo(28.8691f, 52.3917f);
        instancePath.lineTo(28.8691f, 46.3917f);
        instancePath.lineTo(40.6641f, 46.3917f);
        instancePath.lineTo(40.6641f, 42.9827f);
        instancePath.lineTo(32.9423f, 42.9827f);
        instancePath.cubicTo(30.5212f, 42.9827f, 28.5586f, 41.0201f, 28.5586f, 38.599f);
        instancePath.lineTo(28.5586f, 22.5484f);
        instancePath.cubicTo(28.5586f, 20.1274f, 30.5212f, 18.1648f, 32.9423f, 18.1648f);
        instancePath.lineTo(35.2878f, 18.1648f);
        instancePath.lineTo(31.8516f, 11.9171f);
        instancePath.lineTo(37.1089f, 9.02557f);
        instancePath.close();
        instancePath.moveTo(11.3981f, 19.9751f);
        instancePath.lineTo(11.3981f, 13.9751f);
        instancePath.lineTo(20.5204f, 13.9751f);
        instancePath.cubicTo(23.709f, 13.9751f, 26.2853f, 16.5606f, 26.2853f, 19.7424f);
        instancePath.lineTo(26.2853f, 26.1893f);
        instancePath.cubicTo(26.2853f, 29.3745f, 23.7032f, 31.9566f, 20.518f, 31.9566f);
        instancePath.lineTo(16.0078f, 31.9566f);
        instancePath.lineTo(16.0078f, 36.9828f);
        instancePath.lineTo(20.518f, 36.9828f);
        instancePath.cubicTo(23.7032f, 36.9828f, 26.2853f, 39.5649f, 26.2853f, 42.7501f);
        instancePath.lineTo(26.2853f, 49.1545f);
        instancePath.cubicTo(26.2853f, 55.3965f, 21.2252f, 60.4566f, 14.9833f, 60.4566f);
        instancePath.lineTo(11.3981f, 60.4566f);
        instancePath.lineTo(11.3981f, 54.4566f);
        instancePath.lineTo(14.9833f, 54.4566f);
        instancePath.cubicTo(17.9115f, 54.4566f, 20.2853f, 52.0828f, 20.2853f, 49.1545f);
        instancePath.lineTo(20.2853f, 42.9828f);
        instancePath.lineTo(15.7752f, 42.9828f);
        instancePath.cubicTo(12.5899f, 42.9828f, 10.0078f, 40.4006f, 10.0078f, 37.2154f);
        instancePath.lineTo(10.0078f, 31.724f);
        instancePath.cubicTo(10.0078f, 28.5388f, 12.5899f, 25.9566f, 15.7752f, 25.9566f);
        instancePath.lineTo(20.2853f, 25.9566f);
        instancePath.lineTo(20.2853f, 19.9751f);
        instancePath.lineTo(11.3981f, 19.9751f);
        instancePath.close();
        instancePath.moveTo(46.6641f, 36.9827f);
        instancePath.lineTo(52.7531f, 36.9827f);
        instancePath.lineTo(52.7531f, 33.5737f);
        instancePath.lineTo(46.6641f, 33.5737f);
        instancePath.lineTo(46.6641f, 36.9827f);
        instancePath.close();
        instancePath.moveTo(40.6641f, 33.5737f);
        instancePath.lineTo(40.6641f, 36.9827f);
        instancePath.lineTo(34.5586f, 36.9827f);
        instancePath.lineTo(34.5586f, 33.5737f);
        instancePath.lineTo(40.6641f, 33.5737f);
        instancePath.close();
        instancePath.moveTo(46.6641f, 27.5737f);
        instancePath.lineTo(52.7531f, 27.5737f);
        instancePath.lineTo(52.7531f, 24.1648f);
        instancePath.lineTo(46.6641f, 24.1648f);
        instancePath.lineTo(46.6641f, 27.5737f);
        instancePath.close();
        instancePath.moveTo(40.6641f, 24.1648f);
        instancePath.lineTo(40.6641f, 27.5737f);
        instancePath.lineTo(34.5586f, 27.5737f);
        instancePath.lineTo(34.5586f, 24.1648f);
        instancePath.lineTo(40.6641f, 24.1648f);
        instancePath.close();
        instancePath.moveTo(66.2467f, 41.2121f);
        instancePath.cubicTo(65.6121f, 40.6796f, 64.666f, 40.7624f, 64.1335f, 41.397f);
        instancePath.lineTo(50.5277f, 57.6116f);
        instancePath.cubicTo(50.3802f, 57.7875f, 50.3054f, 58.0132f, 50.3187f, 58.2424f);
        instancePath.lineTo(50.5597f, 62.389f);
        instancePath.cubicTo(50.5897f, 62.9058f, 51.0486f, 63.2908f, 51.5628f, 63.2307f);
        instancePath.lineTo(55.6882f, 62.7479f);
        instancePath.cubicTo(55.9163f, 62.7213f, 56.1255f, 62.6084f, 56.2731f, 62.4325f);
        instancePath.lineTo(69.8788f, 46.2179f);
        instancePath.cubicTo(70.4113f, 45.5833f, 70.3285f, 44.6371f, 69.6939f, 44.1046f);
        instancePath.lineTo(66.2467f, 41.2121f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
