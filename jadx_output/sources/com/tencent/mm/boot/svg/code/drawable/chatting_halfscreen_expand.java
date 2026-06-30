package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_halfscreen_expand extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(19.6101f, 10.9583f);
                instancePath.cubicTo(19.3918f, 10.9583f, 19.2108f, 10.8846f, 19.067f, 10.7371f);
                instancePath.cubicTo(18.9233f, 10.5897f, 18.8514f, 10.404f, 18.8514f, 10.18f);
                instancePath.lineTo(18.8514f, 9.09735f);
                instancePath.lineTo(19.0298f, 5.92566f);
                instancePath.lineTo(16.4478f, 8.60037f);
                instancePath.lineTo(13.5554f, 11.5198f);
                instancePath.cubicTo(13.4145f, 11.6729f, 13.2357f, 11.7495f, 13.019f, 11.7495f);
                instancePath.cubicTo(12.7835f, 11.7495f, 12.5882f, 11.6776f, 12.433f, 11.5338f);
                instancePath.cubicTo(12.2778f, 11.39f, 12.2003f, 11.2004f, 12.2003f, 10.965f);
                instancePath.cubicTo(12.2003f, 10.8542f, 12.2192f, 10.7504f, 12.2571f, 10.6534f);
                instancePath.cubicTo(12.295f, 10.5565f, 12.3522f, 10.4702f, 12.4288f, 10.3945f);
                instancePath.lineTo(15.3445f, 7.4787f);
                instancePath.lineTo(18.0253f, 4.91034f);
                instancePath.lineTo(14.8353f, 5.08383f);
                instancePath.lineTo(13.7612f, 5.08383f);
                instancePath.cubicTo(13.538f, 5.08383f, 13.3511f, 5.01458f, 13.2004f, 4.87608f);
                instancePath.cubicTo(13.0497f, 4.73758f, 12.9743f, 4.55634f, 12.9743f, 4.33234f);
                instancePath.cubicTo(12.9743f, 4.10834f, 13.0493f, 3.92447f, 13.1992f, 3.78073f);
                instancePath.cubicTo(13.3491f, 3.63699f, 13.5364f, 3.56512f, 13.7612f, 3.56512f);
                instancePath.lineTo(19.0347f, 3.56512f);
                instancePath.cubicTo(19.4631f, 3.56512f, 19.7953f, 3.68302f, 20.0311f, 3.91882f);
                instancePath.cubicTo(20.2669f, 4.15462f, 20.3848f, 4.48391f, 20.3848f, 4.90668f);
                instancePath.lineTo(20.3848f, 10.18f);
                instancePath.cubicTo(20.3848f, 10.3983f, 20.3117f, 10.5826f, 20.1654f, 10.7329f);
                instancePath.cubicTo(20.0192f, 10.8832f, 19.8341f, 10.9583f, 19.6101f, 10.9583f);
                instancePath.close();
                instancePath.moveTo(9.47702f, 21.1048f);
                instancePath.lineTo(4.20251f, 21.1048f);
                instancePath.cubicTo(3.77486f, 21.1048f, 3.44293f, 20.9869f, 3.20673f, 20.7511f);
                instancePath.cubicTo(2.97052f, 20.5153f, 2.85242f, 20.186f, 2.85242f, 19.7632f);
                instancePath.lineTo(2.85242f, 14.4898f);
                instancePath.cubicTo(2.85242f, 14.2723f, 2.92551f, 14.0882f, 3.07169f, 13.9376f);
                instancePath.cubicTo(3.21786f, 13.7869f, 3.40295f, 13.7116f, 3.62695f, 13.7116f);
                instancePath.cubicTo(3.84607f, 13.7116f, 4.02752f, 13.7853f, 4.17131f, 13.9327f);
                instancePath.cubicTo(4.3151f, 14.0801f, 4.38699f, 14.2658f, 4.38699f, 14.4898f);
                instancePath.lineTo(4.38699f, 15.5724f);
                instancePath.lineTo(4.20862f, 18.7527f);
                instancePath.lineTo(6.78918f, 16.0706f);
                instancePath.lineTo(9.68179f, 13.1501f);
                instancePath.cubicTo(9.8235f, 12.9969f, 10.0027f, 12.9203f, 10.2194f, 12.9203f);
                instancePath.cubicTo(10.4548f, 12.9203f, 10.6498f, 12.9922f, 10.8046f, 13.136f);
                instancePath.cubicTo(10.9594f, 13.2798f, 11.0368f, 13.4693f, 11.0368f, 13.7047f);
                instancePath.cubicTo(11.0368f, 13.8155f, 11.0178f, 13.9194f, 10.9799f, 14.0163f);
                instancePath.cubicTo(10.942f, 14.1133f, 10.8848f, 14.2f, 10.8083f, 14.2766f);
                instancePath.lineTo(7.89255f, 17.1911f);
                instancePath.lineTo(5.21173f, 19.7594f);
                instancePath.lineTo(8.40189f, 19.5861f);
                instancePath.lineTo(9.47702f, 19.5861f);
                instancePath.cubicTo(9.69949f, 19.5861f, 9.88585f, 19.6553f, 10.0361f, 19.7938f);
                instancePath.cubicTo(10.1864f, 19.9322f, 10.2619f, 20.1134f, 10.2627f, 20.3374f);
                instancePath.cubicTo(10.2627f, 20.5614f, 10.1877f, 20.7453f, 10.0379f, 20.8891f);
                instancePath.cubicTo(9.88797f, 21.0329f, 9.70102f, 21.1048f, 9.47702f, 21.1048f);
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
