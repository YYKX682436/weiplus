package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_live_screencast extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(63.0f, 9.0f);
        instancePath.cubicTo(64.65625f, 9.0f, 66.0f, 10.34375f, 66.0f, 12.0f);
        instancePath.lineTo(66.0f, 45.0f);
        instancePath.cubicTo(66.0f, 46.65625f, 64.65625f, 48.0f, 63.0f, 48.0f);
        instancePath.lineTo(48.29297f, 48.0f);
        instancePath.lineTo(50.890625f, 52.5f);
        instancePath.lineTo(51.0f, 52.5f);
        instancePath.lineTo(51.0f, 52.6875f);
        instancePath.lineTo(57.007812f, 63.09375f);
        instancePath.lineTo(51.808594f, 66.09375f);
        instancePath.lineTo(47.42578f, 58.5f);
        instancePath.lineTo(24.578125f, 58.5f);
        instancePath.lineTo(20.195312f, 66.09375f);
        instancePath.lineTo(15.0f, 63.09375f);
        instancePath.lineTo(21.0f, 52.695312f);
        instancePath.lineTo(21.0f, 52.5f);
        instancePath.lineTo(21.109375f, 52.5f);
        instancePath.lineTo(23.710938f, 48.0f);
        instancePath.lineTo(9.0f, 48.0f);
        instancePath.cubicTo(7.34375f, 48.0f, 6.0f, 46.65625f, 6.0f, 45.0f);
        instancePath.lineTo(6.0f, 12.0f);
        instancePath.cubicTo(6.0f, 10.34375f, 7.34375f, 9.0f, 9.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(41.359375f, 48.0f);
        instancePath.lineTo(30.640625f, 48.0f);
        instancePath.lineTo(28.042969f, 52.5f);
        instancePath.lineTo(43.960938f, 52.5f);
        instancePath.close();
        instancePath.moveTo(60.0f, 15.0f);
        instancePath.lineTo(12.0f, 15.0f);
        instancePath.lineTo(12.0f, 42.0f);
        instancePath.lineTo(60.0f, 42.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 15.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
