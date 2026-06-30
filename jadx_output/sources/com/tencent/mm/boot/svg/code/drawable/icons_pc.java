package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_pc extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 64;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.5f, 15.733299f);
        instancePath.cubicTo(8.5f, 14.683958f, 9.350658f, 13.8333f, 10.4f, 13.8333f);
        instancePath.lineTo(53.6f, 13.8333f);
        instancePath.cubicTo(54.649338f, 13.8333f, 55.5f, 14.683958f, 55.5f, 15.733299f);
        instancePath.lineTo(55.5f, 46.933296f);
        instancePath.cubicTo(55.5f, 47.982635f, 54.649338f, 48.833298f, 53.6f, 48.833298f);
        instancePath.lineTo(10.4f, 48.833298f);
        instancePath.cubicTo(9.350658f, 48.833298f, 8.5f, 47.982635f, 8.5f, 46.933296f);
        instancePath.lineTo(8.5f, 15.733299f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(23.4f, 52.4532f);
        instancePath2.cubicTo(22.8477f, 52.4532f, 22.4f, 52.9009f, 22.4f, 53.4532f);
        instancePath2.lineTo(22.4f, 53.5001f);
        instancePath2.lineTo(41.6f, 53.5001f);
        instancePath2.lineTo(41.6f, 53.4532f);
        instancePath2.cubicTo(41.6f, 52.9009f, 41.1523f, 52.4532f, 40.6f, 52.4532f);
        instancePath2.lineTo(23.4f, 52.4532f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
