package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class doc_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(11.9127f, 3.20021f);
            instancePath.lineTo(5.7127f, 3.20021f);
            instancePath.lineTo(5.7127f, 20.8002f);
            instancePath.lineTo(18.3127f, 20.8002f);
            instancePath.lineTo(18.3127f, 9.60021f);
            instancePath.lineTo(13.5127f, 9.60021f);
            instancePath.cubicTo(12.629f, 9.60021f, 11.9127f, 8.88387f, 11.9127f, 8.00021f);
            instancePath.lineTo(11.9127f, 3.20021f);
            instancePath.close();
            instancePath.moveTo(13.1127f, 3.29921f);
            instancePath.lineTo(13.1127f, 8.00021f);
            instancePath.cubicTo(13.1127f, 8.22113f, 13.2918f, 8.40021f, 13.5127f, 8.40021f);
            instancePath.lineTo(18.2155f, 8.40021f);
            instancePath.lineTo(13.1127f, 3.29921f);
            instancePath.close();
            instancePath.moveTo(5.5085f, 2.00021f);
            instancePath.lineTo(13.5106f, 2.00021f);
            instancePath.lineTo(19.5127f, 8.00021f);
            instancePath.lineTo(19.5127f, 21.0016f);
            instancePath.cubicTo(19.5127f, 21.5544f, 19.0669f, 22.0002f, 18.5169f, 22.0002f);
            instancePath.lineTo(5.5085f, 22.0002f);
            instancePath.cubicTo(4.96162f, 22.0002f, 4.5127f, 21.5531f, 4.5127f, 21.0016f);
            instancePath.lineTo(4.5127f, 2.99886f);
            instancePath.cubicTo(4.5127f, 2.44598f, 4.95853f, 2.00021f, 5.5085f, 2.00021f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
