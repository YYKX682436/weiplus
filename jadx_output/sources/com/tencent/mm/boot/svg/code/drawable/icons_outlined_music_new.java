package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_music_new extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.4902f, 7.11079f);
            instancePath.cubicTo(17.0402f, 5.88079f, 14.9502f, 5.88079f, 13.7102f, 4.49079f);
            instancePath.cubicTo(13.3502f, 4.08079f, 13.1302f, 3.58079f, 13.0902f, 3.07079f);
            instancePath.cubicTo(13.0302f, 2.59079f, 12.5202f, 2.48079f, 12.2102f, 2.68079f);
            instancePath.cubicTo(12.1902f, 2.69079f, 12.1702f, 2.70079f, 12.1602f, 2.72079f);
            instancePath.cubicTo(12.1102f, 2.76079f, 12.0702f, 2.81079f, 12.0402f, 2.86079f);
            instancePath.cubicTo(11.8802f, 3.09079f, 11.7902f, 3.46079f, 11.7902f, 4.06079f);
            instancePath.lineTo(11.7902f, 11.8608f);
            instancePath.cubicTo(11.7902f, 15.3408f, 11.1002f, 14.6008f, 8.90018f, 15.1608f);
            instancePath.cubicTo(7.28018f, 15.5708f, 5.93018f, 16.6608f, 5.93018f, 18.3308f);
            instancePath.cubicTo(5.93018f, 20.0008f, 7.41018f, 21.3908f, 9.13018f, 21.3308f);
            instancePath.cubicTo(13.4102f, 21.2008f, 13.2802f, 16.6608f, 13.2802f, 14.9108f);
            instancePath.lineTo(13.2802f, 7.85079f);
            instancePath.cubicTo(13.3402f, 6.49079f, 14.3002f, 6.82079f, 16.1302f, 7.49079f);
            instancePath.cubicTo(16.6602f, 7.70079f, 17.1702f, 7.93079f, 17.6202f, 8.24079f);
            instancePath.cubicTo(19.4002f, 9.45079f, 18.5102f, 11.5908f, 16.8602f, 12.4608f);
            instancePath.cubicTo(16.6602f, 12.5708f, 16.7702f, 12.8708f, 16.9902f, 12.8308f);
            instancePath.cubicTo(19.5202f, 12.3908f, 20.9602f, 9.01079f, 18.4902f, 7.11079f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
