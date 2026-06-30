package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_do_fav extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.99976f, 13.8453f);
                instancePath.lineTo(14.2035f, 16.0553f);
                instancePath.lineTo(13.4007f, 11.3744f);
                instancePath.lineTo(16.8016f, 8.05929f);
                instancePath.lineTo(12.1016f, 7.37634f);
                instancePath.lineTo(9.99976f, 3.11746f);
                instancePath.lineTo(7.89788f, 7.37634f);
                instancePath.lineTo(3.19792f, 8.05929f);
                instancePath.lineTo(6.59884f, 11.3744f);
                instancePath.lineTo(5.79599f, 16.0553f);
                instancePath.lineTo(9.99976f, 13.8453f);
                instancePath.close();
                instancePath.moveTo(5.25574f, 11.8108f);
                instancePath.lineTo(4.44648f, 16.5291f);
                instancePath.cubicTo(4.32379f, 17.2445f, 5.10452f, 17.8311f, 5.7624f, 17.4852f);
                instancePath.lineTo(9.99976f, 15.2575f);
                instancePath.lineTo(14.2371f, 17.4852f);
                instancePath.cubicTo(14.8795f, 17.8229f, 15.6787f, 17.2617f, 15.553f, 16.5291f);
                instancePath.lineTo(14.7438f, 11.8108f);
                instancePath.lineTo(18.1719f, 8.46919f);
                instancePath.cubicTo(18.6916f, 7.9626f, 18.4048f, 7.02912f, 17.6692f, 6.92224f);
                instancePath.lineTo(12.9317f, 6.23383f);
                instancePath.lineTo(10.813f, 1.94091f);
                instancePath.cubicTo(10.4918f, 1.29009f, 9.51542f, 1.27441f, 9.18648f, 1.94091f);
                instancePath.lineTo(7.06779f, 6.23383f);
                instancePath.lineTo(2.33028f, 6.92224f);
                instancePath.cubicTo(1.61205f, 7.0266f, 1.2954f, 7.95039f, 1.82764f, 8.46919f);
                instancePath.lineTo(5.25574f, 11.8108f);
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
