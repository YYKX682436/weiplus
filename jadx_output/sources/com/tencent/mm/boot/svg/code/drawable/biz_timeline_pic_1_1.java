package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_timeline_pic_1_1 extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
                float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(19.008198f, 0.0f);
                instancePath.cubicTo(19.544695f, 0.0f, 20.0f, 0.481137f, 20.0f, 1.0746496f);
                instancePath.lineTo(20.0f, 14.92535f);
                instancePath.cubicTo(20.0f, 15.521152f, 19.555954f, 16.0f, 19.008198f, 16.0f);
                instancePath.lineTo(0.9918031f, 16.0f);
                instancePath.cubicTo(0.45530558f, 16.0f, 0.0f, 15.518863f, 0.0f, 14.92535f);
                instancePath.lineTo(0.0f, 1.0746496f);
                instancePath.cubicTo(0.0f, 0.47884822f, 0.44404536f, 0.0f, 0.9918031f, 0.0f);
                instancePath.lineTo(19.008198f, 0.0f);
                instancePath.close();
                instancePath.moveTo(7.0060563f, 6.940083f);
                instancePath.lineTo(1.199f, 11.635f);
                instancePath.lineTo(1.2f, 14.8f);
                instancePath.lineTo(18.8f, 14.8f);
                instancePath.lineTo(18.8f, 11.993609f);
                instancePath.lineTo(15.426184f, 8.957891f);
                instancePath.lineTo(13.237976f, 10.818708f);
                instancePath.lineTo(14.582438f, 12.0f);
                instancePath.lineTo(12.811167f, 12.0f);
                instancePath.lineTo(7.0060563f, 6.940083f);
                instancePath.close();
                instancePath.moveTo(18.8f, 1.2f);
                instancePath.lineTo(1.2f, 1.2f);
                instancePath.lineTo(1.199f, 10.092f);
                instancePath.lineTo(6.1992455f, 6.0492587f);
                instancePath.cubicTo(6.661799f, 5.675185f, 7.4046254f, 5.693327f, 7.8504953f, 6.0850835f);
                instancePath.lineTo(12.326923f, 10.018227f);
                instancePath.lineTo(14.609102f, 8.0774975f);
                instancePath.cubicTo(15.071318f, 7.6844378f, 15.806723f, 7.6924224f, 16.255432f, 8.095083f);
                instancePath.lineTo(18.799f, 10.408f);
                instancePath.lineTo(18.8f, 1.2f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
