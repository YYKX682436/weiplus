package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_mini_game_filled extends l95.c {
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
                instancePath.moveTo(22.8737f, 4.55576f);
                instancePath.cubicTo(23.3281f, 6.30438f, 22.5181f, 8.03323f, 21.056f, 8.41852f);
                instancePath.cubicTo(19.5939f, 8.80381f, 18.033f, 7.68746f, 17.5786f, 5.93885f);
                instancePath.cubicTo(17.1241f, 4.19023f, 17.9342f, 2.46138f, 19.3963f, 2.07609f);
                instancePath.cubicTo(20.8584f, 1.6908f, 22.4193f, 2.80715f, 22.8737f, 4.55576f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(3.85626f, 7.075f);
                instancePath2.cubicTo(6.81008f, 3.82475f, 12.2336f, 3.95318f, 15.9778f, 7.35162f);
                instancePath2.cubicTo(19.712f, 10.7501f, 20.3541f, 16.1441f, 17.4003f, 19.3943f);
                instancePath2.cubicTo(14.4465f, 22.6446f, 9.02297f, 22.5162f, 5.27884f, 19.1177f);
                instancePath2.cubicTo(1.54459f, 15.7193f, 0.902453f, 10.3252f, 3.85626f, 7.075f);
                instancePath2.close();
                instancePath2.moveTo(11.552f, 13.1112f);
                instancePath2.cubicTo(13.1425f, 13.9608f, 15.0195f, 13.5854f, 15.7308f, 12.2517f);
                instancePath2.cubicTo(16.4421f, 10.918f, 15.7308f, 9.14963f, 14.1304f, 8.29014f);
                instancePath2.cubicTo(12.5399f, 7.44053f, 10.6629f, 7.81594f, 9.95159f, 9.14963f);
                instancePath2.cubicTo(9.2403f, 10.4833f, 9.95159f, 12.2517f, 11.552f, 13.1112f);
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
