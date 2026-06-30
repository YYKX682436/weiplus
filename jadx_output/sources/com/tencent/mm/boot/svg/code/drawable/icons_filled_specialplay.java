package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_specialplay extends l95.c {
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
                instancePath.moveTo(8.496139f, 4.8549366f);
                instancePath.lineTo(19.480574f, 11.131757f);
                instancePath.cubicTo(19.960093f, 11.4057665f, 20.126688f, 12.016622f, 19.852678f, 12.496139f);
                instancePath.cubicTo(19.76409f, 12.65117f, 19.635605f, 12.779654f, 19.480574f, 12.868243f);
                instancePath.lineTo(8.496139f, 19.145063f);
                instancePath.cubicTo(8.016622f, 19.419073f, 7.405767f, 19.252478f, 7.131757f, 18.772959f);
                instancePath.cubicTo(7.0454154f, 18.621862f, 7.0f, 18.450848f, 7.0f, 18.276821f);
                instancePath.lineTo(7.0f, 5.72318f);
                instancePath.cubicTo(7.0f, 5.170895f, 7.4477153f, 4.72318f, 8.0f, 4.72318f);
                instancePath.cubicTo(8.1740265f, 4.72318f, 8.345041f, 4.768595f, 8.496139f, 4.8549366f);
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
