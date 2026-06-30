package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class userguide_emostore_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePaint3.setColor(-9318371);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(47.999f, 15.0f);
                instancePath.cubicTo(29.773f, 15.0f, 15.0f, 29.774f, 15.0f, 48.0f);
                instancePath.cubicTo(15.0f, 66.226f, 29.773f, 81.0f, 47.999f, 81.0f);
                instancePath.cubicTo(66.225f, 81.0f, 81.0f, 66.226f, 81.0f, 48.0f);
                instancePath.cubicTo(81.0f, 29.774f, 66.225f, 15.0f, 47.999f, 15.0f);
                instancePath.lineTo(47.999f, 15.0f);
                instancePath.close();
                instancePath.moveTo(62.0f, 31.0f);
                instancePath.cubicTo(64.762f, 31.0f, 67.0f, 33.462f, 67.0f, 36.5f);
                instancePath.cubicTo(67.0f, 39.538f, 64.762f, 42.0f, 62.0f, 42.0f);
                instancePath.cubicTo(59.238f, 42.0f, 57.0f, 39.538f, 57.0f, 36.5f);
                instancePath.cubicTo(57.0f, 33.462f, 59.238f, 31.0f, 62.0f, 31.0f);
                instancePath.lineTo(62.0f, 31.0f);
                instancePath.close();
                instancePath.moveTo(35.0f, 31.0f);
                instancePath.cubicTo(37.762f, 31.0f, 40.0f, 33.462f, 40.0f, 36.5f);
                instancePath.cubicTo(40.0f, 39.538f, 37.762f, 42.0f, 35.0f, 42.0f);
                instancePath.cubicTo(32.238f, 42.0f, 30.0f, 39.538f, 30.0f, 36.5f);
                instancePath.cubicTo(30.0f, 33.462f, 32.238f, 31.0f, 35.0f, 31.0f);
                instancePath.lineTo(35.0f, 31.0f);
                instancePath.close();
                instancePath.moveTo(48.0f, 71.0f);
                instancePath.cubicTo(28.667f, 71.0f, 26.0f, 53.0f, 26.0f, 53.0f);
                instancePath.cubicTo(26.0f, 53.0f, 40.361f, 51.0f, 48.0f, 51.0f);
                instancePath.cubicTo(55.639f, 51.0f, 70.0f, 53.0f, 70.0f, 53.0f);
                instancePath.cubicTo(70.0f, 53.0f, 67.333f, 71.0f, 48.0f, 71.0f);
                instancePath.lineTo(48.0f, 71.0f);
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
