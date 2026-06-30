package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class top_medium extends l95.c {
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
                instancePath.moveTo(4.0f, 4.5f);
                instancePath.lineTo(20.0f, 4.5f);
                instancePath.lineTo(20.0f, 3.0f);
                instancePath.lineTo(4.0f, 3.0f);
                instancePath.lineTo(4.0f, 4.5f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(5.91421f, 13.9998f);
                instancePath2.cubicTo(5.0233f, 13.9998f, 4.57713f, 12.9227f, 5.2071f, 12.2927f);
                instancePath2.lineTo(11.2929f, 6.20696f);
                instancePath2.cubicTo(11.6834f, 5.81643f, 12.3166f, 5.81643f, 12.7071f, 6.20696f);
                instancePath2.lineTo(18.7929f, 12.2927f);
                instancePath2.cubicTo(19.4228f, 12.9227f, 18.9767f, 13.9998f, 18.0858f, 13.9998f);
                instancePath2.lineTo(16.0f, 13.9998f);
                instancePath2.lineTo(16.0f, 20.9998f);
                instancePath2.cubicTo(16.0f, 21.5521f, 15.5523f, 21.9998f, 15.0f, 21.9998f);
                instancePath2.lineTo(8.99999f, 21.9998f);
                instancePath2.cubicTo(8.44771f, 21.9998f, 7.99999f, 21.5521f, 7.99999f, 20.9998f);
                instancePath2.lineTo(7.99999f, 13.9998f);
                instancePath2.lineTo(5.91421f, 13.9998f);
                instancePath2.close();
                instancePath2.moveTo(9.49999f, 12.4998f);
                instancePath2.lineTo(7.12131f, 12.4998f);
                instancePath2.lineTo(12.0f, 7.62117f);
                instancePath2.lineTo(16.8787f, 12.4998f);
                instancePath2.lineTo(14.5f, 12.4998f);
                instancePath2.lineTo(14.5f, 20.4998f);
                instancePath2.lineTo(9.49999f, 20.4998f);
                instancePath2.lineTo(9.49999f, 12.4998f);
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
