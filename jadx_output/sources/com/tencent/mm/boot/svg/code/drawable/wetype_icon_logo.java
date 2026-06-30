package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wetype_icon_logo extends l95.c {
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
                instancePaint3.setColor(-15022203);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 0.0f);
                instancePath.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
                instancePath.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
                instancePath.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
                instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(15.2135f, 6.66675f);
                instancePath2.cubicTo(14.9086f, 6.66675f, 14.6413f, 6.87008f, 14.5598f, 7.16381f);
                instancePath2.lineTo(14.295f, 8.11887f);
                instancePath2.cubicTo(14.2357f, 8.33248f, 14.3964f, 8.54376f, 14.6181f, 8.54376f);
                instancePath2.cubicTo(16.024f, 8.54376f, 16.7105f, 8.99919f, 16.3533f, 10.2876f);
                instancePath2.cubicTo(16.3511f, 10.2956f, 16.3489f, 10.3033f, 16.3467f, 10.311f);
                instancePath2.cubicTo(16.0795f, 11.2481f, 15.0366f, 11.9817f, 14.0672f, 11.9817f);
                instancePath2.lineTo(11.9985f, 11.9817f);
                instancePath2.lineTo(12.5839f, 9.86949f);
                instancePath2.lineTo(12.9516f, 8.54376f);
                instancePath2.lineTo(13.2338f, 7.52632f);
                instancePath2.cubicTo(13.3536f, 7.09416f, 13.0286f, 6.66675f, 12.5801f, 6.66675f);
                instancePath2.lineTo(11.5331f, 6.66675f);
                instancePath2.cubicTo(11.2282f, 6.66675f, 10.9609f, 6.87009f, 10.8794f, 7.16383f);
                instancePath2.lineTo(9.54363f, 11.9817f);
                instancePath2.lineTo(6.43068f, 11.9817f);
                instancePath2.cubicTo(6.12587f, 11.9817f, 5.85849f, 12.185f, 5.77703f, 12.4787f);
                instancePath2.lineTo(5.57172f, 13.2191f);
                instancePath2.cubicTo(5.45187f, 13.6512f, 5.7769f, 14.0787f, 6.22536f, 14.0787f);
                instancePath2.lineTo(8.96236f, 14.0787f);
                instancePath2.lineTo(8.11313f, 17.1405f);
                instancePath2.cubicTo(7.99327f, 17.5726f, 8.31829f, 18.0001f, 8.76677f, 18.0001f);
                instancePath2.lineTo(9.81379f, 18.0001f);
                instancePath2.cubicTo(10.1186f, 18.0001f, 10.386f, 17.7968f, 10.4674f, 17.503f);
                instancePath2.lineTo(11.417f, 14.0787f);
                instancePath2.lineTo(13.6116f, 14.0787f);
                instancePath2.lineTo(13.676f, 14.0787f);
                instancePath2.cubicTo(16.169f, 13.9655f, 18.2558f, 12.369f, 18.5952f, 10.3001f);
                instancePath2.cubicTo(18.9203f, 8.31854f, 18.162f, 6.77807f, 15.7886f, 6.66675f);
                instancePath2.lineTo(15.2135f, 6.66675f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
