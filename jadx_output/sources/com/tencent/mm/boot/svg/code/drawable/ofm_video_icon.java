package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ofm_video_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.0f, 29.0f);
                instancePath.cubicTo(17.726973f, 27.70042f, 19.455055f, 28.159777f, 21.0f, 28.0f);
                instancePath.cubicTo(34.0089f, 28.089874f, 47.05442f, 27.920113f, 60.0f, 28.0f);
                instancePath.cubicTo(62.067753f, 27.960056f, 63.226467f, 30.137007f, 63.0f, 32.0f);
                instancePath.cubicTo(62.976746f, 42.61952f, 62.966755f, 53.34449f, 63.0f, 64.0f);
                instancePath.cubicTo(63.246445f, 65.83699f, 62.057766f, 68.023926f, 60.0f, 68.0f);
                instancePath.cubicTo(46.335217f, 68.023926f, 32.600464f, 67.94404f, 19.0f, 68.0f);
                instancePath.cubicTo(17.10766f, 68.2536f, 14.970034f, 67.06527f, 15.0f, 65.0f);
                instancePath.cubicTo(14.920089f, 54.383034f, 15.0899f, 43.678036f, 15.0f, 33.0f);
                instancePath.cubicTo(15.059934f, 31.435186f, 14.790233f, 29.447971f, 16.0f, 29.0f);
                instancePath.lineTo(16.0f, 29.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(66.0f, 41.0f);
                instancePath2.cubicTo(71.03873f, 37.01664f, 75.738205f, 32.185577f, 81.0f, 28.0f);
                instancePath2.cubicTo(82.33345f, 30.067574f, 81.93434f, 32.58901f, 82.0f, 35.0f);
                instancePath2.cubicTo(81.94432f, 44.71205f, 81.97425f, 54.505295f, 82.0f, 64.0f);
                instancePath2.cubicTo(82.00419f, 65.62985f, 81.66495f, 66.86031f, 81.0f, 68.0f);
                instancePath2.cubicTo(75.718254f, 63.82451f, 71.01877f, 58.993443f, 66.0f, 55.0f);
                instancePath2.lineTo(66.0f, 41.0f);
                instancePath2.lineTo(66.0f, 41.0f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
