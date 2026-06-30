package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class photo_accounts_regular extends l95.c {
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
        instancePath.moveTo(15.8528f, 4.00797f);
        instancePath.cubicTo(16.4435f, 2.99729f, 17.8973f, 2.9974f, 18.4881f, 4.00797f);
        instancePath.lineTo(22.399f, 10.7019f);
        instancePath.cubicTo(22.867f, 11.503f, 22.867f, 12.497f, 22.399f, 13.2982f);
        instancePath.lineTo(18.4881f, 19.9921f);
        instancePath.lineTo(18.3671f, 20.1694f);
        instancePath.cubicTo(17.7617f, 20.9436f, 16.5792f, 20.9435f, 15.9739f, 20.1694f);
        instancePath.lineTo(15.8528f, 19.9921f);
        instancePath.lineTo(12.0f, 13.3966f);
        instancePath.lineTo(8.14728f, 19.9921f);
        instancePath.lineTo(8.02622f, 20.1694f);
        instancePath.cubicTo(7.4209f, 20.9436f, 6.23835f, 20.9435f, 5.63302f, 20.1694f);
        instancePath.lineTo(5.51195f, 19.9921f);
        instancePath.lineTo(1.60109f, 13.2982f);
        instancePath.cubicTo(1.16239f, 12.547f, 1.13468f, 11.6261f, 1.51876f, 10.8538f);
        instancePath.lineTo(1.60109f, 10.7019f);
        instancePath.lineTo(5.51195f, 4.00797f);
        instancePath.cubicTo(6.10266f, 2.99729f, 7.55648f, 2.9974f, 8.14728f, 4.00797f);
        instancePath.lineTo(12.0f, 10.6025f);
        instancePath.lineTo(15.8528f, 4.00797f);
        instancePath.close();
        instancePath.moveTo(6.80686f, 4.75033f);
        instancePath.lineTo(6.80492f, 4.7513f);
        instancePath.cubicTo(6.80492f, 4.7513f, 6.80009f, 4.756f, 6.79427f, 4.76592f);
        instancePath.lineTo(2.8834f, 11.4598f);
        instancePath.cubicTo(2.68886f, 11.7928f, 2.68915f, 12.2062f, 2.8834f, 12.5392f);
        instancePath.lineTo(6.79427f, 19.2341f);
        instancePath.cubicTo(6.79917f, 19.2425f, 6.80492f, 19.2478f, 6.80492f, 19.2478f);
        instancePath.lineTo(6.80686f, 19.2497f);
        instancePath.cubicTo(6.80915f, 19.2509f, 6.81695f, 19.2535f, 6.82913f, 19.2536f);
        instancePath.cubicTo(6.8418f, 19.2536f, 6.85011f, 19.2509f, 6.85238f, 19.2497f);
        instancePath.lineTo(6.85432f, 19.2478f);
        instancePath.cubicTo(6.85432f, 19.2478f, 6.85904f, 19.2425f, 6.864f, 19.2341f);
        instancePath.lineTo(10.9879f, 12.1759f);
        instancePath.cubicTo(11.0513f, 12.0671f, 11.0515f, 11.9319f, 10.9879f, 11.8232f);
        instancePath.lineTo(6.864f, 4.76592f);
        instancePath.cubicTo(6.85835f, 4.75629f, 6.85432f, 4.7513f, 6.85432f, 4.7513f);
        instancePath.lineTo(6.85238f, 4.75033f);
        instancePath.cubicTo(6.84993f, 4.74907f, 6.84157f, 4.74546f, 6.82913f, 4.74546f);
        instancePath.cubicTo(6.81664f, 4.74557f, 6.80894f, 4.74921f, 6.80686f, 4.75033f);
        instancePath.close();
        instancePath.moveTo(17.1477f, 4.75033f);
        instancePath.lineTo(17.1458f, 4.7513f);
        instancePath.cubicTo(17.1458f, 4.7513f, 17.1409f, 4.756f, 17.1351f, 4.76592f);
        instancePath.lineTo(13.0121f, 11.8232f);
        instancePath.cubicTo(12.9486f, 11.9319f, 12.9489f, 12.0671f, 13.0121f, 12.1759f);
        instancePath.lineTo(17.1351f, 19.2341f);
        instancePath.cubicTo(17.14f, 19.2425f, 17.1458f, 19.2478f, 17.1458f, 19.2478f);
        instancePath.lineTo(17.1477f, 19.2497f);
        instancePath.cubicTo(17.15f, 19.2509f, 17.1578f, 19.2535f, 17.17f, 19.2536f);
        instancePath.cubicTo(17.1826f, 19.2536f, 17.191f, 19.2509f, 17.1932f, 19.2497f);
        instancePath.lineTo(17.1952f, 19.2478f);
        instancePath.cubicTo(17.1952f, 19.2478f, 17.1999f, 19.2425f, 17.2048f, 19.2341f);
        instancePath.lineTo(21.1167f, 12.5392f);
        instancePath.cubicTo(21.311f, 12.2061f, 21.3112f, 11.7928f, 21.1167f, 11.4598f);
        instancePath.lineTo(17.2048f, 4.76592f);
        instancePath.cubicTo(17.1992f, 4.75629f, 17.1952f, 4.7513f, 17.1952f, 4.7513f);
        instancePath.lineTo(17.1932f, 4.75033f);
        instancePath.cubicTo(17.1908f, 4.74907f, 17.1824f, 4.74546f, 17.17f, 4.74546f);
        instancePath.cubicTo(17.1575f, 4.74557f, 17.1498f, 4.74921f, 17.1477f, 4.75033f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
