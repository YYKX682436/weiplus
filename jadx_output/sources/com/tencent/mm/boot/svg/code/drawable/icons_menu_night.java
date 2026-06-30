package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_night extends l95.c {
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
                instancePath.moveTo(18.8425f, 3.60738f);
                instancePath.cubicTo(18.6229f, 3.52639f, 18.3762f, 3.58054f, 18.2107f, 3.74607f);
                instancePath.cubicTo(18.0452f, 3.91159f, 17.991f, 4.15827f, 18.072f, 4.3779f);
                instancePath.cubicTo(18.4955f, 5.5264f, 18.727f, 6.7685f, 18.727f, 8.06603f);
                instancePath.cubicTo(18.727f, 13.9539f, 13.954f, 18.7269f, 8.06615f, 18.7269f);
                instancePath.cubicTo(6.76862f, 18.7269f, 5.52652f, 18.4954f, 4.37803f, 18.0719f);
                instancePath.cubicTo(4.15839f, 17.9909f, 3.91171f, 18.0451f, 3.74619f, 18.2106f);
                instancePath.cubicTo(3.58066f, 18.3761f, 3.52652f, 18.6228f, 3.6075f, 18.8424f);
                instancePath.cubicTo(5.27691f, 23.3699f, 9.63011f, 26.6f, 14.7393f, 26.6f);
                instancePath.cubicTo(21.2898f, 26.6f, 26.6001f, 21.2897f, 26.6001f, 14.7391f);
                instancePath.cubicTo(26.6001f, 9.62999f, 23.37f, 5.27679f, 18.8425f, 3.60738f);
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
