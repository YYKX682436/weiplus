package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class light_download_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.49935f, 8.16997f);
        instancePath.lineTo(8.49935f, 1.33337f);
        instancePath.lineTo(7.49935f, 1.33337f);
        instancePath.lineTo(7.49935f, 8.16994f);
        instancePath.lineTo(6.27732f, 6.94785f);
        instancePath.lineTo(5.57019f, 7.65495f);
        instancePath.lineTo(7.45725f, 9.54209f);
        instancePath.cubicTo(7.75665f, 9.84151f, 8.24211f, 9.84151f, 8.54151f, 9.54208f);
        instancePath.lineTo(10.4287f, 7.65478f);
        instancePath.lineTo(9.72153f, 6.9477f);
        instancePath.lineTo(8.49935f, 8.16997f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.66602f, 13.6667f);
        instancePath2.lineTo(3.66602f, 5.66671f);
        instancePath2.lineTo(5.33268f, 5.66671f);
        instancePath2.lineTo(5.33268f, 4.66671f);
        instancePath2.lineTo(3.33268f, 4.66671f);
        instancePath2.cubicTo(2.96449f, 4.66671f, 2.66602f, 4.96518f, 2.66602f, 5.33337f);
        instancePath2.lineTo(2.66602f, 14.0f);
        instancePath2.cubicTo(2.66602f, 14.3682f, 2.96449f, 14.6667f, 3.33268f, 14.6667f);
        instancePath2.lineTo(12.666f, 14.6667f);
        instancePath2.cubicTo(13.0342f, 14.6667f, 13.3327f, 14.3682f, 13.3327f, 14.0f);
        instancePath2.lineTo(13.3327f, 5.33337f);
        instancePath2.cubicTo(13.3327f, 4.96518f, 13.0342f, 4.66671f, 12.666f, 4.66671f);
        instancePath2.lineTo(10.666f, 4.66671f);
        instancePath2.lineTo(10.666f, 5.66671f);
        instancePath2.lineTo(12.3327f, 5.66671f);
        instancePath2.lineTo(12.3327f, 13.6667f);
        instancePath2.lineTo(3.66602f, 13.6667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
