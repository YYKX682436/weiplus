package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class channels_regular extends l95.c {
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
                instancePath.moveTo(10.9007f, 10.7084f);
                instancePath.cubicTo(11.3267f, 11.4134f, 11.7017f, 12.0414f, 11.9967f, 12.5384f);
                instancePath.cubicTo(12.2917f, 12.0414f, 12.6667f, 11.4134f, 13.0917f, 10.7084f);
                instancePath.cubicTo(16.9227f, 4.34841f, 18.6358f, 3.63541f, 19.7128f, 3.70441f);
                instancePath.cubicTo(20.2008f, 3.74141f, 20.8738f, 4.00441f, 21.3038f, 5.04741f);
                instancePath.cubicTo(22.4048f, 7.70941f, 20.7057f, 15.8054f, 18.9937f, 18.8154f);
                instancePath.cubicTo(18.5345f, 19.6262f, 17.8762f, 20.3083f, 16.8927f, 20.3024f);
                instancePath.cubicTo(14.9507f, 20.3024f, 13.0188f, 17.3854f, 11.9967f, 15.5524f);
                instancePath.cubicTo(11.0068f, 17.3263f, 9.16639f, 20.1153f, 7.28771f, 20.2934f);
                instancePath.cubicTo(6.20772f, 20.334f, 5.51348f, 19.7242f, 4.99875f, 18.8154f);
                instancePath.cubicTo(3.28675f, 15.8054f, 1.58875f, 7.70941f, 2.68975f, 5.04741f);
                instancePath.cubicTo(3.11975f, 4.00441f, 3.79175f, 3.74141f, 4.27975f, 3.70441f);
                instancePath.cubicTo(5.35675f, 3.63541f, 7.06975f, 4.34841f, 10.9007f, 10.7084f);
                instancePath.close();
                instancePath.moveTo(18.8888f, 5.44841f);
                instancePath.cubicTo(18.4118f, 5.79441f, 17.7108f, 6.56441f, 17.2058f, 7.19841f);
                instancePath.cubicTo(15.5208f, 9.31511f, 14.1882f, 11.6797f, 12.8108f, 14.0044f);
                instancePath.cubicTo(13.6718f, 15.7154f, 14.8217f, 17.4194f, 15.7847f, 18.2794f);
                instancePath.cubicTo(16.2317f, 18.6794f, 16.6477f, 18.8704f, 16.9577f, 18.8494f);
                instancePath.cubicTo(17.3207f, 18.8254f, 17.5507f, 18.5164f, 17.7597f, 18.1274f);
                instancePath.cubicTo(18.8807f, 16.0484f, 20.3057f, 10.1474f, 20.2048f, 6.99341f);
                instancePath.cubicTo(20.1938f, 6.64841f, 20.1758f, 6.31041f, 20.1007f, 5.98141f);
                instancePath.cubicTo(20.0397f, 5.71341f, 19.9288f, 5.25441f, 19.6268f, 5.16041f);
                instancePath.cubicTo(19.3848f, 5.08641f, 19.0688f, 5.31741f, 18.8888f, 5.44841f);
                instancePath.close();
                instancePath.moveTo(4.36675f, 5.16041f);
                instancePath.cubicTo(4.06475f, 5.25441f, 3.95275f, 5.71341f, 3.89175f, 5.98141f);
                instancePath.cubicTo(3.81675f, 6.31041f, 3.79975f, 6.64841f, 3.78775f, 6.99341f);
                instancePath.cubicTo(3.68775f, 10.1474f, 5.11175f, 16.0484f, 6.23275f, 18.1274f);
                instancePath.cubicTo(6.44275f, 18.5164f, 6.67175f, 18.8254f, 7.03575f, 18.8494f);
                instancePath.cubicTo(7.34575f, 18.8704f, 7.76175f, 18.6794f, 8.20775f, 18.2794f);
                instancePath.cubicTo(9.17175f, 17.4194f, 10.3207f, 15.7154f, 11.1817f, 14.0044f);
                instancePath.cubicTo(9.81149f, 11.6837f, 8.46972f, 9.3126f, 6.78675f, 7.19841f);
                instancePath.cubicTo(6.28275f, 6.56441f, 5.58175f, 5.79441f, 5.10375f, 5.44841f);
                instancePath.cubicTo(4.92375f, 5.31741f, 4.60875f, 5.08641f, 4.36675f, 5.16041f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
