package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_music_finder extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(12.4332f, 10.167f);
                instancePath.cubicTo(11.5064f, 10.2569f, 10.88f, 11.1572f, 11.1211f, 12.0566f);
                instancePath.lineTo(14.5891f, 24.9895f);
                instancePath.cubicTo(14.7928f, 25.7492f, 14.2406f, 26.4565f, 13.4809f, 26.6601f);
                instancePath.cubicTo(10.2801f, 27.5177f, 8.38059f, 30.8077f, 9.23824f, 34.0085f);
                instancePath.cubicTo(10.0959f, 37.2093f, 13.3859f, 39.1088f, 16.5867f, 38.2512f);
                instancePath.cubicTo(19.7875f, 37.3935f, 21.687f, 34.1035f, 20.8294f, 30.9027f);
                instancePath.lineTo(16.6885f, 15.4489f);
                instancePath.lineTo(19.4766f, 15.0035f);
                instancePath.cubicTo(22.6602f, 14.4948f, 24.7384f, 11.3853f, 23.9907f, 8.24918f);
                instancePath.cubicTo(23.9907f, 8.24918f, 21.5429f, 9.01859f, 19.0145f, 9.414f);
                instancePath.cubicTo(17.3779f, 9.66995f, 14.359f, 9.98007f, 12.4332f, 10.167f);
                instancePath.close();
                instancePath.moveTo(63.4741f, 17.5053f);
                instancePath.cubicTo(63.6471f, 16.5238f, 62.8327f, 15.6496f, 61.8415f, 15.7529f);
                instancePath.lineTo(33.486f, 18.7058f);
                instancePath.cubicTo(32.1537f, 18.8446f, 31.0748f, 19.8498f, 30.8423f, 21.169f);
                instancePath.lineTo(26.4534f, 46.0714f);
                instancePath.cubicTo(26.1897f, 47.5676f, 24.5674f, 48.2273f, 23.0712f, 47.9635f);
                instancePath.cubicTo(18.992f, 47.2443f, 15.1021f, 49.968f, 14.3828f, 54.0472f);
                instancePath.cubicTo(13.6636f, 58.1264f, 16.3873f, 62.0164f, 20.4665f, 62.7356f);
                instancePath.lineTo(20.9549f, 62.8056f);
                instancePath.cubicTo(24.8519f, 63.2348f, 28.4644f, 60.568f, 29.1549f, 56.6519f);
                instancePath.lineTo(33.8065f, 30.2719f);
                instancePath.lineTo(57.0805f, 27.8506f);
                instancePath.lineTo(54.085f, 44.851f);
                instancePath.cubicTo(53.8214f, 46.3472f, 52.1991f, 47.007f, 50.7029f, 46.7432f);
                instancePath.cubicTo(46.6237f, 46.0239f, 42.7338f, 48.7477f, 42.0145f, 52.8269f);
                instancePath.cubicTo(41.2952f, 56.9061f, 44.019f, 60.796f, 48.0982f, 61.5153f);
                instancePath.cubicTo(52.1774f, 62.2346f, 56.0674f, 59.5108f, 56.7866f, 55.4316f);
                instancePath.lineTo(63.4741f, 17.5053f);
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
