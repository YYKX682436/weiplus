package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_light extends l95.c {
    private final int width = 31;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 31;
        }
        if (i17 == 1) {
            return 30;
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
            instancePaint3.setColor(-855638017);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(19.25f, 3.50003f);
            instancePath.cubicTo(19.25f, 3.28869f, 19.1171f, 3.10018f, 18.9181f, 3.02913f);
            instancePath.cubicTo(18.7191f, 2.95808f, 18.4969f, 3.01984f, 18.363f, 3.18341f);
            instancePath.lineTo(7.11303f, 16.9334f);
            instancePath.cubicTo(6.99069f, 17.0829f, 6.96544f, 17.2896f, 7.04817f, 17.4641f);
            instancePath.cubicTo(7.1309f, 17.6387f, 7.30681f, 17.75f, 7.50001f, 17.75f);
            instancePath.lineTo(12.0f, 17.75f);
            instancePath.lineTo(12.0f, 26.0f);
            instancePath.cubicTo(12.0f, 26.2114f, 12.1329f, 26.3999f, 12.3319f, 26.4709f);
            instancePath.cubicTo(12.5309f, 26.542f, 12.7532f, 26.4802f, 12.887f, 26.3166f);
            instancePath.lineTo(24.137f, 12.5666f);
            instancePath.cubicTo(24.2593f, 12.4171f, 24.2846f, 12.2105f, 24.2018f, 12.0359f);
            instancePath.cubicTo(24.1191f, 11.8613f, 23.9432f, 11.75f, 23.75f, 11.75f);
            instancePath.lineTo(19.25f, 11.75f);
            instancePath.lineTo(19.25f, 3.50003f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
