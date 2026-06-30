package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class count_down_4 extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(45.344f, 14.0f);
            instancePath.lineTo(52.544f, 14.0f);
            instancePath.lineTo(52.544f, 47.984f);
            instancePath.lineTo(60.32f, 47.984f);
            instancePath.lineTo(60.32f, 54.248f);
            instancePath.lineTo(52.544f, 54.248f);
            instancePath.lineTo(52.544f, 65.408f);
            instancePath.lineTo(45.056f, 65.408f);
            instancePath.lineTo(45.056f, 54.248f);
            instancePath.lineTo(20.0f, 54.248f);
            instancePath.lineTo(20.0f, 46.832f);
            instancePath.lineTo(45.344f, 14.0f);
            instancePath.close();
            instancePath.moveTo(44.84f, 23.936f);
            instancePath.lineTo(26.408f, 47.984f);
            instancePath.lineTo(45.056f, 47.984f);
            instancePath.lineTo(45.056f, 23.936f);
            instancePath.lineTo(44.84f, 23.936f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
