package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icon_ting_entry_guide extends l95.c {
    private final int width = 51;
    private final int height = 38;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 51;
        }
        if (i17 == 1) {
            return 38;
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
        instancePaint3.setColor(-352965);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(32.8182f, 2.41307f);
        instancePath.cubicTo(33.5209f, 1.39854f, 32.7447f, 0.0f, 31.3694f, 0.0f);
        instancePath.lineTo(22.8036f, 0.683978f);
        instancePath.cubicTo(22.2786f, 0.725899f, 21.8739f, 1.16418f, 21.8739f, 1.69086f);
        instancePath.cubicTo(21.8739f, 2.21204f, 22.2704f, 2.64766f, 22.7893f, 2.6965f);
        instancePath.lineTo(27.611f, 3.15041f);
        instancePath.lineTo(22.0099f, 9.07244f);
        instancePath.lineTo(21.8493f, 9.2697f);
        instancePath.cubicTo(21.1467f, 10.2842f, 21.9229f, 11.6828f, 23.2982f, 11.6828f);
        instancePath.lineTo(32.1864f, 11.2511f);
        instancePath.cubicTo(32.7923f, 11.2216f, 33.2685f, 10.7218f, 33.2685f, 10.1151f);
        instancePath.cubicTo(33.2685f, 9.52522f, 32.8174f, 9.03323f, 32.2297f, 8.98215f);
        instancePath.lineTo(27.0556f, 8.53236f);
        instancePath.lineTo(32.6577f, 2.61033f);
        instancePath.lineTo(32.8182f, 2.41307f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-352965);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.2528f, 9.88559f);
        instancePath2.cubicTo(17.3549f, 9.88559f, 17.9981f, 11.0807f, 17.4692f, 11.9865f);
        instancePath2.lineTo(17.3475f, 12.1633f);
        instancePath2.lineTo(13.9163f, 16.8953f);
        instancePath2.lineTo(16.4868f, 17.0476f);
        instancePath2.cubicTo(17.0385f, 17.0803f, 17.4692f, 17.5373f, 17.4692f, 18.09f);
        instancePath2.cubicTo(17.4692f, 18.6252f, 17.0645f, 19.0738f, 16.5321f, 19.1287f);
        instancePath2.lineTo(11.0002f, 19.6991f);
        instancePath2.cubicTo(9.89817f, 19.6991f, 9.25489f, 18.504f, 9.78387f, 17.5983f);
        instancePath2.lineTo(9.90551f, 17.4214f);
        instancePath2.lineTo(13.3368f, 12.6895f);
        instancePath2.lineTo(10.8691f, 12.6895f);
        instancePath2.cubicTo(10.2963f, 12.6895f, 9.83195f, 12.2251f, 9.83195f, 11.6523f);
        instancePath2.cubicTo(9.83195f, 11.1327f, 10.2165f, 10.6933f, 10.7315f, 10.6244f);
        instancePath2.lineTo(16.2528f, 9.88559f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-352965);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(33.8239f, 24.3112f);
        instancePath3.cubicTo(29.1124f, 22.8133f, 23.1769f, 21.9125f, 18.6782f, 23.3851f);
        instancePath3.cubicTo(14.2207f, 24.8442f, 13.399f, 27.2545f, 12.6818f, 29.3581f);
        instancePath3.lineTo(12.6619f, 29.4164f);
        instancePath3.cubicTo(12.2366f, 30.6634f, 12.1044f, 33.1926f, 12.0675f, 35.0613f);
        instancePath3.cubicTo(12.0425f, 36.3322f, 13.0791f, 37.3481f, 14.3503f, 37.3482f);
        instancePath3.lineTo(49.8843f, 37.3481f);
        instancePath3.cubicTo(50.6663f, 37.3481f, 51.2123f, 36.6008f, 50.919f, 35.8759f);
        instancePath3.cubicTo(50.0302f, 33.6794f, 48.0151f, 29.6441f, 44.7542f, 28.1629f);
        instancePath3.cubicTo(41.2935f, 26.5909f, 38.6992f, 25.8028f, 36.0412f, 24.9954f);
        instancePath3.cubicTo(35.3134f, 24.7743f, 34.5804f, 24.5516f, 33.8239f, 24.3112f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-352965);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(4.67311f, 35.0116f);
        instancePath4.cubicTo(7.254f, 35.0116f, 9.34622f, 32.9194f, 9.34622f, 30.3385f);
        instancePath4.cubicTo(9.34622f, 27.7576f, 7.254f, 25.6654f, 4.67311f, 25.6654f);
        instancePath4.cubicTo(2.09222f, 25.6654f, 0.0f, 27.7576f, 0.0f, 30.3385f);
        instancePath4.cubicTo(0.0f, 32.9194f, 2.09222f, 35.0116f, 4.67311f, 35.0116f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
