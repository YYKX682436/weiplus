package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class exclamation_mark_circle_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.6592f, 6.43115f);
                instancePath.lineTo(12.5713f, 13.4917f);
                instancePath.lineTo(11.4287f, 13.4917f);
                instancePath.lineTo(11.3408f, 6.43115f);
                instancePath.lineTo(12.6592f, 6.43115f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(11.165f, 16.2383f);
                instancePath2.cubicTo(11.165f, 16.707f, 11.5312f, 17.0732f, 12.0f, 17.0732f);
                instancePath2.cubicTo(12.4761f, 17.0732f, 12.835f, 16.707f, 12.835f, 16.2383f);
                instancePath2.cubicTo(12.835f, 15.7622f, 12.4761f, 15.4033f, 12.0f, 15.4033f);
                instancePath2.cubicTo(11.5312f, 15.4033f, 11.165f, 15.7622f, 11.165f, 16.2383f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(2.0f, 12.0f);
                instancePath3.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath3.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath3.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath3.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath3.close();
                instancePath3.moveTo(20.8f, 12.0f);
                instancePath3.cubicTo(20.8f, 16.8601f, 16.8601f, 20.8f, 12.0f, 20.8f);
                instancePath3.cubicTo(7.13989f, 20.8f, 3.2f, 16.8601f, 3.2f, 12.0f);
                instancePath3.cubicTo(3.2f, 7.13989f, 7.13989f, 3.2f, 12.0f, 3.2f);
                instancePath3.cubicTo(16.8601f, 3.2f, 20.8f, 7.13989f, 20.8f, 12.0f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
