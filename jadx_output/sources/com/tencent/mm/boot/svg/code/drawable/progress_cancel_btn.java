package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class progress_cancel_btn extends l95.c {
    private final int width = 66;
    private final int height = 66;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 66;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-499359);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(29.81802f, 33.0f);
                instancePath.lineTo(17.90901f, 21.09099f);
                instancePath.lineTo(21.09099f, 17.90901f);
                instancePath.lineTo(33.0f, 29.81802f);
                instancePath.lineTo(44.909008f, 17.90901f);
                instancePath.lineTo(48.090992f, 21.09099f);
                instancePath.lineTo(36.18198f, 33.0f);
                instancePath.lineTo(48.090992f, 44.909008f);
                instancePath.lineTo(44.909008f, 48.090992f);
                instancePath.lineTo(33.0f, 36.18198f);
                instancePath.lineTo(21.09099f, 48.090992f);
                instancePath.lineTo(17.90901f, 44.909008f);
                instancePath.lineTo(29.81802f, 33.0f);
                instancePath.close();
                instancePath.moveTo(33.0f, 66.0f);
                instancePath.cubicTo(51.225395f, 66.0f, 66.0f, 51.225395f, 66.0f, 33.0f);
                instancePath.cubicTo(66.0f, 14.774603f, 51.225395f, 0.0f, 33.0f, 0.0f);
                instancePath.cubicTo(14.774603f, 0.0f, 0.0f, 14.774603f, 0.0f, 33.0f);
                instancePath.cubicTo(0.0f, 51.225395f, 14.774603f, 66.0f, 33.0f, 66.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
