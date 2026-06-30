package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class arrow_down_line extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                instancePaint3.setColor(-2130706433);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.70538f, 4.46127f);
                instancePath.cubicTo(9.8681f, 4.29855f, 10.1319f, 4.29855f, 10.2946f, 4.46127f);
                instancePath.lineTo(10.8839f, 5.05053f);
                instancePath.lineTo(13.5355f, 7.70218f);
                instancePath.lineTo(12.6517f, 8.58606f);
                instancePath.lineTo(10.625f, 6.55941f);
                instancePath.lineTo(10.625f, 9.97078f);
                instancePath.lineTo(10.6251f, 9.97078f);
                instancePath.lineTo(10.6251f, 15.8334f);
                instancePath.lineTo(9.37506f, 15.8334f);
                instancePath.lineTo(9.37506f, 10.8333f);
                instancePath.lineTo(9.37501f, 10.8333f);
                instancePath.lineTo(9.37501f, 6.55941f);
                instancePath.lineTo(7.34836f, 8.58606f);
                instancePath.lineTo(6.46448f, 7.70218f);
                instancePath.lineTo(9.11613f, 5.05053f);
                instancePath.lineTo(9.70538f, 4.46127f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
