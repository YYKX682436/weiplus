package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class enterprise_chat_entry_avatar extends l95.c {
    private final int width = 108;
    private final int height = 108;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 108;
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
                instancePaint3.setColor(-11890462);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(108.0f, 0.0f);
                instancePath.lineTo(108.0f, 108.0f);
                instancePath.lineTo(0.0f, 108.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(30.23671f, 67.60445f);
                instancePath2.cubicTo(27.256218f, 63.56331f, 25.517647f, 58.701523f, 25.517647f, 53.47059f);
                instancePath2.cubicTo(25.517647f, 39.436058f, 38.032604f, 28.058823f, 53.47059f, 28.058823f);
                instancePath2.cubicTo(68.90857f, 28.058823f, 81.42353f, 39.436058f, 81.42353f, 53.47059f);
                instancePath2.cubicTo(81.42353f, 67.50512f, 68.90857f, 78.882355f, 53.47059f, 78.882355f);
                instancePath2.cubicTo(48.763218f, 78.882355f, 44.327625f, 77.82453f, 40.43574f, 75.95611f);
                instancePath2.cubicTo(39.550022f, 75.52946f, 38.487812f, 75.472984f, 37.545677f, 75.72808f);
                instancePath2.cubicTo(35.13429f, 76.38291f, 30.31151f, 77.69258f, 30.31151f, 77.69258f);
                instancePath2.cubicTo(29.714825f, 77.854614f, 29.361446f, 77.49743f, 29.521812f, 76.894905f);
                instancePath2.cubicTo(29.521812f, 76.894905f, 30.542793f, 73.05886f, 31.053284f, 71.14084f);
                instancePath2.cubicTo(31.415718f, 69.68475f, 30.940517f, 68.555336f, 30.23671f, 67.60445f);
                instancePath2.close();
                instancePath2.moveTo(53.75012f, 57.42353f);
                instancePath2.cubicTo(55.757057f, 57.42353f, 57.384f, 55.78015f, 57.384f, 53.75294f);
                instancePath2.cubicTo(57.384f, 51.72573f, 55.757057f, 50.08235f, 53.75012f, 50.08235f);
                instancePath2.cubicTo(51.74318f, 50.08235f, 50.116234f, 51.72573f, 50.116234f, 53.75294f);
                instancePath2.cubicTo(50.116234f, 55.78015f, 51.74318f, 57.42353f, 53.75012f, 57.42353f);
                instancePath2.close();
                instancePath2.moveTo(38.09647f, 57.42353f);
                instancePath2.cubicTo(40.10341f, 57.42353f, 41.730354f, 55.78015f, 41.730354f, 53.75294f);
                instancePath2.cubicTo(41.730354f, 51.72573f, 40.10341f, 50.08235f, 38.09647f, 50.08235f);
                instancePath2.cubicTo(36.08953f, 50.08235f, 34.46259f, 51.72573f, 34.46259f, 53.75294f);
                instancePath2.cubicTo(34.46259f, 55.78015f, 36.08953f, 57.42353f, 38.09647f, 57.42353f);
                instancePath2.close();
                instancePath2.moveTo(69.40376f, 57.42353f);
                instancePath2.cubicTo(71.410706f, 57.42353f, 73.03764f, 55.78015f, 73.03764f, 53.75294f);
                instancePath2.cubicTo(73.03764f, 51.72573f, 71.410706f, 50.08235f, 69.40376f, 50.08235f);
                instancePath2.cubicTo(67.39683f, 50.08235f, 65.76988f, 51.72573f, 65.76988f, 53.75294f);
                instancePath2.cubicTo(65.76988f, 55.78015f, 67.39683f, 57.42353f, 69.40376f, 57.42353f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
