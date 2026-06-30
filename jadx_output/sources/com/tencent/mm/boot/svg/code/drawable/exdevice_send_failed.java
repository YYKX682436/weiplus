package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class exdevice_send_failed extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.0f, 0.0f);
                instancePath.cubicTo(49.67311f, 0.0f, 64.0f, 14.326888f, 64.0f, 32.0f);
                instancePath.cubicTo(64.0f, 49.67311f, 49.67311f, 64.0f, 32.0f, 64.0f);
                instancePath.cubicTo(14.326888f, 64.0f, 0.0f, 49.67311f, 0.0f, 32.0f);
                instancePath.cubicTo(0.0f, 14.326888f, 14.326888f, 0.0f, 32.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(31.985626f, 42.684376f);
                instancePath.cubicTo(30.388752f, 42.684376f, 29.12f, 43.909374f, 29.12f, 45.50625f);
                instancePath.cubicTo(29.12f, 47.103127f, 30.388752f, 48.328125f, 31.985626f, 48.328125f);
                instancePath.cubicTo(33.62625f, 48.328125f, 34.873127f, 47.103127f, 34.873127f, 45.50625f);
                instancePath.cubicTo(34.873127f, 43.909374f, 33.62625f, 42.684376f, 31.985626f, 42.684376f);
                instancePath.close();
                instancePath.moveTo(34.435627f, 13.234375f);
                instancePath.lineTo(29.5575f, 13.234375f);
                instancePath.lineTo(29.907501f, 37.54375f);
                instancePath.lineTo(34.085625f, 37.54375f);
                instancePath.lineTo(34.435627f, 13.234375f);
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
