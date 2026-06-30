package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_download_tip extends l95.c {
    private final int width = 166;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 166;
        }
        if (i17 == 1) {
            return 36;
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
        instancePaint3.setColor(-11776948);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(162.0f, 0.0f);
        instancePath.cubicTo(164.20914f, 0.0f, 166.0f, 1.7908609f, 166.0f, 4.0f);
        instancePath.lineTo(166.0f, 28.0f);
        instancePath.cubicTo(166.0f, 30.209139f, 164.20914f, 32.0f, 162.0f, 32.0f);
        instancePath.lineTo(4.0f, 32.0f);
        instancePath.cubicTo(1.7908609f, 32.0f, 0.0f, 30.209139f, 0.0f, 28.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-11776948);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(74.5149f, 31.9851f);
        instancePath2.lineTo(91.4853f, 31.9853f);
        instancePath2.lineTo(88.3713f, 31.9848f);
        instancePath2.cubicTo(87.8408f, 31.9847f, 87.3319f, 32.1955f, 86.9568f, 32.5706f);
        instancePath2.lineTo(84.0759f, 35.4515f);
        instancePath2.cubicTo(83.6854f, 35.842f, 83.0522f, 35.842f, 82.6617f, 35.4515f);
        instancePath2.lineTo(79.7808f, 32.5706f);
        instancePath2.cubicTo(79.4057f, 32.1955f, 78.8969f, 31.9848f, 78.3665f, 31.9848f);
        instancePath2.lineTo(74.5149f, 31.9851f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
