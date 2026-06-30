package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_music3_regular extends l95.c {
    private final int width = 25;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 25;
        }
        if (i17 == 1) {
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(19.255f, 7.22999f);
            instancePath.cubicTo(17.785f, 6.01999f, 15.165f, 5.83999f, 14.195f, 4.22999f);
            instancePath.cubicTo(14.115f, 4.07999f, 13.975f, 3.77999f, 13.925f, 3.37999f);
            instancePath.cubicTo(13.895f, 3.14999f, 13.825f, 2.96999f, 13.705f, 2.83999f);
            instancePath.cubicTo(13.665f, 2.79999f, 13.615f, 2.76999f, 13.565f, 2.74999f);
            instancePath.cubicTo(13.565f, 2.74999f, 13.555f, 2.74999f, 13.545f, 2.74999f);
            instancePath.cubicTo(13.525f, 2.74999f, 13.505f, 2.72999f, 13.485f, 2.71999f);
            instancePath.cubicTo(13.045f, 2.61999f, 12.785f, 2.93999f, 12.785f, 4.07999f);
            instancePath.lineTo(12.785f, 12.26f);
            instancePath.cubicTo(12.785f, 15.51f, 11.995f, 14.82f, 9.97502f, 15.33f);
            instancePath.cubicTo(8.50502f, 15.7f, 7.27502f, 16.69f, 7.27502f, 18.21f);
            instancePath.cubicTo(7.27502f, 19.73f, 8.50502f, 20.96f, 10.025f, 20.96f);
            instancePath.cubicTo(14.105f, 20.96f, 13.985f, 16.72f, 13.985f, 15.1f);
            instancePath.lineTo(13.985f, 14.93f);
            instancePath.lineTo(13.985f, 7.99999f);
            instancePath.cubicTo(13.985f, 6.46999f, 15.085f, 6.65999f, 16.985f, 7.34999f);
            instancePath.cubicTo(18.055f, 7.74999f, 19.075f, 8.20999f, 19.485f, 9.32999f);
            instancePath.cubicTo(19.825f, 10.6f, 19.095f, 11.75f, 17.975f, 12.37f);
            instancePath.cubicTo(17.765f, 12.49f, 17.895f, 12.81f, 18.125f, 12.74f);
            instancePath.cubicTo(20.385f, 12.05f, 21.565f, 9.00999f, 19.255f, 7.24999f);
            instancePath.lineTo(19.255f, 7.22999f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
