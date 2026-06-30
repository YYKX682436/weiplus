package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_video_definition extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(60.0f, 12.0f);
            instancePath.cubicTo(61.65625f, 12.0f, 63.0f, 13.34375f, 63.0f, 15.0f);
            instancePath.lineTo(63.0f, 57.0f);
            instancePath.cubicTo(63.0f, 58.65625f, 61.65625f, 60.0f, 60.0f, 60.0f);
            instancePath.lineTo(12.0f, 60.0f);
            instancePath.cubicTo(10.34375f, 60.0f, 9.0f, 58.65625f, 9.0f, 57.0f);
            instancePath.lineTo(9.0f, 15.0f);
            instancePath.cubicTo(9.0f, 13.34375f, 10.34375f, 12.0f, 12.0f, 12.0f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 15.601562f);
            instancePath.lineTo(12.601562f, 15.601562f);
            instancePath.lineTo(12.601562f, 56.398438f);
            instancePath.lineTo(12.613281f, 56.398438f);
            instancePath.lineTo(59.398438f, 15.703125f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 20.476562f);
            instancePath.lineTo(18.097656f, 56.398438f);
            instancePath.lineTo(28.613281f, 56.398438f);
            instancePath.lineTo(59.398438f, 28.660156f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 33.507812f);
            instancePath.lineTo(33.98828f, 56.398438f);
            instancePath.lineTo(42.535156f, 56.398438f);
            instancePath.lineTo(59.398438f, 41.42578f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 46.23828f);
            instancePath.lineTo(47.95703f, 56.398438f);
            instancePath.lineTo(59.398438f, 56.398438f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 46.23828f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
