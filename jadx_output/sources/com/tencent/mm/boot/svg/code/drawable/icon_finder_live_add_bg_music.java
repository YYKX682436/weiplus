package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_finder_live_add_bg_music extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.3999f, 7.23011f);
            instancePath.cubicTo(16.9299f, 6.02011f, 14.3099f, 5.84011f, 13.3399f, 4.23011f);
            instancePath.cubicTo(13.2599f, 4.08011f, 13.1199f, 3.78011f, 13.0699f, 3.38011f);
            instancePath.cubicTo(13.0399f, 3.15011f, 12.9699f, 2.97011f, 12.8499f, 2.84011f);
            instancePath.cubicTo(12.8099f, 2.80011f, 12.7599f, 2.77011f, 12.7099f, 2.75011f);
            instancePath.cubicTo(12.7099f, 2.75011f, 12.6999f, 2.75011f, 12.6899f, 2.75011f);
            instancePath.cubicTo(12.6699f, 2.75011f, 12.6499f, 2.73011f, 12.6299f, 2.72011f);
            instancePath.cubicTo(12.1899f, 2.62011f, 11.9299f, 2.94011f, 11.9299f, 4.08011f);
            instancePath.lineTo(11.9299f, 12.2601f);
            instancePath.cubicTo(11.9299f, 15.5101f, 11.1399f, 14.8201f, 9.11992f, 15.3301f);
            instancePath.cubicTo(7.64992f, 15.7001f, 6.41992f, 16.6901f, 6.41992f, 18.2101f);
            instancePath.cubicTo(6.41992f, 19.7301f, 7.64992f, 20.9601f, 9.16992f, 20.9601f);
            instancePath.cubicTo(13.2499f, 20.9601f, 13.1299f, 16.7201f, 13.1299f, 15.1001f);
            instancePath.lineTo(13.1299f, 14.9301f);
            instancePath.lineTo(13.1299f, 8.00011f);
            instancePath.cubicTo(13.1299f, 6.47011f, 14.2299f, 6.66011f, 16.1299f, 7.35011f);
            instancePath.cubicTo(17.1999f, 7.75011f, 18.2199f, 8.21011f, 18.6299f, 9.33011f);
            instancePath.cubicTo(18.9699f, 10.6001f, 18.2399f, 11.7501f, 17.1199f, 12.3701f);
            instancePath.cubicTo(16.9099f, 12.4901f, 17.0399f, 12.8101f, 17.2699f, 12.7401f);
            instancePath.cubicTo(19.5299f, 12.0501f, 20.7099f, 9.01011f, 18.3999f, 7.25011f);
            instancePath.lineTo(18.3999f, 7.23011f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
