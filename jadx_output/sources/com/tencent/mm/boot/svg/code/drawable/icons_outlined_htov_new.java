package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_htov_new extends l95.c {
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.0f, 10.0f);
        instancePath.cubicTo(18.552284f, 10.0f, 19.0f, 10.447716f, 19.0f, 11.0f);
        instancePath.lineTo(19.0f, 19.0f);
        instancePath.cubicTo(19.0f, 19.552284f, 18.552284f, 20.0f, 18.0f, 20.0f);
        instancePath.lineTo(5.0f, 20.0f);
        instancePath.cubicTo(4.4477153f, 20.0f, 4.0f, 19.552284f, 4.0f, 19.0f);
        instancePath.lineTo(4.0f, 11.0f);
        instancePath.cubicTo(4.0f, 10.447716f, 4.4477153f, 10.0f, 5.0f, 10.0f);
        instancePath.lineTo(18.0f, 10.0f);
        instancePath.close();
        instancePath.moveTo(17.5f, 11.5f);
        instancePath.lineTo(5.5f, 11.5f);
        instancePath.lineTo(5.5f, 18.5f);
        instancePath.lineTo(17.5f, 18.5f);
        instancePath.lineTo(17.5f, 11.5f);
        instancePath.close();
        instancePath.moveTo(16.0f, 4.25f);
        instancePath.cubicTo(19.648605f, 4.25f, 22.621082f, 7.144847f, 22.745918f, 10.763028f);
        instancePath.lineTo(22.75f, 11.0f);
        instancePath.lineTo(21.25f, 11.0f);
        instancePath.cubicTo(21.25f, 8.172993f, 19.01555f, 5.8678684f, 16.216404f, 5.7543793f);
        instancePath.lineTo(16.0f, 5.75f);
        instancePath.lineTo(16.0f, 4.25f);
        instancePath.close();
        instancePath.moveTo(15.579505f, 2.079505f);
        instancePath.lineTo(16.640165f, 3.140165f);
        instancePath.lineTo(15.53f, 4.249505f);
        instancePath.lineTo(16.0f, 4.25f);
        instancePath.lineTo(16.0f, 5.75f);
        instancePath.lineTo(15.31f, 5.749505f);
        instancePath.lineTo(16.640165f, 7.079505f);
        instancePath.lineTo(15.579505f, 8.140165f);
        instancePath.lineTo(13.079505f, 5.640165f);
        instancePath.cubicTo(12.813238f, 5.3738985f, 12.789032f, 4.957235f, 13.0068865f, 4.6636233f);
        instancePath.lineTo(13.079505f, 4.579505f);
        instancePath.lineTo(15.579505f, 2.079505f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
