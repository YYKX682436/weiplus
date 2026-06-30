package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ofm_group_chat_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(47.9995f, 20.0f);
                instancePath.cubicTo(30.878777f, 20.0f, 17.0f, 31.79821f, 17.0f, 46.35247f);
                instancePath.cubicTo(17.0f, 53.18859f, 20.06195f, 59.415703f, 25.08287f, 64.098785f);
                instancePath.cubicTo(23.80389f, 68.17186f, 21.427929f, 76.0f, 21.427929f, 76.0f);
                instancePath.lineTo(34.25072f, 69.97289f);
                instancePath.cubicTo(38.394653f, 71.719925f, 43.06058f, 72.70594f, 48.0005f, 72.70594f);
                instancePath.cubicTo(65.12122f, 72.70594f, 79.0f, 60.90773f, 79.0f, 46.35147f);
                instancePath.cubicTo(78.999f, 31.79821f, 65.120224f, 20.0f, 47.9995f, 20.0f);
                instancePath.lineTo(47.9995f, 20.0f);
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
