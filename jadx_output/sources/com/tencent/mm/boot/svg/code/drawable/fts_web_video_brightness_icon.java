package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fts_web_video_brightness_icon extends l95.c {
    private final int width = 144;
    private final int height = 144;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 144;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2565928);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(144.0f, 0.0f);
            instancePath.lineTo(144.0f, 144.0f);
            instancePath.lineTo(0.0f, 144.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(72.0f, 102.0f);
            instancePath2.cubicTo(55.431458f, 102.0f, 42.0f, 88.56854f, 42.0f, 72.0f);
            instancePath2.cubicTo(42.0f, 55.431458f, 55.431458f, 42.0f, 72.0f, 42.0f);
            instancePath2.cubicTo(88.56854f, 42.0f, 102.0f, 55.431458f, 102.0f, 72.0f);
            instancePath2.cubicTo(102.0f, 88.56854f, 88.56854f, 102.0f, 72.0f, 102.0f);
            instancePath2.close();
            instancePath2.moveTo(72.0f, 96.0f);
            instancePath2.cubicTo(85.25484f, 96.0f, 96.0f, 85.25484f, 96.0f, 72.0f);
            instancePath2.cubicTo(96.0f, 58.745167f, 85.25484f, 48.0f, 72.0f, 48.0f);
            instancePath2.cubicTo(72.0f, 64.35864f, 72.0f, 82.30664f, 72.0f, 96.0f);
            instancePath2.close();
            instancePath2.moveTo(3.0f, 69.0f);
            instancePath2.lineTo(30.0f, 69.0f);
            instancePath2.lineTo(30.0f, 75.0f);
            instancePath2.lineTo(3.0f, 75.0f);
            instancePath2.lineTo(3.0f, 69.0f);
            instancePath2.close();
            instancePath2.moveTo(69.0f, 3.0f);
            instancePath2.lineTo(75.0f, 3.0f);
            instancePath2.lineTo(75.0f, 30.0f);
            instancePath2.lineTo(69.0f, 30.0f);
            instancePath2.lineTo(69.0f, 3.0f);
            instancePath2.close();
            instancePath2.moveTo(69.0f, 114.0f);
            instancePath2.lineTo(75.0f, 114.0f);
            instancePath2.lineTo(75.0f, 141.0f);
            instancePath2.lineTo(69.0f, 141.0f);
            instancePath2.lineTo(69.0f, 114.0f);
            instancePath2.close();
            instancePath2.moveTo(114.0f, 69.0f);
            instancePath2.lineTo(141.0f, 69.0f);
            instancePath2.lineTo(141.0f, 75.0f);
            instancePath2.lineTo(114.0f, 75.0f);
            instancePath2.lineTo(114.0f, 69.0f);
            instancePath2.close();
            instancePath2.moveTo(25.330952f, 21.088312f);
            instancePath2.lineTo(44.422836f, 40.180195f);
            instancePath2.lineTo(40.180195f, 44.422836f);
            instancePath2.lineTo(21.088312f, 25.330952f);
            instancePath2.lineTo(25.330952f, 21.088312f);
            instancePath2.close();
            instancePath2.moveTo(118.669044f, 21.088312f);
            instancePath2.lineTo(122.91169f, 25.330952f);
            instancePath2.lineTo(103.8198f, 44.422836f);
            instancePath2.lineTo(99.57716f, 40.180195f);
            instancePath2.lineTo(118.669044f, 21.088312f);
            instancePath2.close();
            instancePath2.moveTo(40.180195f, 99.57716f);
            instancePath2.lineTo(44.422836f, 103.8198f);
            instancePath2.lineTo(25.330952f, 122.91169f);
            instancePath2.lineTo(21.088312f, 118.669044f);
            instancePath2.lineTo(40.180195f, 99.57716f);
            instancePath2.close();
            instancePath2.moveTo(103.8198f, 99.57716f);
            instancePath2.lineTo(122.91169f, 118.669044f);
            instancePath2.lineTo(118.669044f, 122.91169f);
            instancePath2.lineTo(99.57716f, 103.8198f);
            instancePath2.lineTo(103.8198f, 99.57716f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
