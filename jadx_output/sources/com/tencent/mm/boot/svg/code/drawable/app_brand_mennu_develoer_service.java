package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_mennu_develoer_service extends l95.c {
    private final int width = 32;
    private final int height = 33;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 32;
        }
        if (i17 == 1) {
            return 33;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(16.0f, 29.5833f);
            instancePath.cubicTo(8.63622f, 29.5833f, 2.66669f, 23.6138f, 2.66669f, 16.25f);
            instancePath.cubicTo(2.66669f, 8.88616f, 8.63622f, 2.91663f, 16.0f, 2.91663f);
            instancePath.cubicTo(23.3638f, 2.91663f, 29.3334f, 8.88616f, 29.3334f, 16.25f);
            instancePath.cubicTo(29.3334f, 23.6138f, 23.3638f, 29.5833f, 16.0f, 29.5833f);
            instancePath.close();
            instancePath.moveTo(16.0f, 27.9833f);
            instancePath.cubicTo(22.4802f, 27.9833f, 27.7334f, 22.7301f, 27.7334f, 16.25f);
            instancePath.cubicTo(27.7334f, 9.76982f, 22.4802f, 4.51663f, 16.0f, 4.51663f);
            instancePath.cubicTo(9.51988f, 4.51663f, 4.26669f, 9.76982f, 4.26669f, 16.25f);
            instancePath.cubicTo(4.26669f, 22.7301f, 9.51988f, 27.9833f, 16.0f, 27.9833f);
            instancePath.close();
            instancePath.moveTo(20.0081f, 16.9495f);
            instancePath.lineTo(20.1925f, 16.9475f);
            instancePath.cubicTo(22.1508f, 16.6069f, 23.5758f, 15.0714f, 23.5758f, 13.2202f);
            instancePath.cubicTo(23.5758f, 11.1299f, 21.7026f, 9.45048f, 19.402f, 9.45048f);
            instancePath.cubicTo(17.1014f, 9.45048f, 15.2283f, 11.1299f, 15.2283f, 13.2202f);
            instancePath.lineTo(15.2283f, 19.2808f);
            instancePath.cubicTo(15.2283f, 20.5417f, 14.0325f, 21.5717f, 12.5333f, 21.5717f);
            instancePath.cubicTo(11.0341f, 21.5717f, 9.83839f, 20.5417f, 9.83839f, 19.2808f);
            instancePath.cubicTo(9.83839f, 18.2683f, 10.6267f, 17.3801f, 11.7565f, 17.1074f);
            instancePath.cubicTo(12.1278f, 17.0145f, 12.4798f, 16.7408f, 12.6155f, 16.4242f);
            instancePath.cubicTo(12.6374f, 16.3809f, 12.6522f, 16.338f, 12.6598f, 16.2926f);
            instancePath.cubicTo(12.6657f, 16.257f, 12.6668f, 16.2284f, 12.6667f, 16.1697f);
            instancePath.cubicTo(12.6667f, 15.8321f, 12.3814f, 15.5919f, 11.9677f, 15.5919f);
            instancePath.lineTo(11.8061f, 15.5919f);
            instancePath.cubicTo(9.84869f, 15.8882f, 8.4f, 17.4493f, 8.4f, 19.2808f);
            instancePath.cubicTo(8.4f, 21.3711f, 10.2732f, 23.0505f, 12.5737f, 23.0505f);
            instancePath.cubicTo(14.8743f, 23.0505f, 16.7475f, 21.3711f, 16.7475f, 19.2808f);
            instancePath.lineTo(16.7475f, 13.2202f);
            instancePath.cubicTo(16.7475f, 11.9593f, 17.9432f, 10.9293f, 19.4424f, 10.9293f);
            instancePath.cubicTo(20.9416f, 10.9293f, 22.1374f, 11.9593f, 22.1374f, 13.2202f);
            instancePath.cubicTo(22.1374f, 14.2675f, 21.3552f, 15.1598f, 20.2192f, 15.434f);
            instancePath.cubicTo(19.8286f, 15.5208f, 19.5032f, 15.7836f, 19.3603f, 16.1171f);
            instancePath.cubicTo(19.1581f, 16.5719f, 19.47f, 16.9495f, 20.0081f, 16.9495f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
