package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_room_not_entrance extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePaint3.setColor(855638016);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(8.6665f, 2.6665f);
                instancePath.lineTo(7.33317f, 2.6665f);
                instancePath.lineTo(7.33317f, 7.33317f);
                instancePath.lineTo(2.66649f, 7.33317f);
                instancePath.lineTo(2.66649f, 8.6665f);
                instancePath.lineTo(7.33317f, 8.6665f);
                instancePath.lineTo(7.33317f, 13.3332f);
                instancePath.lineTo(8.6665f, 13.3332f);
                instancePath.lineTo(8.6665f, 8.6665f);
                instancePath.lineTo(13.3332f, 8.6665f);
                instancePath.lineTo(13.3332f, 7.33317f);
                instancePath.lineTo(8.6665f, 7.33317f);
                instancePath.lineTo(8.6665f, 2.6665f);
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
