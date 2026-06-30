package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class photo_edit_mark_sub extends l95.c {
    private final int width = 30;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 30;
        }
        if (i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-1);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(26.0f, 0.0f);
            instancePath.lineTo(26.0f, 20.0f);
            instancePath.lineTo(0.0f, 20.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(24.0f, 2.0f);
            instancePath.lineTo(2.0f, 2.0f);
            instancePath.lineTo(2.0f, 17.0f);
            instancePath.lineTo(24.0f, 17.0f);
            instancePath.lineTo(24.0f, 2.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(28.0f, 23.0f);
            instancePath2.lineTo(29.0f, 23.0f);
            instancePath2.lineTo(29.0f, 3.0f);
            instancePath2.lineTo(27.0f, 3.0f);
            instancePath2.lineTo(27.0f, 21.0f);
            instancePath2.lineTo(3.0f, 21.0f);
            instancePath2.lineTo(3.0f, 23.0f);
            instancePath2.lineTo(28.0f, 23.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(19.784946f, 8.898396f);
            instancePath3.lineTo(15.462585f, 11.916007f);
            instancePath3.lineTo(8.518518f, 6.5454545f);
            instancePath3.lineTo(0.0f, 13.368984f);
            instancePath3.lineTo(0.0f, 18.545454f);
            instancePath3.lineTo(25.555555f, 18.545454f);
            instancePath3.lineTo(25.555555f, 13.368984f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
