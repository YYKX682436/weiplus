package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_live_checkbox extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-40634);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.0f, 8.098765f);
                instancePath.cubicTo(16.0f, 3.5816295f, 12.41837f, 0.0f, 7.9012346f, 0.0f);
                instancePath.cubicTo(3.5816295f, 0.0f, 0.0f, 3.5816295f, 0.0f, 8.098765f);
                instancePath.cubicTo(0.0f, 12.41837f, 3.5816295f, 16.0f, 7.9012346f, 16.0f);
                instancePath.cubicTo(12.41837f, 16.0f, 16.0f, 12.41837f, 16.0f, 8.098765f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(6.9093075f, 10.209139f);
                instancePath2.lineTo(4.7071066f, 8.006938f);
                instancePath2.lineTo(4.0f, 8.714046f);
                instancePath2.lineTo(6.437903f, 11.151948f);
                instancePath2.cubicTo(6.698252f, 11.412297f, 7.1203623f, 11.412297f, 7.380712f, 11.151948f);
                instancePath2.lineTo(12.49222f, 6.04044f);
                instancePath2.lineTo(12.49222f, 6.04044f);
                instancePath2.lineTo(11.785113f, 5.3333335f);
                instancePath2.lineTo(6.9093075f, 10.209139f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
