package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_live_vote extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.748f, 2.35147f);
                instancePath.cubicTo(12.2794f, 1.88284f, 11.5196f, 1.88284f, 11.051f, 2.35147f);
                instancePath.lineTo(2.84854f, 10.5539f);
                instancePath.cubicTo(2.37991f, 11.0225f, 2.37991f, 11.7823f, 2.84854f, 12.251f);
                instancePath.lineTo(9.59759f, 19.0f);
                instancePath.lineTo(3.5001f, 19.0f);
                instancePath.lineTo(3.5001f, 21.0f);
                instancePath.lineTo(20.5001f, 21.0f);
                instancePath.lineTo(20.5001f, 19.0f);
                instancePath.lineTo(14.2014f, 19.0f);
                instancePath.lineTo(20.9505f, 12.251f);
                instancePath.cubicTo(21.4191f, 11.7823f, 21.4191f, 11.0225f, 20.9505f, 10.5539f);
                instancePath.lineTo(12.748f, 2.35147f);
                instancePath.close();
                instancePath.moveTo(16.0304f, 10.0333f);
                instancePath.lineTo(12.2426f, 13.8211f);
                instancePath.cubicTo(11.8325f, 14.2312f, 11.1677f, 14.2312f, 10.7576f, 13.8211f);
                instancePath.lineTo(8.46977f, 11.5333f);
                instancePath.lineTo(9.53043f, 10.4726f);
                instancePath.lineTo(11.5001f, 12.4423f);
                instancePath.lineTo(14.9698f, 8.97261f);
                instancePath.lineTo(16.0304f, 10.0333f);
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
