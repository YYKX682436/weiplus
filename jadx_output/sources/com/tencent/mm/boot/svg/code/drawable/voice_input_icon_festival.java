package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_input_icon_festival extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(12.0f, 0.0f);
        instancePath.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
        instancePath.lineTo(24.0f, 12.0f);
        instancePath.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
        instancePath.lineTo(12.0f, 24.0f);
        instancePath.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-5796769);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.897905f, 8.756343f);
        instancePath2.lineTo(8.093485f, 8.282515f);
        instancePath2.lineTo(7.7207007f, 8.941259f);
        instancePath2.cubicTo(6.4518085f, 11.183511f, 6.9088583f, 13.968303f, 8.6956f, 15.557907f);
        instancePath2.lineTo(7.811896f, 17.119495f);
        instancePath2.lineTo(9.420736f, 18.067152f);
        instancePath2.lineTo(10.3044405f, 16.505564f);
        instancePath2.lineTo(10.3044405f, 16.505564f);
        instancePath2.cubicTo(12.547149f, 17.289433f, 15.139547f, 16.300861f, 16.40844f, 14.05861f);
        instancePath2.lineTo(16.781223f, 13.399865f);
        instancePath2.lineTo(15.976804f, 12.926036f);
        instancePath2.lineTo(15.604019f, 13.584781f);
        instancePath2.cubicTo(14.407016f, 15.7f, 11.875845f, 16.439146f, 9.999716f, 15.334046f);
        instancePath2.cubicTo(7.966277f, 14.136288f, 7.328117f, 11.530307f, 8.525121f, 9.415088f);
        instancePath2.lineTo(8.897905f, 8.756343f);
        instancePath2.lineTo(8.897905f, 8.756343f);
        instancePath2.lineTo(8.897905f, 8.756343f);
        instancePath2.close();
        instancePath2.moveTo(7.6466455f, 17.675043f);
        instancePath2.cubicTo(7.634969f, 17.550129f, 7.7120023f, 17.499817f, 7.8195677f, 17.563177f);
        instancePath2.lineTo(9.04028f, 18.282215f);
        instancePath2.cubicTo(9.147459f, 18.345346f, 9.143215f, 18.438997f, 9.031784f, 18.490932f);
        instancePath2.lineTo(7.9801126f, 18.98109f);
        instancePath2.cubicTo(7.8682413f, 19.033232f, 7.7680407f, 18.973745f, 7.75641f, 18.849323f);
        instancePath2.lineTo(7.6466455f, 17.675043f);
        instancePath2.close();
        instancePath2.moveTo(11.453351f, 6.515008f);
        instancePath2.cubicTo(12.2725315f, 5.06744f, 14.091164f, 4.5691423f, 15.512824f, 5.406545f);
        instancePath2.cubicTo(16.934797f, 6.2441325f, 17.421965f, 8.097922f, 16.60164f, 9.547512f);
        instancePath2.lineTo(14.632907f, 13.026451f);
        instancePath2.cubicTo(13.813726f, 14.474019f, 11.995094f, 14.972317f, 10.573434f, 14.134913f);
        instancePath2.cubicTo(9.15146f, 13.297326f, 8.664292f, 11.443537f, 9.484617f, 9.993947f);
        instancePath2.lineTo(11.453351f, 6.515008f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
