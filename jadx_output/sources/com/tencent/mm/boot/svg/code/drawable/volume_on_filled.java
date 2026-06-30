package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class volume_on_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(8.5f, 8.4999f);
                instancePath.lineTo(12.3f, 4.6999f);
                instancePath.cubicTo(12.7f, 4.2999f, 13.3f, 4.2999f, 13.7f, 4.6999f);
                instancePath.cubicTo(13.9f, 4.8999f, 14.0f, 5.0999f, 14.0f, 5.3999f);
                instancePath.lineTo(14.0f, 18.5999f);
                instancePath.cubicTo(14.0f, 19.1999f, 13.6f, 19.5999f, 13.0f, 19.5999f);
                instancePath.cubicTo(12.7f, 19.5999f, 12.5f, 19.4999f, 12.3f, 19.2999f);
                instancePath.lineTo(8.5f, 15.4999f);
                instancePath.lineTo(4.0f, 15.4999f);
                instancePath.cubicTo(3.4f, 15.4999f, 3.0f, 15.0999f, 3.0f, 14.4999f);
                instancePath.lineTo(3.0f, 9.4999f);
                instancePath.cubicTo(3.0f, 8.8999f, 3.4f, 8.4999f, 4.0f, 8.4999f);
                instancePath.lineTo(8.5f, 8.4999f);
                instancePath.close();
                instancePath.moveTo(18.1001f, 16.7999f);
                instancePath.lineTo(19.2001f, 17.8999f);
                instancePath.lineTo(19.3001f, 17.7999f);
                instancePath.cubicTo(20.9001f, 16.1999f, 21.7001f, 14.1999f, 21.7001f, 11.9999f);
                instancePath.cubicTo(21.7001f, 9.79985f, 20.8001f, 7.69985f, 19.3001f, 6.19985f);
                instancePath.lineTo(19.2001f, 6.09985f);
                instancePath.lineTo(18.1001f, 7.19985f);
                instancePath.lineTo(18.2001f, 7.29985f);
                instancePath.cubicTo(19.4001f, 8.59985f, 20.1001f, 10.1999f, 20.1001f, 11.9999f);
                instancePath.cubicTo(20.1001f, 13.7999f, 19.5001f, 15.3999f, 18.2001f, 16.6999f);
                instancePath.lineTo(18.1001f, 16.7999f);
                instancePath.close();
                instancePath.moveTo(16.1001f, 14.7999f);
                instancePath.lineTo(17.2001f, 15.8999f);
                instancePath.lineTo(17.3001f, 15.7999f);
                instancePath.cubicTo(18.3001f, 14.7999f, 18.9001f, 13.3999f, 18.9001f, 11.9999f);
                instancePath.cubicTo(18.9001f, 10.5999f, 18.3001f, 9.19985f, 17.3001f, 8.19985f);
                instancePath.lineTo(17.2001f, 8.09985f);
                instancePath.lineTo(16.1001f, 9.19985f);
                instancePath.lineTo(16.2001f, 9.29985f);
                instancePath.cubicTo(16.9001f, 9.99985f, 17.3001f, 10.9999f, 17.3001f, 11.9999f);
                instancePath.cubicTo(17.3001f, 12.9999f, 16.9001f, 13.9999f, 16.2001f, 14.6999f);
                instancePath.lineTo(16.1001f, 14.7999f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
