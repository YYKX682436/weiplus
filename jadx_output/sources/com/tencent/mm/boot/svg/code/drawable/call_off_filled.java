package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class call_off_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(22.9204f, 14.619f);
            instancePath.lineTo(22.9324f, 14.6075f);
            instancePath.cubicTo(22.9651f, 14.5748f, 22.9962f, 14.5398f, 23.0261f, 14.5026f);
            instancePath.cubicTo(23.0876f, 14.4263f, 23.1423f, 14.3433f, 23.1931f, 14.2546f);
            instancePath.lineTo(23.2768f, 14.0958f);
            instancePath.cubicTo(24.0621f, 12.399f, 23.7331f, 10.4043f, 22.4086f, 9.07986f);
            instancePath.cubicTo(22.2274f, 8.89867f, 22.026f, 8.73788f, 21.7999f, 8.58208f);
            instancePath.lineTo(21.5262f, 8.40083f);
            instancePath.cubicTo(18.6459f, 6.59014f, 15.3579f, 5.66129f, 11.9996f, 5.66113f);
            instancePath.cubicTo(8.6413f, 5.66097f, 5.35342f, 6.58951f, 2.50735f, 8.37649f);
            instancePath.cubicTo(2.26701f, 8.50919f, 1.89447f, 8.77528f, 1.59085f, 9.0789f);
            instancePath.cubicTo(0.266519f, 10.4032f, -0.0623403f, 12.3979f, 0.716513f, 14.0811f);
            instancePath.lineTo(0.788229f, 14.2294f);
            instancePath.cubicTo(0.843872f, 14.3353f, 0.906026f, 14.4317f, 0.98202f, 14.5193f);
            instancePath.cubicTo(1.01813f, 14.5609f, 1.05663f, 14.5994f, 1.09817f, 14.6346f);
            instancePath.cubicTo(1.58042f, 15.0566f, 2.23762f, 15.1812f, 2.81956f, 14.9453f);
            instancePath.lineTo(6.22986f, 13.3998f);
            instancePath.cubicTo(6.54764f, 13.2413f, 6.66714f, 13.0687f, 6.76483f, 12.7365f);
            instancePath.lineTo(7.20514f, 11.2334f);
            instancePath.lineTo(7.48676f, 10.3006f);
            instancePath.lineTo(7.64509f, 9.79075f);
            instancePath.cubicTo(7.69233f, 9.63346f, 7.76278f, 9.51269f, 7.87091f, 9.40456f);
            instancePath.cubicTo(7.97976f, 9.29571f, 8.11023f, 9.22546f, 8.26567f, 9.18846f);
            instancePath.cubicTo(9.60033f, 8.84344f, 10.8336f, 8.66882f, 12.0064f, 8.67873f);
            instancePath.cubicTo(13.1819f, 8.6788f, 14.4204f, 8.85728f, 15.7352f, 9.19739f);
            instancePath.cubicTo(15.8931f, 9.23508f, 16.0369f, 9.31338f, 16.1394f, 9.4159f);
            instancePath.cubicTo(16.2412f, 9.51769f, 16.3201f, 9.65151f, 16.3631f, 9.79498f);
            instancePath.lineTo(16.6044f, 10.5627f);
            instancePath.lineTo(16.9606f, 11.7493f);
            instancePath.lineTo(17.2432f, 12.7384f);
            instancePath.cubicTo(17.3436f, 13.0801f, 17.4757f, 13.2689f, 17.7759f, 13.4089f);
            instancePath.lineTo(21.1727f, 14.9492f);
            instancePath.cubicTo(21.7801f, 15.1959f, 22.4438f, 15.0649f, 22.9204f, 14.619f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
