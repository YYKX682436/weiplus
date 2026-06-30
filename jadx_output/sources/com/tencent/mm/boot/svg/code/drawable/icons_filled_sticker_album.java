package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_sticker_album extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(62.4f, 6.0f);
        instancePath.cubicTo(64.38822f, 6.0f, 66.0f, 7.611775f, 66.0f, 9.6f);
        instancePath.lineTo(66.0f, 62.4f);
        instancePath.cubicTo(66.0f, 64.38822f, 64.38822f, 66.0f, 62.4f, 66.0f);
        instancePath.lineTo(9.6f, 66.0f);
        instancePath.cubicTo(7.611775f, 66.0f, 6.0f, 64.38822f, 6.0f, 62.4f);
        instancePath.lineTo(6.0f, 9.6f);
        instancePath.cubicTo(6.0f, 7.611775f, 7.611775f, 6.0f, 9.6f, 6.0f);
        instancePath.lineTo(62.4f, 6.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 15.0f);
        instancePath.cubicTo(24.40202f, 15.0f, 15.0f, 24.40202f, 15.0f, 36.0f);
        instancePath.cubicTo(15.0f, 47.59798f, 24.40202f, 57.0f, 36.0f, 57.0f);
        instancePath.cubicTo(47.59798f, 57.0f, 57.0f, 47.59798f, 57.0f, 36.0f);
        instancePath.cubicTo(57.0f, 24.40202f, 47.59798f, 15.0f, 36.0f, 15.0f);
        instancePath.close();
        instancePath.moveTo(47.502914f, 38.1f);
        instancePath.cubicTo(46.972424f, 43.986824f, 42.024944f, 48.6f, 36.0f, 48.6f);
        instancePath.cubicTo(29.975056f, 48.6f, 25.027575f, 43.986824f, 24.497086f, 38.1f);
        instancePath.lineTo(24.497086f, 38.1f);
        instancePath.close();
        instancePath.moveTo(28.65f, 26.55f);
        instancePath.cubicTo(30.389696f, 26.55f, 31.8f, 27.960302f, 31.8f, 29.7f);
        instancePath.cubicTo(31.8f, 31.439697f, 30.389696f, 32.85f, 28.65f, 32.85f);
        instancePath.cubicTo(26.910303f, 32.85f, 25.5f, 31.439697f, 25.5f, 29.7f);
        instancePath.cubicTo(25.5f, 27.960302f, 26.910303f, 26.55f, 28.65f, 26.55f);
        instancePath.close();
        instancePath.moveTo(43.35f, 26.55f);
        instancePath.cubicTo(45.0897f, 26.55f, 46.5f, 27.960302f, 46.5f, 29.7f);
        instancePath.cubicTo(46.5f, 31.439697f, 45.0897f, 32.85f, 43.35f, 32.85f);
        instancePath.cubicTo(41.610302f, 32.85f, 40.2f, 31.439697f, 40.2f, 29.7f);
        instancePath.cubicTo(40.2f, 27.960302f, 41.610302f, 26.55f, 43.35f, 26.55f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
