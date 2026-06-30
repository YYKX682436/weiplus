package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_comment extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.5f, 4.0f);
        instancePath.cubicTo(21.328426f, 4.0f, 22.0f, 4.6715727f, 22.0f, 5.5f);
        instancePath.lineTo(22.0f, 5.5f);
        instancePath.lineTo(22.0f, 17.5f);
        instancePath.cubicTo(22.0f, 18.328426f, 21.328426f, 19.0f, 20.5f, 19.0f);
        instancePath.lineTo(20.5f, 19.0f);
        instancePath.lineTo(11.0f, 19.0f);
        instancePath.lineTo(8.707107f, 21.292892f);
        instancePath.cubicTo(8.316583f, 21.683418f, 7.6834173f, 21.683418f, 7.2928934f, 21.292892f);
        instancePath.cubicTo(7.1053567f, 21.105356f, 7.0f, 20.851004f, 7.0f, 20.585787f);
        instancePath.lineTo(7.0f, 19.0f);
        instancePath.lineTo(3.5f, 19.0f);
        instancePath.cubicTo(2.7203038f, 19.0f, 2.0795512f, 18.405111f, 2.0068667f, 17.64446f);
        instancePath.lineTo(2.0f, 17.5f);
        instancePath.lineTo(2.0f, 5.5f);
        instancePath.cubicTo(2.0f, 4.6715727f, 2.671573f, 4.0f, 3.5f, 4.0f);
        instancePath.lineTo(3.5f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
