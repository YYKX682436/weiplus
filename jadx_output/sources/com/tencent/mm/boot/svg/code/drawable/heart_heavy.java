package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class heart_heavy extends l95.c {
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
                instancePath.moveTo(11.2856f, 6.26427f);
                instancePath.lineTo(11.6718f, 6.64144f);
                instancePath.lineTo(11.9927f, 6.94635f);
                instancePath.lineTo(12.455f, 6.50502f);
                instancePath.cubicTo(12.5451f, 6.41764f, 12.6267f, 6.33739f, 12.6998f, 6.26427f);
                instancePath.cubicTo(14.6524f, 4.31165f, 17.8182f, 4.31165f, 19.7709f, 6.26427f);
                instancePath.cubicTo(21.7053f, 8.19873f, 21.7233f, 11.3239f, 19.8249f, 13.2805f);
                instancePath.lineTo(12.6998f, 20.4064f);
                instancePath.cubicTo(12.3093f, 20.797f, 11.6761f, 20.797f, 11.2856f, 20.4065f);
                instancePath.lineTo(4.16013f, 13.2809f);
                instancePath.cubicTo(2.26207f, 11.3239f, 2.28006f, 8.19873f, 4.21452f, 6.26427f);
                instancePath.cubicTo(6.16714f, 4.31165f, 9.33296f, 4.31165f, 11.2856f, 6.26427f);
                instancePath.close();
                instancePath.moveTo(18.2152f, 7.81991f);
                instancePath.cubicTo(17.1218f, 6.72644f, 15.3489f, 6.72644f, 14.2554f, 7.81991f);
                instancePath.lineTo(13.9741f, 8.09642f);
                instancePath.lineTo(12.0025f, 9.9783f);
                instancePath.lineTo(10.1346f, 8.21533f);
                instancePath.lineTo(9.72995f, 7.81991f);
                instancePath.cubicTo(8.63648f, 6.72644f, 6.86362f, 6.72644f, 5.77015f, 7.81991f);
                instancePath.cubicTo(4.73318f, 8.85688f, 4.6785f, 10.5078f, 5.59123f, 11.5878f);
                instancePath.lineTo(5.71577f, 11.7253f);
                instancePath.lineTo(11.993f, 18.0018f);
                instancePath.lineTo(18.2459f, 11.7485f);
                instancePath.cubicTo(19.2654f, 10.6979f, 19.2964f, 9.04666f, 18.3449f, 7.95854f);
                instancePath.lineTo(18.2152f, 7.81991f);
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
