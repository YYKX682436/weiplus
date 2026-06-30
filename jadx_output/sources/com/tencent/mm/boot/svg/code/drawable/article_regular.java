package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class article_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.00561f, 6.13287f);
        instancePath.lineTo(15.0048f, 6.13287f);
        instancePath.lineTo(15.0048f, 7.33287f);
        instancePath.lineTo(7.00561f, 7.33287f);
        instancePath.lineTo(7.00561f, 6.13287f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.0048f, 9.64184f);
        instancePath2.lineTo(7.00561f, 9.64184f);
        instancePath2.lineTo(7.00561f, 10.8418f);
        instancePath2.lineTo(15.0048f, 10.8418f);
        instancePath2.lineTo(15.0048f, 9.64184f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(4.99975f, 2.0f);
        instancePath3.lineTo(18.999f, 2.0f);
        instancePath3.cubicTo(19.5513f, 2.0f, 19.999f, 2.44772f, 19.999f, 3.0f);
        instancePath3.lineTo(19.9983f, 20.9237f);
        instancePath3.cubicTo(19.9983f, 21.476f, 19.5505f, 21.9237f, 18.9983f, 21.9237f);
        instancePath3.lineTo(4.99902f, 21.9237f);
        instancePath3.cubicTo(4.44674f, 21.9237f, 3.99902f, 21.476f, 3.99902f, 20.9237f);
        instancePath3.lineTo(3.99975f, 3.0f);
        instancePath3.cubicTo(3.99975f, 2.44772f, 4.44746f, 2.0f, 4.99975f, 2.0f);
        instancePath3.close();
        instancePath3.moveTo(5.19902f, 20.7237f);
        instancePath3.lineTo(5.19975f, 3.2f);
        instancePath3.lineTo(18.799f, 3.2f);
        instancePath3.cubicTo(18.799f, 22.4747f, 18.7994f, 6.37997f, 18.7983f, 20.7237f);
        instancePath3.lineTo(5.19902f, 20.7237f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(10.9756f, 13.1414f);
        instancePath4.lineTo(7.00561f, 13.1414f);
        instancePath4.lineTo(7.00561f, 14.3414f);
        instancePath4.lineTo(10.9756f, 14.3414f);
        instancePath4.lineTo(10.9756f, 13.1414f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
