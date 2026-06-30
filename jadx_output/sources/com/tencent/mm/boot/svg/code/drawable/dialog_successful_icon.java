package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class dialog_successful_icon extends l95.c {
    private final int width = 270;
    private final int height = 270;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 270;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(14211288);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(270.0f, 0.0f);
                instancePath.lineTo(270.0f, 270.0f);
                instancePath.lineTo(0.0f, 270.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-15028967);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(63.314346f, 140.34763f);
                instancePath2.cubicTo(62.933258f, 139.95532f, 62.89317f, 139.27344f, 63.224213f, 138.8254f);
                instancePath2.lineTo(69.83471f, 129.87872f);
                instancePath2.cubicTo(70.16602f, 129.43033f, 70.79083f, 129.3384f, 71.22918f, 129.67256f);
                instancePath2.lineTo(108.10534f, 157.78488f);
                instancePath2.cubicTo(108.54417f, 158.11943f, 109.244865f, 158.1048f, 109.66647f, 157.75543f);
                instancePath2.lineTo(198.3778f, 84.246925f);
                instancePath2.cubicTo(198.80116f, 83.89612f, 199.4602f, 83.922f, 199.85126f, 84.30612f);
                instancePath2.lineTo(206.24776f, 90.58951f);
                instancePath2.cubicTo(206.63817f, 90.97301f, 206.63751f, 91.59433f, 206.23552f, 91.98784f);
                instancePath2.lineTo(109.616165f, 186.56723f);
                instancePath2.cubicTo(109.219f, 186.956f, 108.58932f, 186.95439f, 108.20701f, 186.56084f);
                instancePath2.lineTo(63.314346f, 140.34763f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
