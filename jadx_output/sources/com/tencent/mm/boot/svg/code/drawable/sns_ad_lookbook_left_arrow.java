package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_lookbook_left_arrow extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePaint3.setColor(-1946157056);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.6464f, 2.14645f);
                instancePath.lineTo(1.1464f, 5.64645f);
                instancePath.lineTo(0.792847f, 6.0f);
                instancePath.lineTo(1.1464f, 6.35355f);
                instancePath.lineTo(4.6464f, 9.85355f);
                instancePath.lineTo(5.35351f, 9.14645f);
                instancePath.lineTo(2.70706f, 6.5f);
                instancePath.lineTo(11.5f, 6.5f);
                instancePath.lineTo(11.5f, 5.5f);
                instancePath.lineTo(2.70706f, 5.5f);
                instancePath.lineTo(5.35351f, 2.85355f);
                instancePath.lineTo(4.6464f, 2.14645f);
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
