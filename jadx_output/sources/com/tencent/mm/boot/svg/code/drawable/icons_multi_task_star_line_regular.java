package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_multi_task_star_line_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.1479f, 14.1107f);
        instancePath.lineTo(20.2955f, 10.0677f);
        instancePath.lineTo(14.5636f, 9.23482f);
        instancePath.lineTo(12.0002f, 4.04081f);
        instancePath.lineTo(9.43679f, 9.23482f);
        instancePath.lineTo(3.70486f, 10.0677f);
        instancePath.lineTo(7.85252f, 14.1107f);
        instancePath.lineTo(6.87339f, 19.8195f);
        instancePath.lineTo(12.0002f, 17.1241f);
        instancePath.lineTo(17.127f, 19.8195f);
        instancePath.lineTo(16.1479f, 14.1107f);
        instancePath.close();
        instancePath.moveTo(12.0002f, 18.5508f);
        instancePath.lineTo(7.08356f, 21.1356f);
        instancePath.cubicTo(6.56914f, 21.4061f, 5.93287f, 21.2083f, 5.66242f, 20.6939f);
        instancePath.cubicTo(5.55473f, 20.489f, 5.51757f, 20.2544f, 5.55669f, 20.0263f);
        instancePath.lineTo(6.49568f, 14.5516f);
        instancePath.lineTo(2.51805f, 10.6743f);
        instancePath.cubicTo(2.10187f, 10.2686f, 2.09335f, 9.6024f, 2.49903f, 9.18623f);
        instancePath.cubicTo(2.66057f, 9.0205f, 2.87223f, 8.91265f, 3.10126f, 8.87937f);
        instancePath.lineTo(8.59822f, 8.08062f);
        instancePath.lineTo(11.0565f, 3.09953f);
        instancePath.cubicTo(11.3137f, 2.57836f, 11.9447f, 2.36439f, 12.4659f, 2.6216f);
        instancePath.cubicTo(12.6734f, 2.72402f, 12.8414f, 2.892f, 12.9438f, 3.09953f);
        instancePath.lineTo(15.4022f, 8.08062f);
        instancePath.lineTo(20.8991f, 8.87937f);
        instancePath.cubicTo(21.4743f, 8.96295f, 21.8728f, 9.49694f, 21.7892f, 10.0721f);
        instancePath.cubicTo(21.7559f, 10.3011f, 21.6481f, 10.5128f, 21.4823f, 10.6743f);
        instancePath.lineTo(17.5047f, 14.5516f);
        instancePath.lineTo(18.4437f, 20.0263f);
        instancePath.cubicTo(18.5419f, 20.5991f, 18.1572f, 21.1431f, 17.5844f, 21.2414f);
        instancePath.cubicTo(17.3563f, 21.2805f, 17.1217f, 21.2433f, 16.9168f, 21.1356f);
        instancePath.lineTo(12.0002f, 18.5508f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
