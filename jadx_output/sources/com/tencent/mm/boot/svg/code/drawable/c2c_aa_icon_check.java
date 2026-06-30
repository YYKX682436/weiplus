package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class c2c_aa_icon_check extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
            instancePaint3.setColor(-1);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(60.0f, 0.0f);
            instancePath.cubicTo(93.137085f, 0.0f, 120.0f, 26.862917f, 120.0f, 60.0f);
            instancePath.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            instancePath.cubicTo(26.862917f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            instancePath.cubicTo(0.0f, 26.862917f, 26.862917f, 0.0f, 60.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(60.0f, 3.5294118f);
            instancePath.cubicTo(28.812153f, 3.5294118f, 3.5294118f, 28.812153f, 3.5294118f, 60.0f);
            instancePath.cubicTo(3.5294118f, 91.18784f, 28.812153f, 116.47059f, 60.0f, 116.47059f);
            instancePath.cubicTo(91.18784f, 116.47059f, 116.47059f, 91.18784f, 116.47059f, 60.0f);
            instancePath.cubicTo(116.47059f, 28.812153f, 91.18784f, 3.5294118f, 60.0f, 3.5294118f);
            instancePath.close();
            instancePath.moveTo(90.694916f, 40.54746f);
            instancePath.lineTo(92.318306f, 42.15407f);
            instancePath.cubicTo(92.54849f, 42.38188f, 92.54888f, 42.75086f, 92.32171f, 42.97568f);
            instancePath.lineTo(51.800766f, 83.07772f);
            instancePath.cubicTo(51.339966f, 83.53375f, 50.591316f, 83.53221f, 50.134388f, 83.08f);
            instancePath.lineTo(31.721106f, 64.857086f);
            instancePath.cubicTo(31.494366f, 64.63269f, 31.471153f, 64.25013f, 31.676823f, 63.993153f);
            instancePath.lineTo(33.931248f, 61.176247f);
            instancePath.cubicTo(34.13353f, 60.923508f, 34.50826f, 60.858036f, 34.7784f, 61.036728f);
            instancePath.lineTo(49.98593f, 71.09692f);
            instancePath.cubicTo(50.527435f, 71.45514f, 51.381306f, 71.41192f, 51.880283f, 71.0107f);
            instancePath.lineTo(89.82304f, 40.50092f);
            instancePath.cubicTo(90.07438f, 40.298813f, 90.47092f, 40.325775f, 90.694916f, 40.54746f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
