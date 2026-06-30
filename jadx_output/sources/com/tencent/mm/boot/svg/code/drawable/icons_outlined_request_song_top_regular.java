package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_request_song_top_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(12.7071f, 6.22183f);
        instancePath.lineTo(18.7782f, 12.2929f);
        instancePath.cubicTo(19.1687f, 12.6834f, 19.1687f, 13.3166f, 18.7782f, 13.7071f);
        instancePath.cubicTo(18.5906f, 13.8946f, 18.3363f, 14.0f, 18.0711f, 14.0f);
        instancePath.lineTo(15.9999f, 13.9999f);
        instancePath.lineTo(16.0f, 21.0f);
        instancePath.cubicTo(16.0f, 21.5523f, 15.5523f, 22.0f, 15.0f, 22.0f);
        instancePath.lineTo(9.0f, 22.0f);
        instancePath.cubicTo(8.44772f, 22.0f, 8.0f, 21.5523f, 8.0f, 21.0f);
        instancePath.lineTo(7.99993f, 13.9999f);
        instancePath.lineTo(5.92893f, 14.0f);
        instancePath.cubicTo(5.37665f, 14.0f, 4.92893f, 13.5523f, 4.92893f, 13.0f);
        instancePath.cubicTo(4.92893f, 12.7348f, 5.03429f, 12.4804f, 5.22183f, 12.2929f);
        instancePath.lineTo(11.2929f, 6.22183f);
        instancePath.cubicTo(11.6834f, 5.8313f, 12.3166f, 5.8313f, 12.7071f, 6.22183f);
        instancePath.close();
        instancePath.moveTo(12.0f, 7.212f);
        instancePath.lineTo(6.411f, 12.8f);
        instancePath.lineTo(9.19992f, 12.7999f);
        instancePath.lineTo(9.2f, 20.8f);
        instancePath.lineTo(14.8f, 20.8f);
        instancePath.lineTo(14.7999f, 12.7999f);
        instancePath.lineTo(17.588f, 12.8f);
        instancePath.lineTo(12.0f, 7.212f);
        instancePath.close();
        instancePath.moveTo(20.0f, 3.0f);
        instancePath.lineTo(20.0f, 4.2f);
        instancePath.lineTo(4.0f, 4.2f);
        instancePath.lineTo(4.0f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
