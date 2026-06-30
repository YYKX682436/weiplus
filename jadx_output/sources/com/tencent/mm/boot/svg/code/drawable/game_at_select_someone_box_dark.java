package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_at_select_someone_box_dark extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 40;
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
                instancePaint3.setColor(-14803426);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.0f, 24.0f);
                instancePath.cubicTo(36.418278f, 24.0f, 40.0f, 27.581722f, 40.0f, 32.0f);
                instancePath.cubicTo(40.0f, 36.418278f, 36.418278f, 40.0f, 32.0f, 40.0f);
                instancePath.cubicTo(27.581722f, 40.0f, 24.0f, 36.418278f, 24.0f, 32.0f);
                instancePath.cubicTo(24.0f, 27.581722f, 27.581722f, 24.0f, 32.0f, 24.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16728129);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(25.3335f, 32.0002f);
                instancePath2.cubicTo(25.3335f, 35.6821f, 28.3183f, 38.6668f, 32.0002f, 38.6668f);
                instancePath2.cubicTo(35.6821f, 38.6668f, 38.6668f, 35.6821f, 38.6668f, 32.0002f);
                instancePath2.cubicTo(38.6668f, 28.3183f, 35.6821f, 25.3335f, 32.0002f, 25.3335f);
                instancePath2.cubicTo(28.3183f, 25.3335f, 25.3335f, 28.3183f, 25.3335f, 32.0002f);
                instancePath2.close();
                instancePath2.moveTo(34.9485f, 29.6934f);
                instancePath2.lineTo(31.2156f, 33.4262f);
                instancePath2.lineTo(29.3717f, 31.5823f);
                instancePath2.lineTo(28.6667f, 32.2873f);
                instancePath2.lineTo(30.7458f, 34.368f);
                instancePath2.cubicTo(31.0061f, 34.6284f, 31.4282f, 34.6286f, 31.6887f, 34.3682f);
                instancePath2.lineTo(35.6569f, 30.4017f);
                instancePath2.lineTo(34.9485f, 29.6934f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
