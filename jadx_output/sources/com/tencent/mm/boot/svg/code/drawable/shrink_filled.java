package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class shrink_filled extends l95.c {
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
            instancePath.moveTo(10.6001f, 16.1f);
            instancePath.lineTo(10.6001f, 22.4f);
            instancePath.lineTo(8.4001f, 22.4f);
            instancePath.lineTo(8.4001f, 16.1f);
            instancePath.cubicTo(8.4001f, 15.8612f, 8.39943f, 15.7126f, 8.39453f, 15.6056f);
            instancePath.cubicTo(8.28752f, 15.6007f, 8.13896f, 15.6f, 7.9001f, 15.6f);
            instancePath.lineTo(1.6001f, 15.6f);
            instancePath.lineTo(1.6001f, 13.4f);
            instancePath.lineTo(7.9001f, 13.4f);
            instancePath.cubicTo(8.16197f, 13.4f, 8.42455f, 13.3991f, 8.64648f, 13.4173f);
            instancePath.cubicTo(8.88126f, 13.4364f, 9.16565f, 13.4822f, 9.45352f, 13.6289f);
            instancePath.cubicTo(9.84863f, 13.8302f, 10.1699f, 14.1514f, 10.3712f, 14.5466f);
            instancePath.cubicTo(10.5179f, 14.8344f, 10.5636f, 15.1188f, 10.5828f, 15.3536f);
            instancePath.cubicTo(10.6009f, 15.5755f, 10.6001f, 15.8381f, 10.6001f, 16.1f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(13.4001f, 7.89998f);
            instancePath2.lineTo(13.4001f, 1.59998f);
            instancePath2.lineTo(15.6001f, 1.59998f);
            instancePath2.lineTo(15.6001f, 7.89998f);
            instancePath2.cubicTo(15.6001f, 8.13876f, 15.6008f, 8.28731f, 15.6057f, 8.39431f);
            instancePath2.cubicTo(15.7127f, 8.39922f, 15.8612f, 8.39998f, 16.1001f, 8.39998f);
            instancePath2.lineTo(22.4001f, 8.39998f);
            instancePath2.lineTo(22.4001f, 10.6f);
            instancePath2.lineTo(16.1001f, 10.6f);
            instancePath2.cubicTo(15.8382f, 10.6f, 15.5756f, 10.6008f, 15.3537f, 10.5827f);
            instancePath2.cubicTo(15.1189f, 10.5635f, 14.8345f, 10.5177f, 14.5467f, 10.3711f);
            instancePath2.cubicTo(14.1516f, 10.1697f, 13.8303f, 9.8485f, 13.629f, 9.45339f);
            instancePath2.cubicTo(13.4823f, 9.16553f, 13.4366f, 8.88114f, 13.4174f, 8.64636f);
            instancePath2.cubicTo(13.3992f, 8.42443f, 13.4001f, 8.16185f, 13.4001f, 7.89998f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
