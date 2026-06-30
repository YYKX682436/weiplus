package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_left_scroll_guide extends l95.c {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2565928);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(27.87868f, 16.80868f);
            instancePath2.lineTo(32.12132f, 21.051321f);
            instancePath2.lineTo(20.164774f, 33.00468f);
            instancePath2.lineTo(63.0f, 33.005226f);
            instancePath2.lineTo(63.0f, 39.005226f);
            instancePath2.lineTo(20.167774f, 39.00468f);
            instancePath2.lineTo(32.12132f, 50.959133f);
            instancePath2.lineTo(27.87868f, 55.20177f);
            instancePath2.lineTo(10.803453f, 38.126545f);
            instancePath2.cubicTo(9.722002f, 37.045094f, 9.638813f, 35.343403f, 10.553888f, 34.166527f);
            instancePath2.lineTo(10.803453f, 33.883907f);
            instancePath2.lineTo(27.87868f, 16.80868f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
