package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_icon_max_window_regular extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(26.3958f, 6.72745f);
        instancePath.lineTo(19.0998f, 14.0234f);
        instancePath.lineTo(17.9685f, 12.892f);
        instancePath.lineTo(25.2644f, 5.59609f);
        instancePath.lineTo(21.3291f, 5.59609f);
        instancePath.lineTo(21.3291f, 3.99609f);
        instancePath.lineTo(26.6624f, 3.99609f);
        instancePath.cubicTo(27.3988f, 3.99609f, 27.9958f, 4.59305f, 27.9958f, 5.32943f);
        instancePath.lineTo(27.9958f, 10.6628f);
        instancePath.lineTo(26.3958f, 10.6628f);
        instancePath.lineTo(26.3958f, 6.72745f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.9001f, 17.9765f);
        instancePath2.lineTo(5.60415f, 25.2724f);
        instancePath2.lineTo(5.60415f, 21.3371f);
        instancePath2.lineTo(4.00415f, 21.3371f);
        instancePath2.lineTo(4.00415f, 26.6705f);
        instancePath2.cubicTo(4.00415f, 27.4069f, 4.6011f, 28.0038f, 5.33748f, 28.0038f);
        instancePath2.lineTo(10.6708f, 28.0038f);
        instancePath2.lineTo(10.6708f, 26.4038f);
        instancePath2.lineTo(6.73553f, 26.4038f);
        instancePath2.lineTo(14.0314f, 19.1079f);
        instancePath2.lineTo(12.9001f, 17.9765f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
