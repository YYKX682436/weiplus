package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class emoji_album_arrow_down extends l95.c {
    private final int width = 8;
    private final int height = 5;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 8;
        }
        if (i17 == 1) {
            return 5;
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
            instancePath.moveTo(4.36029f, 4.72568f);
            instancePath.cubicTo(4.16359f, 4.93009f, 3.83641f, 4.93009f, 3.63971f, 4.72568f);
            instancePath.lineTo(0.484598f, 1.44679f);
            instancePath.cubicTo(0.178937f, 1.12913f, 0.404056f, 0.600098f, 0.844886f, 0.600098f);
            instancePath.lineTo(7.15511f, 0.600098f);
            instancePath.cubicTo(7.59594f, 0.600098f, 7.82106f, 1.12913f, 7.5154f, 1.44679f);
            instancePath.lineTo(4.36029f, 4.72568f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
