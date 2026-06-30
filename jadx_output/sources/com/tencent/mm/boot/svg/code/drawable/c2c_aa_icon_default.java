package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class c2c_aa_icon_default extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        instancePath.moveTo(82.355896f, 30.0f);
        instancePath.cubicTo(83.653755f, 30.0f, 84.70588f, 31.054106f, 84.70588f, 32.35207f);
        instancePath.lineTo(84.70588f, 32.35207f);
        instancePath.lineTo(84.70588f, 62.52294f);
        instancePath.lineTo(61.71054f, 72.06421f);
        instancePath.cubicTo(61.447872f, 72.15308f, 61.16587f, 72.20466f, 60.87054f, 72.20466f);
        instancePath.cubicTo(60.3752f, 72.20466f, 59.914528f, 72.066696f, 59.52853f, 71.83116f);
        instancePath.lineTo(59.52853f, 71.83116f);
        instancePath.lineTo(54.25052f, 68.32798f);
        instancePath.cubicTo(54.113846f, 68.232895f, 53.94452f, 68.17634f, 53.760517f, 68.17634f);
        instancePath.cubicTo(53.307846f, 68.17634f, 52.941177f, 68.51877f, 52.941177f, 68.94012f);
        instancePath.cubicTo(52.941177f, 69.04949f, 52.971176f, 69.16198f, 53.019848f, 69.26203f);
        instancePath.lineTo(53.019848f, 69.26203f);
        instancePath.lineTo(57.49253f, 78.41121f);
        instancePath.lineTo(57.599857f, 78.630585f);
        instancePath.cubicTo(57.880527f, 79.09606f, 58.414528f, 79.411766f, 59.02853f, 79.411766f);
        instancePath.cubicTo(59.293858f, 79.411766f, 59.54387f, 79.35148f, 59.76587f, 79.247086f);
        instancePath.lineTo(59.76587f, 79.247086f);
        instancePath.lineTo(59.945198f, 79.15075f);
        instancePath.lineTo(84.70588f, 65.823906f);
        instancePath.lineTo(84.70588f, 87.64793f);
        instancePath.cubicTo(84.70588f, 88.94694f, 83.650986f, 90.0f, 82.355896f, 90.0f);
        instancePath.lineTo(82.355896f, 90.0f);
        instancePath.lineTo(37.644104f, 90.0f);
        instancePath.cubicTo(36.34625f, 90.0f, 35.294117f, 88.94589f, 35.294117f, 87.64793f);
        instancePath.lineTo(35.294117f, 87.64793f);
        instancePath.lineTo(35.294117f, 32.35207f);
        instancePath.cubicTo(35.294117f, 31.053059f, 36.34901f, 30.0f, 37.644104f, 30.0f);
        instancePath.lineTo(37.644104f, 30.0f);
        instancePath.lineTo(82.355896f, 30.0f);
        instancePath.close();
        instancePath.moveTo(61.764706f, 47.64706f);
        instancePath.lineTo(44.11765f, 47.64706f);
        instancePath.lineTo(44.11765f, 51.17647f);
        instancePath.lineTo(61.764706f, 51.17647f);
        instancePath.lineTo(61.764706f, 47.64706f);
        instancePath.close();
        instancePath.moveTo(61.764706f, 38.82353f);
        instancePath.lineTo(44.11765f, 38.82353f);
        instancePath.lineTo(44.11765f, 42.35294f);
        instancePath.lineTo(61.764706f, 42.35294f);
        instancePath.lineTo(61.764706f, 38.82353f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
