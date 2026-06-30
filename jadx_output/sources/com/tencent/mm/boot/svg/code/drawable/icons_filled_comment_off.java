package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_comment_off extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(17.0f, 12.0f);
                instancePath2.cubicTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f);
                instancePath2.cubicTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f);
                instancePath2.cubicTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f);
                instancePath2.cubicTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f);
                instancePath2.close();
                instancePath2.moveTo(20.5f, 4.0f);
                instancePath2.cubicTo(21.328426f, 4.0f, 22.0f, 4.6715727f, 22.0f, 5.5f);
                instancePath2.lineTo(22.001322f, 12.848017f);
                instancePath2.cubicTo(20.809025f, 11.413408f, 19.01118f, 10.5f, 17.0f, 10.5f);
                instancePath2.cubicTo(13.41015f, 10.5f, 10.5f, 13.41015f, 10.5f, 17.0f);
                instancePath2.cubicTo(10.5f, 17.749784f, 10.62695f, 18.469917f, 10.860529f, 19.140076f);
                instancePath2.lineTo(8.707107f, 21.292892f);
                instancePath2.cubicTo(8.316583f, 21.683418f, 7.6834173f, 21.683418f, 7.2928934f, 21.292892f);
                instancePath2.cubicTo(7.1053567f, 21.105356f, 7.0f, 20.851004f, 7.0f, 20.585787f);
                instancePath2.lineTo(7.0f, 19.0f);
                instancePath2.lineTo(3.5f, 19.0f);
                instancePath2.cubicTo(2.671573f, 19.0f, 2.0f, 18.328426f, 2.0f, 17.5f);
                instancePath2.lineTo(2.0f, 5.5f);
                instancePath2.cubicTo(2.0f, 4.6715727f, 2.671573f, 4.0f, 3.5f, 4.0f);
                instancePath2.lineTo(20.5f, 4.0f);
                instancePath2.close();
                instancePath2.moveTo(14.051692f, 15.113071f);
                instancePath2.cubicTo(13.702494f, 15.657558f, 13.5f, 16.305132f, 13.5f, 17.0f);
                instancePath2.cubicTo(13.5f, 18.932997f, 15.067003f, 20.5f, 17.0f, 20.5f);
                instancePath2.cubicTo(17.694868f, 20.5f, 18.342442f, 20.297506f, 18.886929f, 19.948309f);
                instancePath2.lineTo(14.051692f, 15.113071f);
                instancePath2.close();
                instancePath2.moveTo(17.0f, 13.5f);
                instancePath2.cubicTo(16.305132f, 13.5f, 15.657558f, 13.702494f, 15.113071f, 14.051692f);
                instancePath2.lineTo(19.948309f, 18.886929f);
                instancePath2.cubicTo(20.297506f, 18.342442f, 20.5f, 17.694868f, 20.5f, 17.0f);
                instancePath2.cubicTo(20.5f, 15.067003f, 18.932997f, 13.5f, 17.0f, 13.5f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
