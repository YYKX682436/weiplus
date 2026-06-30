package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_finder_record_music extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.8152f, 2.55273f);
            instancePath.cubicTo(12.263f, 2.55273f, 11.8152f, 3.00045f, 11.8152f, 3.55273f);
            instancePath.lineTo(11.8152f, 13.88f);
            instancePath.lineTo(11.8123f, 14.3254f);
            instancePath.cubicTo(11.8123f, 15.479f, 11.4739f, 15.6789f, 10.1667f, 15.7836f);
            instancePath.cubicTo(9.71077f, 15.8201f, 9.23235f, 15.8384f, 8.75441f, 15.9664f);
            instancePath.cubicTo(6.48718f, 16.5739f, 5.03684f, 18.513f, 5.51498f, 20.2974f);
            instancePath.cubicTo(5.99312f, 22.0819f, 8.21868f, 23.036f, 10.4859f, 22.4285f);
            instancePath.cubicTo(12.4959f, 21.8899f, 13.8639f, 20.3048f, 13.8152f, 18.7087f);
            instancePath.lineTo(13.8152f, 7.9899f);
            instancePath.cubicTo(13.8152f, 7.87696f, 13.9086f, 7.78585f, 14.0212f, 7.7945f);
            instancePath.cubicTo(14.6402f, 7.84206f, 15.4846f, 8.04371f, 16.0985f, 8.84583f);
            instancePath.cubicTo(16.7075f, 9.64164f, 16.6671f, 10.4165f, 16.6282f, 11.1646f);
            instancePath.cubicTo(16.6217f, 11.2885f, 16.6153f, 11.4117f, 16.6119f, 11.5341f);
            instancePath.cubicTo(16.6097f, 11.6104f, 16.6899f, 11.6568f, 16.7495f, 11.6091f);
            instancePath.cubicTo(17.5639f, 10.9584f, 18.3519f, 8.63772f, 17.4679f, 6.71558f);
            instancePath.cubicTo(16.6881f, 5.01997f, 15.1267f, 4.29487f, 14.1403f, 3.98533f);
            instancePath.cubicTo(13.9497f, 3.92553f, 13.8152f, 3.75245f, 13.8152f, 3.55273f);
            instancePath.cubicTo(13.8152f, 3.00045f, 13.3675f, 2.55273f, 12.8152f, 2.55273f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
