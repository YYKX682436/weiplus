package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_filled_album extends l95.c {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(20.5f, 14.136058f);
            instancePath.lineTo(20.5f, 5.5f);
            instancePath.lineTo(3.5f, 5.5f);
            instancePath.lineTo(3.5f, 13.849606f);
            instancePath.lineTo(8.199245f, 10.049258f);
            instancePath.cubicTo(8.661799f, 9.675185f, 9.404626f, 9.693327f, 9.850495f, 10.085084f);
            instancePath.lineTo(14.326923f, 14.018227f);
            instancePath.lineTo(16.609102f, 12.0774975f);
            instancePath.cubicTo(17.071318f, 11.684438f, 17.806723f, 11.692423f, 18.255432f, 12.095083f);
            instancePath.lineTo(20.5f, 14.136058f);
            instancePath.close();
            instancePath.moveTo(2.9918032f, 4.0f);
            instancePath.lineTo(21.008198f, 4.0f);
            instancePath.cubicTo(21.544695f, 4.0f, 22.0f, 4.481137f, 22.0f, 5.0746493f);
            instancePath.lineTo(22.0f, 18.92535f);
            instancePath.cubicTo(22.0f, 19.521152f, 21.555954f, 20.0f, 21.008198f, 20.0f);
            instancePath.lineTo(2.9918032f, 20.0f);
            instancePath.cubicTo(2.4553056f, 20.0f, 2.0f, 19.518864f, 2.0f, 18.92535f);
            instancePath.lineTo(2.0f, 5.0746493f);
            instancePath.cubicTo(2.0f, 4.4788485f, 2.4440453f, 4.0f, 2.9918032f, 4.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
