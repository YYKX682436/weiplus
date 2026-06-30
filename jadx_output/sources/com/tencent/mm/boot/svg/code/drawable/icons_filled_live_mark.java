package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_live_mark extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(63.0f, 12.0f);
                instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
                instancePath.lineTo(66.0f, 57.0f);
                instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
                instancePath.lineTo(9.0f, 60.0f);
                instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
                instancePath.lineTo(6.0f, 15.0f);
                instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
                instancePath.lineTo(63.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(17.736328f, 28.089844f);
                instancePath.lineTo(14.197266f, 28.089844f);
                instancePath.lineTo(14.197266f, 45.0f);
                instancePath.lineTo(25.13086f, 45.0f);
                instancePath.lineTo(25.13086f, 42.070312f);
                instancePath.lineTo(17.736328f, 42.070312f);
                instancePath.lineTo(17.736328f, 28.089844f);
                instancePath.close();
                instancePath.moveTo(30.767578f, 28.089844f);
                instancePath.lineTo(27.228516f, 28.089844f);
                instancePath.lineTo(27.228516f, 45.0f);
                instancePath.lineTo(30.767578f, 45.0f);
                instancePath.lineTo(30.767578f, 28.089844f);
                instancePath.close();
                instancePath.moveTo(36.46289f, 28.089844f);
                instancePath.lineTo(32.501953f, 28.089844f);
                instancePath.lineTo(38.185547f, 45.0f);
                instancePath.lineTo(42.45117f, 45.0f);
                instancePath.lineTo(48.134766f, 28.089844f);
                instancePath.lineTo(44.279297f, 28.089844f);
                instancePath.lineTo(40.41211f, 41.35547f);
                instancePath.lineTo(40.33008f, 41.35547f);
                instancePath.lineTo(36.46289f, 28.089844f);
                instancePath.close();
                instancePath.moveTo(61.060547f, 28.089844f);
                instancePath.lineTo(49.85742f, 28.089844f);
                instancePath.lineTo(49.85742f, 45.0f);
                instancePath.lineTo(61.060547f, 45.0f);
                instancePath.lineTo(61.060547f, 42.070312f);
                instancePath.lineTo(53.396484f, 42.070312f);
                instancePath.lineTo(53.396484f, 37.804688f);
                instancePath.lineTo(60.626953f, 37.804688f);
                instancePath.lineTo(60.626953f, 35.085938f);
                instancePath.lineTo(53.396484f, 35.085938f);
                instancePath.lineTo(53.396484f, 31.007812f);
                instancePath.lineTo(61.060547f, 31.007812f);
                instancePath.lineTo(61.060547f, 28.089844f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
