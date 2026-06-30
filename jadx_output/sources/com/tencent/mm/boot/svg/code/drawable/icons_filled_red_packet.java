package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_red_packet extends l95.c {
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.75f, 7.5f);
        instancePath.lineTo(20.25f, 7.5f);
        instancePath.lineTo(20.25f, 21.0f);
        instancePath.lineTo(3.75f, 21.0f);
        instancePath.lineTo(3.75f, 7.5f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-372399);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.25f, 13.1271f);
        instancePath2.lineTo(18.0466f, 13.1271f);
        instancePath2.cubicTo(18.2028f, 12.8161f, 18.2907f, 12.4645f, 18.2907f, 12.0919f);
        instancePath2.cubicTo(18.2907f, 10.8212f, 17.2681f, 9.79477f, 16.0111f, 9.79477f);
        instancePath2.cubicTo(15.3885f, 9.79477f, 14.804f, 10.0486f, 14.3776f, 10.4897f);
        instancePath2.cubicTo(13.0888f, 11.7835f, 12.5097f, 12.3652f, 12.0f, 12.8768f);
        instancePath2.lineTo(9.57088f, 10.4383f);
        instancePath2.cubicTo(9.14047f, 10.0244f, 8.58168f, 9.79477f, 7.98909f, 9.79477f);
        instancePath2.cubicTo(6.73207f, 9.79477f, 5.70927f, 10.8212f, 5.70927f, 12.0919f);
        instancePath2.cubicTo(5.70927f, 12.4645f, 5.79741f, 12.8161f, 5.95335f, 13.1271f);
        instancePath2.lineTo(3.75f, 13.1271f);
        instancePath2.lineTo(3.75f, 4.4493f);
        instancePath2.cubicTo(3.75f, 3.86786f, 4.15445f, 3.18418f, 4.67179f, 2.92665f);
        instancePath2.cubicTo(4.67179f, 2.92665f, 4.71485f, 2.90268f, 4.85329f, 2.84367f);
        instancePath2.cubicTo(6.78338f, 2.02047f, 9.27287f, 1.49988f, 12.0f, 1.49988f);
        instancePath2.cubicTo(14.7237f, 1.49988f, 17.2172f, 2.00224f, 19.1393f, 2.84039f);
        instancePath2.cubicTo(19.2554f, 2.891f, 19.3222f, 2.92378f, 19.3222f, 2.92378f);
        instancePath2.cubicTo(19.8347f, 3.185f, 20.25f, 3.86806f, 20.25f, 4.4493f);
        instancePath2.lineTo(20.25f, 13.1271f);
        instancePath2.close();
        instancePath2.moveTo(20.25f, 14.3871f);
        instancePath2.lineTo(20.25f, 21.4499f);
        instancePath2.cubicTo(20.25f, 22.0311f, 19.7914f, 22.4999f, 19.2179f, 22.4999f);
        instancePath2.lineTo(4.78206f, 22.4999f);
        instancePath2.cubicTo(4.212f, 22.4999f, 3.75f, 22.0309f, 3.75f, 21.4499f);
        instancePath2.lineTo(3.75f, 14.3871f);
        instancePath2.lineTo(7.8921f, 14.3871f);
        instancePath2.cubicTo(7.9243f, 14.3886f, 7.9567f, 14.3892f, 7.98909f, 14.3892f);
        instancePath2.lineTo(10.4933f, 14.3892f);
        instancePath2.cubicTo(9.62018f, 15.2579f, 8.27724f, 16.3964f, 6.46888f, 17.7988f);
        instancePath2.lineTo(7.21862f, 18.801f);
        instancePath2.cubicTo(9.09982f, 17.3421f, 10.4959f, 16.1561f, 11.4118f, 15.2368f);
        instancePath2.lineTo(12.0f, 14.6463f);
        instancePath2.cubicTo(12.1743f, 14.8213f, 12.37f, 15.0178f, 12.601f, 15.2495f);
        instancePath2.cubicTo(13.514f, 16.1661f, 14.9058f, 17.348f, 16.7816f, 18.8012f);
        instancePath2.lineTo(17.5309f, 17.7986f);
        instancePath2.cubicTo(15.7195f, 16.3949f, 14.3766f, 15.2566f, 13.5067f, 14.3892f);
        instancePath2.lineTo(16.0111f, 14.3892f);
        instancePath2.cubicTo(16.0437f, 14.3892f, 16.0759f, 14.3886f, 16.1081f, 14.3871f);
        instancePath2.lineTo(20.25f, 14.3871f);
        instancePath2.close();
        instancePath2.moveTo(16.0771f, 13.1271f);
        instancePath2.lineTo(13.5132f, 13.1271f);
        instancePath2.lineTo(15.2531f, 11.3803f);
        instancePath2.cubicTo(15.4554f, 11.1711f, 15.723f, 11.0548f, 16.0111f, 11.0548f);
        instancePath2.cubicTo(16.5886f, 11.0548f, 17.053f, 11.5213f, 17.053f, 12.0919f);
        instancePath2.cubicTo(17.053f, 12.6409f, 16.6236f, 13.0931f, 16.0771f, 13.1271f);
        instancePath2.lineTo(16.0771f, 13.1271f);
        instancePath2.close();
        instancePath2.moveTo(7.92436f, 13.1271f);
        instancePath2.cubicTo(7.37785f, 13.0931f, 6.94824f, 12.6407f, 6.94824f, 12.0919f);
        instancePath2.cubicTo(6.94824f, 11.5213f, 7.41286f, 11.0548f, 7.99036f, 11.0548f);
        instancePath2.cubicTo(8.26462f, 11.0548f, 8.52037f, 11.1599f, 8.71314f, 11.3451f);
        instancePath2.cubicTo(9.53633f, 12.1714f, 10.0738f, 12.7112f, 10.4881f, 13.1271f);
        instancePath2.lineTo(7.92436f, 13.1271f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
