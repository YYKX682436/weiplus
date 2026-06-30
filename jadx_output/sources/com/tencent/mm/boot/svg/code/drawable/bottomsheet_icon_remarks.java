package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_remarks extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePaint3.setColor(-8683387);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(69.0f, 12.0f);
                instancePath.lineTo(60.0f, 21.0f);
                instancePath.lineTo(69.0f, 29.0f);
                instancePath.lineTo(77.0f, 21.0f);
                instancePath.lineTo(69.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(20.0f, 60.0f);
                instancePath.lineTo(20.0f, 60.0f);
                instancePath.lineTo(20.0f, 60.0f);
                instancePath.lineTo(20.0f, 69.0f);
                instancePath.lineTo(29.0f, 69.0f);
                instancePath.lineTo(63.0f, 34.0f);
                instancePath.lineTo(55.0f, 26.0f);
                instancePath.lineTo(20.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 85.0f);
                instancePath.lineTo(85.0f, 85.0f);
                instancePath.lineTo(85.0f, 77.0f);
                instancePath.lineTo(12.0f, 77.0f);
                instancePath.lineTo(12.0f, 85.0f);
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
