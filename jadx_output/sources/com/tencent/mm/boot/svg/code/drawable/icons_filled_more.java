package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_more extends l95.c {
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
                instancePath.moveTo(21.0f, 36.0f);
                instancePath.cubicTo(21.0f, 39.3132f, 18.3132f, 42.0f, 15.0f, 42.0f);
                instancePath.cubicTo(11.6868f, 42.0f, 9.0f, 39.3132f, 9.0f, 36.0f);
                instancePath.cubicTo(9.0f, 32.6856f, 11.6868f, 30.0f, 15.0f, 30.0f);
                instancePath.cubicTo(18.3132f, 30.0f, 21.0f, 32.6856f, 21.0f, 36.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 30.0f);
                instancePath.cubicTo(39.3132f, 30.0f, 42.0f, 32.6856f, 42.0f, 36.0f);
                instancePath.cubicTo(42.0f, 39.3132f, 39.3132f, 42.0f, 36.0f, 42.0f);
                instancePath.cubicTo(32.6868f, 42.0f, 30.0f, 39.3132f, 30.0f, 36.0f);
                instancePath.cubicTo(30.0f, 32.6856f, 32.6868f, 30.0f, 36.0f, 30.0f);
                instancePath.close();
                instancePath.moveTo(57.0f, 30.0f);
                instancePath.cubicTo(60.3132f, 30.0f, 63.0f, 32.6856f, 63.0f, 36.0f);
                instancePath.cubicTo(63.0f, 39.3132f, 60.3132f, 42.0f, 57.0f, 42.0f);
                instancePath.cubicTo(53.6868f, 42.0f, 51.0f, 39.3132f, 51.0f, 36.0f);
                instancePath.cubicTo(51.0f, 32.6856f, 53.6868f, 30.0f, 57.0f, 30.0f);
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
