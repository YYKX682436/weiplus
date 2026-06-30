package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_icon_music_filled extends l95.c {
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
        instancePath.moveTo(19.8999f, 7.23036f);
        instancePath.cubicTo(18.4299f, 6.02036f, 15.8099f, 5.84036f, 14.8399f, 4.23036f);
        instancePath.cubicTo(14.7599f, 4.08036f, 14.6199f, 3.78036f, 14.5699f, 3.38036f);
        instancePath.cubicTo(14.5399f, 3.15036f, 14.4699f, 2.97036f, 14.3499f, 2.84036f);
        instancePath.cubicTo(14.3099f, 2.80036f, 14.2599f, 2.77036f, 14.2099f, 2.75036f);
        instancePath.cubicTo(14.2099f, 2.75036f, 14.1999f, 2.75036f, 14.1899f, 2.75036f);
        instancePath.cubicTo(14.1699f, 2.75036f, 14.1499f, 2.73036f, 14.1299f, 2.72036f);
        instancePath.cubicTo(13.6899f, 2.62036f, 13.4299f, 2.94036f, 13.4299f, 4.08036f);
        instancePath.lineTo(13.4299f, 12.2604f);
        instancePath.cubicTo(13.4299f, 15.5104f, 12.6399f, 14.8204f, 10.6199f, 15.3304f);
        instancePath.cubicTo(9.14992f, 15.7004f, 7.91992f, 16.6904f, 7.91992f, 18.2104f);
        instancePath.cubicTo(7.91992f, 19.7304f, 9.14992f, 20.9604f, 10.6699f, 20.9604f);
        instancePath.cubicTo(14.7499f, 20.9604f, 14.6299f, 16.7204f, 14.6299f, 15.1004f);
        instancePath.lineTo(14.6299f, 14.9304f);
        instancePath.lineTo(14.6299f, 8.00036f);
        instancePath.cubicTo(14.6299f, 6.47036f, 15.7299f, 6.66036f, 17.6299f, 7.35036f);
        instancePath.cubicTo(18.6999f, 7.75036f, 19.7199f, 8.21036f, 20.1299f, 9.33036f);
        instancePath.cubicTo(20.4699f, 10.6004f, 19.7399f, 11.7504f, 18.6199f, 12.3704f);
        instancePath.cubicTo(18.4099f, 12.4904f, 18.5399f, 12.8104f, 18.7699f, 12.7404f);
        instancePath.cubicTo(21.0299f, 12.0504f, 22.2099f, 9.01036f, 19.8999f, 7.25036f);
        instancePath.lineTo(19.8999f, 7.23036f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.5f, 8.0f);
        instancePath2.lineTo(10.5f, 8.0f);
        instancePath2.lineTo(10.5f, 10.0f);
        instancePath2.lineTo(7.5f, 10.0f);
        instancePath2.lineTo(7.5f, 13.0f);
        instancePath2.lineTo(5.5f, 13.0f);
        instancePath2.lineTo(5.5f, 10.0f);
        instancePath2.lineTo(2.5f, 10.0f);
        instancePath2.lineTo(2.5f, 8.0f);
        instancePath2.lineTo(5.5f, 8.0f);
        instancePath2.lineTo(5.5f, 5.0f);
        instancePath2.lineTo(7.5f, 5.0f);
        instancePath2.lineTo(7.5f, 8.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
