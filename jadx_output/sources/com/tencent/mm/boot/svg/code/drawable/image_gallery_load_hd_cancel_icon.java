package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class image_gallery_load_hd_cancel_icon extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.saveLayerAlpha(null, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, 31);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.5f, 0.0f);
        instancePath.lineTo(1.32f, 0.0f);
        instancePath.cubicTo(5.04f, 3.33f, 8.42f, 7.02f, 12.0f, 10.5f);
        instancePath.cubicTo(15.57f, 7.02f, 18.96f, 3.36f, 22.63f, 0.0f);
        instancePath.lineTo(23.38f, 0.0f);
        instancePath.lineTo(23.52f, 0.52f);
        instancePath.lineTo(24.0f, 0.5f);
        instancePath.lineTo(24.0f, 1.32f);
        instancePath.cubicTo(20.67f, 5.04f, 16.98f, 8.42f, 13.5f, 12.0f);
        instancePath.cubicTo(16.99f, 15.56f, 20.63f, 18.96f, 24.0f, 22.63f);
        instancePath.lineTo(24.0f, 23.38f);
        instancePath.lineTo(23.48f, 23.52f);
        instancePath.lineTo(23.5f, 24.0f);
        instancePath.lineTo(22.67f, 24.0f);
        instancePath.cubicTo(18.96f, 20.66f, 15.58f, 16.98f, 12.0f, 13.51f);
        instancePath.cubicTo(8.43f, 16.98f, 5.04f, 20.65f, 1.35f, 24.0f);
        instancePath.lineTo(0.55f, 24.0f);
        instancePath.lineTo(0.56f, 23.47f);
        instancePath.lineTo(0.0f, 23.48f);
        instancePath.lineTo(0.0f, 22.69f);
        instancePath.cubicTo(3.32f, 18.96f, 7.02f, 15.59f, 10.48f, 12.0f);
        instancePath.cubicTo(7.02f, 8.43f, 3.36f, 5.04f, 0.0f, 1.37f);
        instancePath.lineTo(0.0f, 0.62f);
        instancePath.lineTo(0.52f, 0.48f);
        instancePath.lineTo(0.5f, 0.0f);
        instancePath.lineTo(0.5f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
