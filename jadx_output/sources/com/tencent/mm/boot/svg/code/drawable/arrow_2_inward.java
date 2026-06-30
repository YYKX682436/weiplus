package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class arrow_2_inward extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.80029f, 13.2017f);
        instancePath.cubicTo(10.3524f, 13.2019f, 10.8003f, 13.6495f, 10.8003f, 14.2017f);
        instancePath.lineTo(10.8003f, 19.2017f);
        instancePath.lineTo(9.6001f, 19.2017f);
        instancePath.lineTo(9.6001f, 15.2505f);
        instancePath.lineTo(4.1001f, 20.7495f);
        instancePath.lineTo(3.25146f, 19.9019f);
        instancePath.lineTo(8.75146f, 14.4019f);
        instancePath.lineTo(4.80029f, 14.4019f);
        instancePath.lineTo(4.80029f, 13.2017f);
        instancePath.lineTo(9.80029f, 13.2017f);
        instancePath.close();
        instancePath.moveTo(20.7485f, 4.1001f);
        instancePath.lineTo(15.2485f, 9.6001f);
        instancePath.lineTo(19.1997f, 9.6001f);
        instancePath.lineTo(19.1997f, 10.8003f);
        instancePath.lineTo(14.1997f, 10.8003f);
        instancePath.cubicTo(13.6477f, 10.8002f, 13.1999f, 10.3523f, 13.1997f, 9.80029f);
        instancePath.lineTo(13.1997f, 4.80029f);
        instancePath.lineTo(14.3999f, 4.80029f);
        instancePath.lineTo(14.3999f, 8.75146f);
        instancePath.lineTo(19.8999f, 3.25146f);
        instancePath.lineTo(20.7485f, 4.1001f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
