package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outline_miniprogram_live extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(9.601562f, 20.101562f);
            instancePath.lineTo(9.601562f, 51.898438f);
            instancePath.lineTo(47.398438f, 51.898438f);
            instancePath.lineTo(47.398438f, 20.101562f);
            instancePath.close();
            instancePath.moveTo(9.0f, 16.5f);
            instancePath.lineTo(48.0f, 16.5f);
            instancePath.cubicTo(49.65625f, 16.5f, 51.0f, 17.84375f, 51.0f, 19.5f);
            instancePath.lineTo(51.0f, 52.5f);
            instancePath.cubicTo(51.0f, 54.15625f, 49.65625f, 55.5f, 48.0f, 55.5f);
            instancePath.lineTo(9.0f, 55.5f);
            instancePath.cubicTo(7.34375f, 55.5f, 6.0f, 54.15625f, 6.0f, 52.5f);
            instancePath.lineTo(6.0f, 19.5f);
            instancePath.cubicTo(6.0f, 17.84375f, 7.34375f, 16.5f, 9.0f, 16.5f);
            instancePath.close();
            instancePath.moveTo(57.601562f, 40.26953f);
            instancePath.lineTo(65.39844f, 46.507812f);
            instancePath.lineTo(65.39844f, 25.492188f);
            instancePath.lineTo(57.601562f, 31.730469f);
            instancePath.close();
            instancePath.moveTo(54.0f, 30.0f);
            instancePath.lineTo(64.125f, 21.898438f);
            instancePath.cubicTo(65.41797f, 20.863281f, 67.30859f, 21.074219f, 68.34375f, 22.367188f);
            instancePath.cubicTo(68.76953f, 22.898438f, 69.0f, 23.5625f, 69.0f, 24.242188f);
            instancePath.lineTo(69.0f, 47.757812f);
            instancePath.cubicTo(69.0f, 49.414062f, 67.65625f, 50.757812f, 66.0f, 50.757812f);
            instancePath.cubicTo(65.32031f, 50.757812f, 64.65625f, 50.527344f, 64.125f, 50.101562f);
            instancePath.lineTo(54.0f, 42.0f);
            instancePath.close();
            instancePath.moveTo(54.0f, 30.0f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(21.0f, 28.199219f);
            instancePath2.cubicTo(21.0f, 30.023438f, 19.523438f, 31.5f, 17.699219f, 31.5f);
            instancePath2.cubicTo(15.878906f, 31.5f, 14.398438f, 30.023438f, 14.398438f, 28.199219f);
            instancePath2.cubicTo(14.398438f, 26.378906f, 15.878906f, 24.898438f, 17.699219f, 24.898438f);
            instancePath2.cubicTo(19.523438f, 24.898438f, 21.0f, 26.378906f, 21.0f, 28.199219f);
            instancePath2.close();
            instancePath2.moveTo(21.0f, 28.199219f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
