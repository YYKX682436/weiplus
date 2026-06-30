package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_ad_link_tag_weapp_mini_program extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
            instancePath.moveTo(10.7126f, 3.79338f);
            instancePath.cubicTo(9.47935f, 3.79338f, 8.59914f, 4.67132f, 8.59914f, 5.61504f);
            instancePath.lineTo(8.5995f, 10.38f);
            instancePath.cubicTo(8.5995f, 12.1112f, 7.05003f, 13.4017f, 5.28608f, 13.4017f);
            instancePath.cubicTo(3.52213f, 13.4017f, 1.97266f, 12.1112f, 1.97266f, 10.38f);
            instancePath.cubicTo(1.97266f, 8.85635f, 3.1729f, 7.67407f, 4.66325f, 7.41251f);
            instancePath.cubicTo(5.23172f, 7.31274f, 5.53314f, 7.70339f, 5.35077f, 8.12887f);
            instancePath.cubicTo(5.23264f, 8.40448f, 4.98836f, 8.57614f, 4.62105f, 8.68068f);
            instancePath.cubicTo(3.75486f, 8.92723f, 3.17266f, 9.62353f, 3.17266f, 10.38f);
            instancePath.cubicTo(3.17266f, 11.3237f, 4.05287f, 12.2017f, 5.28608f, 12.2017f);
            instancePath.cubicTo(6.51929f, 12.2017f, 7.3995f, 11.3237f, 7.3995f, 10.38f);
            instancePath.lineTo(7.39914f, 5.61504f);
            instancePath.cubicTo(7.39914f, 3.88387f, 8.94861f, 2.59338f, 10.7126f, 2.59338f);
            instancePath.cubicTo(12.4765f, 2.59338f, 14.026f, 3.88387f, 14.026f, 5.61504f);
            instancePath.cubicTo(14.026f, 7.13868f, 12.8257f, 8.32096f, 11.3354f, 8.58253f);
            instancePath.cubicTo(10.7669f, 8.6823f, 10.4655f, 8.29165f, 10.6479f, 7.86617f);
            instancePath.cubicTo(10.766f, 7.59056f, 11.0103f, 7.4189f, 11.3776f, 7.31435f);
            instancePath.cubicTo(12.2438f, 7.06781f, 12.826f, 6.3715f, 12.826f, 5.61504f);
            instancePath.cubicTo(12.826f, 4.67132f, 11.9458f, 3.79338f, 10.7126f, 3.79338f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
