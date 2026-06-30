package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_fav_tips_arrow extends l95.c {
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
            instancePath.moveTo(40.046875f, 16.890625f);
            instancePath.lineTo(57.546875f, 34.390625f);
            instancePath.cubicTo(57.945312f, 34.789062f, 58.164062f, 35.30078f, 58.19922f, 35.82422f);
            instancePath.lineTo(58.19922f, 36.152344f);
            instancePath.cubicTo(58.164062f, 36.67578f, 57.945312f, 37.1875f, 57.546875f, 37.585938f);
            instancePath.lineTo(40.046875f, 55.085938f);
            instancePath.lineTo(37.5f, 52.54297f);
            instancePath.lineTo(54.05078f, 35.98828f);
            instancePath.lineTo(37.5f, 19.4375f);
            instancePath.close();
            instancePath.moveTo(38.25f, 34.19922f);
            instancePath.lineTo(38.25f, 37.80078f);
            instancePath.lineTo(13.5f, 37.80078f);
            instancePath.lineTo(13.5f, 34.19922f);
            instancePath.close();
            instancePath.moveTo(38.25f, 34.19922f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
