package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_source_view_icon extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePath.moveTo(10.425f, 4.23557f);
                instancePath.cubicTo(10.425f, 3.04172f, 9.35212f, 2.07495f, 8.02471f, 2.07495f);
                instancePath.cubicTo(6.6973f, 2.07495f, 5.62447f, 3.04172f, 5.62447f, 4.23557f);
                instancePath.lineTo(5.62447f, 7.82982f);
                instancePath.cubicTo(5.62447f, 8.62467f, 4.8761f, 9.26345f, 3.95123f, 9.26345f);
                instancePath.cubicTo(3.02636f, 9.26345f, 2.27799f, 8.62467f, 2.27799f, 7.82982f);
                instancePath.cubicTo(2.27799f, 7.19389f, 2.76962f, 6.63774f, 3.47236f, 6.46811f);
                instancePath.cubicTo(3.70383f, 6.41025f, 3.95597f, 6.21416f, 3.9553f, 5.98478f);
                instancePath.cubicTo(3.9553f, 5.75203f, 3.74339f, 5.68415f, 3.53115f, 5.71628f);
                instancePath.cubicTo(2.40414f, 5.8869f, 1.57495f, 6.78359f, 1.57495f, 7.82982f);
                instancePath.cubicTo(1.57495f, 9.02368f, 2.64778f, 9.99045f, 3.97519f, 9.99045f);
                instancePath.cubicTo(5.3026f, 9.99045f, 6.37543f, 9.02368f, 6.37543f, 7.82982f);
                instancePath.lineTo(6.37543f, 4.23557f);
                instancePath.cubicTo(6.37543f, 3.44072f, 7.1238f, 2.80195f, 8.04867f, 2.80195f);
                instancePath.cubicTo(8.97354f, 2.80195f, 9.72192f, 3.44072f, 9.72192f, 4.23557f);
                instancePath.cubicTo(9.72192f, 4.89072f, 9.23536f, 5.45039f, 8.52562f, 5.6217f);
                instancePath.cubicTo(8.31855f, 5.6677f, 8.14452f, 5.80671f, 8.06849f, 5.98409f);
                instancePath.cubicTo(7.93306f, 6.2888f, 8.23112f, 6.41616f, 8.48662f, 6.37114f);
                instancePath.cubicTo(9.61794f, 6.17179f, 10.425f, 5.28663f, 10.425f, 4.23557f);
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
