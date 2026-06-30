package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mmfooter_listtotext_arrow1_normal extends l95.c {
    private final int width = 40;
    private final int height = 56;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 40;
        }
        if (i17 == 1) {
            return 56;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-7105645);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(1.0f, 0.0f);
            instancePath.cubicTo(4.17f, 3.36f, 8.43f, 5.76f, 12.0f, 9.0f);
            instancePath.cubicTo(21.51f, 15.04f, 30.72f, 21.47f, 40.0f, 28.0f);
            instancePath.lineTo(40.0f, 27.0f);
            instancePath.lineTo(40.0f, 28.0f);
            instancePath.cubicTo(26.72f, 37.37f, 13.33f, 46.61f, 0.0f, 56.0f);
            instancePath.lineTo(0.0f, 56.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
