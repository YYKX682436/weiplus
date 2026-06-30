package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_live_nearby extends l95.c {
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
            instancePath.moveTo(31.71875f, 37.5f);
            instancePath.lineTo(40.28125f, 37.5f);
            instancePath.cubicTo(42.88672f, 37.5f, 45.0f, 39.722656f, 45.0f, 42.472656f);
            instancePath.cubicTo(45.0f, 42.617188f, 44.992188f, 42.765625f, 44.976562f, 42.914062f);
            instancePath.lineTo(41.88672f, 63.445312f);
            instancePath.cubicTo(41.66797f, 64.91406f, 40.40625f, 66.0f, 38.921875f, 66.0f);
            instancePath.lineTo(33.07422f, 66.0f);
            instancePath.cubicTo(31.589844f, 66.0f, 30.328125f, 64.91406f, 30.109375f, 63.445312f);
            instancePath.lineTo(27.019531f, 42.914062f);
            instancePath.cubicTo(26.789062f, 40.179688f, 28.703125f, 37.765625f, 31.296875f, 37.51953f);
            instancePath.cubicTo(31.4375f, 37.507812f, 31.578125f, 37.5f, 31.71875f, 37.5f);
            instancePath.close();
            instancePath.moveTo(41.398438f, 42.527344f);
            instancePath.cubicTo(41.398438f, 42.523438f, 41.398438f, 42.503906f, 41.398438f, 42.472656f);
            instancePath.cubicTo(41.398438f, 41.671875f, 40.85547f, 41.101562f, 40.28125f, 41.101562f);
            instancePath.lineTo(31.71875f, 41.101562f);
            instancePath.cubicTo(31.691406f, 41.101562f, 31.664062f, 41.101562f, 31.636719f, 41.10547f);
            instancePath.cubicTo(31.046875f, 41.160156f, 30.539062f, 41.804688f, 30.578125f, 42.378906f);
            instancePath.lineTo(33.589844f, 62.398438f);
            instancePath.lineTo(38.40625f, 62.398438f);
            instancePath.close();
            instancePath.moveTo(36.0f, 34.80078f);
            instancePath.cubicTo(31.28125f, 34.80078f, 27.449219f, 30.96875f, 27.449219f, 26.25f);
            instancePath.cubicTo(27.449219f, 21.53125f, 31.28125f, 17.699219f, 36.0f, 17.699219f);
            instancePath.cubicTo(40.71875f, 17.699219f, 44.55078f, 21.53125f, 44.55078f, 26.25f);
            instancePath.cubicTo(44.55078f, 30.96875f, 40.71875f, 34.80078f, 36.0f, 34.80078f);
            instancePath.close();
            instancePath.moveTo(36.0f, 31.199219f);
            instancePath.cubicTo(38.73047f, 31.199219f, 40.94922f, 28.980469f, 40.94922f, 26.25f);
            instancePath.cubicTo(40.94922f, 23.519531f, 38.73047f, 21.300781f, 36.0f, 21.300781f);
            instancePath.cubicTo(33.26953f, 21.300781f, 31.050781f, 23.519531f, 31.050781f, 26.25f);
            instancePath.cubicTo(31.050781f, 28.980469f, 33.26953f, 31.199219f, 36.0f, 31.199219f);
            instancePath.close();
            instancePath.moveTo(22.769531f, 7.410156f);
            instancePath.lineTo(24.425781f, 10.609375f);
            instancePath.cubicTo(16.125f, 14.910156f, 10.800781f, 23.480469f, 10.800781f, 33.0f);
            instancePath.cubicTo(10.800781f, 41.51172f, 15.050781f, 49.30078f, 21.996094f, 53.953125f);
            instancePath.lineTo(19.992188f, 56.945312f);
            instancePath.cubicTo(12.0625f, 51.632812f, 7.199219f, 42.726562f, 7.199219f, 33.0f);
            instancePath.cubicTo(7.199219f, 22.121094f, 13.285156f, 12.324219f, 22.769531f, 7.410156f);
            instancePath.close();
            instancePath.moveTo(52.023438f, 56.933594f);
            instancePath.lineTo(50.01953f, 53.945312f);
            instancePath.cubicTo(56.953125f, 49.29297f, 61.19922f, 41.507812f, 61.19922f, 33.0f);
            instancePath.cubicTo(61.19922f, 23.480469f, 55.875f, 14.90625f, 47.570312f, 10.605469f);
            instancePath.lineTo(49.226562f, 7.410156f);
            instancePath.cubicTo(58.714844f, 12.324219f, 64.80078f, 22.121094f, 64.80078f, 33.0f);
            instancePath.cubicTo(64.80078f, 42.722656f, 59.945312f, 51.621094f, 52.023438f, 56.933594f);
            instancePath.close();
            instancePath.moveTo(52.023438f, 56.933594f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
