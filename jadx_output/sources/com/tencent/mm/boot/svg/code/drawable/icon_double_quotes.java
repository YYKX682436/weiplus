package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_double_quotes extends l95.c {
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint3.setColor(-16777216);
                instancePaint4.setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(18.24f, 5.64f);
                instancePath.cubicTo(16.48f, 6.08f, 15.12f, 6.96f, 14.08f, 8.28f);
                instancePath.cubicTo(13.04f, 9.559999f, 12.559999f, 11.12f, 12.559999f, 12.92f);
                instancePath.cubicTo(12.559999f, 14.04f, 12.799999f, 15.0f, 13.32f, 15.72f);
                instancePath.cubicTo(13.88f, 16.44f, 14.599999f, 16.84f, 15.5199995f, 16.84f);
                instancePath.cubicTo(16.279999f, 16.84f, 16.88f, 16.6f, 17.359999f, 16.16f);
                instancePath.cubicTo(17.839998f, 15.68f, 18.119999f, 15.08f, 18.119999f, 14.36f);
                instancePath.cubicTo(18.119999f, 13.639999f, 17.88f, 13.08f, 17.439999f, 12.599999f);
                instancePath.cubicTo(16.96f, 12.12f, 16.359999f, 11.919999f, 15.679998f, 11.919999f);
                instancePath.cubicTo(15.279999f, 11.919999f, 14.959998f, 11.959999f, 14.799998f, 12.039999f);
                instancePath.cubicTo(14.799998f, 11.079999f, 15.079998f, 10.199999f, 15.679998f, 9.439999f);
                instancePath.cubicTo(16.319998f, 8.5599985f, 17.159998f, 7.9599986f, 18.239998f, 7.6399984f);
                instancePath.lineTo(18.239998f, 5.6399984f);
                instancePath.close();
                instancePath.moveTo(10.32f, 5.64f);
                instancePath.cubicTo(8.559999f, 6.08f, 7.2f, 6.96f, 6.2f, 8.28f);
                instancePath.cubicTo(5.16f, 9.559999f, 4.64f, 11.12f, 4.64f, 12.92f);
                instancePath.cubicTo(4.64f, 14.08f, 4.8799996f, 15.0f, 5.44f, 15.72f);
                instancePath.cubicTo(5.96f, 16.44f, 6.6800003f, 16.84f, 7.6000004f, 16.84f);
                instancePath.cubicTo(8.400001f, 16.84f, 9.040001f, 16.6f, 9.52f, 16.16f);
                instancePath.cubicTo(9.96f, 15.68f, 10.200001f, 15.08f, 10.200001f, 14.36f);
                instancePath.cubicTo(10.200001f, 13.639999f, 9.960001f, 13.08f, 9.4800005f, 12.599999f);
                instancePath.cubicTo(9.000001f, 12.12f, 8.440001f, 11.919999f, 7.8000007f, 11.919999f);
                instancePath.cubicTo(7.3600006f, 11.919999f, 7.040001f, 11.959999f, 6.8800006f, 12.039999f);
                instancePath.cubicTo(6.8800006f, 11.079999f, 7.160001f, 10.199999f, 7.8000007f, 9.399999f);
                instancePath.cubicTo(8.400001f, 8.5599985f, 9.240001f, 7.9599986f, 10.320001f, 7.6399984f);
                instancePath.lineTo(10.320001f, 5.6399984f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
