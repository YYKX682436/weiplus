package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class beauty_regular extends l95.c {
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
            instancePath.moveTo(12.0f, 2.0f);
            instancePath.cubicTo(14.0241f, 2.0f, 15.9078f, 2.6014f, 17.4821f, 3.63525f);
            instancePath.cubicTo(17.3527f, 3.87446f, 17.224f, 4.08412f, 17.0991f, 4.25024f);
            instancePath.cubicTo(16.9504f, 4.44806f, 16.7617f, 4.6382f, 16.5489f, 4.81835f);
            instancePath.cubicTo(15.2336f, 3.98348f, 13.6732f, 3.5f, 12.0f, 3.5f);
            instancePath.cubicTo(7.30558f, 3.5f, 3.5f, 7.30558f, 3.5f, 12.0f);
            instancePath.cubicTo(3.5f, 16.6944f, 7.30558f, 20.5f, 12.0f, 20.5f);
            instancePath.cubicTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f);
            instancePath.cubicTo(20.5f, 11.547f, 20.4646f, 11.1022f, 20.3963f, 10.6683f);
            instancePath.cubicTo(20.5174f, 10.4721f, 20.6454f, 10.292f, 20.7773f, 10.1257f);
            instancePath.cubicTo(20.9972f, 9.84872f, 21.2888f, 9.55464f, 21.6195f, 9.25848f);
            instancePath.cubicTo(21.8673f, 10.1297f, 22.0f, 11.0493f, 22.0f, 12.0f);
            instancePath.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
            instancePath.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
            instancePath.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(20.8248f, 5.24219f);
            instancePath2.cubicTo(20.2609f, 4.62539f, 19.6248f, 3.05469f, 19.6248f, 3.05469f);
            instancePath2.cubicTo(19.6248f, 3.05469f, 18.9538f, 4.66355f, 18.4248f, 5.24219f);
            instancePath2.cubicTo(17.8958f, 5.82082f, 16.4248f, 6.55469f, 16.4248f, 6.55469f);
            instancePath2.cubicTo(16.4248f, 6.55469f, 17.9047f, 7.29835f, 18.4248f, 7.86719f);
            instancePath2.cubicTo(18.9449f, 8.43603f, 19.6248f, 10.0547f, 19.6248f, 10.0547f);
            instancePath2.cubicTo(19.6248f, 10.0547f, 20.296f, 8.44554f, 20.8248f, 7.86719f);
            instancePath2.cubicTo(21.3536f, 7.28884f, 22.8248f, 6.55469f, 22.8248f, 6.55469f);
            instancePath2.cubicTo(22.8248f, 6.55469f, 21.3887f, 5.85899f, 20.8248f, 5.24219f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(17.0f, 10.2305f);
            instancePath3.cubicTo(17.0f, 9.40204f, 16.3284f, 8.73047f, 15.5f, 8.73047f);
            instancePath3.cubicTo(14.6716f, 8.73047f, 14.0f, 9.40204f, 14.0f, 10.2305f);
            instancePath3.cubicTo(14.0f, 11.0589f, 14.6716f, 11.7305f, 15.5f, 11.7305f);
            instancePath3.cubicTo(16.3284f, 11.7305f, 17.0f, 11.0589f, 17.0f, 10.2305f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-16777216);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(10.0f, 10.2305f);
            instancePath4.cubicTo(10.0f, 9.40204f, 9.32843f, 8.73047f, 8.5f, 8.73047f);
            instancePath4.cubicTo(7.67157f, 8.73047f, 7.0f, 9.40204f, 7.0f, 10.2305f);
            instancePath4.cubicTo(7.0f, 11.0589f, 7.67157f, 11.7305f, 8.5f, 11.7305f);
            instancePath4.cubicTo(9.32843f, 11.7305f, 10.0f, 11.0589f, 10.0f, 10.2305f);
            instancePath4.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
            canvas.drawPath(instancePath4, instancePaint6);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
            instancePaint7.setColor(-16777216);
            android.graphics.Path instancePath5 = l95.c.instancePath(looper);
            instancePath5.moveTo(11.9997f, 16.6522f);
            instancePath5.cubicTo(10.4917f, 16.6522f, 9.24392f, 15.5383f, 9.03418f, 14.0884f);
            instancePath5.lineTo(14.9653f, 14.0884f);
            instancePath5.cubicTo(14.7555f, 15.5383f, 13.5077f, 16.6522f, 11.9997f, 16.6522f);
            instancePath5.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
            canvas.drawPath(instancePath5, instancePaint7);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
