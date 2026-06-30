package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class download_image_icon extends l95.c {
    private final int width = 480;
    private final int height = 480;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 480;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-2565928);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(480.0f, 0.0f);
                instancePath.lineTo(480.0f, 480.0f);
                instancePath.lineTo(0.0f, 480.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(377.6f, 272.91428f);
                instancePath2.lineTo(377.6f, 137.6f);
                instancePath2.lineTo(102.4f, 137.6f);
                instancePath2.lineTo(102.4f, 269.6258f);
                instancePath2.lineTo(188.8f, 188.8f);
                instancePath2.lineTo(288.0f, 278.4f);
                instancePath2.lineTo(278.4f, 252.8f);
                instancePath2.lineTo(320.0f, 220.8f);
                instancePath2.lineTo(377.6f, 272.91428f);
                instancePath2.close();
                instancePath2.moveTo(86.4f, 124.594025f);
                instancePath2.cubicTo(86.4f, 122.940475f, 87.736046f, 121.6f, 89.391014f, 121.6f);
                instancePath2.lineTo(390.60898f, 121.6f);
                instancePath2.cubicTo(392.26086f, 121.6f, 393.6f, 122.946335f, 393.6f, 124.594025f);
                instancePath2.lineTo(393.6f, 355.40598f);
                instancePath2.cubicTo(393.6f, 357.05954f, 392.26395f, 358.4f, 390.60898f, 358.4f);
                instancePath2.lineTo(89.391014f, 358.4f);
                instancePath2.cubicTo(87.73912f, 358.4f, 86.4f, 357.05365f, 86.4f, 355.40598f);
                instancePath2.lineTo(86.4f, 124.594025f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
