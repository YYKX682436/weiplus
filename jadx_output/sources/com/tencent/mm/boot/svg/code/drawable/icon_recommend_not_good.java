package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_recommend_not_good extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.65459f, 25.8422f);
                instancePath.cubicTo(13.4435f, 19.5302f, 21.6268f, 17.4879f, 27.9326f, 21.2805f);
                instancePath.cubicTo(28.5229f, 21.6356f, 29.2787f, 22.0718f, 30.2f, 22.5892f);
                instancePath.cubicTo(30.7707f, 21.6994f, 31.2335f, 20.9591f, 31.5882f, 20.3682f);
                instancePath.cubicTo(35.3771f, 14.0562f, 43.5604f, 12.0138f, 49.8662f, 15.8064f);
                instancePath.cubicTo(55.8609f, 19.412f, 58.0006f, 26.993f, 54.9418f, 33.1554f);
                instancePath.cubicTo(52.2181f, 28.0969f, 46.259f, 25.4349f, 40.5146f, 27.0838f);
                instancePath.cubicTo(33.9481f, 28.9685f, 30.1268f, 35.7777f, 31.9029f, 42.3559f);
                instancePath.lineTo(31.9115f, 42.3878f);
                instancePath.lineTo(36.2017f, 57.3642f);
                instancePath.lineTo(14.0362f, 44.0326f);
                instancePath.cubicTo(7.86858f, 40.1934f, 5.90095f, 32.0955f, 9.65459f, 25.8422f);
                instancePath.close();
                instancePath.moveTo(41.7042f, 31.2364f);
                instancePath.cubicTo(46.0406f, 29.9917f, 50.564f, 32.5016f, 51.8075f, 36.8423f);
                instancePath.cubicTo(51.8936f, 37.1429f, 52.0018f, 37.5012f, 52.1319f, 37.9174f);
                instancePath.cubicTo(52.1778f, 38.0639f, 52.2263f, 38.2176f, 52.2776f, 38.3784f);
                instancePath.cubicTo(52.9053f, 38.2183f, 53.4222f, 38.08f, 53.8281f, 37.9635f);
                instancePath.cubicTo(58.1646f, 36.7188f, 62.688f, 39.2286f, 63.9315f, 43.5694f);
                instancePath.cubicTo(65.1634f, 47.8697f, 62.7139f, 52.3538f, 58.4516f, 53.6471f);
                instancePath.lineTo(42.0174f, 58.3651f);
                instancePath.cubicTo(41.487f, 58.5174f, 40.9338f, 58.2104f, 40.7817f, 57.6795f);
                instancePath.lineTo(40.6166f, 57.1033f);
                instancePath.lineTo(36.0692f, 41.2288f);
                instancePath.cubicTo(34.9071f, 36.925f, 37.408f, 32.4695f, 41.7042f, 31.2364f);
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
