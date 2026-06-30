package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_arrow_down extends l95.c {
    private final int width = 72;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 72;
        }
        if (i17 == 1) {
            return 36;
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
            instancePath.moveTo(52.257812f, 7.363281f);
            instancePath.lineTo(55.441406f, 10.542969f);
            instancePath.lineTo(38.101562f, 27.878906f);
            instancePath.cubicTo(36.933594f, 29.050781f, 35.046875f, 29.0625f, 33.86328f, 27.878906f);
            instancePath.lineTo(16.527344f, 10.542969f);
            instancePath.lineTo(19.710938f, 7.363281f);
            instancePath.lineTo(35.984375f, 23.636719f);
            instancePath.close();
            instancePath.moveTo(52.257812f, 7.363281f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
