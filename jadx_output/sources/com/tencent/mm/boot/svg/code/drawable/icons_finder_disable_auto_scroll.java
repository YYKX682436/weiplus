package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_finder_disable_auto_scroll extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(25.333334f, 2.6666667f);
        instancePath.cubicTo(26.069714f, 2.6666667f, 26.666666f, 3.2636204f, 26.666666f, 4.0f);
        instancePath.lineTo(26.666962f, 15.429904f);
        instancePath.cubicTo(26.154255f, 15.14617f, 25.617788f, 14.921061f, 25.067385f, 14.754577f);
        instancePath.lineTo(25.066668f, 4.266667f);
        instancePath.lineTo(6.9333334f, 4.266667f);
        instancePath.lineTo(6.9333334f, 27.733334f);
        instancePath.lineTo(16.134037f, 27.73392f);
        instancePath.cubicTo(16.344036f, 28.003942f, 16.573107f, 28.263939f, 16.82125f, 28.512083f);
        instancePath.cubicTo(17.123455f, 28.814287f, 17.443235f, 29.088202f, 17.777302f, 29.333826f);
        instancePath.lineTo(6.6666665f, 29.333334f);
        instancePath.cubicTo(5.930287f, 29.333334f, 5.3333335f, 28.73638f, 5.3333335f, 28.0f);
        instancePath.lineTo(5.3333335f, 4.0f);
        instancePath.cubicTo(5.3333335f, 3.2636204f, 5.930287f, 2.6666667f, 6.6666665f, 2.6666667f);
        instancePath.lineTo(25.333334f, 2.6666667f);
        instancePath.close();
        instancePath.moveTo(16.353554f, 8.177816f);
        instancePath.lineTo(20.715992f, 12.540255f);
        instancePath.lineTo(19.587978f, 13.668269f);
        instancePath.lineTo(16.797993f, 10.878406f);
        instancePath.lineTo(16.797571f, 16.845024f);
        instancePath.cubicTo(16.123829f, 17.524143f, 15.592083f, 18.291054f, 15.202333f, 19.108751f);
        instancePath.lineTo(15.202992f, 10.877405f);
        instancePath.lineTo(12.412023f, 13.668269f);
        instancePath.lineTo(11.284008f, 12.540255f);
        instancePath.lineTo(14.871985f, 8.952277f);
        instancePath.lineTo(15.646446f, 8.177816f);
        instancePath.cubicTo(15.841709f, 7.982554f, 16.15829f, 7.982554f, 16.353554f, 8.177816f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(27.380713f, 17.952621f);
        instancePath2.cubicTo(29.984207f, 20.556116f, 29.984207f, 24.777216f, 27.380713f, 27.380713f);
        instancePath2.cubicTo(24.777216f, 29.984207f, 20.556116f, 29.984207f, 17.952621f, 27.380713f);
        instancePath2.cubicTo(15.349126f, 24.777216f, 15.349126f, 20.556116f, 17.952621f, 17.952621f);
        instancePath2.cubicTo(20.556116f, 15.349126f, 24.777216f, 15.349126f, 27.380713f, 17.952621f);
        instancePath2.close();
        instancePath2.moveTo(18.56249f, 19.694391f);
        instancePath2.cubicTo(17.124079f, 21.67546f, 17.297913f, 24.46326f, 19.083992f, 26.24934f);
        instancePath2.cubicTo(20.870071f, 28.035421f, 23.657873f, 28.209255f, 25.63894f, 26.770844f);
        instancePath2.lineTo(18.56249f, 19.694391f);
        instancePath2.close();
        instancePath2.moveTo(19.694391f, 18.56249f);
        instancePath2.lineTo(26.770844f, 25.63894f);
        instancePath2.cubicTo(28.209255f, 23.657873f, 28.035421f, 20.870071f, 26.24934f, 19.083992f);
        instancePath2.cubicTo(24.46326f, 17.297913f, 21.67546f, 17.124079f, 19.694391f, 18.56249f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
