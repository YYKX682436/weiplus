package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_limited_mode extends l95.c {
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
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.0f, 0.0f);
        instancePath2.cubicTo(10.298234f, 0.0f, 10.545647f, 0.21758962f, 10.592147f, 0.5026769f);
        instancePath2.lineTo(10.6f, 0.6f);
        instancePath2.lineTo(10.601041f, 1.0177648f);
        instancePath2.cubicTo(15.84405f, 1.3285768f, 20.0f, 5.6789513f, 20.0f, 11.0f);
        instancePath2.lineTo(19.99679f, 11.2559f);
        instancePath2.cubicTo(19.04615f, 10.470693f, 17.828043f, 10.0f, 16.5f, 10.0f);
        instancePath2.cubicTo(15.222575f, 10.0f, 14.046865f, 10.435496f, 13.113922f, 11.165782f);
        instancePath2.cubicTo(12.384065f, 10.663586f, 11.526924f, 10.333047f, 10.600768f, 10.232434f);
        instancePath2.lineTo(10.6f, 17.486572f);
        instancePath2.cubicTo(10.6f, 18.867285f, 9.523762f, 19.996628f, 8.164428f, 20.081457f);
        instancePath2.lineTo(8.0f, 20.086573f);
        instancePath2.lineTo(7.787842f, 20.086573f);
        instancePath2.cubicTo(6.40713f, 20.086573f, 5.277787f, 19.010334f, 5.192957f, 17.651001f);
        instancePath2.lineTo(5.187842f, 17.486572f);
        instancePath2.lineTo(5.187842f, 17.241272f);
        instancePath2.cubicTo(5.187842f, 16.9099f, 5.456471f, 16.641272f, 5.787842f, 16.641272f);
        instancePath2.cubicTo(6.086076f, 16.641272f, 6.3334885f, 16.858862f, 6.3799887f, 17.14395f);
        instancePath2.lineTo(6.3878417f, 17.241272f);
        instancePath2.lineTo(6.3878417f, 17.486572f);
        instancePath2.cubicTo(6.3878417f, 18.214289f, 6.943071f, 18.812325f, 7.6530123f, 18.880163f);
        instancePath2.lineTo(7.787842f, 18.886572f);
        instancePath2.lineTo(8.0f, 18.886572f);
        instancePath2.cubicTo(8.727716f, 18.886572f, 9.325752f, 18.331343f, 9.393591f, 17.6214f);
        instancePath2.lineTo(9.4f, 17.486572f);
        instancePath2.lineTo(9.400242f, 10.2323265f);
        instancePath2.cubicTo(8.473719f, 10.332818f, 7.6163197f, 10.663463f, 6.88676f, 11.166119f);
        instancePath2.cubicTo(5.953135f, 10.435496f, 4.7774253f, 10.0f, 3.5f, 10.0f);
        instancePath2.cubicTo(2.1715279f, 10.0f, 0.95306295f, 10.470997f, 0.00248315f, 11.255113f);
        instancePath2.lineTo(0.0f, 11.0f);
        instancePath2.cubicTo(0.0f, 5.678612f, 4.156479f, 1.3280222f, 9.399961f, 1.0177054f);
        instancePath2.lineTo(9.4f, 0.6f);
        instancePath2.cubicTo(9.4f, 0.26862916f, 9.66863f, 0.0f, 10.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 2.2f);
        instancePath2.cubicTo(5.834195f, 2.2f, 2.3444638f, 5.094616f, 1.4323785f, 8.974886f);
        instancePath2.lineTo(1.396f, 9.138f);
        instancePath2.lineTo(1.4972f, 9.104778f);
        instancePath2.cubicTo(2.0454957f, 8.933295f, 2.6188784f, 8.831864f, 3.2055886f, 8.806384f);
        instancePath2.lineTo(3.5f, 8.8f);
        instancePath2.cubicTo(4.61134f, 8.8f, 5.6829276f, 9.072138f, 6.6365485f, 9.578147f);
        instancePath2.lineTo(6.931f, 9.744f);
        instancePath2.lineTo(7.003595f, 9.706253f);
        instancePath2.cubicTo(7.8306828f, 9.29174f, 8.740587f, 9.051286f, 9.684259f, 9.0073395f);
        instancePath2.lineTo(10.0f, 9.0f);
        instancePath2.cubicTo(11.055876f, 9.0f, 12.07688f, 9.245533f, 12.996115f, 9.705804f);
        instancePath2.lineTo(13.069f, 9.744f);
        instancePath2.lineTo(13.106622f, 9.721795f);
        instancePath2.cubicTo(14.037875f, 9.173693f, 15.094497f, 8.855881f, 16.197954f, 8.806719f);
        instancePath2.lineTo(16.5f, 8.8f);
        instancePath2.cubicTo(17.189444f, 8.8f, 17.863317f, 8.904756f, 18.502981f, 9.104957f);
        instancePath2.lineTo(18.601f, 9.138f);
        instancePath2.lineTo(18.567585f, 8.982241f);
        instancePath2.cubicTo(17.674538f, 5.175608f, 14.310092f, 2.32104f, 10.259465f, 2.2037518f);
        instancePath2.lineTo(10.0f, 2.2f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
