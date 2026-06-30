package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_location_blue extends l95.c {
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
                instancePaint3.setColor(-6640172);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 2.5f);
                instancePath.cubicTo(16.1421f, 2.5f, 19.5f, 5.83401f, 19.5f, 9.94673f);
                instancePath.cubicTo(19.5f, 15.5488f, 12.6788f, 21.2544f, 12.6788f, 21.2544f);
                instancePath.cubicTo(12.3033f, 21.5963f, 11.702f, 21.5952f, 11.3344f, 21.2666f);
                instancePath.cubicTo(11.3344f, 21.2666f, 4.5f, 15.5488f, 4.5f, 9.94673f);
                instancePath.cubicTo(4.5f, 5.83401f, 7.85786f, 2.5f, 12.0f, 2.5f);
                instancePath.close();
                instancePath.moveTo(12.0f, 7.0f);
                instancePath.cubicTo(10.3431f, 7.0f, 9.0f, 8.34315f, 9.0f, 10.0f);
                instancePath.cubicTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f);
                instancePath.cubicTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f);
                instancePath.cubicTo(15.0f, 8.34315f, 13.6569f, 7.0f, 12.0f, 7.0f);
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
