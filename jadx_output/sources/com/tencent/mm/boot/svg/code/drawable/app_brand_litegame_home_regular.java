package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_litegame_home_regular extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePaint3.setColor(1275068416);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.0f, 20.0f);
        instancePath.cubicTo(2.0f, 10.058874f, 10.058874f, 2.0f, 20.0f, 2.0f);
        instancePath.lineTo(20.0f, 2.0f);
        instancePath.cubicTo(29.941126f, 2.0f, 38.0f, 10.058874f, 38.0f, 20.0f);
        instancePath.lineTo(38.0f, 20.0f);
        instancePath.cubicTo(38.0f, 29.941126f, 29.941126f, 38.0f, 20.0f, 38.0f);
        instancePath.lineTo(20.0f, 38.0f);
        instancePath.cubicTo(10.058874f, 38.0f, 2.0f, 29.941126f, 2.0f, 20.0f);
        instancePath.lineTo(2.0f, 20.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.2077f, 18.911f);
        instancePath2.lineTo(15.0467f, 13.75f);
        instancePath2.lineTo(14.166f, 14.6307f);
        instancePath2.lineTo(19.327f, 19.7917f);
        instancePath2.lineTo(14.166f, 24.9527f);
        instancePath2.lineTo(15.0467f, 25.8333f);
        instancePath2.lineTo(20.2077f, 20.6723f);
        instancePath2.lineTo(25.3687f, 25.8333f);
        instancePath2.lineTo(26.2493f, 24.9527f);
        instancePath2.lineTo(21.0884f, 19.7917f);
        instancePath2.lineTo(26.2493f, 14.6307f);
        instancePath2.lineTo(25.3687f, 13.75f);
        instancePath2.lineTo(20.2077f, 18.911f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
