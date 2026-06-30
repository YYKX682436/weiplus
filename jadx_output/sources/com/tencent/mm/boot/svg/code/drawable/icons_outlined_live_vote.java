package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_live_vote extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 28;
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
                instancePaint3.setColor(-419430401);
                instancePaint3.setColor(-419430401);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.9226f, 24.85f);
                instancePath.cubicTo(13.9744f, 24.8528f, 14.0262f, 24.8528f, 14.0779f, 24.85f);
                instancePath.lineTo(23.9172f, 24.85f);
                instancePath.lineTo(23.9172f, 23.45f);
                instancePath.lineTo(15.9823f, 23.45f);
                instancePath.lineTo(24.5597f, 14.8725f);
                instancePath.cubicTo(25.1065f, 14.3258f, 25.1065f, 13.4394f, 24.5597f, 12.8926f);
                instancePath.lineTo(14.9902f, 3.32314f);
                instancePath.cubicTo(14.4435f, 2.7764f, 13.5571f, 2.7764f, 13.0103f, 3.32314f);
                instancePath.lineTo(3.44081f, 12.8926f);
                instancePath.cubicTo(2.89408f, 13.4394f, 2.89408f, 14.3258f, 3.44081f, 14.8725f);
                instancePath.lineTo(12.0182f, 23.45f);
                instancePath.lineTo(4.08731f, 23.45f);
                instancePath.lineTo(4.08731f, 24.85f);
                instancePath.lineTo(13.9226f, 24.85f);
                instancePath.close();
                instancePath.moveTo(13.9981f, 23.45f);
                instancePath.lineTo(13.9432f, 23.395f);
                instancePath.lineTo(4.43076f, 13.8826f);
                instancePath.lineTo(14.0003f, 4.31309f);
                instancePath.lineTo(23.5698f, 13.8826f);
                instancePath.lineTo(14.0573f, 23.395f);
                instancePath.lineTo(14.0024f, 23.45f);
                instancePath.lineTo(13.9981f, 23.45f);
                instancePath.close();
                instancePath.moveTo(18.5786f, 12.1615f);
                instancePath.lineTo(14.1594f, 16.5807f);
                instancePath.cubicTo(13.7494f, 16.9907f, 13.0845f, 16.9907f, 12.6745f, 16.5807f);
                instancePath.lineTo(10.0053f, 13.9115f);
                instancePath.lineTo(10.9952f, 12.9215f);
                instancePath.lineTo(13.4169f, 15.3432f);
                instancePath.lineTo(17.5886f, 11.1715f);
                instancePath.lineTo(18.5786f, 12.1615f);
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
