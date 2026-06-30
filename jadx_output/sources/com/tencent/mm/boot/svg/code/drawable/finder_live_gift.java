package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_gift extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.5625f, 2.5f);
        instancePath2.cubicTo(10.205121f, 2.5f, 11.615339f, 3.6258662f, 12.00091f, 5.1925073f);
        instancePath2.cubicTo(12.369879f, 3.6857982f, 13.688518f, 2.5867383f, 15.250152f, 2.5048993f);
        instancePath2.lineTo(15.5f, 2.5f);
        instancePath2.cubicTo(17.156855f, 2.5f, 18.5f, 3.8431458f, 18.5f, 5.5f);
        instancePath2.cubicTo(18.5f, 6.0467286f, 18.35375f, 6.5592985f, 18.098236f, 7.0007215f);
        instancePath2.lineTo(20.0f, 7.0f);
        instancePath2.cubicTo(20.552284f, 7.0f, 21.0f, 7.4477153f, 21.0f, 8.0f);
        instancePath2.lineTo(21.0f, 13.0f);
        instancePath2.lineTo(20.0f, 13.0f);
        instancePath2.lineTo(20.0f, 20.0f);
        instancePath2.cubicTo(20.0f, 20.552284f, 19.552284f, 21.0f, 19.0f, 21.0f);
        instancePath2.lineTo(5.0f, 21.0f);
        instancePath2.cubicTo(4.4477153f, 21.0f, 4.0f, 20.552284f, 4.0f, 20.0f);
        instancePath2.lineTo(4.0f, 13.0f);
        instancePath2.lineTo(3.0f, 13.0f);
        instancePath2.lineTo(3.0f, 8.0f);
        instancePath2.cubicTo(3.0f, 7.4477153f, 3.4477153f, 7.0f, 4.0f, 7.0f);
        instancePath2.lineTo(5.901764f, 7.0007215f);
        instancePath2.cubicTo(5.6462507f, 6.5592985f, 5.5f, 6.0467286f, 5.5f, 5.5f);
        instancePath2.cubicTo(5.5f, 3.8431458f, 6.843146f, 2.5f, 8.5f, 2.5f);
        instancePath2.lineTo(8.5625f, 2.5f);
        instancePath2.close();
        instancePath2.moveTo(11.399f, 13.0f);
        instancePath2.lineTo(5.2f, 13.0f);
        instancePath2.lineTo(5.2f, 19.799f);
        instancePath2.lineTo(11.399f, 19.798f);
        instancePath2.lineTo(11.399f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(18.8f, 13.0f);
        instancePath2.lineTo(12.599f, 13.0f);
        instancePath2.lineTo(12.599f, 19.798f);
        instancePath2.lineTo(18.8f, 19.799f);
        instancePath2.lineTo(18.8f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(19.8f, 8.2f);
        instancePath2.lineTo(4.2f, 8.2f);
        instancePath2.lineTo(4.2f, 11.8f);
        instancePath2.lineTo(19.8f, 11.8f);
        instancePath2.lineTo(19.8f, 8.2f);
        instancePath2.close();
        instancePath2.moveTo(8.5625f, 3.7f);
        instancePath2.lineTo(8.5f, 3.7f);
        instancePath2.cubicTo(7.5058875f, 3.7f, 6.7f, 4.5058875f, 6.7f, 5.5f);
        instancePath2.cubicTo(6.7f, 6.126492f, 7.0200624f, 6.67823f, 7.5055933f, 7.0006194f);
        instancePath2.lineTo(11.068f, 7.0f);
        instancePath2.lineTo(10.8795f, 5.703613f);
        instancePath2.cubicTo(10.72812f, 4.6655755f, 9.910199f, 3.8696167f, 8.897783f, 3.723933f);
        instancePath2.lineTo(8.727327f, 3.7057436f);
        instancePath2.lineTo(8.5625f, 3.7f);
        instancePath2.close();
        instancePath2.moveTo(15.5f, 3.7f);
        instancePath2.lineTo(15.4375f, 3.7f);
        instancePath2.cubicTo(14.330204f, 3.7f, 13.382637f, 4.4738064f, 13.149969f, 5.54134f);
        instancePath2.lineTo(13.1205f, 5.703613f);
        instancePath2.lineTo(12.931f, 7.0f);
        instancePath2.lineTo(16.494616f, 7.0004807f);
        instancePath2.cubicTo(16.941511f, 6.703655f, 17.248178f, 6.2125096f, 17.294033f, 5.647628f);
        instancePath2.lineTo(17.3f, 5.5f);
        instancePath2.cubicTo(17.3f, 4.555593f, 16.572687f, 3.7810593f, 15.647628f, 3.705967f);
        instancePath2.lineTo(15.5f, 3.7f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
