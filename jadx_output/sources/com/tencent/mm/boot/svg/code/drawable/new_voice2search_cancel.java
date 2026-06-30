package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class new_voice2search_cancel extends l95.c {
    private final int width = 27;
    private final int height = 27;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 27;
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
                instancePaint3.setColor(-1);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.65f, 14.9396f);
                instancePath.lineTo(8.10712f, 21.7832f);
                instancePath.lineTo(6.51625f, 20.4946f);
                instancePath.lineTo(12.0589f, 13.6514f);
                instancePath.lineTo(5.21355f, 8.10916f);
                instancePath.lineTo(6.50176f, 6.51805f);
                instancePath.lineTo(13.3474f, 12.0605f);
                instancePath.lineTo(18.8934f, 5.2131f);
                instancePath.lineTo(20.4843f, 6.50161f);
                instancePath.lineTo(14.9385f, 13.3487f);
                instancePath.lineTo(21.7868f, 18.8933f);
                instancePath.lineTo(20.4986f, 20.4844f);
                instancePath.lineTo(13.65f, 14.9396f);
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
