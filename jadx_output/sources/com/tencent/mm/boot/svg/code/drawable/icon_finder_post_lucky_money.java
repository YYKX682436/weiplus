package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_finder_post_lucky_money extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 36.1875f);
            instancePath.cubicTo(33.410156f, 36.1875f, 31.3125f, 34.089844f, 31.3125f, 31.5f);
            instancePath.cubicTo(31.3125f, 28.910156f, 33.410156f, 26.8125f, 36.0f, 26.8125f);
            instancePath.cubicTo(38.589844f, 26.8125f, 40.6875f, 28.910156f, 40.6875f, 31.5f);
            instancePath.cubicTo(40.6875f, 34.089844f, 38.589844f, 36.1875f, 36.0f, 36.1875f);
            instancePath.moveTo(58.5f, 11.28125f);
            instancePath.cubicTo(58.5f, 10.019531f, 57.476562f, 9.0f, 56.26953f, 9.0f);
            instancePath.lineTo(15.730469f, 9.0f);
            instancePath.cubicTo(14.5f, 9.0f, 13.5f, 10.011719f, 13.5f, 11.28125f);
            instancePath.lineTo(13.5f, 13.355469f);
            instancePath.cubicTo(13.5f, 21.285156f, 20.375f, 27.972656f, 29.769531f, 30.0625f);
            instancePath.cubicTo(29.644531f, 30.5625f, 29.570312f, 31.085938f, 29.570312f, 31.628906f);
            instancePath.cubicTo(29.570312f, 31.84375f, 29.582031f, 32.054688f, 29.605469f, 32.265625f);
            instancePath.cubicTo(23.402344f, 31.296875f, 17.847656f, 28.9375f, 13.5f, 25.632812f);
            instancePath.lineTo(13.5f, 63.007812f);
            instancePath.cubicTo(13.5f, 64.24609f, 14.523438f, 65.25f, 15.730469f, 65.25f);
            instancePath.lineTo(56.26953f, 65.25f);
            instancePath.cubicTo(57.5f, 65.25f, 58.5f, 64.26953f, 58.5f, 63.007812f);
            instancePath.lineTo(58.5f, 25.632812f);
            instancePath.cubicTo(54.152344f, 28.9375f, 48.597656f, 31.296875f, 42.39453f, 32.265625f);
            instancePath.cubicTo(42.41797f, 32.054688f, 42.429688f, 31.84375f, 42.429688f, 31.628906f);
            instancePath.cubicTo(42.429688f, 31.085938f, 42.35547f, 30.5625f, 42.23047f, 30.0625f);
            instancePath.cubicTo(51.625f, 27.972656f, 58.5f, 21.285156f, 58.5f, 13.355469f);
            instancePath.close();
            instancePath.moveTo(58.5f, 11.28125f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
