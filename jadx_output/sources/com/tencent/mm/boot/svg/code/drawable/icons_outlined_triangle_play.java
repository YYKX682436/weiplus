package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_triangle_play extends l95.c {
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.496139f, 4.8549366f);
                instancePath.lineTo(18.480574f, 11.131757f);
                instancePath.cubicTo(18.960093f, 11.4057665f, 19.126688f, 12.016622f, 18.852678f, 12.496139f);
                instancePath.cubicTo(18.76409f, 12.65117f, 18.635605f, 12.779654f, 18.480574f, 12.868243f);
                instancePath.lineTo(7.496139f, 19.145063f);
                instancePath.cubicTo(7.0166216f, 19.419073f, 6.405767f, 19.252478f, 6.131757f, 18.772959f);
                instancePath.cubicTo(6.0454154f, 18.621862f, 6.0f, 18.450848f, 6.0f, 18.276821f);
                instancePath.lineTo(6.0f, 5.72318f);
                instancePath.cubicTo(6.0f, 5.170895f, 6.4477153f, 4.72318f, 7.0f, 4.72318f);
                instancePath.cubicTo(7.174027f, 4.72318f, 7.3450413f, 4.768595f, 7.496139f, 4.8549366f);
                instancePath.close();
                instancePath.moveTo(7.2f, 6.067816f);
                instancePath.lineTo(7.2f, 17.932184f);
                instancePath.lineTo(17.581324f, 12.0f);
                instancePath.lineTo(7.2f, 6.067816f);
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
