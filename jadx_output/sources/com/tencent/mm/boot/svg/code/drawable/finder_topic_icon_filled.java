package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_topic_icon_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        canvas.saveLayerAlpha(null, 230, 31);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.104428f, 2.0731251f);
        instancePath.lineTo(10.529613f, 2.074452f);
        instancePath.lineTo(9.848f, 7.916f);
        instancePath.lineTo(15.096f, 7.916f);
        instancePath.lineTo(15.784979f, 2.0793445f);
        instancePath.lineTo(17.210163f, 2.0806713f);
        instancePath.lineTo(16.529f, 7.916f);
        instancePath.lineTo(21.5f, 7.9162297f);
        instancePath.lineTo(21.5f, 9.352281f);
        instancePath.lineTo(16.362f, 9.352f);
        instancePath.lineTo(15.744f, 14.647f);
        instancePath.lineTo(21.5f, 14.647719f);
        instancePath.lineTo(21.5f, 16.08377f);
        instancePath.lineTo(15.577f, 16.083f);
        instancePath.lineTo(14.895572f, 21.926874f);
        instancePath.lineTo(13.445195f, 21.925524f);
        instancePath.lineTo(14.134f, 16.083f);
        instancePath.lineTo(8.896f, 16.083f);
        instancePath.lineTo(8.215021f, 21.920656f);
        instancePath.lineTo(6.7898374f, 21.919329f);
        instancePath.lineTo(7.47f, 16.083f);
        instancePath.lineTo(2.5f, 16.08377f);
        instancePath.lineTo(2.5f, 14.647719f);
        instancePath.lineTo(7.637f, 14.647f);
        instancePath.lineTo(8.255f, 9.352f);
        instancePath.lineTo(2.5f, 9.352281f);
        instancePath.lineTo(2.5f, 7.9162297f);
        instancePath.lineTo(8.422f, 7.916f);
        instancePath.lineTo(9.104428f, 2.0731251f);
        instancePath.close();
        instancePath.moveTo(14.927f, 9.352f);
        instancePath.lineTo(9.68f, 9.352f);
        instancePath.lineTo(9.063f, 14.647f);
        instancePath.lineTo(14.303f, 14.647f);
        instancePath.lineTo(14.927f, 9.352f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
