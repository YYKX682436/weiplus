package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_finder_live_add_bg_music_filled extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 28;
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
            instancePath.moveTo(21.7352f, 8.08397f);
            instancePath.cubicTo(19.7169f, 6.43897f, 17.6986f, 6.66064f, 16.1936f, 5.08564f);
            instancePath.cubicTo(15.7619f, 4.61897f, 15.5286f, 4.07064f, 15.4586f, 3.48731f);
            instancePath.cubicTo(15.3302f, 2.77564f, 14.5836f, 2.63564f, 14.1052f, 2.92731f);
            instancePath.cubicTo(14.0702f, 2.95064f, 14.0469f, 2.97397f, 14.0119f, 2.99731f);
            instancePath.cubicTo(13.9419f, 3.05564f, 13.8836f, 3.12564f, 13.8369f, 3.19564f);
            instancePath.cubicTo(13.5919f, 3.53397f, 13.4286f, 4.03564f, 13.4286f, 4.73564f);
            instancePath.lineTo(13.4286f, 14.0456f);
            instancePath.cubicTo(13.3702f, 17.009f, 12.8686f, 16.9273f, 10.2902f, 17.5806f);
            instancePath.cubicTo(8.27191f, 18.094f, 6.59191f, 19.4473f, 6.60358f, 21.524f);
            instancePath.cubicTo(6.61524f, 23.6006f, 8.44691f, 25.3273f, 10.5702f, 25.269f);
            instancePath.cubicTo(15.8319f, 25.129f, 15.7619f, 19.6573f, 15.7502f, 17.394f);
            instancePath.lineTo(15.7502f, 9.12231f);
            instancePath.cubicTo(15.7502f, 7.95564f, 16.5436f, 8.24731f, 18.0369f, 8.79564f);
            instancePath.lineTo(18.0252f, 8.79564f);
            instancePath.cubicTo(18.2469f, 8.86564f, 18.4686f, 8.94731f, 18.6902f, 9.00564f);
            instancePath.cubicTo(19.7402f, 9.42564f, 20.9419f, 9.92731f, 21.3269f, 10.954f);
            instancePath.cubicTo(21.8169f, 12.5056f, 20.7786f, 13.9173f, 19.2619f, 14.629f);
            instancePath.cubicTo(19.0402f, 14.734f, 19.1219f, 15.0723f, 19.3669f, 15.0723f);
            instancePath.cubicTo(22.7736f, 15.0606f, 24.8852f, 10.534f, 21.7236f, 8.08397f);
            instancePath.lineTo(21.7352f, 8.08397f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
