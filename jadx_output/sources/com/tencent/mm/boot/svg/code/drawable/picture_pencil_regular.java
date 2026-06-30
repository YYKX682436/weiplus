package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class picture_pencil_regular extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(22.3252f, 10.0947f);
        instancePath.cubicTo(22.5196f, 9.92106f, 22.8218f, 9.93443f, 23.0f, 10.124f);
        instancePath.lineTo(23.5821f, 10.6875f);
        instancePath.cubicTo(23.7601f, 10.8773f, 23.7468f, 11.1725f, 23.5528f, 11.3467f);
        instancePath.lineTo(16.1221f, 18.917f);
        instancePath.lineTo(13.8516f, 20.0342f);
        instancePath.cubicTo(13.9355f, 19.9996f, 13.6015f, 20.1722f, 13.5303f, 20.0342f);
        instancePath.cubicTo(13.4853f, 19.9466f, 13.4905f, 19.8417f, 13.544f, 19.7588f);
        instancePath.lineTo(14.8955f, 17.665f);
        instancePath.lineTo(22.3252f, 10.0947f);
        instancePath.close();
        instancePath.moveTo(20.0078f, 4.0f);
        instancePath.cubicTo(20.5442f, 4.0f, 20.9998f, 4.4809f, 21.0f, 5.07422f);
        instancePath.lineTo(21.0f, 9.0f);
        instancePath.lineTo(19.7998f, 9.0f);
        instancePath.lineTo(19.7998f, 5.2002f);
        instancePath.lineTo(2.2002f, 5.2002f);
        instancePath.lineTo(2.2002f, 14.0908f);
        instancePath.lineTo(7.19922f, 10.0488f);
        instancePath.cubicTo(7.66179f, 9.67492f, 8.40478f, 9.69327f, 8.85059f, 10.085f);
        instancePath.lineTo(13.3272f, 14.0186f);
        instancePath.lineTo(15.2998f, 12.0f);
        instancePath.cubicTo(15.9998f, 11.5f, 16.5f, 11.5f, 17.0f, 12.0f);
        instancePath.lineTo(13.5f, 15.5f);
        instancePath.lineTo(8.00587f, 10.9404f);
        instancePath.lineTo(2.2002f, 15.6338f);
        instancePath.lineTo(2.2002f, 18.7998f);
        instancePath.lineTo(11.0f, 18.7998f);
        instancePath.lineTo(11.0f, 20.0f);
        instancePath.lineTo(1.99219f, 20.0f);
        instancePath.cubicTo(1.45582f, 20.0f, 1.00022f, 19.5191f, 1.0f, 18.9258f);
        instancePath.lineTo(1.0f, 5.07422f);
        instancePath.cubicTo(1.00021f, 4.47862f, 1.44456f, 4.0f, 1.99219f, 4.0f);
        instancePath.lineTo(20.0078f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
