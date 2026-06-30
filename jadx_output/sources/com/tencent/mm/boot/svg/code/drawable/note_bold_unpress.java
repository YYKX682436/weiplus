package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_bold_unpress extends l95.c {
    private final int width = 144;
    private final int height = 144;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 144;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 28.8f);
        instancePath.cubicTo(0.0f, 12.894198f, 12.894198f, 0.0f, 28.8f, 0.0f);
        instancePath.lineTo(115.2f, 0.0f);
        instancePath.cubicTo(131.1058f, 0.0f, 144.0f, 12.894198f, 144.0f, 28.8f);
        instancePath.lineTo(144.0f, 115.2f);
        instancePath.cubicTo(144.0f, 131.1058f, 131.1058f, 144.0f, 115.2f, 144.0f);
        instancePath.lineTo(28.8f, 144.0f);
        instancePath.cubicTo(12.894198f, 144.0f, 0.0f, 131.1058f, 0.0f, 115.2f);
        instancePath.lineTo(0.0f, 28.8f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(55.95f, 100.0f);
        instancePath2.lineTo(55.95f, 45.325f);
        instancePath2.lineTo(71.025f, 45.325f);
        instancePath2.cubicTo(82.05f, 45.325f, 89.25f, 49.375f, 89.25f, 58.6f);
        instancePath2.cubicTo(89.25f, 64.225f, 86.325f, 68.875f, 80.85f, 70.525f);
        instancePath2.lineTo(80.85f, 70.9f);
        instancePath2.cubicTo(87.9f, 72.1f, 92.55f, 76.525f, 92.55f, 84.025f);
        instancePath2.cubicTo(92.55f, 94.6f, 84.45f, 100.0f, 72.15f, 100.0f);
        instancePath2.lineTo(55.95f, 100.0f);
        instancePath2.close();
        instancePath2.moveTo(60.45f, 69.175f);
        instancePath2.lineTo(69.6f, 69.175f);
        instancePath2.cubicTo(80.4f, 69.175f, 84.75f, 65.35f, 84.75f, 59.125f);
        instancePath2.cubicTo(84.75f, 51.7f, 79.725f, 49.0f, 70.05f, 49.0f);
        instancePath2.lineTo(60.45f, 49.0f);
        instancePath2.lineTo(60.45f, 69.175f);
        instancePath2.close();
        instancePath2.moveTo(60.45f, 96.25f);
        instancePath2.lineTo(71.1f, 96.25f);
        instancePath2.cubicTo(81.675f, 96.25f, 88.125f, 92.5f, 88.125f, 84.025f);
        instancePath2.cubicTo(88.125f, 76.375f, 81.975f, 72.775f, 71.1f, 72.775f);
        instancePath2.lineTo(60.45f, 72.775f);
        instancePath2.lineTo(60.45f, 96.25f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 230, 31);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
