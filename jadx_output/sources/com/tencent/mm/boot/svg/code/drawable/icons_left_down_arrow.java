package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_left_down_arrow extends l95.c {
    private final int width = 16;
    private final int height = 17;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 17;
        }
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
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.61934f, 13.168f);
            instancePath.lineTo(11.286f, 13.168f);
            instancePath.lineTo(11.286f, 11.8346f);
            instancePath.lineTo(5.5623f, 11.8346f);
            instancePath.lineTo(12.6667f, 4.73021f);
            instancePath.lineTo(11.7239f, 3.78741f);
            instancePath.lineTo(4.61934f, 10.892f);
            instancePath.lineTo(4.61934f, 5.16797f);
            instancePath.lineTo(3.28601f, 5.16797f);
            instancePath.lineTo(3.28601f, 11.8346f);
            instancePath.lineTo(3.28601f, 13.168f);
            instancePath.lineTo(4.61934f, 13.168f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
