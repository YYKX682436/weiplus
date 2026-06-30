package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_black_profile extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.saveLayerAlpha(null, 204, 31);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(16.0f, 3.1f);
            instancePath.cubicTo(23.124474f, 3.1f, 28.9f, 8.875526f, 28.9f, 16.0f);
            instancePath.cubicTo(28.9f, 23.124474f, 23.124474f, 28.9f, 16.0f, 28.9f);
            instancePath.cubicTo(8.875526f, 28.9f, 3.1f, 23.124474f, 3.1f, 16.0f);
            instancePath.cubicTo(3.1f, 8.875526f, 8.875526f, 3.1f, 16.0f, 3.1f);
            instancePath.close();
            instancePath.moveTo(7.3629313f, 9.02724f);
            instancePath.cubicTo(5.822522f, 10.932937f, 4.9f, 13.358735f, 4.9f, 16.0f);
            instancePath.cubicTo(4.9f, 22.130362f, 9.869639f, 27.1f, 16.0f, 27.1f);
            instancePath.cubicTo(18.641266f, 27.1f, 21.067064f, 26.177479f, 22.972761f, 24.637068f);
            instancePath.close();
            instancePath.moveTo(16.0f, 4.9f);
            instancePath.cubicTo(13.231251f, 4.9f, 10.69927f, 5.9137244f, 8.754966f, 7.5902653f);
            instancePath.lineTo(24.409735f, 23.245033f);
            instancePath.cubicTo(26.086275f, 21.30073f, 27.1f, 18.76875f, 27.1f, 16.0f);
            instancePath.cubicTo(27.1f, 9.869639f, 22.130362f, 4.9f, 16.0f, 4.9f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
