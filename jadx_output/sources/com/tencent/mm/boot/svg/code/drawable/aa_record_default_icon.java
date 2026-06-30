package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class aa_record_default_icon extends l95.c {
    private final int width = 100;
    private final int height = 100;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 100;
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
        instancePaint3.setColor(-2236702);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 10.0f);
        instancePath.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath.lineTo(90.0f, 0.0f);
        instancePath.cubicTo(95.52285f, 0.0f, 100.0f, 4.4771523f, 100.0f, 10.0f);
        instancePath.lineTo(100.0f, 90.0f);
        instancePath.cubicTo(100.0f, 95.52285f, 95.52285f, 100.0f, 90.0f, 100.0f);
        instancePath.lineTo(10.0f, 100.0f);
        instancePath.cubicTo(4.4771523f, 100.0f, 0.0f, 95.52285f, 0.0f, 90.0f);
        instancePath.lineTo(0.0f, 10.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(74.0f, 52.03699f);
        instancePath2.lineTo(74.0f, 22.99649f);
        instancePath2.cubicTo(74.0f, 21.887833f, 73.10395f, 21.0f, 71.99861f, 21.0f);
        instancePath2.lineTo(28.001389f, 21.0f);
        instancePath2.cubicTo(26.894938f, 21.0f, 26.0f, 21.89386f, 26.0f, 22.99649f);
        instancePath2.lineTo(26.0f, 77.00351f);
        instancePath2.cubicTo(26.0f, 78.11217f, 26.896053f, 79.0f, 28.001389f, 79.0f);
        instancePath2.lineTo(71.99861f, 79.0f);
        instancePath2.cubicTo(73.105064f, 79.0f, 74.0f, 78.10614f, 74.0f, 77.00351f);
        instancePath2.lineTo(74.0f, 55.48232f);
        instancePath2.lineTo(50.747208f, 68.733765f);
        instancePath2.lineTo(50.57445f, 68.832016f);
        instancePath2.cubicTo(50.36059f, 68.938515f, 50.119755f, 69.0f, 49.86415f, 69.0f);
        instancePath2.cubicTo(49.272663f, 69.0f, 48.75824f, 68.677986f, 48.487865f, 68.2032f);
        instancePath2.lineTo(48.384464f, 67.97943f);
        instancePath2.lineTo(44.075783f, 58.647274f);
        instancePath2.cubicTo(44.0289f, 58.54522f, 44.0f, 58.430485f, 44.0f, 58.318916f);
        instancePath2.cubicTo(44.0f, 57.88914f, 44.35322f, 57.539864f, 44.789295f, 57.539864f);
        instancePath2.cubicTo(44.96655f, 57.539864f, 45.129673f, 57.59755f, 45.26133f, 57.694534f);
        instancePath2.lineTo(50.345818f, 61.267784f);
        instancePath2.cubicTo(50.717667f, 61.50803f, 51.161446f, 61.648754f, 51.63862f, 61.648754f);
        instancePath2.cubicTo(51.923122f, 61.648754f, 52.194782f, 61.59614f, 52.44782f, 61.505493f);
        instancePath2.lineTo(74.0f, 52.03699f);
        instancePath2.close();
        instancePath2.moveTo(34.0f, 38.0f);
        instancePath2.lineTo(52.0f, 38.0f);
        instancePath2.lineTo(52.0f, 41.0f);
        instancePath2.lineTo(34.0f, 41.0f);
        instancePath2.lineTo(34.0f, 38.0f);
        instancePath2.close();
        instancePath2.moveTo(34.0f, 29.0f);
        instancePath2.lineTo(52.0f, 29.0f);
        instancePath2.lineTo(52.0f, 32.0f);
        instancePath2.lineTo(34.0f, 32.0f);
        instancePath2.lineTo(34.0f, 29.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
