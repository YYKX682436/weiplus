package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_camera_flash_on extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.25001f, 3.5f);
        instancePath.cubicTo(18.25001f, 3.2887099f, 18.11711f, 3.10021f, 17.918108f, 3.02911f);
        instancePath.cubicTo(17.719109f, 2.9581099f, 17.496908f, 3.01981f, 17.363008f, 3.18341f);
        instancePath.lineTo(6.1130085f, 16.93341f);
        instancePath.cubicTo(5.990709f, 17.08291f, 5.965409f, 17.28961f, 6.0482087f, 17.46411f);
        instancePath.cubicTo(6.1309085f, 17.63871f, 6.3068085f, 17.75001f, 6.5f, 17.75001f);
        instancePath.lineTo(11.0f, 17.75001f);
        instancePath.lineTo(11.0f, 26.0f);
        instancePath.cubicTo(11.0f, 26.21141f, 11.132909f, 26.39991f, 11.331908f, 26.47091f);
        instancePath.cubicTo(11.530909f, 26.54201f, 11.753208f, 26.48021f, 11.887009f, 26.31661f);
        instancePath.lineTo(23.137009f, 12.56661f);
        instancePath.cubicTo(23.259308f, 12.4171095f, 23.284609f, 12.21051f, 23.201809f, 12.03591f);
        instancePath.cubicTo(23.119108f, 11.86131f, 22.943209f, 11.75001f, 22.75001f, 11.75001f);
        instancePath.lineTo(18.25001f, 11.75001f);
        instancePath.lineTo(18.25001f, 3.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-419430401);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.25001f, 3.5f);
        instancePath2.cubicTo(18.25001f, 3.2887099f, 18.11711f, 3.10021f, 17.918108f, 3.02911f);
        instancePath2.cubicTo(17.719109f, 2.9581099f, 17.496908f, 3.01981f, 17.363008f, 3.18341f);
        instancePath2.lineTo(6.1130085f, 16.93341f);
        instancePath2.cubicTo(5.990709f, 17.08291f, 5.965409f, 17.28961f, 6.0482087f, 17.46411f);
        instancePath2.cubicTo(6.1309085f, 17.63871f, 6.3068085f, 17.75001f, 6.5f, 17.75001f);
        instancePath2.lineTo(11.0f, 17.75001f);
        instancePath2.lineTo(11.0f, 26.0f);
        instancePath2.cubicTo(11.0f, 26.21141f, 11.132909f, 26.39991f, 11.331908f, 26.47091f);
        instancePath2.cubicTo(11.530909f, 26.54201f, 11.753208f, 26.48021f, 11.887009f, 26.31661f);
        instancePath2.lineTo(23.137009f, 12.56661f);
        instancePath2.cubicTo(23.259308f, 12.4171095f, 23.284609f, 12.21051f, 23.201809f, 12.03591f);
        instancePath2.cubicTo(23.119108f, 11.86131f, 22.943209f, 11.75001f, 22.75001f, 11.75001f);
        instancePath2.lineTo(18.25001f, 11.75001f);
        instancePath2.lineTo(18.25001f, 3.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
