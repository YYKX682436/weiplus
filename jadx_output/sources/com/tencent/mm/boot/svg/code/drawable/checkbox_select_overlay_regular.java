package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_select_overlay_regular extends l95.c {
    private final int width = 26;
    private final int height = 26;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(13.0f, 1.0f);
            instancePath.cubicTo(19.6274f, 1.0f, 25.0f, 6.37258f, 25.0f, 13.0f);
            instancePath.cubicTo(25.0f, 19.6274f, 19.6274f, 25.0f, 13.0f, 25.0f);
            instancePath.cubicTo(6.37258f, 25.0f, 1.0f, 19.6274f, 1.0f, 13.0f);
            instancePath.cubicTo(1.0f, 6.37258f, 6.37258f, 1.0f, 13.0f, 1.0f);
            instancePath.close();
            instancePath.moveTo(11.2422f, 15.876f);
            instancePath.lineTo(7.94238f, 12.5762f);
            instancePath.lineTo(7.0f, 13.5186f);
            instancePath.lineTo(10.7715f, 17.29f);
            instancePath.cubicTo(11.0318f, 17.5502f, 11.4536f, 17.5502f, 11.7139f, 17.29f);
            instancePath.lineTo(19.7275f, 9.27637f);
            instancePath.lineTo(18.7852f, 8.33301f);
            instancePath.lineTo(11.2422f, 15.876f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
