package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voicepost_beginicon extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-15028967);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(29.278912f, 21.516287f);
                instancePath.lineTo(52.24126f, 35.468605f);
                instancePath.cubicTo(52.949238f, 35.898785f, 53.17444f, 36.82145f, 52.74426f, 37.52943f);
                instancePath.cubicTo(52.61935f, 37.735f, 52.44683f, 37.90752f, 52.24126f, 38.03243f);
                instancePath.lineTo(29.278912f, 51.98475f);
                instancePath.cubicTo(28.57093f, 52.41493f, 27.64827f, 52.189728f, 27.218088f, 51.481747f);
                instancePath.cubicTo(27.07544f, 51.24698f, 27.0f, 50.977547f, 27.0f, 50.702835f);
                instancePath.lineTo(27.0f, 22.798197f);
                instancePath.cubicTo(27.0f, 21.96977f, 27.671574f, 21.298197f, 28.5f, 21.298197f);
                instancePath.cubicTo(28.77471f, 21.298197f, 29.044144f, 21.373636f, 29.278912f, 21.516287f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                instancePaint5.setColor(-15028967);
                instancePaint5.setStrokeWidth(3.6f);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(36.0f, 1.7999992f);
                instancePath2.cubicTo(54.888138f, 1.7999992f, 70.2f, 17.11186f, 70.2f, 36.0f);
                instancePath2.cubicTo(70.2f, 54.888138f, 54.888138f, 70.2f, 36.0f, 70.2f);
                instancePath2.cubicTo(17.11186f, 70.2f, 1.7999992f, 54.888138f, 1.7999992f, 36.0f);
                instancePath2.cubicTo(1.7999992f, 17.11186f, 17.11186f, 1.7999992f, 36.0f, 1.7999992f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
