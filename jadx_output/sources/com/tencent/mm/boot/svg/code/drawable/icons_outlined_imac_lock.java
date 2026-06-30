package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_imac_lock extends l95.c {
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
        instancePath.moveTo(69.015625f, 45.0f);
        instancePath.cubicTo(70.66406f, 45.0f, 72.0f, 46.339844f, 72.0f, 47.98828f);
        instancePath.lineTo(72.0f, 64.51172f);
        instancePath.cubicTo(72.0f, 66.16406f, 70.63281f, 67.5f, 69.015625f, 67.5f);
        instancePath.lineTo(44.984375f, 67.5f);
        instancePath.cubicTo(43.335938f, 67.5f, 42.0f, 66.16016f, 42.0f, 64.51172f);
        instancePath.lineTo(42.0f, 64.5f);
        instancePath.lineTo(26.089844f, 64.5f);
        instancePath.cubicTo(25.925781f, 64.5f, 25.765625f, 64.47266f, 25.609375f, 64.421875f);
        instancePath.cubicTo(24.824219f, 64.15625f, 24.402344f, 63.304688f, 24.667969f, 62.51953f);
        instancePath.lineTo(26.535156f, 57.0f);
        instancePath.lineTo(9.0f, 57.0f);
        instancePath.cubicTo(7.34375f, 57.0f, 6.0f, 55.65625f, 6.0f, 54.0f);
        instancePath.lineTo(6.0f, 15.0f);
        instancePath.cubicTo(6.0f, 13.34375f, 7.34375f, 12.0f, 9.0f, 12.0f);
        instancePath.lineTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65625f, 12.0f, 66.0f, 13.34375f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 45.0f);
        instancePath.close();
        instancePath.moveTo(68.39844f, 48.601562f);
        instancePath.lineTo(66.0f, 48.597656f);
        instancePath.lineTo(66.0f, 48.601562f);
        instancePath.lineTo(45.597656f, 48.601562f);
        instancePath.lineTo(45.601562f, 63.898438f);
        instancePath.lineTo(68.39844f, 63.898438f);
        instancePath.close();
        instancePath.moveTo(42.0f, 56.996094f);
        instancePath.lineTo(30.332031f, 57.0f);
        instancePath.lineTo(29.015625f, 60.898438f);
        instancePath.lineTo(42.0f, 60.898438f);
        instancePath.close();
        instancePath.moveTo(42.0f, 48.601562f);
        instancePath.lineTo(9.597656f, 48.601562f);
        instancePath.lineTo(9.601562f, 53.398438f);
        instancePath.lineTo(42.0f, 53.398438f);
        instancePath.close();
        instancePath.moveTo(62.398438f, 15.601562f);
        instancePath.lineTo(9.601562f, 15.601562f);
        instancePath.lineTo(9.597656f, 45.0f);
        instancePath.lineTo(48.0f, 45.0f);
        instancePath.lineTo(48.0f, 44.101562f);
        instancePath.cubicTo(48.0f, 38.796875f, 52.03125f, 34.5f, 57.0f, 34.5f);
        instancePath.cubicTo(59.027344f, 34.5f, 60.89453f, 35.214844f, 62.398438f, 36.41797f);
        instancePath.close();
        instancePath.moveTo(57.0f, 38.101562f);
        instancePath.cubicTo(54.070312f, 38.101562f, 51.601562f, 40.734375f, 51.601562f, 44.101562f);
        instancePath.lineTo(51.601562f, 45.0f);
        instancePath.lineTo(62.398438f, 45.0f);
        instancePath.lineTo(62.398438f, 44.101562f);
        instancePath.cubicTo(62.398438f, 40.734375f, 59.929688f, 38.101562f, 57.0f, 38.101562f);
        instancePath.close();
        instancePath.moveTo(57.0f, 38.101562f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
