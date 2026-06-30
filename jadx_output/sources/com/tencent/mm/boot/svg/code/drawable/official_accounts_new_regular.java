package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class official_accounts_new_regular extends l95.c {
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
        instancePath.moveTo(2.75f, 4.35129f);
        instancePath.cubicTo(2.75026f, 3.76939f, 3.31589f, 3.37119f, 3.85059f, 3.53844f);
        instancePath.lineTo(3.95703f, 3.57948f);
        instancePath.lineTo(8.83496f, 5.83827f);
        instancePath.cubicTo(10.2263f, 6.48248f, 11.3248f, 7.56456f, 12.0f, 8.87571f);
        instancePath.cubicTo(12.6752f, 7.56456f, 13.7737f, 6.48248f, 15.165f, 5.83827f);
        instancePath.lineTo(20.043f, 3.57948f);
        instancePath.lineTo(20.1494f, 3.53844f);
        instancePath.cubicTo(20.6841f, 3.37119f, 21.2497f, 3.76939f, 21.25f, 4.35129f);
        instancePath.lineTo(21.25f, 12.2297f);
        instancePath.cubicTo(21.25f, 14.8611f, 19.7219f, 17.2531f, 17.335f, 18.3583f);
        instancePath.lineTo(12.3154f, 20.6826f);
        instancePath.cubicTo(12.3031f, 20.6883f, 12.2899f, 20.6922f, 12.2773f, 20.6972f);
        instancePath.cubicTo(12.2608f, 20.7038f, 12.2444f, 20.7104f, 12.2275f, 20.7158f);
        instancePath.cubicTo(12.1533f, 20.7394f, 12.0767f, 20.75f, 12.0f, 20.75f);
        instancePath.cubicTo(11.923f, 20.75f, 11.846f, 20.7396f, 11.7715f, 20.7158f);
        instancePath.cubicTo(11.7549f, 20.7105f, 11.7389f, 20.7037f, 11.7227f, 20.6972f);
        instancePath.cubicTo(11.7101f, 20.6922f, 11.6969f, 20.6883f, 11.6846f, 20.6826f);
        instancePath.lineTo(6.66504f, 18.3583f);
        instancePath.cubicTo(4.27806f, 17.2531f, 2.75f, 14.8611f, 2.75f, 12.2297f);
        instancePath.lineTo(2.75f, 4.35129f);
        instancePath.close();
        instancePath.moveTo(4.25f, 12.2297f);
        instancePath.cubicTo(4.25f, 14.2763f, 5.43841f, 16.1368f, 7.29492f, 16.9964f);
        instancePath.lineTo(11.25f, 18.8273f);
        instancePath.lineTo(11.25f, 11.9669f);
        instancePath.cubicTo(11.2499f, 9.92032f, 10.0616f, 8.05978f, 8.20508f, 7.20018f);
        instancePath.lineTo(4.25f, 5.36834f);
        instancePath.lineTo(4.25f, 12.2297f);
        instancePath.close();
        instancePath.moveTo(15.7949f, 7.20018f);
        instancePath.cubicTo(13.9384f, 8.05978f, 12.7501f, 9.92032f, 12.75f, 11.9669f);
        instancePath.lineTo(12.75f, 18.8273f);
        instancePath.lineTo(16.7051f, 16.9964f);
        instancePath.cubicTo(18.5616f, 16.1368f, 19.75f, 14.2763f, 19.75f, 12.2297f);
        instancePath.lineTo(19.75f, 5.36834f);
        instancePath.lineTo(15.7949f, 7.20018f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
