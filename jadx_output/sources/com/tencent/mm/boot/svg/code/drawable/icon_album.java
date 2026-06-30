package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_album extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.0f, 8.0f);
        instancePath.cubicTo(3.0f, 5.64298f, 3.0f, 4.46447f, 3.73223f, 3.73223f);
        instancePath.cubicTo(4.46447f, 3.0f, 5.64298f, 3.0f, 8.0f, 3.0f);
        instancePath.lineTo(16.0f, 3.0f);
        instancePath.cubicTo(18.357f, 3.0f, 19.5355f, 3.0f, 20.2678f, 3.73223f);
        instancePath.cubicTo(21.0f, 4.46447f, 21.0f, 5.64298f, 21.0f, 8.0f);
        instancePath.lineTo(21.0f, 16.0f);
        instancePath.cubicTo(21.0f, 18.357f, 21.0f, 19.5355f, 20.2678f, 20.2678f);
        instancePath.cubicTo(19.5355f, 21.0f, 18.357f, 21.0f, 16.0f, 21.0f);
        instancePath.lineTo(8.0f, 21.0f);
        instancePath.cubicTo(5.64298f, 21.0f, 4.46447f, 21.0f, 3.73223f, 20.2678f);
        instancePath.cubicTo(3.0f, 19.5355f, 3.0f, 18.357f, 3.0f, 16.0f);
        instancePath.lineTo(3.0f, 8.0f);
        instancePath.close();
        instancePath.moveTo(8.0f, 4.2f);
        instancePath.lineTo(16.0f, 4.2f);
        instancePath.cubicTo(17.2124f, 4.2f, 18.001f, 4.20255f, 18.5833f, 4.28083f);
        instancePath.cubicTo(19.131f, 4.35447f, 19.3132f, 4.47477f, 19.4192f, 4.58076f);
        instancePath.cubicTo(19.5252f, 4.68675f, 19.6455f, 4.869f, 19.7192f, 5.41672f);
        instancePath.cubicTo(19.7975f, 5.99896f, 19.8f, 6.78756f, 19.8f, 8.0f);
        instancePath.lineTo(19.8f, 16.0f);
        instancePath.cubicTo(19.8f, 17.2124f, 19.7975f, 18.001f, 19.7192f, 18.5833f);
        instancePath.cubicTo(19.6455f, 19.131f, 19.5252f, 19.3132f, 19.4192f, 19.4192f);
        instancePath.cubicTo(19.3132f, 19.5252f, 19.131f, 19.6455f, 18.5833f, 19.7192f);
        instancePath.cubicTo(18.001f, 19.7975f, 17.2124f, 19.8f, 16.0f, 19.8f);
        instancePath.lineTo(8.0f, 19.8f);
        instancePath.cubicTo(6.78756f, 19.8f, 5.99896f, 19.7975f, 5.41672f, 19.7192f);
        instancePath.cubicTo(4.869f, 19.6455f, 4.68675f, 19.5252f, 4.58076f, 19.4192f);
        instancePath.cubicTo(4.47477f, 19.3132f, 4.35447f, 19.131f, 4.28083f, 18.5833f);
        instancePath.cubicTo(4.20255f, 18.001f, 4.2f, 17.2124f, 4.2f, 16.0f);
        instancePath.lineTo(4.2f, 8.0f);
        instancePath.cubicTo(4.2f, 6.78756f, 4.20255f, 5.99896f, 4.28083f, 5.41672f);
        instancePath.cubicTo(4.35447f, 4.869f, 4.47477f, 4.68675f, 4.58076f, 4.58076f);
        instancePath.cubicTo(4.68675f, 4.47477f, 4.869f, 4.35447f, 5.41672f, 4.28083f);
        instancePath.cubicTo(5.99896f, 4.20255f, 6.78756f, 4.2f, 8.0f, 4.2f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.7341f, 9.25596f);
        instancePath2.cubicTo(14.7942f, 8.48991f, 13.8543f, 8.59314f, 13.1534f, 7.85969f);
        instancePath2.cubicTo(12.9524f, 7.64237f, 12.8437f, 7.38702f, 12.8111f, 7.11537f);
        instancePath2.cubicTo(12.7514f, 6.78396f, 12.4037f, 6.71876f, 12.1809f, 6.85459f);
        instancePath2.cubicTo(12.1646f, 6.86545f, 12.1538f, 6.87632f, 12.1375f, 6.88719f);
        instancePath2.cubicTo(12.1049f, 6.91435f, 12.0777f, 6.94695f, 12.056f, 6.97955f);
        instancePath2.cubicTo(11.9419f, 7.1371f, 11.8658f, 7.37072f, 11.8658f, 7.6967f);
        instancePath2.lineTo(11.8658f, 12.0322f);
        instancePath2.cubicTo(11.8386f, 13.4122f, 11.605f, 13.3741f, 10.4043f, 13.6784f);
        instancePath2.cubicTo(9.46444f, 13.9174f, 8.6821f, 14.5477f, 8.68753f, 15.5147f);
        instancePath2.cubicTo(8.69296f, 16.4818f, 9.54594f, 17.2859f, 10.5347f, 17.2587f);
        instancePath2.cubicTo(12.985f, 17.1935f, 12.9524f, 14.6455f, 12.947f, 13.5915f);
        instancePath2.lineTo(12.947f, 9.73949f);
        instancePath2.cubicTo(12.947f, 9.1962f, 13.3164f, 9.33202f, 14.0118f, 9.58737f);
        instancePath2.lineTo(14.0064f, 9.58737f);
        instancePath2.cubicTo(14.1096f, 9.61997f, 14.2129f, 9.658f, 14.3161f, 9.68516f);
        instancePath2.cubicTo(14.805f, 9.88075f, 15.3646f, 10.1144f, 15.5439f, 10.5925f);
        instancePath2.cubicTo(15.7721f, 11.3151f, 15.2886f, 11.9724f, 14.5823f, 12.3039f);
        instancePath2.cubicTo(14.4791f, 12.3527f, 14.5171f, 12.5103f, 14.6312f, 12.5103f);
        instancePath2.cubicTo(16.2176f, 12.5049f, 17.201f, 10.3969f, 15.7287f, 9.25596f);
        instancePath2.lineTo(15.7341f, 9.25596f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
