package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice2txt_trans_chs_img extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.3333335f, 4.0f);
        instancePath.lineTo(26.666666f, 4.0f);
        instancePath.cubicTo(27.403046f, 4.0f, 28.0f, 4.596954f, 28.0f, 5.3333335f);
        instancePath.lineTo(28.0f, 26.666666f);
        instancePath.cubicTo(28.0f, 27.403046f, 27.403046f, 28.0f, 26.666666f, 28.0f);
        instancePath.lineTo(5.3333335f, 28.0f);
        instancePath.cubicTo(4.596954f, 28.0f, 4.0f, 27.403046f, 4.0f, 26.666666f);
        instancePath.lineTo(4.0f, 5.3333335f);
        instancePath.cubicTo(4.0f, 4.596954f, 4.596954f, 4.0f, 5.3333335f, 4.0f);
        instancePath.close();
        instancePath.moveTo(9.597333f, 11.797334f);
        instancePath.lineTo(9.597333f, 13.322667f);
        instancePath.lineTo(11.826667f, 13.322667f);
        instancePath.cubicTo(12.442667f, 15.449333f, 13.542666f, 17.312f, 15.126667f, 18.925333f);
        instancePath.cubicTo(13.601334f, 20.216f, 11.665334f, 21.154667f, 9.333333f, 21.756f);
        instancePath.lineTo(10.154667f, 23.105333f);
        instancePath.cubicTo(12.545333f, 22.430666f, 14.569333f, 21.36f, 16.212f, 19.908f);
        instancePath.cubicTo(17.766666f, 21.198668f, 19.717333f, 22.284f, 22.064f, 23.164f);
        instancePath.lineTo(22.914667f, 21.858667f);
        instancePath.cubicTo(20.685333f, 21.037333f, 18.808f, 20.04f, 17.297333f, 18.837334f);
        instancePath.cubicTo(18.646667f, 17.356f, 19.673334f, 15.522667f, 20.377333f, 13.322667f);
        instancePath.lineTo(22.592f, 13.322667f);
        instancePath.lineTo(22.592f, 11.797334f);
        instancePath.lineTo(17.048f, 11.797334f);
        instancePath.cubicTo(16.608f, 10.844f, 16.124f, 10.022667f, 15.596f, 9.333333f);
        instancePath.lineTo(14.056f, 9.890667f);
        instancePath.cubicTo(14.584f, 10.492f, 15.038667f, 11.122666f, 15.4053335f, 11.797334f);
        instancePath.lineTo(9.597333f, 11.797334f);
        instancePath.close();
        instancePath.moveTo(13.293333f, 13.322667f);
        instancePath.lineTo(18.793333f, 13.322667f);
        instancePath.cubicTo(18.221333f, 15.097333f, 17.356f, 16.622667f, 16.212f, 17.884f);
        instancePath.cubicTo(14.862667f, 16.564f, 13.894667f, 15.053333f, 13.293333f, 13.322667f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
