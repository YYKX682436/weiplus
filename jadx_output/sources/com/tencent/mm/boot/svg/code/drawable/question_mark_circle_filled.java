package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class question_mark_circle_filled extends l95.c {
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
                instancePath.moveTo(12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.close();
                instancePath.moveTo(8.75013f, 9.77372f);
                instancePath.lineTo(8.74133f, 10.0322f);
                instancePath.lineTo(10.8408f, 10.0322f);
                instancePath.lineTo(10.8559f, 9.79832f);
                instancePath.cubicTo(10.8798f, 9.42757f, 11.0136f, 9.14424f, 11.2185f, 8.95351f);
                instancePath.cubicTo(11.4235f, 8.76272f, 11.7213f, 8.64453f, 12.1103f, 8.64453f);
                instancePath.cubicTo(12.4904f, 8.64453f, 12.7872f, 8.76024f, 12.9855f, 8.93556f);
                instancePath.cubicTo(13.1818f, 9.10914f, 13.2959f, 9.3531f, 13.2959f, 9.64551f);
                instancePath.cubicTo(13.2959f, 9.94308f, 13.2345f, 10.1491f, 13.0952f, 10.3379f);
                instancePath.cubicTo(12.9477f, 10.5378f, 12.6994f, 10.7374f, 12.2831f, 10.9894f);
                instancePath.cubicTo(11.7924f, 11.2776f, 11.4193f, 11.5958f, 11.1807f, 11.9942f);
                instancePath.cubicTo(10.9404f, 12.3954f, 10.8509f, 12.8533f, 10.8829f, 13.394f);
                instancePath.lineTo(10.8931f, 14.1201f);
                instancePath.lineTo(12.9756f, 14.1201f);
                instancePath.lineTo(12.9756f, 13.4736f);
                instancePath.cubicTo(12.9756f, 13.1667f, 13.0312f, 12.9642f, 13.1657f, 12.7805f);
                instancePath.cubicTo(13.3089f, 12.5848f, 13.5582f, 12.3873f, 13.9995f, 12.1313f);
                instancePath.lineTo(14.0019f, 12.1298f);
                instancePath.cubicTo(14.4901f, 11.8391f, 14.8851f, 11.4931f, 15.1575f, 11.0693f);
                instancePath.cubicTo(15.4316f, 10.643f, 15.5732f, 10.151f, 15.5732f, 9.58398f);
                instancePath.cubicTo(15.5732f, 8.75754f, 15.2273f, 8.04154f, 14.6241f, 7.53637f);
                instancePath.cubicTo(14.024f, 7.03373f, 13.1826f, 6.75f, 12.1992f, 6.75f);
                instancePath.cubicTo(11.1357f, 6.75f, 10.2845f, 7.05871f, 9.68973f, 7.60449f);
                instancePath.cubicTo(9.09422f, 8.15092f, 8.77942f, 8.91343f, 8.75013f, 9.77372f);
                instancePath.close();
                instancePath.moveTo(10.7051f, 16.5f);
                instancePath.cubicTo(10.7051f, 17.1849f, 11.2682f, 17.7207f, 11.9531f, 17.7207f);
                instancePath.cubicTo(12.6403f, 17.7207f, 13.1943f, 17.1826f, 13.1943f, 16.5f);
                instancePath.cubicTo(13.1943f, 15.8151f, 12.638f, 15.2861f, 11.9531f, 15.2861f);
                instancePath.cubicTo(11.2705f, 15.2861f, 10.7051f, 15.8129f, 10.7051f, 16.5f);
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
