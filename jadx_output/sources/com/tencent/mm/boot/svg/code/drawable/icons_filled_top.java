package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_top extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(38.335938f, 21.878906f);
            instancePath.lineTo(56.546875f, 40.09375f);
            instancePath.cubicTo(57.71875f, 41.26172f, 57.71875f, 43.164062f, 56.546875f, 44.335938f);
            instancePath.cubicTo(55.984375f, 44.898438f, 55.222656f, 45.214844f, 54.42578f, 45.214844f);
            instancePath.lineTo(48.214844f, 45.214844f);
            instancePath.lineTo(48.214844f, 63.0f);
            instancePath.cubicTo(48.214844f, 64.65625f, 46.871094f, 66.0f, 45.214844f, 66.0f);
            instancePath.lineTo(27.214844f, 66.0f);
            instancePath.cubicTo(25.554688f, 66.0f, 24.214844f, 64.65625f, 24.214844f, 63.0f);
            instancePath.lineTo(24.214844f, 45.214844f);
            instancePath.lineTo(18.0f, 45.214844f);
            instancePath.cubicTo(16.34375f, 45.214844f, 15.0f, 43.871094f, 15.0f, 42.214844f);
            instancePath.cubicTo(15.0f, 41.41797f, 15.316406f, 40.65625f, 15.878906f, 40.09375f);
            instancePath.lineTo(34.09375f, 21.878906f);
            instancePath.cubicTo(35.26172f, 20.707031f, 37.164062f, 20.707031f, 38.335938f, 21.878906f);
            instancePath.close();
            instancePath.moveTo(60.0f, 9.0f);
            instancePath.lineTo(60.0f, 15.0f);
            instancePath.lineTo(12.0f, 15.0f);
            instancePath.lineTo(12.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(60.0f, 9.0f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
