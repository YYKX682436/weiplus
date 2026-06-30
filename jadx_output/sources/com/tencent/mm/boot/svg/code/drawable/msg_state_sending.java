package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class msg_state_sending extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                instancePaint3.setColor(-5592406);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(28.0f, 24.0f);
                instancePath.lineTo(34.0f, 24.0f);
                instancePath.lineTo(34.0f, 36.0f);
                instancePath.lineTo(28.0f, 36.0f);
                instancePath.lineTo(28.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(38.0f, 24.0f);
                instancePath.lineTo(43.0f, 24.0f);
                instancePath.lineTo(43.0f, 36.0f);
                instancePath.lineTo(38.0f, 36.0f);
                instancePath.lineTo(38.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(47.0f, 24.0f);
                instancePath.lineTo(51.0f, 24.0f);
                instancePath.lineTo(51.0f, 36.0f);
                instancePath.lineTo(47.0f, 36.0f);
                instancePath.lineTo(47.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(25.763962f, 14.012434f);
                instancePath.cubicTo(26.998892f, 12.900997f, 28.0f, 13.345539f, 28.0f, 15.00742f);
                instancePath.lineTo(28.0f, 44.99258f);
                instancePath.cubicTo(28.0f, 46.653534f, 27.008198f, 47.107376f, 25.763962f, 45.987564f);
                instancePath.lineTo(10.236038f, 32.012436f);
                instancePath.cubicTo(9.001108f, 30.900997f, 8.991803f, 29.107378f, 10.236038f, 27.987566f);
                instancePath.lineTo(25.763962f, 14.012434f);
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
