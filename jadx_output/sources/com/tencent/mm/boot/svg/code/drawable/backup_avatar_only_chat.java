package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class backup_avatar_only_chat extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(36.0f, 0.0f);
        instancePath.cubicTo(38.20914f, 0.0f, 40.0f, 1.7908609f, 40.0f, 4.0f);
        instancePath.lineTo(40.0f, 36.0f);
        instancePath.cubicTo(40.0f, 38.20914f, 38.20914f, 40.0f, 36.0f, 40.0f);
        instancePath.lineTo(4.0f, 40.0f);
        instancePath.cubicTo(1.7908609f, 40.0f, 0.0f, 38.20914f, 0.0f, 36.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(33.3334f, 19.3333f);
        instancePath2.cubicTo(33.3334f, 25.5926f, 27.3639f, 30.6667f, 20.0001f, 30.6667f);
        instancePath2.cubicTo(18.4948f, 30.6667f, 17.0477f, 30.4546f, 15.698f, 30.0638f);
        instancePath2.lineTo(11.7207f, 31.9709f);
        instancePath2.cubicTo(11.6072f, 32.0254f, 11.4806f, 32.0465f, 11.3555f, 32.032f);
        instancePath2.cubicTo(10.9898f, 31.9895f, 10.7278f, 31.6585f, 10.7703f, 31.2928f);
        instancePath2.lineTo(11.1731f, 27.8276f);
        instancePath2.cubicTo(8.40941f, 25.7511f, 6.66675f, 22.7152f, 6.66675f, 19.3333f);
        instancePath2.cubicTo(6.66675f, 13.0741f, 12.6363f, 8.0f, 20.0001f, 8.0f);
        instancePath2.cubicTo(27.3639f, 8.0f, 33.3334f, 13.0741f, 33.3334f, 19.3333f);
        instancePath2.close();
        instancePath2.moveTo(13.3334f, 24.3801f);
        instancePath2.cubicTo(13.3334f, 24.8969f, 13.7523f, 25.3158f, 14.2691f, 25.3158f);
        instancePath2.lineTo(25.7311f, 25.3158f);
        instancePath2.cubicTo(26.2478f, 25.3158f, 26.6667f, 24.8969f, 26.6667f, 24.3801f);
        instancePath2.lineTo(26.6667f, 24.1337f);
        instancePath2.cubicTo(26.6667f, 23.6492f, 26.3167f, 23.0924f, 25.8849f, 22.8818f);
        instancePath2.lineTo(21.9127f, 20.9442f);
        instancePath2.cubicTo(21.3342f, 20.662f, 21.205f, 20.0379f, 21.6187f, 19.5475f);
        instancePath2.lineTo(21.8724f, 19.2467f);
        instancePath2.cubicTo(22.3867f, 18.6371f, 22.8071f, 17.4907f, 22.8071f, 16.6914f);
        instancePath2.lineTo(22.8071f, 15.4914f);
        instancePath2.cubicTo(22.8071f, 13.9424f, 21.5504f, 12.6842f, 20.0001f, 12.6842f);
        instancePath2.cubicTo(18.453f, 12.6842f, 17.1931f, 13.9408f, 17.1931f, 15.4909f);
        instancePath2.lineTo(17.1931f, 16.6907f);
        instancePath2.cubicTo(17.1931f, 17.4909f, 17.6115f, 18.6339f, 18.1277f, 19.2457f);
        instancePath2.lineTo(18.3814f, 19.5464f);
        instancePath2.cubicTo(18.7975f, 20.0395f, 18.6635f, 20.6621f, 18.0874f, 20.9433f);
        instancePath2.lineTo(14.1152f, 22.8816f);
        instancePath2.cubicTo(13.683f, 23.0926f, 13.3334f, 23.6529f, 13.3334f, 24.1337f);
        instancePath2.lineTo(13.3334f, 24.3801f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
