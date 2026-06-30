package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ok_icon extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 120;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
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
                instancePaint3.setColor(-15028967);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(31.45011f, 60.4841f);
                instancePath.lineTo(32.711105f, 58.771122f);
                instancePath.lineTo(32.711105f, 58.771122f);
                instancePath.cubicTo(33.36593f, 57.881584f, 34.61788f, 57.69131f, 35.50742f, 58.346134f);
                instancePath.cubicTo(35.51739f, 58.353477f, 35.527294f, 58.36091f, 35.53713f, 58.36843f);
                instancePath.lineTo(49.747337f, 69.241776f);
                instancePath.lineTo(49.747337f, 69.241776f);
                instancePath.cubicTo(50.4887f, 69.80905f, 51.523895f, 69.78802f, 52.241604f, 69.19109f);
                instancePath.lineTo(89.730385f, 38.011433f);
                instancePath.lineTo(89.730385f, 38.011433f);
                instancePath.cubicTo(90.52095f, 37.35392f, 91.68126f, 37.403004f, 92.41347f, 38.124935f);
                instancePath.lineTo(93.147606f, 38.848774f);
                instancePath.lineTo(93.147606f, 38.848774f);
                instancePath.cubicTo(93.93415f, 39.624283f, 93.9431f, 40.89058f, 93.16759f, 41.677128f);
                instancePath.cubicTo(93.16016f, 41.684666f, 93.152664f, 41.692146f, 93.14511f, 41.699566f);
                instancePath.lineTo(52.450825f, 81.68274f);
                instancePath.lineTo(52.450825f, 81.68274f);
                instancePath.cubicTo(51.66292f, 82.45688f, 50.39664f, 82.44572f, 49.62251f, 81.657814f);
                instancePath.cubicTo(49.618988f, 81.65423f, 49.615482f, 81.650635f, 49.611988f, 81.647026f);
                instancePath.lineTo(31.623617f, 63.060673f);
                instancePath.lineTo(31.623617f, 63.060673f);
                instancePath.cubicTo(30.944754f, 62.35924f, 30.871418f, 61.270214f, 31.45011f, 60.4841f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
