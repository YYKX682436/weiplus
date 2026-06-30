package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mike_no_circle_filled extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.33105f, 12.4033f);
        instancePath.cubicTo(8.33152f, 14.4288f, 9.97446f, 16.0711f, 12.0f, 16.0713f);
        instancePath.cubicTo(14.0257f, 16.0712f, 15.6675f, 14.4289f, 15.668f, 12.4033f);
        instancePath.lineTo(15.668f, 11.4883f);
        instancePath.lineTo(16.8682f, 11.4883f);
        instancePath.lineTo(16.8682f, 12.4033f);
        instancePath.cubicTo(16.8677f, 14.8887f, 15.0052f, 16.937f, 12.5996f, 17.2324f);
        instancePath.lineTo(12.5996f, 18.501f);
        instancePath.lineTo(11.4004f, 18.501f);
        instancePath.lineTo(11.4004f, 17.2324f);
        instancePath.cubicTo(8.99515f, 16.9367f, 7.13227f, 14.8885f, 7.13184f, 12.4033f);
        instancePath.lineTo(7.13184f, 11.4883f);
        instancePath.lineTo(8.33105f, 11.4883f);
        instancePath.lineTo(8.33105f, 12.4033f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.2803f, 6.01465f);
        instancePath2.cubicTo(13.664f, 6.15513f, 14.7441f, 7.32336f, 14.7441f, 8.74414f);
        instancePath2.lineTo(14.7441f, 12.4023f);
        instancePath2.lineTo(14.7295f, 12.6836f);
        instancePath2.cubicTo(14.5888f, 14.067f, 13.4205f, 15.1464f, 12.0f, 15.1465f);
        instancePath2.lineTo(11.7197f, 15.1328f);
        instancePath2.cubicTo(10.4284f, 15.0017f, 9.40184f, 13.9748f, 9.27051f, 12.6836f);
        instancePath2.lineTo(9.25586f, 12.4023f);
        instancePath2.lineTo(9.25586f, 8.74414f);
        instancePath2.cubicTo(9.25586f, 7.22882f, 10.4847f, 6.00023f, 12.0f, 6.0f);
        instancePath2.lineTo(12.2803f, 6.01465f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
