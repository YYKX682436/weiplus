package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voip_filled extends l95.c {
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
                instancePaint3.setColor(-16268960);
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.0f, 7.28573f);
                instancePath.cubicTo(3.0f, 6.81235f, 3.38376f, 6.42859f, 3.85714f, 6.42859f);
                instancePath.lineTo(15.4286f, 6.42859f);
                instancePath.cubicTo(15.902f, 6.42859f, 16.2857f, 6.81235f, 16.2857f, 7.28573f);
                instancePath.lineTo(16.2857f, 16.7143f);
                instancePath.cubicTo(16.2857f, 17.1877f, 15.902f, 17.5714f, 15.4286f, 17.5714f);
                instancePath.lineTo(3.85714f, 17.5714f);
                instancePath.cubicTo(3.38376f, 17.5714f, 3.0f, 17.1877f, 3.0f, 16.7143f);
                instancePath.lineTo(3.0f, 7.28573f);
                instancePath.close();
                instancePath.moveTo(19.5734f, 8.12524f);
                instancePath.cubicTo(20.1261f, 7.63389f, 21.0f, 8.02629f, 21.0f, 8.76588f);
                instancePath.lineTo(21.0f, 15.2342f);
                instancePath.cubicTo(21.0f, 15.9737f, 20.1261f, 16.3661f, 19.5734f, 15.8748f);
                instancePath.lineTo(17.1429f, 13.7143f);
                instancePath.lineTo(17.1429f, 10.2857f);
                instancePath.lineTo(19.5734f, 8.12524f);
                instancePath.close();
                instancePath.moveTo(7.94087f, 8.94645f);
                instancePath.lineTo(7.94623f, 8.94653f);
                instancePath.cubicTo(8.15589f, 8.95353f, 8.3365f, 9.07461f, 8.41848f, 9.26873f);
                instancePath.lineTo(8.84046f, 10.3908f);
                instancePath.cubicTo(8.87684f, 10.4908f, 8.86396f, 10.5639f, 8.80914f, 10.6643f);
                instancePath.lineTo(8.64855f, 10.9534f);
                instancePath.lineTo(8.4598f, 11.304f);
                instancePath.lineTo(8.34016f, 11.5333f);
                instancePath.cubicTo(8.31734f, 11.5757f, 8.30483f, 11.6241f, 8.30483f, 11.6704f);
                instancePath.cubicTo(8.30483f, 11.7169f, 8.31973f, 11.7674f, 8.34705f, 11.8119f);
                instancePath.cubicTo(8.56859f, 12.188f, 8.80951f, 12.5101f, 9.07667f, 12.7773f);
                instancePath.cubicTo(9.34098f, 13.0461f, 9.66097f, 13.2867f, 10.0427f, 13.5116f);
                instancePath.cubicTo(10.0865f, 13.5385f, 10.1321f, 13.5522f, 10.1816f, 13.5522f);
                instancePath.cubicTo(10.2307f, 13.5522f, 10.2742f, 13.5407f, 10.3207f, 13.5158f);
                instancePath.lineTo(10.4725f, 13.4359f);
                instancePath.lineTo(10.7486f, 13.2879f);
                instancePath.lineTo(11.1903f, 13.0463f);
                instancePath.cubicTo(11.288f, 12.993f, 11.3543f, 12.9809f, 11.4626f, 13.0172f);
                instancePath.lineTo(12.589f, 13.441f);
                instancePath.cubicTo(12.7749f, 13.5196f, 12.8959f, 13.6973f, 12.9096f, 13.9029f);
                instancePath.cubicTo(12.9111f, 13.9203f, 12.9111f, 13.9378f, 12.9098f, 13.9554f);
                instancePath.cubicTo(12.9072f, 13.9926f, 12.8994f, 14.0287f, 12.888f, 14.0654f);
                instancePath.lineTo(12.8706f, 14.1154f);
                instancePath.cubicTo(12.6651f, 14.675f, 12.1369f, 15.0536f, 11.5349f, 15.0536f);
                instancePath.cubicTo(11.3969f, 15.0536f, 11.2517f, 15.0294f, 11.1669f, 15.0049f);
                instancePath.cubicTo(10.1139f, 14.7642f, 9.15561f, 14.228f, 8.39235f, 13.4646f);
                instancePath.cubicTo(7.6291f, 12.7013f, 7.09292f, 11.7429f, 6.84981f, 10.6767f);
                instancePath.lineTo(6.82879f, 10.5733f);
                instancePath.cubicTo(6.81281f, 10.4865f, 6.80357f, 10.4042f, 6.80357f, 10.3218f);
                instancePath.cubicTo(6.80357f, 9.71977f, 7.18215f, 9.19161f, 7.74628f, 8.98444f);
                instancePath.lineTo(7.8014f, 8.96739f);
                instancePath.cubicTo(7.8331f, 8.95876f, 7.86443f, 8.95234f, 7.89573f, 8.94897f);
                instancePath.cubicTo(7.91098f, 8.94733f, 7.92601f, 8.94645f, 7.94087f, 8.94645f);
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
