package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_icons_filled_more_option extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 28;
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
                instancePaint3.setColor(-855638017);
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.33331f, 13.9999f);
                instancePath.cubicTo(2.33331f, 20.4432f, 7.55666f, 25.6666f, 14.0f, 25.6666f);
                instancePath.cubicTo(20.4433f, 25.6666f, 25.6666f, 20.4432f, 25.6666f, 13.9999f);
                instancePath.cubicTo(25.6666f, 7.5566f, 20.4433f, 2.33325f, 14.0f, 2.33325f);
                instancePath.cubicTo(7.55666f, 2.33325f, 2.33331f, 7.5566f, 2.33331f, 13.9999f);
                instancePath.close();
                instancePath.moveTo(14.0f, 15.75f);
                instancePath.cubicTo(14.9665f, 15.75f, 15.75f, 14.9665f, 15.75f, 14.0f);
                instancePath.cubicTo(15.75f, 13.0335f, 14.9665f, 12.25f, 14.0f, 12.25f);
                instancePath.cubicTo(13.0335f, 12.25f, 12.25f, 13.0335f, 12.25f, 14.0f);
                instancePath.cubicTo(12.25f, 14.9665f, 13.0335f, 15.75f, 14.0f, 15.75f);
                instancePath.close();
                instancePath.moveTo(21.0f, 14.0f);
                instancePath.cubicTo(21.0f, 14.9665f, 20.2165f, 15.75f, 19.25f, 15.75f);
                instancePath.cubicTo(18.2835f, 15.75f, 17.5f, 14.9665f, 17.5f, 14.0f);
                instancePath.cubicTo(17.5f, 13.0335f, 18.2835f, 12.25f, 19.25f, 12.25f);
                instancePath.cubicTo(20.2165f, 12.25f, 21.0f, 13.0335f, 21.0f, 14.0f);
                instancePath.close();
                instancePath.moveTo(8.75f, 15.75f);
                instancePath.cubicTo(9.7165f, 15.75f, 10.5f, 14.9665f, 10.5f, 14.0f);
                instancePath.cubicTo(10.5f, 13.0335f, 9.7165f, 12.25f, 8.75f, 12.25f);
                instancePath.cubicTo(7.7835f, 12.25f, 7.0f, 13.0335f, 7.0f, 14.0f);
                instancePath.cubicTo(7.0f, 14.9665f, 7.7835f, 15.75f, 8.75f, 15.75f);
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
