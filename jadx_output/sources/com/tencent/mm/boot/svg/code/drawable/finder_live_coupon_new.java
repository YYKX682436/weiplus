package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_coupon_new extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.999f, 4.0f);
                instancePath.cubicTo(21.5513f, 4.0f, 21.999f, 4.44772f, 21.999f, 5.0f);
                instancePath.lineTo(21.999f, 9.44762f);
                instancePath.cubicTo(20.8945f, 9.44762f, 19.9991f, 10.4027f, 19.9991f, 11.581f);
                instancePath.cubicTo(19.9991f, 12.7592f, 20.8945f, 13.7143f, 21.999f, 13.7143f);
                instancePath.lineTo(21.999f, 19.0f);
                instancePath.cubicTo(21.999f, 19.5523f, 21.5513f, 20.0f, 20.999f, 20.0f);
                instancePath.lineTo(3.0f, 20.0f);
                instancePath.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
                instancePath.lineTo(2.0f, 14.0f);
                instancePath.cubicTo(3.10457f, 14.0f, 4.0f, 13.1046f, 4.0f, 12.0f);
                instancePath.cubicTo(4.0f, 10.8954f, 3.10457f, 10.0f, 2.0f, 10.0f);
                instancePath.lineTo(2.0f, 5.0f);
                instancePath.cubicTo(2.0f, 4.44772f, 2.44772f, 4.0f, 3.0f, 4.0f);
                instancePath.lineTo(20.999f, 4.0f);
                instancePath.close();
                instancePath.moveTo(20.799f, 5.199f);
                instancePath.lineTo(3.2f, 5.199f);
                instancePath.lineTo(3.2f, 9.032f);
                instancePath.cubicTo(4.32231f, 9.4895f, 5.12433f, 10.5563f, 5.19493f, 11.8184f);
                instancePath.lineTo(5.2f, 12.0f);
                instancePath.cubicTo(5.2f, 13.2737f, 4.45587f, 14.3736f, 3.37864f, 14.8886f);
                instancePath.lineTo(3.2f, 14.967f);
                instancePath.lineTo(3.2f, 18.799f);
                instancePath.lineTo(20.799f, 18.799f);
                instancePath.lineTo(20.799f, 14.673f);
                instancePath.lineTo(20.7858f, 14.6673f);
                instancePath.cubicTo(19.6666f, 14.1901f, 18.8739f, 13.0727f, 18.8041f, 11.7685f);
                instancePath.lineTo(18.7991f, 11.581f);
                instancePath.cubicTo(18.7991f, 10.2662f, 19.5339f, 9.11521f, 20.6126f, 8.57479f);
                instancePath.lineTo(20.799f, 8.488f);
                instancePath.lineTo(20.799f, 5.199f);
                instancePath.close();
                instancePath.moveTo(12.9705f, 12.9344f);
                instancePath.lineTo(12.9705f, 14.1344f);
                instancePath.lineTo(7.4f, 14.1344f);
                instancePath.lineTo(7.4f, 12.9344f);
                instancePath.lineTo(12.9705f, 12.9344f);
                instancePath.close();
                instancePath.moveTo(15.6658f, 9.40039f);
                instancePath.lineTo(15.6658f, 10.6004f);
                instancePath.lineTo(7.3999f, 10.6004f);
                instancePath.lineTo(7.3999f, 9.40039f);
                instancePath.lineTo(15.6658f, 9.40039f);
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
