package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class download_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePath.moveTo(5.0f, 7.0f);
        instancePath.cubicTo(4.44772f, 7.0f, 4.0f, 7.44772f, 4.0f, 8.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(4.0f, 21.5523f, 4.44772f, 22.0f, 5.0f, 22.0f);
        instancePath.lineTo(19.0f, 22.0f);
        instancePath.cubicTo(19.5523f, 22.0f, 20.0f, 21.5523f, 20.0f, 21.0f);
        instancePath.lineTo(20.0f, 8.0f);
        instancePath.cubicTo(20.0f, 7.44772f, 19.5523f, 7.0f, 19.0f, 7.0f);
        instancePath.lineTo(13.0001f, 7.0f);
        instancePath.lineTo(13.0001f, 12.6497f);
        instancePath.lineTo(14.405f, 11.2447f);
        instancePath.lineTo(15.8192f, 12.6589f);
        instancePath.lineTo(12.7128f, 15.7656f);
        instancePath.cubicTo(12.3183f, 16.1601f, 11.6788f, 16.1601f, 11.2844f, 15.7657f);
        instancePath.lineTo(8.17798f, 12.6591f);
        instancePath.lineTo(9.59223f, 11.245f);
        instancePath.lineTo(11.0001f, 12.6529f);
        instancePath.lineTo(11.0001f, 7.0f);
        instancePath.lineTo(5.0f, 7.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.0f, 2.0f);
        instancePath2.lineTo(13.0001f, 7.0f);
        instancePath2.lineTo(11.0001f, 7.0f);
        instancePath2.lineTo(11.0f, 2.0f);
        instancePath2.lineTo(13.0f, 2.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
