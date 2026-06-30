package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_music2 extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.5f, 4.276247f);
                instancePath.cubicTo(11.5f, 4.1579003f, 11.582233f, 4.05876f, 11.6926775f, 4.03285f);
                instancePath.lineTo(11.762453f, 4.0265574f);
                instancePath.lineTo(11.762453f, 4.0265574f);
                instancePath.lineTo(16.274876f, 4.4774876f);
                instancePath.cubicTo(16.402676f, 4.4902678f, 16.5f, 4.597809f, 16.5f, 4.726247f);
                instancePath.lineTo(16.5f, 7.223753f);
                instancePath.cubicTo(16.5f, 7.3420997f, 16.417767f, 7.44124f, 16.307323f, 7.46715f);
                instancePath.lineTo(16.237547f, 7.4734426f);
                instancePath.lineTo(16.237547f, 7.4734426f);
                instancePath.lineTo(13.5f, 7.199247f);
                instancePath.lineTo(13.5f, 17.0f);
                instancePath.cubicTo(13.5f, 18.597681f, 12.25108f, 19.903662f, 10.676272f, 19.994907f);
                instancePath.lineTo(10.5f, 20.0f);
                instancePath.cubicTo(8.843145f, 20.0f, 7.5f, 18.656855f, 7.5f, 17.0f);
                instancePath.cubicTo(7.5f, 15.343145f, 8.843145f, 14.0f, 10.5f, 14.0f);
                instancePath.cubicTo(10.850972f, 14.0f, 11.187867f, 14.060269f, 11.5009f, 14.171024f);
                instancePath.lineTo(11.5f, 4.276247f);
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
