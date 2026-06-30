package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_lucky_money extends l95.c {
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
                instancePaint3.setColor(-855638017);
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(21.5833f, 2.9165f);
                instancePath.cubicTo(22.2277f, 2.9165f, 22.75f, 3.43884f, 22.75f, 4.08317f);
                instancePath.lineTo(22.75f, 23.9165f);
                instancePath.cubicTo(22.75f, 24.5608f, 22.2277f, 25.0832f, 21.5833f, 25.0832f);
                instancePath.lineTo(6.41667f, 25.0832f);
                instancePath.cubicTo(5.77233f, 25.0832f, 5.25f, 24.5608f, 5.25f, 23.9165f);
                instancePath.lineTo(5.25f, 4.08317f);
                instancePath.cubicTo(5.25f, 3.43884f, 5.77233f, 2.9165f, 6.41667f, 2.9165f);
                instancePath.lineTo(21.5833f, 2.9165f);
                instancePath.close();
                instancePath.moveTo(21.35f, 4.3165f);
                instancePath.lineTo(6.65f, 4.3165f);
                instancePath.lineTo(6.64933f, 8.27833f);
                instancePath.cubicTo(7.78306f, 9.63103f, 9.52561f, 10.6508f, 11.577f, 11.107f);
                instancePath.cubicTo(11.5285f, 11.3026f, 11.5f, 11.506f, 11.5f, 11.7167f);
                instancePath.cubicTo(11.5f, 11.8003f, 11.5045f, 11.8828f, 11.5125f, 11.9644f);
                instancePath.cubicTo(9.7236f, 11.6843f, 8.07335f, 11.108f, 6.65019f, 10.3044f);
                instancePath.lineTo(6.65f, 23.6832f);
                instancePath.lineTo(21.35f, 23.6832f);
                instancePath.lineTo(21.351f, 10.3038f);
                instancePath.cubicTo(19.9276f, 11.1077f, 18.2769f, 11.6842f, 16.4875f, 11.9644f);
                instancePath.cubicTo(16.4955f, 11.8828f, 16.5f, 11.8003f, 16.5f, 11.7167f);
                instancePath.cubicTo(16.5f, 11.506f, 16.4715f, 11.3026f, 16.423f, 11.107f);
                instancePath.cubicTo(18.475f, 10.6507f, 20.2179f, 9.63044f, 21.3516f, 8.27716f);
                instancePath.lineTo(21.35f, 4.3165f);
                instancePath.close();
                instancePath.moveTo(14.0f, 9.84356f);
                instancePath.cubicTo(15.0068f, 9.84356f, 15.8229f, 10.6597f, 15.8229f, 11.6665f);
                instancePath.cubicTo(15.8229f, 12.6733f, 15.0068f, 13.4894f, 14.0f, 13.4894f);
                instancePath.cubicTo(12.9932f, 13.4894f, 12.1771f, 12.6733f, 12.1771f, 11.6665f);
                instancePath.cubicTo(12.1771f, 10.6597f, 12.9932f, 9.84356f, 14.0f, 9.84356f);
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
