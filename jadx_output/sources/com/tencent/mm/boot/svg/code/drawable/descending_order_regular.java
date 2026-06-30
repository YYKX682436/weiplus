package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class descending_order_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.5f, 5.5f);
            instancePath.lineTo(19.5f, 5.5f);
            instancePath.lineTo(19.5f, 6.7f);
            instancePath.lineTo(4.5f, 6.7f);
            instancePath.lineTo(4.5f, 5.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(13.5f, 11.0f);
            instancePath2.lineTo(4.5f, 11.0f);
            instancePath2.lineTo(4.5f, 12.2f);
            instancePath2.lineTo(13.5f, 12.2f);
            instancePath2.lineTo(13.5f, 11.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(13.5f, 16.5f);
            instancePath3.lineTo(4.5f, 16.5f);
            instancePath3.lineTo(4.5f, 17.7f);
            instancePath3.lineTo(13.5f, 17.7f);
            instancePath3.lineTo(13.5f, 16.5f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-16777216);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(20.4353f, 15.7641f);
            instancePath4.lineTo(19.5868f, 14.9155f);
            instancePath4.lineTo(17.4998f, 17.0025f);
            instancePath4.lineTo(17.4998f, 8.38538f);
            instancePath4.lineTo(16.2998f, 8.38538f);
            instancePath4.lineTo(16.2998f, 18.144f);
            instancePath4.cubicTo(16.2998f, 18.5514f, 16.4445f, 18.7521f, 16.7369f, 18.856f);
            instancePath4.cubicTo(17.0293f, 18.96f, 17.3499f, 18.8495f, 17.6069f, 18.5925f);
            instancePath4.lineTo(20.4353f, 15.7641f);
            instancePath4.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
            canvas.drawPath(instancePath4, instancePaint6);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
