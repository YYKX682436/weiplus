package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_regular_replay extends l95.c {
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
        instancePath.moveTo(21.4999f, 6.625f);
        instancePath.cubicTo(21.4999f, 5.24429f, 20.3806f, 4.125f, 18.9999f, 4.125f);
        instancePath.lineTo(4.99988f, 4.125f);
        instancePath.cubicTo(3.61917f, 4.125f, 2.49988f, 5.24429f, 2.49988f, 6.625f);
        instancePath.lineTo(2.49988f, 17.375f);
        instancePath.cubicTo(2.49988f, 18.7557f, 3.61917f, 19.875f, 4.99988f, 19.875f);
        instancePath.lineTo(18.9999f, 19.875f);
        instancePath.cubicTo(20.3806f, 19.875f, 21.4999f, 18.7557f, 21.4999f, 17.375f);
        instancePath.lineTo(21.4999f, 6.625f);
        instancePath.close();
        instancePath.moveTo(4.99988f, 5.325f);
        instancePath.lineTo(18.9999f, 5.325f);
        instancePath.lineTo(19.1328f, 5.33171f);
        instancePath.cubicTo(19.7883f, 5.39828f, 20.2999f, 5.9519f, 20.2999f, 6.625f);
        instancePath.lineTo(20.2999f, 17.375f);
        instancePath.lineTo(20.2932f, 17.5079f);
        instancePath.cubicTo(20.2266f, 18.1634f, 19.673f, 18.675f, 18.9999f, 18.675f);
        instancePath.lineTo(4.99988f, 18.675f);
        instancePath.lineTo(4.86696f, 18.6683f);
        instancePath.cubicTo(4.21143f, 18.6017f, 3.69988f, 18.0481f, 3.69988f, 17.375f);
        instancePath.lineTo(3.69988f, 6.625f);
        instancePath.lineTo(3.70659f, 6.49208f);
        instancePath.cubicTo(3.77316f, 5.83655f, 4.32678f, 5.325f, 4.99988f, 5.325f);
        instancePath.close();
        instancePath.moveTo(7.35012f, 11.25f);
        instancePath.cubicTo(7.01875f, 11.25f, 6.75012f, 11.5186f, 6.75012f, 11.85f);
        instancePath.cubicTo(6.75012f, 12.1814f, 7.01875f, 12.45f, 7.35012f, 12.45f);
        instancePath.lineTo(16.6501f, 12.45f);
        instancePath.cubicTo(16.9815f, 12.45f, 17.2501f, 12.1814f, 17.2501f, 11.85f);
        instancePath.cubicTo(17.2501f, 11.5186f, 16.9815f, 11.25f, 16.6501f, 11.25f);
        instancePath.lineTo(7.35012f, 11.25f);
        instancePath.close();
        instancePath.moveTo(15.0001f, 8.85f);
        instancePath.cubicTo(15.0001f, 8.51863f, 15.2688f, 8.25f, 15.6001f, 8.25f);
        instancePath.lineTo(16.6501f, 8.25f);
        instancePath.cubicTo(16.9815f, 8.25f, 17.2501f, 8.51863f, 17.2501f, 8.85f);
        instancePath.cubicTo(17.2501f, 9.18137f, 16.9815f, 9.45f, 16.6501f, 9.45f);
        instancePath.lineTo(15.6001f, 9.45f);
        instancePath.cubicTo(15.2688f, 9.45f, 15.0001f, 9.18137f, 15.0001f, 8.85f);
        instancePath.close();
        instancePath.moveTo(6.60012f, 8.25f);
        instancePath.cubicTo(6.26875f, 8.25f, 6.00012f, 8.51863f, 6.00012f, 8.85f);
        instancePath.cubicTo(6.00012f, 9.18137f, 6.26875f, 9.45f, 6.60012f, 9.45f);
        instancePath.lineTo(12.9001f, 9.45f);
        instancePath.cubicTo(13.2315f, 9.45f, 13.5001f, 9.18137f, 13.5001f, 8.85f);
        instancePath.cubicTo(13.5001f, 8.51863f, 13.2315f, 8.25f, 12.9001f, 8.25f);
        instancePath.lineTo(6.60012f, 8.25f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
