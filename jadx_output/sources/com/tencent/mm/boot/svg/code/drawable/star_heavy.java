package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class star_heavy extends l95.c {
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.3964f, 9.07678f);
        instancePath.lineTo(12.0f, 4.05476f);
        instancePath.lineTo(9.60358f, 9.07678f);
        instancePath.lineTo(4.08684f, 9.80399f);
        instancePath.lineTo(8.12254f, 13.635f);
        instancePath.lineTo(7.10939f, 19.1064f);
        instancePath.lineTo(12.0f, 16.4521f);
        instancePath.lineTo(16.8906f, 19.1064f);
        instancePath.lineTo(15.8774f, 13.635f);
        instancePath.lineTo(19.9131f, 9.80399f);
        instancePath.lineTo(14.3964f, 9.07678f);
        instancePath.close();
        instancePath.moveTo(8.39979f, 7.41989f);
        instancePath.lineTo(2.81276f, 8.15636f);
        instancePath.cubicTo(1.72868f, 8.29926f, 1.2946f, 9.63524f, 2.08764f, 10.3881f);
        instancePath.lineTo(6.17475f, 14.2678f);
        instancePath.lineTo(5.14869f, 19.809f);
        instancePath.cubicTo(4.9496f, 20.8842f, 6.08605f, 21.7099f, 7.04708f, 21.1883f);
        instancePath.lineTo(12.0f, 18.5001f);
        instancePath.lineTo(16.9529f, 21.1883f);
        instancePath.cubicTo(17.9139f, 21.7099f, 19.0503f, 20.8842f, 18.8512f, 19.809f);
        instancePath.lineTo(17.8252f, 14.2678f);
        instancePath.lineTo(21.9123f, 10.3881f);
        instancePath.cubicTo(22.7053f, 9.63524f, 22.2713f, 8.29926f, 21.1872f, 8.15636f);
        instancePath.lineTo(15.6002f, 7.41989f);
        instancePath.lineTo(13.1732f, 2.33389f);
        instancePath.cubicTo(12.7023f, 1.34704f, 11.2976f, 1.34703f, 10.8267f, 2.33389f);
        instancePath.lineTo(8.39979f, 7.41989f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
