package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_rcd_hint_new extends l95.c {
    private final int width = 67;
    private final int height = 67;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 67;
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
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(35.416668f, 58.48882f);
                instancePath.lineTo(35.416668f, 67.0f);
                instancePath.lineTo(31.25f, 67.0f);
                instancePath.lineTo(31.25f, 58.48882f);
                instancePath.cubicTo(21.490765f, 57.440975f, 13.888889f, 49.115345f, 13.888889f, 39.0f);
                instancePath.lineTo(13.888889f, 33.4f);
                instancePath.lineTo(18.055555f, 33.4f);
                instancePath.lineTo(18.055555f, 39.0f);
                instancePath.cubicTo(18.055555f, 47.505184f, 24.895649f, 54.4f, 33.333332f, 54.4f);
                instancePath.cubicTo(41.771015f, 54.4f, 48.61111f, 47.505184f, 48.61111f, 39.0f);
                instancePath.lineTo(48.61111f, 33.4f);
                instancePath.lineTo(52.77778f, 33.4f);
                instancePath.lineTo(52.77778f, 39.0f);
                instancePath.cubicTo(52.77778f, 49.115345f, 45.175903f, 57.440975f, 35.416668f, 58.48882f);
                instancePath.close();
                instancePath.moveTo(22.222221f, 22.11111f);
                instancePath.cubicTo(22.222221f, 15.974614f, 27.196836f, 11.0f, 33.333332f, 11.0f);
                instancePath.cubicTo(39.46983f, 11.0f, 44.444443f, 15.974614f, 44.444443f, 22.11111f);
                instancePath.lineTo(44.444443f, 39.08889f);
                instancePath.cubicTo(44.444443f, 45.225388f, 39.46983f, 50.2f, 33.333332f, 50.2f);
                instancePath.cubicTo(27.196836f, 50.2f, 22.222221f, 45.225388f, 22.222221f, 39.08889f);
                instancePath.lineTo(22.222221f, 22.11111f);
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
