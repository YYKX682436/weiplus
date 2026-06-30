package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class safe_line extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 48;
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
                instancePaint3.setColor(1275068416);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(40.0f, 18.72917f);
                instancePath.cubicTo(40.0f, 18.72917f, 40.0f, 18.72917f, 40.0f, 18.72917f);
                instancePath.lineTo(40.0f, 22.507578f);
                instancePath.cubicTo(40.0f, 32.200287f, 33.40331f, 40.649174f, 24.0f, 43.0f);
                instancePath.cubicTo(14.59669f, 40.649174f, 8.0f, 32.200287f, 8.0f, 22.507578f);
                instancePath.lineTo(8.0f, 11.0f);
                instancePath.lineTo(24.0f, 5.0f);
                instancePath.lineTo(40.0f, 11.0f);
                instancePath.lineTo(40.0f, 18.729168f);
                instancePath.close();
                instancePath.moveTo(37.6f, 18.514235f);
                instancePath.lineTo(37.6f, 12.873863f);
                instancePath.lineTo(24.0f, 7.4738636f);
                instancePath.lineTo(10.4f, 12.873863f);
                instancePath.lineTo(10.4f, 22.507578f);
                instancePath.cubicTo(10.4f, 30.897581f, 15.976219f, 38.23617f, 24.0f, 40.516243f);
                instancePath.cubicTo(32.02378f, 38.23617f, 37.6f, 30.897581f, 37.6f, 22.507578f);
                instancePath.lineTo(37.6f, 20.653854f);
                instancePath.lineTo(20.657824f, 29.824987f);
                instancePath.lineTo(20.538334f, 29.88998f);
                instancePath.cubicTo(20.390781f, 29.95922f, 20.224674f, 30.0f, 20.048609f, 30.0f);
                instancePath.cubicTo(19.6399f, 30.0f, 19.2846f, 29.78888f, 19.098124f, 29.477085f);
                instancePath.lineTo(19.027065f, 29.330957f);
                instancePath.lineTo(16.05205f, 23.204657f);
                instancePath.cubicTo(16.019915f, 23.137966f, 16.0f, 23.062353f, 16.0f, 22.988865f);
                instancePath.cubicTo(16.0f, 22.706804f, 16.243958f, 22.47827f, 16.54449f, 22.47827f);
                instancePath.cubicTo(16.667603f, 22.47827f, 16.779396f, 22.516075f, 16.870825f, 22.579794f);
                instancePath.lineTo(20.380825f, 24.92505f);
                instancePath.cubicTo(20.63655f, 25.082222f, 20.943872f, 25.174828f, 21.273375f, 25.174828f);
                instancePath.cubicTo(21.469355f, 25.174828f, 21.657188f, 25.140844f, 21.831444f, 25.080948f);
                instancePath.cubicTo(21.831444f, 25.080948f, 33.20402f, 20.342318f, 37.6f, 18.514235f);
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
