package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_ringing extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.035257f, 6.0f);
                instancePath.lineTo(15.675531f, 6.3497066f);
                instancePath.cubicTo(15.778631f, 6.3596177f, 15.857142f, 6.4430184f, 15.857142f, 6.542625f);
                instancePath.lineTo(15.857142f, 8.479497f);
                instancePath.cubicTo(15.857142f, 8.571278f, 15.790805f, 8.648163f, 15.701707f, 8.668257f);
                instancePath.lineTo(15.645417f, 8.673137f);
                instancePath.lineTo(13.436975f, 8.460491f);
                instancePath.lineTo(13.436975f, 16.061193f);
                instancePath.lineTo(13.427873f, 16.06182f);
                instancePath.cubicTo(13.325673f, 17.148512f, 12.375519f, 18.0f, 11.218488f, 18.0f);
                instancePath.cubicTo(9.993251f, 18.0f, 9.0f, 17.045164f, 9.0f, 15.867313f);
                instancePath.cubicTo(9.0f, 14.689464f, 9.993251f, 13.734628f, 11.218488f, 13.734628f);
                instancePath.cubicTo(11.428403f, 13.734628f, 11.631509f, 13.762654f, 11.8239765f, 13.815028f);
                instancePath.lineTo(11.823528f, 6.1936398f);
                instancePath.cubicTo(11.823528f, 6.1018596f, 11.88987f, 6.024974f, 11.978968f, 6.00488f);
                instancePath.lineTo(12.035257f, 6.0f);
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
