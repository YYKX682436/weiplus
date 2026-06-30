package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_mini_program_circle_regular extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 22.0f);
                instancePath.cubicTo(6.47715f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 6.47715f, 6.47715f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(17.5228f, 2.0f, 22.0f, 6.47715f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 20.8f);
                instancePath.cubicTo(16.8601f, 20.8f, 20.8f, 16.8601f, 20.8f, 12.0f);
                instancePath.cubicTo(20.8f, 7.13989f, 16.8601f, 3.2f, 12.0f, 3.2f);
                instancePath.cubicTo(7.13989f, 3.2f, 3.2f, 7.13989f, 3.2f, 12.0f);
                instancePath.cubicTo(3.2f, 16.8601f, 7.13989f, 20.8f, 12.0f, 20.8f);
                instancePath.close();
                instancePath.moveTo(15.006f, 12.5246f);
                instancePath.lineTo(15.1444f, 12.5232f);
                instancePath.cubicTo(16.6131f, 12.2677f, 17.6818f, 11.1161f, 17.6818f, 9.72766f);
                instancePath.cubicTo(17.6818f, 8.15993f, 16.2769f, 6.90039f, 14.5515f, 6.90039f);
                instancePath.cubicTo(12.8261f, 6.90039f, 11.4212f, 8.15993f, 11.4212f, 9.72766f);
                instancePath.lineTo(11.4212f, 14.2731f);
                instancePath.cubicTo(11.4212f, 15.2188f, 10.5244f, 15.9913f, 9.39999f, 15.9913f);
                instancePath.cubicTo(8.27558f, 15.9913f, 7.37878f, 15.2188f, 7.37878f, 14.2731f);
                instancePath.cubicTo(7.37878f, 13.5138f, 7.97001f, 12.8476f, 8.81739f, 12.6431f);
                instancePath.cubicTo(9.09587f, 12.5734f, 9.35984f, 12.3681f, 9.4616f, 12.1307f);
                instancePath.cubicTo(9.47802f, 12.0982f, 9.48916f, 12.0661f, 9.49484f, 12.032f);
                instancePath.cubicTo(9.49929f, 12.0053f, 9.50012f, 11.9838f, 9.49999f, 11.9398f);
                instancePath.cubicTo(9.49999f, 11.6866f, 9.28606f, 11.5065f, 8.97575f, 11.5065f);
                instancePath.lineTo(8.85453f, 11.5065f);
                instancePath.cubicTo(7.3865f, 11.7287f, 6.29999f, 12.8995f, 6.29999f, 14.2731f);
                instancePath.cubicTo(6.29999f, 15.8409f, 7.70485f, 17.1004f, 9.43029f, 17.1004f);
                instancePath.cubicTo(11.1557f, 17.1004f, 12.5606f, 15.8409f, 12.5606f, 14.2731f);
                instancePath.lineTo(12.5606f, 9.72766f);
                instancePath.cubicTo(12.5606f, 8.78198f, 13.4574f, 8.00948f, 14.5818f, 8.00948f);
                instancePath.cubicTo(15.7062f, 8.00948f, 16.603f, 8.78198f, 16.603f, 9.72766f);
                instancePath.cubicTo(16.603f, 10.5131f, 16.0164f, 11.1824f, 15.1644f, 11.388f);
                instancePath.cubicTo(14.8714f, 11.4531f, 14.6274f, 11.6502f, 14.5202f, 11.9004f);
                instancePath.cubicTo(14.3686f, 12.2415f, 14.6025f, 12.5246f, 15.006f, 12.5246f);
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
