package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_finder_red_envelope extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-40634);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.3334f, 8.71638f);
        instancePath.lineTo(11.909f, 8.71638f);
        instancePath.cubicTo(12.0098f, 8.51896f, 12.0667f, 8.29566f, 12.0667f, 8.05901f);
        instancePath.cubicTo(12.0667f, 7.25232f, 11.4057f, 6.60065f, 10.5931f, 6.60065f);
        instancePath.cubicTo(10.1906f, 6.60065f, 9.81265f, 6.76179f, 9.53708f, 7.04187f);
        instancePath.cubicTo(8.70391f, 7.86334f, 8.32945f, 8.23253f, 7.99999f, 8.55737f);
        instancePath.lineTo(6.4297f, 7.00917f);
        instancePath.cubicTo(6.15139f, 6.74646f, 5.79013f, 6.60065f, 5.40713f, 6.60065f);
        instancePath.cubicTo(4.59454f, 6.60065f, 3.93335f, 7.25233f, 3.93335f, 8.05901f);
        instancePath.cubicTo(3.93335f, 8.29565f, 3.99021f, 8.51895f, 4.09108f, 8.71638f);
        instancePath.lineTo(2.66669f, 8.71638f);
        instancePath.lineTo(2.66669f, 3.2066f);
        instancePath.cubicTo(2.66669f, 2.83747f, 2.92816f, 2.40342f, 3.26254f, 2.23987f);
        instancePath.cubicTo(3.26254f, 2.23987f, 3.12619f, 2.29573f, 3.37996f, 2.18718f);
        instancePath.cubicTo(4.62366f, 1.65516f, 6.23703f, 1.33398f, 8.00002f, 1.33398f);
        instancePath.cubicTo(9.76074f, 1.33398f, 11.3722f, 1.65433f, 12.6153f, 2.18513f);
        instancePath.cubicTo(12.8708f, 2.29425f, 12.7335f, 2.23811f, 12.7335f, 2.23811f);
        instancePath.cubicTo(13.0648f, 2.40387f, 13.3334f, 2.8376f, 13.3334f, 3.2066f);
        instancePath.lineTo(13.3334f, 8.71638f);
        instancePath.close();
        instancePath.moveTo(13.3334f, 9.51638f);
        instancePath.lineTo(13.3334f, 13.9803f);
        instancePath.cubicTo(13.3334f, 14.3494f, 13.0369f, 14.6487f, 12.6661f, 14.6487f);
        instancePath.lineTo(3.33393f, 14.6487f);
        instancePath.cubicTo(2.96542f, 14.6487f, 2.66669f, 14.3493f, 2.66669f, 13.9803f);
        instancePath.lineTo(2.66669f, 9.51638f);
        instancePath.lineTo(5.34448f, 9.51638f);
        instancePath.cubicTo(5.36526f, 9.51724f, 5.38614f, 9.51768f, 5.40713f, 9.51768f);
        instancePath.lineTo(7.0259f, 9.51768f);
        instancePath.cubicTo(6.46155f, 10.0692f, 5.59335f, 10.792f, 4.42432f, 11.6824f);
        instancePath.lineTo(4.90906f, 12.3189f);
        instancePath.cubicTo(6.12523f, 11.3925f, 7.02772f, 10.6395f, 7.61973f, 10.0558f);
        instancePath.lineTo(8.00001f, 9.68083f);
        instancePath.cubicTo(8.11271f, 9.79195f, 8.23927f, 9.91673f, 8.38856f, 10.0639f);
        instancePath.cubicTo(8.97882f, 10.6459f, 9.8786f, 11.3962f, 11.0911f, 12.319f);
        instancePath.lineTo(11.5756f, 11.6823f);
        instancePath.cubicTo(10.4046f, 10.7912f, 9.53636f, 10.0684f, 8.97408f, 9.51768f);
        instancePath.lineTo(10.5931f, 9.51768f);
        instancePath.cubicTo(10.6141f, 9.51768f, 10.6349f, 9.51724f, 10.6557f, 9.51638f);
        instancePath.lineTo(13.3334f, 9.51638f);
        instancePath.close();
        instancePath.moveTo(10.6357f, 8.71638f);
        instancePath.lineTo(8.97815f, 8.71638f);
        instancePath.lineTo(10.103f, 7.60724f);
        instancePath.cubicTo(10.2338f, 7.47445f, 10.4069f, 7.40065f, 10.5931f, 7.40065f);
        instancePath.cubicTo(10.9664f, 7.40065f, 11.2667f, 7.69672f, 11.2667f, 8.059f);
        instancePath.cubicTo(11.2667f, 8.40766f, 10.989f, 8.69485f, 10.6357f, 8.71638f);
        instancePath.lineTo(10.6357f, 8.71638f);
        instancePath.close();
        instancePath.moveTo(5.36448f, 8.71638f);
        instancePath.cubicTo(5.01115f, 8.69485f, 4.73335f, 8.40762f, 4.73335f, 8.059f);
        instancePath.cubicTo(4.73335f, 7.69677f, 5.03379f, 7.40065f, 5.40713f, 7.40065f);
        instancePath.cubicTo(5.58443f, 7.40065f, 5.74974f, 7.46738f, 5.87436f, 7.58495f);
        instancePath.cubicTo(6.40643f, 8.10959f, 6.75395f, 8.45225f, 7.02184f, 8.71638f);
        instancePath.lineTo(5.36448f, 8.71638f);
        instancePath.lineTo(5.36448f, 8.71638f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
