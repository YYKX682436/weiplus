package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class thumb_regular extends l95.c {
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
                instancePath.moveTo(15.6544f, 6.79722f);
                instancePath.lineTo(15.4772f, 9.55466f);
                instancePath.lineTo(19.4862f, 9.55466f);
                instancePath.cubicTo(20.833f, 9.55466f, 21.8455f, 10.94f, 21.6418f, 12.318f);
                instancePath.lineTo(21.6152f, 12.4655f);
                instancePath.lineTo(20.1864f, 19.2095f);
                instancePath.cubicTo(19.9745f, 20.202f, 19.1663f, 20.9225f, 18.2096f, 20.9921f);
                instancePath.lineTo(18.0574f, 20.9976f);
                instancePath.lineTo(4.3501f, 20.9924f);
                instancePath.cubicTo(3.79796f, 20.9919f, 3.35047f, 20.5442f, 3.3501f, 19.9921f);
                instancePath.lineTo(3.3501f, 11.4118f);
                instancePath.cubicTo(3.3501f, 10.8595f, 3.79781f, 10.4118f, 4.3501f, 10.4118f);
                instancePath.lineTo(6.7913f, 10.4118f);
                instancePath.lineTo(8.05324f, 10.3821f);
                instancePath.lineTo(8.47038f, 10.3637f);
                instancePath.lineTo(8.63817f, 10.3493f);
                instancePath.lineTo(8.66647f, 10.3443f);
                instancePath.cubicTo(10.0216f, 10.0291f, 11.0566f, 7.93788f, 11.2466f, 6.06791f);
                instancePath.lineTo(11.2569f, 5.90795f);
                instancePath.lineTo(11.2787f, 5.33552f);
                instancePath.lineTo(11.3008f, 5.06045f);
                instancePath.cubicTo(11.3741f, 4.35257f, 11.5999f, 3.52042f, 12.3812f, 3.17748f);
                instancePath.cubicTo(14.435f, 2.27605f, 15.7671f, 5.01232f, 15.6544f, 6.79722f);
                instancePath.close();
                instancePath.moveTo(12.8635f, 4.2763f);
                instancePath.cubicTo(12.7037f, 4.34643f, 12.5818f, 4.57088f, 12.5181f, 4.99022f);
                instancePath.lineTo(12.4969f, 5.15669f);
                instancePath.lineTo(12.4778f, 5.38109f);
                instancePath.lineTo(12.4544f, 5.98516f);
                instancePath.lineTo(12.4405f, 6.18924f);
                instancePath.cubicTo(12.1879f, 8.6748f, 10.8257f, 11.0741f, 8.93836f, 11.5131f);
                instancePath.lineTo(8.84107f, 11.5313f);
                instancePath.lineTo(8.6379f, 11.5537f);
                instancePath.lineTo(8.45636f, 11.5661f);
                instancePath.lineTo(8.2001f, 11.576f);
                instancePath.lineTo(8.2001f, 19.794f);
                instancePath.lineTo(18.0139f, 19.7984f);
                instancePath.lineTo(18.1226f, 19.7952f);
                instancePath.cubicTo(18.5045f, 19.7674f, 18.8441f, 19.4909f, 18.9785f, 19.086f);
                instancePath.lineTo(19.0125f, 18.9608f);
                instancePath.lineTo(20.4342f, 12.2533f);
                instancePath.lineTo(20.4547f, 12.1425f);
                instancePath.cubicTo(20.5534f, 11.4746f, 20.1005f, 10.8346f, 19.5837f, 10.7616f);
                instancePath.lineTo(19.4862f, 10.7547f);
                instancePath.lineTo(14.1976f, 10.7547f);
                instancePath.lineTo(14.4568f, 6.72159f);
                instancePath.cubicTo(14.5483f, 5.27314f, 13.5938f, 3.95578f, 12.8635f, 4.2763f);
                instancePath.close();
                instancePath.moveTo(7.0001f, 11.607f);
                instancePath.lineTo(6.7913f, 11.6118f);
                instancePath.lineTo(4.5491f, 11.611f);
                instancePath.lineTo(4.5491f, 19.792f);
                instancePath.lineTo(7.0001f, 19.793f);
                instancePath.lineTo(7.0001f, 11.607f);
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
