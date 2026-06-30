package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_outline_at extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 24.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(11.948242f, 20.896484f);
            instancePath2.cubicTo(13.387695f, 20.896484f, 14.655273f, 20.72461f, 15.525391f, 20.423828f);
            instancePath2.lineTo(15.525391f, 19.360352f);
            instancePath2.cubicTo(14.794922f, 19.65039f, 13.40918f, 19.833008f, 11.958984f, 19.833008f);
            instancePath2.cubicTo(7.46875f, 19.833008f, 4.1816406f, 16.889648f, 4.1816406f, 11.958984f);
            instancePath2.cubicTo(4.1816406f, 7.361328f, 7.3720703f, 4.0634766f, 11.744141f, 4.0634766f);
            instancePath2.cubicTo(16.180664f, 4.0634766f, 19.263672f, 6.8671875f, 19.263672f, 10.970703f);
            instancePath2.cubicTo(19.263672f, 13.860352f, 18.286133f, 15.503906f, 16.857422f, 15.503906f);
            instancePath2.cubicTo(15.879883f, 15.503906f, 15.364258f, 14.859375f, 15.364258f, 13.881836f);
            instancePath2.lineTo(15.364258f, 7.7373047f);
            instancePath2.lineTo(14.118164f, 7.7373047f);
            instancePath2.lineTo(14.118164f, 9.251953f);
            instancePath2.lineTo(14.042969f, 9.251953f);
            instancePath2.cubicTo(13.645508f, 8.199219f, 12.560547f, 7.522461f, 11.314453f, 7.522461f);
            instancePath2.cubicTo(9.123047f, 7.522461f, 7.5976562f, 9.348633f, 7.5976562f, 11.991211f);
            instancePath2.cubicTo(7.5976562f, 14.698242f, 9.1015625f, 16.524414f, 11.314453f, 16.524414f);
            instancePath2.cubicTo(12.646484f, 16.524414f, 13.645508f, 15.847656f, 14.128906f, 14.623047f);
            instancePath2.lineTo(14.204102f, 14.623047f);
            instancePath2.cubicTo(14.365234f, 15.826172f, 15.375f, 16.59961f, 16.65332f, 16.59961f);
            instancePath2.cubicTo(19.016602f, 16.59961f, 20.43457f, 14.408203f, 20.43457f, 10.9921875f);
            instancePath2.cubicTo(20.43457f, 6.2333984f, 16.857422f, 3.0f, 11.84082f, 3.0f);
            instancePath2.cubicTo(6.663086f, 3.0f, 3.0f, 6.6416016f, 3.0f, 11.916016f);
            instancePath2.cubicTo(3.0f, 17.544922f, 6.7382812f, 20.896484f, 11.948242f, 20.896484f);
            instancePath2.close();
            instancePath2.moveTo(11.486328f, 15.353516f);
            instancePath2.cubicTo(9.928711f, 15.353516f, 8.9296875f, 14.042969f, 8.9296875f, 12.0234375f);
            instancePath2.cubicTo(8.9296875f, 9.993164f, 9.939453f, 8.671875f, 11.49707f, 8.671875f);
            instancePath2.cubicTo(13.097656f, 8.671875f, 14.09668f, 9.950195f, 14.09668f, 11.969727f);
            instancePath2.cubicTo(14.09668f, 14.021484f, 13.076172f, 15.353516f, 11.486328f, 15.353516f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
