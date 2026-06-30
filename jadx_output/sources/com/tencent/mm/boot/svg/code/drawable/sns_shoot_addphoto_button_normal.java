package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_shoot_addphoto_button_normal extends l95.c {
    private final int width = 186;
    private final int height = 186;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 186;
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
                instancePaint3.setColor(-2105120);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(186.0f, 0.0f);
                instancePath.lineTo(186.0f, 186.0f);
                instancePath.lineTo(0.0f, 186.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(3.0f, 3.0f);
                instancePath.lineTo(3.0f, 183.0f);
                instancePath.lineTo(183.0f, 183.0f);
                instancePath.lineTo(183.0f, 3.0f);
                instancePath.lineTo(3.0f, 3.0f);
                instancePath.lineTo(3.0f, 3.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(90.0f, 33.0f);
                instancePath2.lineTo(96.0f, 33.0f);
                instancePath2.lineTo(96.0f, 90.0f);
                instancePath2.lineTo(153.0f, 90.0f);
                instancePath2.lineTo(153.0f, 96.0f);
                instancePath2.lineTo(96.0f, 96.0f);
                instancePath2.lineTo(96.0f, 153.0f);
                instancePath2.lineTo(90.0f, 153.0f);
                instancePath2.lineTo(90.0f, 96.0f);
                instancePath2.lineTo(33.0f, 96.0f);
                instancePath2.lineTo(33.0f, 90.0f);
                instancePath2.lineTo(90.0f, 90.0f);
                instancePath2.lineTo(90.0f, 33.0f);
                instancePath2.lineTo(90.0f, 33.0f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
