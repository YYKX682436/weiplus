package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voiceinput_cancel_pressed extends l95.c {
    private final int width = 120;
    private final int height = 70;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 120;
        }
        if (i17 == 1) {
            return 70;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.saveLayerAlpha(null, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, 31);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-9473160);
            instancePaint4.setStrokeWidth(5.0f);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(24.0f, 17.0f);
            instancePath.lineTo(60.0f, 53.0f);
            instancePath.lineTo(96.0f, 17.0f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
