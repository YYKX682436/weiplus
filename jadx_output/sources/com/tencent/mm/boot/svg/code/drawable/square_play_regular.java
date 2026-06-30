package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class square_play_regular extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.158f, 8.06612f);
        instancePath.lineTo(15.7978f, 11.6311f);
        instancePath.cubicTo(15.9992f, 11.7584f, 16.0605f, 12.0268f, 15.9346f, 12.2305f);
        instancePath.cubicTo(15.9f, 12.2865f, 15.8532f, 12.3338f, 15.7978f, 12.3688f);
        instancePath.lineTo(10.158f, 15.9338f);
        instancePath.cubicTo(9.9566f, 16.0611f, 9.69126f, 15.9992f, 9.56537f, 15.7955f);
        instancePath.cubicTo(9.52265f, 15.7264f, 9.5f, 15.6465f, 9.5f, 15.565f);
        instancePath.lineTo(9.5f, 8.43498f);
        instancePath.cubicTo(9.5f, 8.19475f, 9.69255f, 8.0f, 9.93008f, 8.0f);
        instancePath.cubicTo(10.0107f, 8.0f, 10.0897f, 8.02291f, 10.158f, 8.06612f);
        instancePath.close();
        instancePath.moveTo(10.6778f, 14.2822f);
        instancePath.lineTo(14.2882f, 12.0f);
        instancePath.lineTo(10.6778f, 9.71776f);
        instancePath.lineTo(10.6778f, 14.2822f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.0f, 3.0f);
        instancePath2.cubicTo(4.0f, 2.44772f, 4.44772f, 2.0f, 5.0f, 2.0f);
        instancePath2.lineTo(19.0f, 2.0f);
        instancePath2.cubicTo(19.5523f, 2.0f, 20.0f, 2.44772f, 20.0f, 3.0f);
        instancePath2.lineTo(20.0f, 21.0f);
        instancePath2.cubicTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f);
        instancePath2.lineTo(5.0f, 22.0f);
        instancePath2.cubicTo(4.44772f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f);
        instancePath2.lineTo(4.0f, 3.0f);
        instancePath2.close();
        instancePath2.moveTo(5.2f, 3.2f);
        instancePath2.lineTo(5.2f, 20.8f);
        instancePath2.lineTo(18.8f, 20.8f);
        instancePath2.lineTo(18.8f, 3.2f);
        instancePath2.lineTo(5.2f, 3.2f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
