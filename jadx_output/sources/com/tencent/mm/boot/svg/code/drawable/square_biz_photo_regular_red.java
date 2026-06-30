package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class square_biz_photo_regular_red extends l95.c {
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
        instancePaint3.setColor(-15683841);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.91507f, 20.875f);
        instancePath.lineTo(14.6865f, 20.875f);
        instancePath.lineTo(14.6865f, 8.125f);
        instancePath.lineTo(3.91507f, 8.125f);
        instancePath.lineTo(3.91507f, 20.875f);
        instancePath.close();
        instancePath.moveTo(15.8008f, 21.0625f);
        instancePath.cubicTo(15.8008f, 21.5803f, 15.385f, 22.0f, 14.8722f, 22.0f);
        instancePath.lineTo(3.72935f, 22.0f);
        instancePath.cubicTo(3.21652f, 22.0f, 2.80078f, 21.5803f, 2.80078f, 21.0625f);
        instancePath.lineTo(2.80078f, 7.9375f);
        instancePath.cubicTo(2.80078f, 7.41973f, 3.21652f, 7.0f, 3.72935f, 7.0f);
        instancePath.lineTo(14.8722f, 7.0f);
        instancePath.cubicTo(15.385f, 7.0f, 15.8008f, 7.41973f, 15.8008f, 7.9375f);
        instancePath.lineTo(15.8008f, 21.0625f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15683841);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.7992f, 16.8395f);
        instancePath2.cubicTo(18.7992f, 17.149f, 18.5482f, 17.4f, 18.2386f, 17.4f);
        instancePath2.cubicTo(17.929f, 17.4f, 17.6781f, 17.149f, 17.6781f, 16.8395f);
        instancePath2.lineTo(17.6781f, 5.12105f);
        instancePath2.lineTo(6.7598f, 5.12105f);
        instancePath2.cubicTo(6.4502f, 5.12105f, 6.19922f, 4.8701f, 6.19922f, 4.56053f);
        instancePath2.cubicTo(6.19922f, 4.25096f, 6.4502f, 4.0f, 6.7598f, 4.0f);
        instancePath2.lineTo(17.8649f, 4.0f);
        instancePath2.cubicTo(18.3809f, 4.0f, 18.7992f, 4.41826f, 18.7992f, 4.93421f);
        instancePath2.lineTo(18.7992f, 16.8395f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15683841);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(21.5996f, 13.0396f);
        instancePath3.cubicTo(21.5996f, 13.3491f, 21.3486f, 13.6001f, 21.039f, 13.6001f);
        instancePath3.cubicTo(20.7294f, 13.6001f, 20.4784f, 13.3491f, 20.4784f, 13.0396f);
        instancePath3.lineTo(20.4784f, 2.72115f);
        instancePath3.lineTo(11.1602f, 2.72115f);
        instancePath3.cubicTo(10.8506f, 2.72115f, 10.5996f, 2.47019f, 10.5996f, 2.16062f);
        instancePath3.cubicTo(10.5996f, 1.85105f, 10.8506f, 1.6001f, 11.1602f, 1.6001f);
        instancePath3.lineTo(20.6653f, 1.6001f);
        instancePath3.cubicTo(21.1813f, 1.6001f, 21.5996f, 2.01836f, 21.5996f, 2.53431f);
        instancePath3.lineTo(21.5996f, 13.0396f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
