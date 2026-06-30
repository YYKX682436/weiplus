package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_migration_move_to_computer extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePath.moveTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 54.0f);
        instancePath.cubicTo(66.0f, 55.656853f, 64.65685f, 57.0f, 63.0f, 57.0f);
        instancePath.lineTo(24.0f, 57.0f);
        instancePath.lineTo(24.0f, 63.0f);
        instancePath.cubicTo(24.0f, 64.65685f, 22.656855f, 66.0f, 21.0f, 66.0f);
        instancePath.lineTo(3.0f, 66.0f);
        instancePath.cubicTo(1.3431457f, 66.0f, 0.0f, 64.65685f, 0.0f, 63.0f);
        instancePath.lineTo(0.0f, 33.0f);
        instancePath.cubicTo(0.0f, 31.343145f, 1.3431457f, 30.0f, 3.0f, 30.0f);
        instancePath.lineTo(6.0f, 30.0f);
        instancePath.lineTo(6.0f, 15.0f);
        instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
        instancePath.lineTo(63.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(46.209553f, 60.899998f);
        instancePath.cubicTo(47.198387f, 60.899998f, 48.0f, 61.698956f, 48.0f, 62.699997f);
        instancePath.lineTo(48.0f, 64.5f);
        instancePath.lineTo(27.0f, 64.5f);
        instancePath.lineTo(27.0f, 62.699997f);
        instancePath.cubicTo(27.0f, 61.705887f, 27.797583f, 60.899998f, 28.79045f, 60.899998f);
        instancePath.lineTo(46.209553f, 60.899998f);
        instancePath.close();
        instancePath.moveTo(20.4f, 33.6f);
        instancePath.lineTo(3.6f, 33.6f);
        instancePath.lineTo(3.6f, 62.4f);
        instancePath.lineTo(20.4f, 62.4f);
        instancePath.lineTo(20.4f, 33.6f);
        instancePath.close();
        instancePath.moveTo(62.4f, 15.6f);
        instancePath.lineTo(9.6f, 15.6f);
        instancePath.lineTo(9.6f, 30.0f);
        instancePath.lineTo(21.0f, 30.0f);
        instancePath.cubicTo(22.656855f, 30.0f, 24.0f, 31.343145f, 24.0f, 33.0f);
        instancePath.lineTo(24.0f, 53.399f);
        instancePath.lineTo(62.4f, 53.4f);
        instancePath.lineTo(62.4f, 15.6f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
