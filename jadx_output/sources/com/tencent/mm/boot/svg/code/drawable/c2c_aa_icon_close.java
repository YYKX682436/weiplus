package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class c2c_aa_icon_close extends l95.c {
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
            instancePath.moveTo(82.355896f, 30.0f);
            instancePath.cubicTo(83.653755f, 30.0f, 84.70588f, 31.054106f, 84.70588f, 32.35207f);
            instancePath.lineTo(84.70588f, 87.64793f);
            instancePath.cubicTo(84.70588f, 88.94694f, 83.650986f, 90.0f, 82.355896f, 90.0f);
            instancePath.lineTo(37.644104f, 90.0f);
            instancePath.cubicTo(36.34625f, 90.0f, 35.294117f, 88.94589f, 35.294117f, 87.64793f);
            instancePath.lineTo(35.294117f, 32.35207f);
            instancePath.cubicTo(35.294117f, 31.053059f, 36.34901f, 30.0f, 37.644104f, 30.0f);
            instancePath.lineTo(82.355896f, 30.0f);
            instancePath.close();
            instancePath.moveTo(81.17647f, 33.52941f);
            instancePath.lineTo(38.82353f, 33.52941f);
            instancePath.lineTo(38.82353f, 86.47059f);
            instancePath.lineTo(81.17647f, 86.47059f);
            instancePath.lineTo(81.17647f, 33.52941f);
            instancePath.close();
            instancePath.moveTo(74.67125f, 60.0f);
            instancePath.lineTo(77.166916f, 62.49567f);
            instancePath.lineTo(68.43207f, 71.230515f);
            instancePath.lineTo(77.166916f, 79.96536f);
            instancePath.lineTo(74.67125f, 82.46104f);
            instancePath.lineTo(65.9364f, 73.72619f);
            instancePath.lineTo(57.201553f, 82.46104f);
            instancePath.lineTo(54.705883f, 79.96536f);
            instancePath.lineTo(63.44073f, 71.230515f);
            instancePath.lineTo(54.705883f, 62.49567f);
            instancePath.lineTo(57.201553f, 60.0f);
            instancePath.lineTo(65.9364f, 68.73485f);
            instancePath.lineTo(74.67125f, 60.0f);
            instancePath.close();
            instancePath.moveTo(61.764706f, 47.64706f);
            instancePath.lineTo(61.764706f, 51.17647f);
            instancePath.lineTo(44.11765f, 51.17647f);
            instancePath.lineTo(44.11765f, 47.64706f);
            instancePath.lineTo(61.764706f, 47.64706f);
            instancePath.close();
            instancePath.moveTo(61.764706f, 38.82353f);
            instancePath.lineTo(61.764706f, 42.35294f);
            instancePath.lineTo(44.11765f, 42.35294f);
            instancePath.lineTo(44.11765f, 38.82353f);
            instancePath.lineTo(61.764706f, 38.82353f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
