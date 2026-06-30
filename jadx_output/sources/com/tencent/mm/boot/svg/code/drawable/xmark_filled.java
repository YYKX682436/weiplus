package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class xmark_filled extends l95.c {
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
                instancePath.moveTo(11.9987f, 13.414f);
                instancePath.lineTo(5.91451f, 19.4971f);
                instancePath.lineTo(4.50043f, 18.0827f);
                instancePath.lineTo(10.5844f, 11.9999f);
                instancePath.lineTo(4.49951f, 5.91617f);
                instancePath.lineTo(5.9136f, 4.50183f);
                instancePath.lineTo(11.9987f, 10.5858f);
                instancePath.lineTo(18.0864f, 4.49936f);
                instancePath.lineTo(19.5004f, 5.91371f);
                instancePath.lineTo(13.4131f, 11.9999f);
                instancePath.lineTo(19.5005f, 18.0863f);
                instancePath.lineTo(18.0864f, 19.5006f);
                instancePath.lineTo(11.9987f, 13.414f);
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
