package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_cut_song extends l95.c {
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
                instancePath.moveTo(14.8199f, 12.821f);
                instancePath.lineTo(6.07107f, 18.9071f);
                instancePath.cubicTo(5.40803f, 19.3684f, 4.5f, 18.8939f, 4.5f, 18.0862f);
                instancePath.lineTo(4.5f, 5.91387f);
                instancePath.cubicTo(4.5f, 5.10618f, 5.40803f, 4.63172f, 6.07106f, 5.09297f);
                instancePath.lineTo(14.8199f, 11.1791f);
                instancePath.cubicTo(15.3919f, 11.577f, 15.3919f, 12.4231f, 14.8199f, 12.821f);
                instancePath.close();
                instancePath.moveTo(18.5f, 19.0001f);
                instancePath.lineTo(17.75f, 19.0001f);
                instancePath.cubicTo(17.3358f, 19.0001f, 17.0f, 18.6643f, 17.0f, 18.2501f);
                instancePath.lineTo(17.0f, 5.75005f);
                instancePath.cubicTo(17.0f, 5.33584f, 17.3358f, 5.00005f, 17.75f, 5.00005f);
                instancePath.lineTo(18.5f, 5.00005f);
                instancePath.cubicTo(18.9142f, 5.00005f, 19.25f, 5.33584f, 19.25f, 5.75005f);
                instancePath.lineTo(19.25f, 18.2501f);
                instancePath.cubicTo(19.25f, 18.6643f, 18.9142f, 19.0001f, 18.5f, 19.0001f);
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
