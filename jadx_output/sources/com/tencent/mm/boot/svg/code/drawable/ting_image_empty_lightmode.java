package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ting_image_empty_lightmode extends l95.c {
    private final int width = 400;
    private final int height = 400;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 400;
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
            instancePaint3.setColor(-526345);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(400.0f, 0.0f);
            instancePath.lineTo(400.0f, 400.0f);
            instancePath.lineTo(0.0f, 400.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(419430400);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(248.343f, 163.025f);
            instancePath2.cubicTo(235.729f, 152.744f, 223.114f, 154.129f, 213.708f, 144.285f);
            instancePath2.cubicTo(211.01f, 141.369f, 209.552f, 137.942f, 209.114f, 134.296f);
            instancePath2.cubicTo(208.312f, 129.848f, 203.645f, 128.973f, 200.656f, 130.796f);
            instancePath2.cubicTo(200.437f, 130.942f, 200.291f, 131.088f, 200.072f, 131.233f);
            instancePath2.cubicTo(199.635f, 131.598f, 199.27f, 132.035f, 198.979f, 132.473f);
            instancePath2.cubicTo(197.447f, 134.588f, 196.427f, 137.723f, 196.427f, 142.098f);
            instancePath2.lineTo(196.427f, 200.285f);
            instancePath2.cubicTo(196.062f, 218.806f, 192.927f, 218.296f, 176.812f, 222.379f);
            instancePath2.cubicTo(164.197f, 225.588f, 153.697f, 234.046f, 153.77f, 247.025f);
            instancePath2.cubicTo(153.843f, 260.004f, 165.291f, 270.796f, 178.562f, 270.431f);
            instancePath2.cubicTo(211.447f, 269.556f, 211.01f, 235.358f, 210.937f, 221.213f);
            instancePath2.lineTo(210.937f, 169.515f);
            instancePath2.cubicTo(210.937f, 162.223f, 215.895f, 164.046f, 225.229f, 167.473f);
            instancePath2.lineTo(225.156f, 167.473f);
            instancePath2.cubicTo(226.541f, 167.91f, 227.927f, 168.421f, 229.312f, 168.785f);
            instancePath2.cubicTo(235.875f, 171.41f, 243.385f, 174.546f, 245.791f, 180.963f);
            instancePath2.cubicTo(248.854f, 190.66f, 242.364f, 199.483f, 232.885f, 203.931f);
            instancePath2.cubicTo(231.5f, 204.588f, 232.01f, 206.702f, 233.541f, 206.702f);
            instancePath2.cubicTo(254.833f, 206.629f, 268.031f, 178.338f, 248.27f, 163.025f);
            instancePath2.lineTo(248.343f, 163.025f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
