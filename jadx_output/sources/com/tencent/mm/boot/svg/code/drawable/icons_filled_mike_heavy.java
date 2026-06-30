package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mike_heavy extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.80078f, 6.7f);
        instancePath.cubicTo(7.80078f, 4.3804f, 9.68119f, 2.5f, 12.0008f, 2.5f);
        instancePath.cubicTo(14.3204f, 2.5f, 16.2008f, 4.3804f, 16.2008f, 6.7f);
        instancePath.lineTo(16.2008f, 12.3f);
        instancePath.cubicTo(16.2008f, 14.6196f, 14.3204f, 16.5f, 12.0008f, 16.5f);
        instancePath.cubicTo(9.68119f, 16.5f, 7.80078f, 14.6196f, 7.80078f, 12.3f);
        instancePath.lineTo(7.80078f, 6.7f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.0f, 11.0f);
        instancePath2.lineTo(6.0f, 12.5f);
        instancePath2.cubicTo(6.0f, 15.8137f, 8.68629f, 18.5f, 12.0f, 18.5f);
        instancePath2.cubicTo(15.3137f, 18.5f, 18.0f, 15.8137f, 18.0f, 12.5f);
        instancePath2.lineTo(18.0f, 11.0f);
        instancePath2.lineTo(20.0f, 11.0f);
        instancePath2.lineTo(20.0f, 12.5f);
        instancePath2.cubicTo(20.0f, 16.5796f, 16.9463f, 19.946f, 13.0f, 20.4381f);
        instancePath2.lineTo(13.0f, 22.5f);
        instancePath2.lineTo(11.0f, 22.5f);
        instancePath2.lineTo(11.0f, 20.4381f);
        instancePath2.cubicTo(7.05369f, 19.946f, 4.0f, 16.5796f, 4.0f, 12.5f);
        instancePath2.lineTo(4.0f, 11.0f);
        instancePath2.lineTo(6.0f, 11.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
