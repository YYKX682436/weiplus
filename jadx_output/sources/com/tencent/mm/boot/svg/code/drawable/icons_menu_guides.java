package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_guides extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 30;
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.0f, 5.0f);
                instancePath.lineTo(8.0f, 5.0f);
                instancePath.lineTo(8.0f, 8.0f);
                instancePath.lineTo(5.0f, 8.0f);
                instancePath.lineTo(5.0f, 10.0f);
                instancePath.lineTo(8.0f, 10.0f);
                instancePath.lineTo(8.0f, 20.0f);
                instancePath.lineTo(5.0f, 20.0f);
                instancePath.lineTo(5.0f, 22.0f);
                instancePath.lineTo(8.0f, 22.0f);
                instancePath.lineTo(8.0f, 25.0f);
                instancePath.lineTo(10.0f, 25.0f);
                instancePath.lineTo(10.0f, 22.0f);
                instancePath.lineTo(20.0f, 22.0f);
                instancePath.lineTo(20.0f, 25.0f);
                instancePath.lineTo(22.0f, 25.0f);
                instancePath.lineTo(22.0f, 22.0f);
                instancePath.lineTo(25.0f, 22.0f);
                instancePath.lineTo(25.0f, 20.0f);
                instancePath.lineTo(22.0f, 20.0f);
                instancePath.lineTo(22.0f, 10.0f);
                instancePath.lineTo(25.0f, 10.0f);
                instancePath.lineTo(25.0f, 8.0f);
                instancePath.lineTo(22.0f, 8.0f);
                instancePath.lineTo(22.0f, 5.0f);
                instancePath.lineTo(20.0f, 5.0f);
                instancePath.lineTo(20.0f, 8.0f);
                instancePath.lineTo(10.0f, 8.0f);
                instancePath.lineTo(10.0f, 5.0f);
                instancePath.close();
                instancePath.moveTo(20.0f, 20.0f);
                instancePath.lineTo(20.0f, 10.0f);
                instancePath.lineTo(10.0f, 10.0f);
                instancePath.lineTo(10.0f, 20.0f);
                instancePath.lineTo(20.0f, 20.0f);
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
