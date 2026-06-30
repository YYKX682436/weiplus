package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice2txt_hint_trans_eng extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2130706433);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.0f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        instancePath.cubicTo(20.552284f, 3.0f, 21.0f, 3.4477153f, 21.0f, 4.0f);
        instancePath.lineTo(21.0f, 20.0f);
        instancePath.cubicTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.4477153f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 4.0f);
        instancePath.cubicTo(3.0f, 3.4477153f, 3.4477153f, 3.0f, 4.0f, 3.0f);
        instancePath.close();
        instancePath.moveTo(6.0f, 8.0f);
        instancePath.lineTo(6.0f, 16.0f);
        instancePath.lineTo(11.856354f, 16.0f);
        instancePath.lineTo(11.856354f, 14.957983f);
        instancePath.lineTo(7.20442f, 14.957983f);
        instancePath.lineTo(7.20442f, 12.414566f);
        instancePath.lineTo(11.403315f, 12.414566f);
        instancePath.lineTo(11.403315f, 11.372549f);
        instancePath.lineTo(7.20442f, 11.372549f);
        instancePath.lineTo(7.20442f, 9.042017f);
        instancePath.lineTo(11.668509f, 9.042017f);
        instancePath.lineTo(11.668509f, 8.0f);
        instancePath.lineTo(6.0f, 8.0f);
        instancePath.close();
        instancePath.moveTo(15.867403f, 10.05042f);
        instancePath.cubicTo(15.513812f, 10.05042f, 15.19337f, 10.117647f, 14.906077f, 10.274509f);
        instancePath.cubicTo(14.618785f, 10.420168f, 14.364641f, 10.633053f, 14.143646f, 10.92437f);
        instancePath.lineTo(14.143646f, 10.207283f);
        instancePath.lineTo(12.972376f, 10.207283f);
        instancePath.lineTo(12.972376f, 16.0f);
        instancePath.lineTo(14.143646f, 16.0f);
        instancePath.lineTo(14.143646f, 12.515407f);
        instancePath.cubicTo(14.187845f, 12.044818f, 14.353591f, 11.67507f, 14.618785f, 11.406162f);
        instancePath.cubicTo(14.861878f, 11.159664f, 15.160221f, 11.047619f, 15.491713f, 11.047619f);
        instancePath.cubicTo(16.37569f, 11.047619f, 16.82873f, 11.540616f, 16.82873f, 12.52661f);
        instancePath.lineTo(16.82873f, 16.0f);
        instancePath.lineTo(18.0f, 16.0f);
        instancePath.lineTo(18.0f, 12.425771f);
        instancePath.cubicTo(18.0f, 10.834734f, 17.281769f, 10.05042f, 15.867403f, 10.05042f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
