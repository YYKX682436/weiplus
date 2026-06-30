package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ic_line_game extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePath.moveTo(40.2463f, 7.24633f);
        instancePath.cubicTo(37.9166f, 4.91657f, 34.0984f, 4.90099f, 31.7531f, 7.24633f);
        instancePath.lineTo(7.24633f, 31.7531f);
        instancePath.cubicTo(4.91657f, 34.0829f, 4.90099f, 37.901f, 7.24633f, 40.2463f);
        instancePath.lineTo(31.7531f, 64.7531f);
        instancePath.cubicTo(34.0829f, 67.0829f, 37.901f, 67.0984f, 40.2463f, 64.7531f);
        instancePath.lineTo(64.7531f, 40.2463f);
        instancePath.cubicTo(67.0829f, 37.9166f, 67.0984f, 34.0984f, 64.7531f, 31.7531f);
        instancePath.lineTo(40.2463f, 7.24633f);
        instancePath.close();
        instancePath.moveTo(23.527f, 34.2001f);
        instancePath.lineTo(9.89027f, 34.2001f);
        instancePath.lineTo(34.1994f, 9.89103f);
        instancePath.lineTo(34.1994f, 23.5278f);
        instancePath.cubicTo(28.6811f, 24.3171f, 24.3163f, 28.6819f, 23.527f, 34.2001f);
        instancePath.close();
        instancePath.moveTo(37.7994f, 23.5278f);
        instancePath.lineTo(37.7994f, 9.89099f);
        instancePath.lineTo(62.1086f, 34.2001f);
        instancePath.lineTo(48.4718f, 34.2001f);
        instancePath.cubicTo(47.6825f, 28.6819f, 43.3176f, 24.3171f, 37.7994f, 23.5278f);
        instancePath.close();
        instancePath.moveTo(48.4718f, 37.8001f);
        instancePath.lineTo(62.1079f, 37.8001f);
        instancePath.lineTo(37.7994f, 62.1087f);
        instancePath.lineTo(37.7994f, 48.4725f);
        instancePath.cubicTo(43.3176f, 47.6832f, 47.6825f, 43.3184f, 48.4718f, 37.8001f);
        instancePath.close();
        instancePath.moveTo(34.1994f, 48.4725f);
        instancePath.lineTo(34.1994f, 62.1086f);
        instancePath.lineTo(9.89089f, 37.8001f);
        instancePath.lineTo(23.527f, 37.8001f);
        instancePath.cubicTo(24.3163f, 43.3184f, 28.6811f, 47.6832f, 34.1994f, 48.4725f);
        instancePath.close();
        instancePath.moveTo(44.9999f, 36.0f);
        instancePath.cubicTo(44.9999f, 40.9706f, 40.9705f, 45.0f, 35.9999f, 45.0f);
        instancePath.cubicTo(31.0294f, 45.0f, 26.9999f, 40.9706f, 26.9999f, 36.0f);
        instancePath.cubicTo(26.9999f, 31.0294f, 31.0294f, 27.0f, 35.9999f, 27.0f);
        instancePath.cubicTo(40.9705f, 27.0f, 44.9999f, 31.0294f, 44.9999f, 36.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
