package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_arrow_down_line_regular extends l95.c {
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
                instancePath.moveTo(11.6464f, 18.6465f);
                instancePath.cubicTo(11.8417f, 18.8418f, 12.1583f, 18.8418f, 12.3535f, 18.6465f);
                instancePath.lineTo(13.0606f, 17.9394f);
                instancePath.lineTo(16.2426f, 14.7574f);
                instancePath.lineTo(15.1819f, 13.6968f);
                instancePath.lineTo(12.75f, 16.1288f);
                instancePath.lineTo(12.75f, 12.0352f);
                instancePath.lineTo(12.75f, 12.0352f);
                instancePath.lineTo(12.75f, 5.0f);
                instancePath.lineTo(11.25f, 5.0f);
                instancePath.lineTo(11.25f, 11.0001f);
                instancePath.lineTo(11.25f, 11.0001f);
                instancePath.lineTo(11.25f, 16.1288f);
                instancePath.lineTo(8.81798f, 13.6968f);
                instancePath.lineTo(7.75732f, 14.7574f);
                instancePath.lineTo(10.9393f, 17.9394f);
                instancePath.lineTo(11.6464f, 18.6465f);
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
