package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_forward_pressed extends l95.c {
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
        instancePath.moveTo(12.75f, 4.3664327f);
        instancePath.lineTo(12.75f, 7.0f);
        instancePath.lineTo(19.001043f, 7.0f);
        instancePath.cubicTo(19.550869f, 7.0f, 20.0f, 7.4458385f, 20.0f, 7.9958086f);
        instancePath.lineTo(20.0f, 21.004192f);
        instancePath.cubicTo(20.0f, 21.55108f, 19.554161f, 22.0f, 19.004192f, 22.0f);
        instancePath.lineTo(4.9958086f, 22.0f);
        instancePath.cubicTo(4.4489202f, 22.0f, 4.0f, 21.554161f, 4.0f, 21.004192f);
        instancePath.lineTo(4.0f, 7.9958086f);
        instancePath.cubicTo(4.0f, 7.4489202f, 4.447248f, 7.0f, 4.9989567f, 7.0f);
        instancePath.lineTo(11.25f, 7.0f);
        instancePath.lineTo(11.25f, 4.376435f);
        instancePath.lineTo(9.5305f, 6.0961943f);
        instancePath.lineTo(8.47f, 5.035534f);
        instancePath.lineTo(11.29784f, 2.2070534f);
        instancePath.cubicTo(11.688335f, 1.8164996f, 12.3215f, 1.8164518f, 12.712053f, 2.2069466f);
        instancePath.cubicTo(12.71209f, 2.2069821f, 12.712125f, 2.207018f, 12.71216f, 2.2070534f);
        instancePath.lineTo(12.712053f, 2.2071602f);
        instancePath.lineTo(15.54f, 5.035534f);
        instancePath.lineTo(14.479501f, 6.0961943f);
        instancePath.lineTo(12.75f, 4.3664327f);
        instancePath.close();
        instancePath.moveTo(11.25f, 7.0f);
        instancePath.lineTo(11.25f, 13.5f);
        instancePath.lineTo(12.75f, 13.5f);
        instancePath.lineTo(12.75f, 7.0f);
        instancePath.lineTo(11.25f, 7.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
