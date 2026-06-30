package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class remittance_timed_out extends l95.c {
    private final int width = 270;
    private final int height = 270;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 270;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-2206378);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(132.38f, 0.0f);
                instancePath.lineTo(139.11f, 0.0f);
                instancePath.cubicTo(170.03f, 0.97f, 200.5f, 12.81f, 223.73f, 33.29f);
                instancePath.cubicTo(252.25f, 57.88f, 269.48f, 94.88f, 270.0f, 132.53f);
                instancePath.lineTo(270.0f, 137.41f);
                instancePath.cubicTo(269.51f, 169.65f, 256.95f, 201.48f, 235.3f, 225.36f);
                instancePath.cubicTo(210.51f, 253.12f, 173.83f, 269.77f, 136.59f, 270.0f);
                instancePath.lineTo(131.83f, 270.0f);
                instancePath.cubicTo(100.09f, 269.31f, 68.8f, 256.99f, 45.18f, 235.78f);
                instancePath.cubicTo(17.51f, 211.35f, 0.78f, 175.18f, 0.0f, 138.28f);
                instancePath.lineTo(0.0f, 132.6f);
                instancePath.cubicTo(0.51f, 95.16f, 17.51f, 58.35f, 45.74f, 33.75f);
                instancePath.cubicTo(69.41f, 12.69f, 100.71f, 0.55f, 132.38f, 0.0f);
                instancePath.lineTo(132.38f, 0.0f);
                instancePath.close();
                instancePath.moveTo(129.28561f, 66.398506f);
                instancePath.cubicTo(127.909935f, 67.02799f, 128.00961f, 68.716606f, 128.00961f, 69.97557f);
                instancePath.cubicTo(128.0495f, 101.339806f, 127.989685f, 132.69405f, 128.02956f, 164.05827f);
                instancePath.cubicTo(127.830185f, 165.34721f, 128.65758f, 166.64615f, 129.96349f, 166.88596f);
                instancePath.cubicTo(133.33289f, 167.0758f, 136.72224f, 166.97588f, 140.09164f, 166.9559f);
                instancePath.cubicTo(141.71654f, 167.17572f, 143.26169f, 165.72691f, 142.96263f, 164.05827f);
                instancePath.cubicTo(142.98256f, 132.36432f, 142.9726f, 100.67036f, 142.96263f, 68.9664f);
                instancePath.cubicTo(143.24174f, 67.27779f, 141.6667f, 65.818985f, 140.0119f, 66.07877f);
                instancePath.cubicTo(136.45308f, 66.19867f, 132.77464f, 65.65912f, 129.28561f, 66.398506f);
                instancePath.lineTo(129.28561f, 66.398506f);
                instancePath.close();
                instancePath.moveTo(132.43211f, 189.68253f);
                instancePath.cubicTo(127.108795f, 191.74556f, 126.39702f, 199.80829f, 131.29929f, 202.72841f);
                instancePath.cubicTo(135.77048f, 206.00732f, 142.81812f, 202.52908f, 142.95847f, 197.03766f);
                instancePath.cubicTo(143.56999f, 191.69572f, 137.3043f, 187.25075f, 132.43211f, 189.68253f);
                instancePath.lineTo(132.43211f, 189.68253f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
