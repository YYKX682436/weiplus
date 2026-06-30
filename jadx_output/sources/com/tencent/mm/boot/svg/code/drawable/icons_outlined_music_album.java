package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_music_album extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(39.7975f, 25.2227f);
        instancePath.cubicTo(39.7975f, 24.2286f, 38.9917f, 23.4227f, 37.9975f, 23.4227f);
        instancePath.cubicTo(37.0034f, 23.4227f, 36.1975f, 24.2286f, 36.1975f, 25.2227f);
        instancePath.lineTo(36.1975f, 41.9695f);
        instancePath.cubicTo(34.75f, 41.4592f, 33.0349f, 41.4588f, 31.3842f, 42.0895f);
        instancePath.cubicTo(28.0367f, 43.3684f, 26.2219f, 46.758f, 27.3307f, 49.6604f);
        instancePath.cubicTo(28.4396f, 52.5628f, 32.0522f, 53.8789f, 35.3998f, 52.5999f);
        instancePath.cubicTo(37.9972f, 51.6076f, 39.6718f, 49.3445f, 39.7739f, 47.0243f);
        instancePath.cubicTo(39.7895f, 46.9291f, 39.7975f, 46.8315f, 39.7975f, 46.7319f);
        instancePath.lineTo(39.7975f, 33.16f);
        instancePath.cubicTo(39.7975f, 32.7212f, 40.2531f, 32.4308f, 40.6508f, 32.616f);
        instancePath.lineTo(43.7716f, 34.0692f);
        instancePath.cubicTo(44.6728f, 34.4889f, 45.7436f, 34.0985f, 46.1632f, 33.1973f);
        instancePath.cubicTo(46.5829f, 32.2961f, 46.1925f, 31.2254f, 45.2913f, 30.8057f);
        instancePath.lineTo(40.6643f, 28.6512f);
        instancePath.cubicTo(40.1356f, 28.405f, 39.7975f, 27.8746f, 39.7975f, 27.2914f);
        instancePath.lineTo(39.7975f, 25.2227f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.0f, 9.0f);
        instancePath2.cubicTo(6.0f, 7.34315f, 7.34315f, 6.0f, 9.0f, 6.0f);
        instancePath2.lineTo(63.0f, 6.0f);
        instancePath2.cubicTo(64.6569f, 6.0f, 66.0f, 7.34315f, 66.0f, 9.0f);
        instancePath2.lineTo(66.0f, 63.0f);
        instancePath2.cubicTo(66.0f, 64.6569f, 64.6569f, 66.0f, 63.0f, 66.0f);
        instancePath2.lineTo(9.0f, 66.0f);
        instancePath2.cubicTo(7.34315f, 66.0f, 6.0f, 64.6569f, 6.0f, 63.0f);
        instancePath2.lineTo(6.0f, 9.0f);
        instancePath2.close();
        instancePath2.moveTo(9.6f, 62.4f);
        instancePath2.lineTo(9.6f, 9.6f);
        instancePath2.lineTo(62.4f, 9.6f);
        instancePath2.lineTo(62.4f, 62.4f);
        instancePath2.lineTo(9.6f, 62.4f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
