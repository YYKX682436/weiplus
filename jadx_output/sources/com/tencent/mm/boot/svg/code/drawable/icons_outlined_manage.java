package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_manage extends l95.c {
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(5.999f, 17.641f);
                instancePath2.lineTo(5.999f, 19.0f);
                instancePath2.lineTo(4.0f, 19.0f);
                instancePath2.lineTo(4.0f, 17.64179f);
                instancePath2.lineTo(5.999f, 17.641f);
                instancePath2.close();
                instancePath2.moveTo(20.0f, 17.64179f);
                instancePath2.lineTo(20.0f, 19.0f);
                instancePath2.lineTo(7.599f, 19.0f);
                instancePath2.lineTo(7.599f, 17.641f);
                instancePath2.lineTo(20.0f, 17.64179f);
                instancePath2.close();
                instancePath2.moveTo(5.999f, 11.82f);
                instancePath2.lineTo(5.999f, 13.179f);
                instancePath2.lineTo(4.0f, 13.179105f);
                instancePath2.lineTo(4.0f, 11.820895f);
                instancePath2.lineTo(5.999f, 11.82f);
                instancePath2.close();
                instancePath2.moveTo(20.0f, 11.820895f);
                instancePath2.lineTo(20.0f, 13.179105f);
                instancePath2.lineTo(7.599f, 13.179f);
                instancePath2.lineTo(7.599f, 11.82f);
                instancePath2.lineTo(20.0f, 11.820895f);
                instancePath2.close();
                instancePath2.moveTo(20.0f, 6.0f);
                instancePath2.lineTo(20.0f, 7.358209f);
                instancePath2.lineTo(7.599f, 7.358f);
                instancePath2.lineTo(7.6f, 6.0f);
                instancePath2.lineTo(20.0f, 6.0f);
                instancePath2.close();
                instancePath2.moveTo(5.999f, 7.358f);
                instancePath2.lineTo(4.0f, 7.358209f);
                instancePath2.lineTo(4.0f, 6.0f);
                instancePath2.lineTo(6.0f, 6.0f);
                instancePath2.lineTo(5.999f, 7.358f);
                instancePath2.close();
                canvas.saveLayerAlpha(null, 230, 31);
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
