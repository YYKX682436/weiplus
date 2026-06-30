package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_more2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
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
            instancePath.moveTo(36.0f, 66.0f);
            instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 40.5f);
            instancePath.cubicTo(38.485283f, 40.5f, 40.5f, 38.485283f, 40.5f, 36.0f);
            instancePath.cubicTo(40.5f, 33.514717f, 38.485283f, 31.5f, 36.0f, 31.5f);
            instancePath.cubicTo(33.514717f, 31.5f, 31.5f, 33.514717f, 31.5f, 36.0f);
            instancePath.cubicTo(31.5f, 38.485283f, 33.514717f, 40.5f, 36.0f, 40.5f);
            instancePath.close();
            instancePath.moveTo(49.5f, 40.5f);
            instancePath.cubicTo(51.985283f, 40.5f, 54.0f, 38.485283f, 54.0f, 36.0f);
            instancePath.cubicTo(54.0f, 33.514717f, 51.985283f, 31.5f, 49.5f, 31.5f);
            instancePath.cubicTo(47.014717f, 31.5f, 45.0f, 33.514717f, 45.0f, 36.0f);
            instancePath.cubicTo(45.0f, 38.485283f, 47.014717f, 40.5f, 49.5f, 40.5f);
            instancePath.close();
            instancePath.moveTo(22.5f, 40.5f);
            instancePath.cubicTo(24.985281f, 40.5f, 27.0f, 38.485283f, 27.0f, 36.0f);
            instancePath.cubicTo(27.0f, 33.514717f, 24.985281f, 31.5f, 22.5f, 31.5f);
            instancePath.cubicTo(20.014719f, 31.5f, 18.0f, 33.514717f, 18.0f, 36.0f);
            instancePath.cubicTo(18.0f, 38.485283f, 20.014719f, 40.5f, 22.5f, 40.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
