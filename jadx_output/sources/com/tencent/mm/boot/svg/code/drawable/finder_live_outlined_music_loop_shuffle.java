package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_outlined_music_loop_shuffle extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.125f, 13.2998f);
        instancePath.lineTo(21.3068f, 16.4817f);
        instancePath.cubicTo(21.5753f, 16.7502f, 21.5977f, 17.1716f, 21.374f, 17.4655f);
        instancePath.lineTo(21.3068f, 17.5423f);
        instancePath.lineTo(18.1249f, 20.7243f);
        instancePath.lineTo(17.0642f, 19.6637f);
        instancePath.lineTo(18.976f, 17.7498f);
        instancePath.lineTo(16.9155f, 17.7498f);
        instancePath.lineTo(16.6863f, 17.7443f);
        instancePath.cubicTo(15.1068f, 17.6683f, 13.6688f, 16.81f, 12.8516f, 15.459f);
        instancePath.lineTo(13.694f, 13.8569f);
        instancePath.lineTo(14.0392f, 14.5129f);
        instancePath.lineTo(14.1439f, 14.6972f);
        instancePath.cubicTo(14.695f, 15.5974f, 15.6504f, 16.1743f, 16.7036f, 16.2429f);
        instancePath.lineTo(16.9155f, 16.2498f);
        instancePath.lineTo(18.955f, 16.2498f);
        instancePath.lineTo(17.0643f, 14.3605f);
        instancePath.lineTo(18.125f, 13.2998f);
        instancePath.close();
        instancePath.moveTo(18.125f, 3.7998f);
        instancePath.lineTo(21.3068f, 6.98167f);
        instancePath.cubicTo(21.5753f, 7.25016f, 21.5977f, 7.67156f, 21.374f, 7.96553f);
        instancePath.lineTo(21.3068f, 8.04233f);
        instancePath.lineTo(18.1249f, 11.2243f);
        instancePath.lineTo(17.0642f, 10.1637f);
        instancePath.lineTo(18.981f, 8.2448f);
        instancePath.lineTo(16.9155f, 8.24488f);
        instancePath.cubicTo(15.7796f, 8.24488f, 14.7317f, 8.83732f, 14.1439f, 9.79753f);
        instancePath.lineTo(14.0392f, 9.98182f);
        instancePath.lineTo(11.2883f, 15.2112f);
        instancePath.cubicTo(10.5028f, 16.7044f, 8.98768f, 17.6637f, 7.31369f, 17.7443f);
        instancePath.lineTo(7.08449f, 17.7498f);
        instancePath.lineTo(2.5f, 17.7498f);
        instancePath.lineTo(2.5f, 16.2498f);
        instancePath.lineTo(7.08449f, 16.2498f);
        instancePath.cubicTo(8.2204f, 16.2498f, 9.26827f, 15.6574f, 9.85607f, 14.6972f);
        instancePath.lineTo(9.9608f, 14.5129f);
        instancePath.lineTo(12.7117f, 9.28348f);
        instancePath.cubicTo(13.4972f, 7.79024f, 15.0123f, 6.83098f, 16.6863f, 6.75039f);
        instancePath.lineTo(16.9155f, 6.74488f);
        instancePath.lineTo(18.95f, 6.7448f);
        instancePath.lineTo(17.0643f, 4.86046f);
        instancePath.lineTo(18.125f, 3.7998f);
        instancePath.close();
        instancePath.moveTo(7.08449f, 6.74488f);
        instancePath.lineTo(7.31369f, 6.75039f);
        instancePath.cubicTo(8.89315f, 6.82643f, 10.3312f, 7.68471f, 11.1484f, 9.0357f);
        instancePath.lineTo(10.305f, 10.6359f);
        instancePath.lineTo(9.9608f, 9.98182f);
        instancePath.lineTo(9.85607f, 9.79753f);
        instancePath.cubicTo(9.30501f, 8.89733f, 8.34959f, 8.32037f, 7.29635f, 8.25177f);
        instancePath.lineTo(7.08449f, 8.24488f);
        instancePath.lineTo(2.5f, 8.24488f);
        instancePath.lineTo(2.5f, 6.74488f);
        instancePath.lineTo(7.08449f, 6.74488f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
