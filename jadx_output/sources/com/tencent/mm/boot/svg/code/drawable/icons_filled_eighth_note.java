package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_eighth_note extends l95.c {
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
            instancePaint3.setColor(-16268960);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.815f, 2.55273f);
            instancePath.cubicTo(12.2628f, 2.55273f, 11.815f, 3.00045f, 11.815f, 3.55273f);
            instancePath.lineTo(11.815f, 13.88f);
            instancePath.lineTo(11.8121f, 14.3254f);
            instancePath.cubicTo(11.8121f, 15.479f, 11.4737f, 15.6789f, 10.1665f, 15.7836f);
            instancePath.cubicTo(9.71053f, 15.8201f, 9.23211f, 15.8384f, 8.75416f, 15.9664f);
            instancePath.cubicTo(6.48694f, 16.5739f, 5.0366f, 18.513f, 5.51474f, 20.2974f);
            instancePath.cubicTo(5.99288f, 22.0819f, 8.21844f, 23.036f, 10.4857f, 22.4285f);
            instancePath.cubicTo(12.4957f, 21.8899f, 13.8637f, 20.3048f, 13.815f, 18.7087f);
            instancePath.lineTo(13.815f, 7.9899f);
            instancePath.cubicTo(13.815f, 7.87696f, 13.9084f, 7.78585f, 14.021f, 7.7945f);
            instancePath.cubicTo(14.64f, 7.84206f, 15.4844f, 8.04371f, 16.0983f, 8.84583f);
            instancePath.cubicTo(16.7073f, 9.64164f, 16.6669f, 10.4165f, 16.628f, 11.1646f);
            instancePath.cubicTo(16.6215f, 11.2885f, 16.6151f, 11.4117f, 16.6117f, 11.5341f);
            instancePath.cubicTo(16.6095f, 11.6104f, 16.6897f, 11.6568f, 16.7493f, 11.6091f);
            instancePath.cubicTo(17.5637f, 10.9584f, 18.3517f, 8.63772f, 17.4677f, 6.71558f);
            instancePath.cubicTo(16.6879f, 5.01997f, 15.1265f, 4.29487f, 14.1401f, 3.98533f);
            instancePath.cubicTo(13.9495f, 3.92553f, 13.815f, 3.75245f, 13.815f, 3.55273f);
            instancePath.cubicTo(13.815f, 3.00045f, 13.3673f, 2.55273f, 12.815f, 2.55273f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
