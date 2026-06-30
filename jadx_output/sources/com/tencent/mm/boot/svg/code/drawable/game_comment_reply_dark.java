package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_reply_dark extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePaint3.setColor(-419430401);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.05606f, 9.65621f);
                instancePath.lineTo(4.31261f, 9.7305f);
                instancePath.cubicTo(4.85003f, 9.88613f, 5.41801f, 9.96664f, 6.00005f, 9.96664f);
                instancePath.cubicTo(8.85805f, 9.96664f, 11.1334f, 8.0326f, 11.1334f, 5.7083f);
                instancePath.cubicTo(11.1334f, 3.384f, 8.85805f, 1.44997f, 6.00005f, 1.44997f);
                instancePath.cubicTo(3.14205f, 1.44997f, 0.866717f, 3.384f, 0.866717f, 5.7083f);
                instancePath.cubicTo(0.866717f, 6.91926f, 1.48326f, 8.05686f, 2.55873f, 8.86493f);
                instancePath.lineTo(2.87995f, 9.10629f);
                instancePath.lineTo(2.74283f, 10.2859f);
                instancePath.lineTo(4.05606f, 9.65621f);
                instancePath.close();
                instancePath.moveTo(6.00008f, 10.6667f);
                instancePath.cubicTo(5.34151f, 10.6667f, 4.70842f, 10.5739f, 4.11793f, 10.4029f);
                instancePath.lineTo(2.37787f, 11.2373f);
                instancePath.cubicTo(2.3282f, 11.2611f, 2.2728f, 11.2704f, 2.21809f, 11.264f);
                instancePath.cubicTo(2.05808f, 11.2454f, 1.94345f, 11.1006f, 1.96205f, 10.9406f);
                instancePath.lineTo(2.13827f, 9.42459f);
                instancePath.cubicTo(0.929164f, 8.51611f, 0.166748f, 7.1879f, 0.166748f, 5.70833f);
                instancePath.cubicTo(0.166748f, 2.96992f, 2.77842f, 0.75f, 6.00008f, 0.75f);
                instancePath.cubicTo(9.22174f, 0.75f, 11.8334f, 2.96992f, 11.8334f, 5.70833f);
                instancePath.cubicTo(11.8334f, 8.44674f, 9.22174f, 10.6667f, 6.00008f, 10.6667f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
