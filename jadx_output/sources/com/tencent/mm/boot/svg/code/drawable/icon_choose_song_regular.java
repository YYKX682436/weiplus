package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_choose_song_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.3121f, 11.9975f);
        instancePath.cubicTo(13.777f, 11.8114f, 15.141f, 10.967f, 15.9363f, 9.58952f);
        instancePath.cubicTo(17.2873f, 7.24949f, 16.4855f, 4.2573f, 14.1455f, 2.90628f);
        instancePath.cubicTo(11.8055f, 1.55527f, 8.81326f, 2.35702f, 7.46224f, 4.69705f);
        instancePath.cubicTo(6.67364f, 6.06295f, 6.61852f, 7.65104f, 7.17467f, 9.00524f);
        instancePath.lineTo(3.22623f, 17.0588f);
        instancePath.cubicTo(2.71399f, 18.1036f, 3.09873f, 19.3667f, 4.10646f, 19.9485f);
        instancePath.cubicTo(5.08831f, 20.5153f, 6.33979f, 20.2482f, 7.00457f, 19.3298f);
        instancePath.lineTo(12.3121f, 11.9975f);
        instancePath.close();
        instancePath.moveTo(14.7931f, 8.92952f);
        instancePath.cubicTo(14.2692f, 9.83687f, 13.4085f, 10.428f, 12.4565f, 10.6347f);
        instancePath.cubicTo(10.9135f, 10.0048f, 9.72779f, 9.32074f, 8.29518f, 8.22745f);
        instancePath.cubicTo(8.00034f, 7.30105f, 8.08262f, 6.26252f, 8.60539f, 5.35705f);
        instancePath.cubicTo(9.59191f, 3.64837f, 11.7768f, 3.06293f, 13.4855f, 4.04944f);
        instancePath.cubicTo(15.1942f, 5.03595f, 15.7796f, 7.22084f, 14.7931f, 8.92952f);
        instancePath.close();
        instancePath.moveTo(8.24203f, 9.82673f);
        instancePath.lineTo(4.41145f, 17.6399f);
        instancePath.cubicTo(4.20486f, 18.0613f, 4.36003f, 18.5707f, 4.76646f, 18.8053f);
        instancePath.cubicTo(5.16245f, 19.0339f, 5.66719f, 18.9262f, 5.9353f, 18.5558f);
        instancePath.lineTo(11.0652f, 11.4689f);
        instancePath.cubicTo(10.0705f, 11.0079f, 9.18403f, 10.492f, 8.24203f, 9.82673f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.3999f, 21.0f);
        instancePath2.lineTo(16.3999f, 17.5999f);
        instancePath2.lineTo(13.0f, 17.5999f);
        instancePath2.lineTo(13.0f, 16.3999f);
        instancePath2.lineTo(16.3999f, 16.3999f);
        instancePath2.lineTo(16.3999f, 13.0f);
        instancePath2.lineTo(17.5999f, 13.0f);
        instancePath2.lineTo(17.5999f, 16.3999f);
        instancePath2.lineTo(21.0f, 16.3999f);
        instancePath2.lineTo(21.0f, 17.5999f);
        instancePath2.lineTo(17.5999f, 17.5999f);
        instancePath2.lineTo(17.5999f, 21.0f);
        instancePath2.lineTo(16.3999f, 21.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
