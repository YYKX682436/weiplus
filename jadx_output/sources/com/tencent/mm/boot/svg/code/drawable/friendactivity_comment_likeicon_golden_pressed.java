package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class friendactivity_comment_likeicon_golden_pressed extends l95.c {
    private final int width = 52;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 52;
        }
        if (i17 == 1) {
            return 48;
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
            instancePaint3.setColor(-7503);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(14.181818f, 0.0f);
            instancePath.cubicTo(7.043382f, 0.0f, 2.0274723E-7f, 6.794741f, 0.0f, 19.047619f);
            instancePath.cubicTo(-2.0274723E-7f, 30.949684f, 12.336814f, 43.475533f, 26.0f, 48.0f);
            instancePath.cubicTo(40.098804f, 43.475533f, 52.0f, 30.618835f, 52.0f, 19.047619f);
            instancePath.cubicTo(52.0f, 6.463891f, 45.245247f, 1.657497E-7f, 37.81818f, 0.0f);
            instancePath.cubicTo(31.004267f, -1.4875212E-7f, 28.267746f, 2.4507387f, 26.0f, 4.7619047f);
            instancePath.cubicTo(23.75256f, 2.4507387f, 20.412228f, 0.0f, 14.181818f, 0.0f);
            instancePath.close();
            instancePath.moveTo(15.702877f, 6.3492064f);
            instancePath.cubicTo(11.534709f, 6.3492064f, 6.3030305f, 10.766748f, 6.3030305f, 18.896448f);
            instancePath.cubicTo(6.3030305f, 27.026146f, 14.82103f, 37.12266f, 26.0f, 40.857143f);
            instancePath.cubicTo(37.535385f, 37.12266f, 45.696968f, 25.122057f, 45.696968f, 18.896448f);
            instancePath.cubicTo(45.696968f, 12.670838f, 41.74611f, 6.3492064f, 35.669422f, 6.3492064f);
            instancePath.cubicTo(30.0944f, 6.3492064f, 27.220886f, 12.0678f, 26.0f, 14.285714f);
            instancePath.cubicTo(24.840904f, 12.0678f, 19.871044f, 6.3492064f, 15.702877f, 6.3492064f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
