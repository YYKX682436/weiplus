package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_input extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.0f, 29.3333f);
                instancePath.cubicTo(8.63619f, 29.3333f, 2.66666f, 23.3638f, 2.66666f, 16.0f);
                instancePath.cubicTo(2.66666f, 8.6362f, 8.63619f, 2.66666f, 16.0f, 2.66666f);
                instancePath.cubicTo(23.3638f, 2.66666f, 29.3333f, 8.6362f, 29.3333f, 16.0f);
                instancePath.cubicTo(29.3333f, 23.3638f, 23.3638f, 29.3333f, 16.0f, 29.3333f);
                instancePath.close();
                instancePath.moveTo(16.0f, 27.7333f);
                instancePath.cubicTo(22.4801f, 27.7333f, 27.7333f, 22.4801f, 27.7333f, 16.0f);
                instancePath.cubicTo(27.7333f, 9.51986f, 22.4801f, 4.26666f, 16.0f, 4.26666f);
                instancePath.cubicTo(9.51985f, 4.26666f, 4.26666f, 9.51986f, 4.26666f, 16.0f);
                instancePath.cubicTo(4.26666f, 22.4801f, 9.51985f, 27.7333f, 16.0f, 27.7333f);
                instancePath.close();
                instancePath.moveTo(11.3333f, 10.6667f);
                instancePath.lineTo(8.66666f, 10.6667f);
                instancePath.lineTo(8.66666f, 13.3333f);
                instancePath.lineTo(11.3333f, 13.3333f);
                instancePath.lineTo(11.3333f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(12.6667f, 10.6667f);
                instancePath.lineTo(15.3333f, 10.6667f);
                instancePath.lineTo(15.3333f, 13.3333f);
                instancePath.lineTo(12.6667f, 13.3333f);
                instancePath.lineTo(12.6667f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(19.3333f, 10.6667f);
                instancePath.lineTo(16.6667f, 10.6667f);
                instancePath.lineTo(16.6667f, 13.3333f);
                instancePath.lineTo(19.3333f, 13.3333f);
                instancePath.lineTo(19.3333f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(20.6667f, 10.6667f);
                instancePath.lineTo(23.3333f, 10.6667f);
                instancePath.lineTo(23.3333f, 13.3333f);
                instancePath.lineTo(20.6667f, 13.3333f);
                instancePath.lineTo(20.6667f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(11.3333f, 14.6667f);
                instancePath.lineTo(8.66666f, 14.6667f);
                instancePath.lineTo(8.66666f, 17.3333f);
                instancePath.lineTo(11.3333f, 17.3333f);
                instancePath.lineTo(11.3333f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(12.6667f, 14.6667f);
                instancePath.lineTo(15.3333f, 14.6667f);
                instancePath.lineTo(15.3333f, 17.3333f);
                instancePath.lineTo(12.6667f, 17.3333f);
                instancePath.lineTo(12.6667f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(20.0f, 22.6667f);
                instancePath.lineTo(20.0f, 20.0f);
                instancePath.lineTo(12.0f, 20.0f);
                instancePath.lineTo(12.0f, 22.6667f);
                instancePath.lineTo(20.0f, 22.6667f);
                instancePath.close();
                instancePath.moveTo(16.6667f, 14.6667f);
                instancePath.lineTo(19.3333f, 14.6667f);
                instancePath.lineTo(19.3333f, 17.3333f);
                instancePath.lineTo(16.6667f, 17.3333f);
                instancePath.lineTo(16.6667f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(23.3333f, 14.6667f);
                instancePath.lineTo(20.6667f, 14.6667f);
                instancePath.lineTo(20.6667f, 17.3333f);
                instancePath.lineTo(23.3333f, 17.3333f);
                instancePath.lineTo(23.3333f, 14.6667f);
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
