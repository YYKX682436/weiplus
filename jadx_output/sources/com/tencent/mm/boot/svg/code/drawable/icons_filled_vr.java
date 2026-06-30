package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_vr extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                canvas.saveLayerAlpha(null, 230, 31);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(57.0f, 7.5f);
                instancePath.cubicTo(58.656853f, 7.5f, 60.0f, 8.843145f, 60.0f, 10.5f);
                instancePath.lineTo(60.0f, 61.5f);
                instancePath.cubicTo(60.0f, 63.156853f, 58.656853f, 64.5f, 57.0f, 64.5f);
                instancePath.lineTo(15.0f, 64.5f);
                instancePath.cubicTo(13.343145f, 64.5f, 12.0f, 63.156853f, 12.0f, 61.5f);
                instancePath.lineTo(12.0f, 10.5f);
                instancePath.cubicTo(12.0f, 8.843145f, 13.343145f, 7.5f, 15.0f, 7.5f);
                instancePath.lineTo(57.0f, 7.5f);
                instancePath.close();
                instancePath.moveTo(22.352573f, 26.25f);
                instancePath.lineTo(18.0f, 26.25f);
                instancePath.lineTo(24.346334f, 46.5f);
                instancePath.lineTo(29.288612f, 46.5f);
                instancePath.lineTo(35.663025f, 26.25f);
                instancePath.lineTo(31.450857f, 26.25f);
                instancePath.lineTo(28.75507f, 36.101353f);
                instancePath.cubicTo(28.109205f, 38.345272f, 27.631824f, 40.37027f, 26.98596f, 42.641556f);
                instancePath.lineTo(26.845554f, 42.641556f);
                instancePath.cubicTo(26.171606f, 40.37027f, 25.75039f, 38.345272f, 25.104525f, 36.101353f);
                instancePath.lineTo(22.352573f, 26.25f);
                instancePath.close();
                instancePath.moveTo(45.294853f, 26.25f);
                instancePath.lineTo(38.049923f, 26.25f);
                instancePath.lineTo(38.049923f, 46.5f);
                instancePath.lineTo(42.20593f, 46.5f);
                instancePath.lineTo(42.20593f, 38.837837f);
                instancePath.lineTo(45.098286f, 38.837837f);
                instancePath.lineTo(49.366615f, 46.5f);
                instancePath.lineTo(54.0f, 46.5f);
                instancePath.lineTo(49.141964f, 38.208447f);
                instancePath.cubicTo(51.528862f, 37.305405f, 53.101402f, 35.41723f, 53.101402f, 32.37973f);
                instancePath.cubicTo(53.101402f, 27.727703f, 49.647427f, 26.25f, 45.294853f, 26.25f);
                instancePath.close();
                instancePath.moveTo(44.901714f, 29.451689f);
                instancePath.cubicTo(47.569424f, 29.451689f, 49.02964f, 30.19054f, 49.02964f, 32.37973f);
                instancePath.cubicTo(49.02964f, 34.541553f, 47.569424f, 35.63615f, 44.901714f, 35.63615f);
                instancePath.lineTo(42.20593f, 35.63615f);
                instancePath.lineTo(42.20593f, 29.451689f);
                instancePath.lineTo(44.901714f, 29.451689f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
