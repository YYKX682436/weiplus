package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_ticket_icon_in_live extends l95.c {
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
                instancePath.moveTo(18.9333f, 2.0f);
                instancePath.cubicTo(19.5224f, 2.0f, 20.0f, 2.47128f, 20.0f, 3.05263f);
                instancePath.lineTo(20.0f, 20.9474f);
                instancePath.cubicTo(20.0f, 21.5287f, 19.5224f, 22.0f, 18.9333f, 22.0f);
                instancePath.lineTo(5.06667f, 22.0f);
                instancePath.cubicTo(4.47756f, 22.0f, 4.0f, 21.5287f, 4.0f, 20.9474f);
                instancePath.lineTo(4.0f, 3.05263f);
                instancePath.cubicTo(4.0f, 2.47128f, 4.47756f, 2.0f, 5.06667f, 2.0f);
                instancePath.lineTo(18.9333f, 2.0f);
                instancePath.close();
                instancePath.moveTo(18.8f, 3.20001f);
                instancePath.lineTo(5.19998f, 3.20001f);
                instancePath.lineTo(5.19998f, 20.8f);
                instancePath.lineTo(18.8f, 20.8f);
                instancePath.lineTo(18.8f, 3.20001f);
                instancePath.close();
                instancePath.moveTo(12.8f, 17.9f);
                instancePath.lineTo(12.8f, 14.8f);
                instancePath.lineTo(15.9f, 14.8f);
                instancePath.lineTo(15.9f, 17.9f);
                instancePath.lineTo(12.8f, 17.9f);
                instancePath.close();
                instancePath.moveTo(11.7f, 14.1f);
                instancePath.cubicTo(11.7f, 13.8791f, 11.879f, 13.7f, 12.1f, 13.7f);
                instancePath.lineTo(16.6f, 13.7f);
                instancePath.cubicTo(16.8209f, 13.7f, 17.0f, 13.8791f, 17.0f, 14.1f);
                instancePath.lineTo(17.0f, 18.6f);
                instancePath.cubicTo(17.0f, 18.8209f, 16.8209f, 19.0f, 16.6f, 19.0f);
                instancePath.lineTo(12.1f, 19.0f);
                instancePath.cubicTo(11.879f, 19.0f, 11.7f, 18.8209f, 11.7f, 18.6f);
                instancePath.lineTo(11.7f, 14.1f);
                instancePath.close();
                instancePath.moveTo(16.5f, 6.5f);
                instancePath.lineTo(16.5f, 7.7f);
                instancePath.lineTo(7.5f, 7.7f);
                instancePath.lineTo(7.5f, 6.5f);
                instancePath.lineTo(16.5f, 6.5f);
                instancePath.close();
                instancePath.moveTo(13.5f, 10.7f);
                instancePath.lineTo(13.5f, 9.5f);
                instancePath.lineTo(7.5f, 9.5f);
                instancePath.lineTo(7.5f, 10.7f);
                instancePath.lineTo(13.5f, 10.7f);
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
