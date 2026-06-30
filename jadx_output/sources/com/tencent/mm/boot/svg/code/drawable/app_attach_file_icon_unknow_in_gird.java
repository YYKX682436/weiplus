package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_attach_file_icon_unknow_in_gird extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 80;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePath.moveTo(61.0f, 33.0f);
                instancePath.lineTo(61.0f, 64.0f);
                instancePath.lineTo(19.0f, 64.0f);
                instancePath.lineTo(19.0f, 17.0f);
                instancePath.lineTo(47.0f, 17.0f);
                instancePath.lineTo(47.0f, 33.0f);
                instancePath.lineTo(49.0f, 33.0f);
                instancePath.lineTo(61.0f, 33.0f);
                instancePath.close();
                instancePath.moveTo(60.989494f, 29.0f);
                instancePath.lineTo(51.0f, 18.140165f);
                instancePath.lineTo(51.0f, 29.0f);
                instancePath.lineTo(60.989494f, 29.0f);
                instancePath.close();
                instancePath.moveTo(63.0f, 68.0f);
                instancePath.lineTo(15.0f, 68.0f);
                instancePath.lineTo(15.0f, 66.0f);
                instancePath.lineTo(15.0f, 15.0f);
                instancePath.lineTo(15.0f, 13.0f);
                instancePath.lineTo(51.0f, 13.0f);
                instancePath.lineTo(51.0f, 13.028122f);
                instancePath.lineTo(65.04203f, 28.0f);
                instancePath.lineTo(65.0f, 28.010773f);
                instancePath.lineTo(65.0f, 68.0f);
                instancePath.lineTo(63.0f, 68.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
