package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_type_note extends l95.c {
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
        instancePath.moveTo(18.0f, 2.0f);
        instancePath.cubicTo(19.1046f, 2.0f, 20.0f, 2.89543f, 20.0f, 4.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.cubicTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f);
        instancePath.lineTo(4.0f, 22.0f);
        instancePath.lineTo(4.0f, 2.0f);
        instancePath.lineTo(18.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 19.0093f);
        instancePath.lineTo(5.199f, 19.009f);
        instancePath.lineTo(5.2f, 20.8f);
        instancePath.lineTo(18.0f, 20.8f);
        instancePath.cubicTo(18.4418f, 20.8f, 18.8f, 20.4418f, 18.8f, 20.0f);
        instancePath.lineTo(18.7998f, 18.8429f);
        instancePath.cubicTo(18.5549f, 18.9499f, 18.2844f, 19.0093f, 18.0f, 19.0093f);
        instancePath.close();
        instancePath.moveTo(7.0f, 3.199f);
        instancePath.lineTo(5.2f, 3.2f);
        instancePath.lineTo(5.199f, 17.809f);
        instancePath.lineTo(7.0f, 17.809f);
        instancePath.lineTo(7.0f, 3.199f);
        instancePath.close();
        instancePath.moveTo(18.0f, 3.2f);
        instancePath.lineTo(8.2f, 3.199f);
        instancePath.lineTo(8.2f, 17.809f);
        instancePath.lineTo(18.0f, 17.8093f);
        instancePath.cubicTo(18.4371f, 17.8093f, 18.7923f, 17.4588f, 18.7999f, 17.0235f);
        instancePath.lineTo(18.8f, 4.0f);
        instancePath.cubicTo(18.8f, 3.55817f, 18.4418f, 3.2f, 18.0f, 3.2f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
