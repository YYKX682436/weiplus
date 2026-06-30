package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_finder_live_logo extends l95.c {
    private final int width = 14;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 14;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.2083f, 6.99996f);
        instancePath.cubicTo(10.2083f, 5.22805f, 8.77187f, 3.79163f, 6.99996f, 3.79163f);
        instancePath.cubicTo(5.22805f, 3.79163f, 3.79163f, 5.22805f, 3.79163f, 6.99996f);
        instancePath.cubicTo(3.79163f, 8.77187f, 5.22805f, 10.2083f, 6.99996f, 10.2083f);
        instancePath.cubicTo(8.77187f, 10.2083f, 10.2083f, 8.77187f, 10.2083f, 6.99996f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.8333f, 6.99996f);
        instancePath2.cubicTo(12.8333f, 10.2216f, 10.2216f, 12.8333f, 6.99996f, 12.8333f);
        instancePath2.cubicTo(3.7783f, 12.8333f, 1.16663f, 10.2216f, 1.16663f, 6.99996f);
        instancePath2.cubicTo(1.16663f, 3.7783f, 3.7783f, 1.16663f, 6.99996f, 1.16663f);
        instancePath2.cubicTo(10.2216f, 1.16663f, 12.8333f, 3.7783f, 12.8333f, 6.99996f);
        instancePath2.close();
        instancePath2.moveTo(11.6666f, 6.99996f);
        instancePath2.cubicTo(11.6666f, 9.57729f, 9.57729f, 11.6666f, 6.99996f, 11.6666f);
        instancePath2.cubicTo(4.42263f, 11.6666f, 2.33329f, 9.57729f, 2.33329f, 6.99996f);
        instancePath2.cubicTo(2.33329f, 4.42263f, 4.42263f, 2.33329f, 6.99996f, 2.33329f);
        instancePath2.cubicTo(9.57729f, 2.33329f, 11.6666f, 4.42263f, 11.6666f, 6.99996f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
