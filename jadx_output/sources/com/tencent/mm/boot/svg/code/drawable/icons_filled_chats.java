package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_chats extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(36.0f, 60.0f);
                instancePath.cubicTo(52.568542f, 60.0f, 66.0f, 48.58326f, 66.0f, 34.5f);
                instancePath.cubicTo(66.0f, 20.416739f, 52.568542f, 9.0f, 36.0f, 9.0f);
                instancePath.cubicTo(19.431458f, 9.0f, 6.0f, 20.416739f, 6.0f, 34.5f);
                instancePath.cubicTo(6.0f, 42.109215f, 9.920994f, 48.94f, 16.139269f, 53.6122f);
                instancePath.lineTo(15.232977f, 61.40884f);
                instancePath.cubicTo(15.137323f, 62.231728f, 15.726863f, 62.976353f, 16.54975f, 63.072006f);
                instancePath.cubicTo(16.831148f, 63.104713f, 17.116058f, 63.057068f, 17.371504f, 62.934578f);
                instancePath.lineTo(26.320362f, 58.64351f);
                instancePath.cubicTo(29.357191f, 59.52292f, 32.61305f, 60.0f, 36.0f, 60.0f);
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
