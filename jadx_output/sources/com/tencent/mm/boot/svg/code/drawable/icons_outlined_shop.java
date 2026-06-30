package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_shop extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 6.0f);
        instancePath.cubicTo(42.628906f, 6.0f, 48.0f, 11.371094f, 48.0f, 18.0f);
        instancePath.lineTo(48.0f, 21.0f);
        instancePath.lineTo(56.996094f, 21.0f);
        instancePath.cubicTo(58.65625f, 21.0f, 60.0f, 22.347656f, 60.0f, 24.023438f);
        instancePath.lineTo(60.0f, 60.023438f);
        instancePath.cubicTo(60.0f, 63.32422f, 57.316406f, 66.0f, 54.01953f, 66.0f);
        instancePath.lineTo(17.980469f, 66.0f);
        instancePath.cubicTo(14.679688f, 66.0f, 12.0f, 63.320312f, 12.0f, 60.023438f);
        instancePath.lineTo(12.0f, 24.023438f);
        instancePath.cubicTo(12.0f, 22.351562f, 13.332031f, 21.0f, 15.003906f, 21.0f);
        instancePath.lineTo(24.0f, 21.0f);
        instancePath.lineTo(24.0f, 18.0f);
        instancePath.cubicTo(24.0f, 11.371094f, 29.371094f, 6.0f, 36.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(56.398438f, 24.601562f);
        instancePath.lineTo(48.0f, 24.597656f);
        instancePath.lineTo(48.0f, 33.0f);
        instancePath.lineTo(44.398438f, 33.0f);
        instancePath.lineTo(44.398438f, 24.597656f);
        instancePath.lineTo(27.597656f, 24.597656f);
        instancePath.lineTo(27.601562f, 33.0f);
        instancePath.lineTo(24.0f, 33.0f);
        instancePath.lineTo(24.0f, 24.597656f);
        instancePath.lineTo(15.601562f, 24.601562f);
        instancePath.lineTo(15.601562f, 60.023438f);
        instancePath.cubicTo(15.601562f, 61.33203f, 16.667969f, 62.398438f, 17.980469f, 62.398438f);
        instancePath.lineTo(54.01953f, 62.398438f);
        instancePath.cubicTo(55.33203f, 62.398438f, 56.398438f, 61.33203f, 56.398438f, 60.023438f);
        instancePath.close();
        instancePath.moveTo(36.0f, 9.601562f);
        instancePath.cubicTo(31.359375f, 9.601562f, 27.601562f, 13.359375f, 27.601562f, 18.0f);
        instancePath.lineTo(27.597656f, 21.0f);
        instancePath.lineTo(44.398438f, 21.0f);
        instancePath.lineTo(44.398438f, 18.0f);
        instancePath.cubicTo(44.398438f, 13.359375f, 40.640625f, 9.601562f, 36.0f, 9.601562f);
        instancePath.close();
        instancePath.moveTo(36.0f, 9.601562f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
