package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class webeans extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 0.0f);
                instancePath.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
                instancePath.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
                instancePath.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
                instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-983041);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(16.4178f, 8.38189f);
                instancePath2.cubicTo(15.7431f, 7.70723f, 14.8625f, 7.3299f, 13.8958f, 7.2299f);
                instancePath2.cubicTo(13.7738f, 7.52857f, 13.5845f, 7.8659f, 13.2985f, 8.26056f);
                instancePath2.cubicTo(12.4885f, 9.37922f, 11.2478f, 9.90922f, 11.2478f, 9.90922f);
                instancePath2.cubicTo(11.2478f, 9.90922f, 12.5485f, 8.52456f, 12.7025f, 7.1999f);
                instancePath2.cubicTo(12.7792f, 6.54057f, 12.6438f, 5.71924f, 12.3505f, 5.42258f);
                instancePath2.cubicTo(12.1758f, 5.24458f, 11.8765f, 5.34858f, 11.8518f, 5.59657f);
                instancePath2.cubicTo(11.8125f, 6.00324f, 11.6612f, 6.5599f, 11.2652f, 7.0879f);
                instancePath2.cubicTo(10.9478f, 7.51123f, 10.2745f, 7.99923f, 10.0338f, 8.16656f);
                instancePath2.cubicTo(9.45384f, 8.50723f, 8.89451f, 8.93389f, 8.38051f, 9.44789f);
                instancePath2.cubicTo(5.86719f, 11.9612f, 5.38986f, 15.5599f, 7.31519f, 17.4852f);
                instancePath2.cubicTo(9.23984f, 19.4098f, 12.8385f, 18.9332f, 15.3518f, 16.4192f);
                instancePath2.cubicTo(17.8658f, 13.9052f, 18.3431f, 10.3072f, 16.4178f, 8.38189f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
