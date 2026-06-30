package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_comment_image_flow_swipe_up extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.52612f, 8.77117f);
        instancePath.lineTo(3.75488f, 4.99994f);
        instancePath.lineTo(4.69769f, 4.05713f);
        instancePath.lineTo(7.99752f, 7.35696f);
        instancePath.lineTo(11.2974f, 4.05713f);
        instancePath.lineTo(12.2402f, 4.99994f);
        instancePath.lineTo(8.46893f, 8.77117f);
        instancePath.cubicTo(8.20858f, 9.03152f, 7.78647f, 9.03152f, 7.52612f, 8.77117f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.52612f, 12.7712f);
        instancePath2.lineTo(3.75488f, 8.99994f);
        instancePath2.lineTo(4.69769f, 8.05713f);
        instancePath2.lineTo(7.99752f, 11.357f);
        instancePath2.lineTo(11.2974f, 8.05713f);
        instancePath2.lineTo(12.2402f, 8.99994f);
        instancePath2.lineTo(8.46893f, 12.7712f);
        instancePath2.cubicTo(8.20858f, 13.0315f, 7.78647f, 13.0315f, 7.52612f, 12.7712f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
