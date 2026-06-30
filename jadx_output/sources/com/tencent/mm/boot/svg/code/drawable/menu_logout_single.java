package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class menu_logout_single extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2565928);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(96.0f, 0.0f);
            instancePath.lineTo(96.0f, 96.0f);
            instancePath.lineTo(0.0f, 96.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-8617851);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(58.234665f, 65.333336f);
            instancePath2.cubicTo(58.234665f, 65.333336f, 56.0f, 64.88355f, 56.0f, 62.666668f);
            instancePath2.lineTo(56.0f, 61.333332f);
            instancePath2.cubicTo(56.0f, 59.977333f, 57.333332f, 58.666668f, 57.333332f, 58.666668f);
            instancePath2.cubicTo(62.017944f, 54.044582f, 65.138985f, 47.470398f, 65.13022f, 37.007732f);
            instancePath2.cubicTo(65.12012f, 24.950094f, 58.55467f, 16.0f, 48.0f, 16.0f);
            instancePath2.cubicTo(37.44533f, 16.0f, 30.897902f, 24.952658f, 30.908f, 37.007732f);
            instancePath2.cubicTo(30.908f, 47.468624f, 34.000893f, 54.025047f, 38.753777f, 58.666668f);
            instancePath2.cubicTo(38.666668f, 58.666668f, 40.0f, 59.977333f, 40.0f, 61.333332f);
            instancePath2.lineTo(40.0f, 62.666668f);
            instancePath2.cubicTo(40.0f, 64.88355f, 37.765335f, 65.333336f, 37.765335f, 65.333336f);
            instancePath2.lineTo(17.333334f, 72.44444f);
            instancePath2.cubicTo(14.228f, 73.564445f, 12.0f, 76.51822f, 12.0f, 80.0f);
            instancePath2.lineTo(12.0f, 84.0f);
            instancePath2.lineTo(84.0f, 84.0f);
            instancePath2.lineTo(84.0f, 80.0f);
            instancePath2.cubicTo(84.0f, 76.51822f, 81.77155f, 73.564445f, 78.666664f, 72.46489f);
            instancePath2.lineTo(58.234665f, 65.333336f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
