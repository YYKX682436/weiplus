package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_full_share_new extends l95.c {
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
            instancePath.moveTo(39.01172f, 8.992188f);
            instancePath.cubicTo(39.80078f, 8.992188f, 40.558594f, 9.304688f, 41.121094f, 9.863281f);
            instancePath.lineTo(62.63672f, 31.171875f);
            instancePath.cubicTo(63.722656f, 32.25f, 63.8125f, 33.94922f, 62.90625f, 35.132812f);
            instancePath.lineTo(62.63672f, 35.433594f);
            instancePath.lineTo(41.121094f, 56.746094f);
            instancePath.cubicTo(39.945312f, 57.910156f, 38.046875f, 57.902344f, 36.878906f, 56.726562f);
            instancePath.cubicTo(36.32422f, 56.164062f, 36.01172f, 55.402344f, 36.01172f, 54.61328f);
            instancePath.lineTo(36.01172f, 44.765625f);
            instancePath.cubicTo(28.996094f, 45.328125f, 18.753906f, 49.472656f, 13.425781f, 62.464844f);
            instancePath.cubicTo(12.542969f, 64.625f, 10.371094f, 64.60547f, 9.898438f, 61.808594f);
            instancePath.cubicTo(6.160156f, 39.66797f, 18.753906f, 24.644531f, 36.01172f, 21.925781f);
            instancePath.lineTo(36.01172f, 11.992188f);
            instancePath.cubicTo(36.01172f, 10.335938f, 37.35547f, 8.992188f, 39.01172f, 8.992188f);
            instancePath.close();
            instancePath.moveTo(40.507812f, 15.589844f);
            instancePath.lineTo(40.51172f, 25.773438f);
            instancePath.lineTo(36.710938f, 26.371094f);
            instancePath.cubicTo(23.515625f, 28.449219f, 14.644531f, 38.210938f, 13.8125f, 52.08203f);
            instancePath.lineTo(13.777344f, 52.660156f);
            instancePath.lineTo(13.914062f, 52.48047f);
            instancePath.cubicTo(19.324219f, 45.26953f, 26.832031f, 41.23828f, 34.765625f, 40.36328f);
            instancePath.lineTo(35.652344f, 40.277344f);
            instancePath.lineTo(40.51172f, 39.88672f);
            instancePath.lineTo(40.507812f, 51.015625f);
            instancePath.lineTo(58.39453f, 33.304688f);
            instancePath.close();
            instancePath.moveTo(40.507812f, 15.589844f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
