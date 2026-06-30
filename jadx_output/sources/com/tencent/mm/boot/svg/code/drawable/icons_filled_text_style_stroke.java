package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_text_style_stroke extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(19.5f, 3.0f);
                instancePath.lineTo(4.5f, 3.0f);
                instancePath.cubicTo(3.9477153f, 3.0f, 3.5f, 3.4477153f, 3.5f, 4.0f);
                instancePath.lineTo(3.5f, 8.0f);
                instancePath.cubicTo(3.5f, 8.552285f, 3.9477153f, 9.0f, 4.5f, 9.0f);
                instancePath.lineTo(9.0f, 9.0f);
                instancePath.lineTo(9.0f, 9.0f);
                instancePath.lineTo(9.0f, 20.0f);
                instancePath.cubicTo(9.0f, 20.552284f, 9.447715f, 21.0f, 10.0f, 21.0f);
                instancePath.lineTo(14.0f, 21.0f);
                instancePath.cubicTo(14.552284f, 21.0f, 15.0f, 20.552284f, 15.0f, 20.0f);
                instancePath.lineTo(15.0f, 9.0f);
                instancePath.lineTo(15.0f, 9.0f);
                instancePath.lineTo(19.5f, 9.0f);
                instancePath.cubicTo(20.052284f, 9.0f, 20.5f, 8.552285f, 20.5f, 8.0f);
                instancePath.lineTo(20.5f, 4.0f);
                instancePath.cubicTo(20.5f, 3.4477153f, 20.052284f, 3.0f, 19.5f, 3.0f);
                instancePath.close();
                instancePath.moveTo(18.5f, 5.0f);
                instancePath.lineTo(18.5f, 7.0f);
                instancePath.lineTo(13.0f, 7.0f);
                instancePath.lineTo(13.0f, 19.0f);
                instancePath.lineTo(11.0f, 19.0f);
                instancePath.lineTo(11.0f, 7.0f);
                instancePath.lineTo(5.5f, 7.0f);
                instancePath.lineTo(5.5f, 5.0f);
                instancePath.lineTo(18.5f, 5.0f);
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
