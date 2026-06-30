package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class arrow_left_circle_filled extends l95.c {
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
                instancePath.moveTo(12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.close();
                instancePath.moveTo(12.9246f, 7.32495f);
                instancePath.lineTo(9.03639f, 11.3179f);
                instancePath.cubicTo(8.6535f, 11.7112f, 8.6547f, 12.3381f, 9.03902f, 12.7299f);
                instancePath.lineTo(12.9135f, 16.6792f);
                instancePath.lineTo(14.3412f, 15.2786f);
                instancePath.lineTo(11.1443f, 12.02f);
                instancePath.lineTo(14.3575f, 8.72023f);
                instancePath.lineTo(12.9246f, 7.32495f);
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
