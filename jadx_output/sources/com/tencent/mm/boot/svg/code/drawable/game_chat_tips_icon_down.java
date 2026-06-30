package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_chat_tips_icon_down extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.184f, 8.954f);
            instancePath.lineTo(3.968f, 8.17f);
            instancePath.lineTo(8.0f, 12.16f);
            instancePath.lineTo(12.018f, 8.17f);
            instancePath.lineTo(12.816f, 8.954f);
            instancePath.lineTo(8.518f, 13.196f);
            instancePath.cubicTo(8.36867f, 13.3453f, 8.19133f, 13.42f, 7.986f, 13.42f);
            instancePath.cubicTo(7.79f, 13.42f, 7.622f, 13.3453f, 7.482f, 13.196f);
            instancePath.lineTo(3.184f, 8.954f);
            instancePath.close();
            instancePath.moveTo(3.212f, 4.474f);
            instancePath.lineTo(3.996f, 3.69f);
            instancePath.lineTo(8.014f, 7.68f);
            instancePath.lineTo(12.032f, 3.69f);
            instancePath.lineTo(12.83f, 4.474f);
            instancePath.lineTo(8.546f, 8.716f);
            instancePath.cubicTo(8.39667f, 8.86533f, 8.21933f, 8.94f, 8.014f, 8.94f);
            instancePath.cubicTo(7.80867f, 8.94f, 7.636f, 8.86533f, 7.496f, 8.716f);
            instancePath.lineTo(3.212f, 4.474f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
