package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_hangup extends l95.c {
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
            instancePath.moveTo(22.9209f, 14.5136f);
            instancePath.cubicTo(22.4809f, 14.9251f, 21.8816f, 15.0684f, 21.3142f, 14.8939f);
            instancePath.lineTo(21.1732f, 14.8437f);
            instancePath.lineTo(17.7763f, 13.3035f);
            instancePath.cubicTo(17.5191f, 13.1834f, 17.3852f, 13.0275f, 17.289f, 12.7703f);
            instancePath.lineTo(17.2437f, 12.633f);
            instancePath.lineTo(16.9611f, 11.6439f);
            instancePath.lineTo(16.6049f, 10.4573f);
            instancePath.lineTo(16.3636f, 9.68951f);
            instancePath.cubicTo(16.3206f, 9.54604f, 16.2417f, 9.41222f, 16.1399f, 9.31043f);
            instancePath.cubicTo(16.0374f, 9.20791f, 15.8936f, 9.12961f, 15.7357f, 9.09192f);
            instancePath.cubicTo(14.4208f, 8.75181f, 13.1824f, 8.57333f, 12.0068f, 8.57326f);
            instancePath.cubicTo(10.834f, 8.56335f, 9.60081f, 8.73798f, 8.26616f, 9.08299f);
            instancePath.cubicTo(8.11072f, 9.11999f, 7.98025f, 9.19024f, 7.8714f, 9.29909f);
            instancePath.cubicTo(7.7903f, 9.38019f, 7.7304f, 9.4684f, 7.68559f, 9.57379f);
            instancePath.lineTo(7.64558f, 9.68528f);
            instancePath.lineTo(7.48725f, 10.1951f);
            instancePath.lineTo(7.20563f, 11.1279f);
            instancePath.lineTo(6.76532f, 12.631f);
            instancePath.cubicTo(6.67984f, 12.9217f, 6.57766f, 13.0902f, 6.34057f, 13.2339f);
            instancePath.lineTo(6.23035f, 13.2943f);
            instancePath.lineTo(2.82005f, 14.8399f);
            instancePath.cubicTo(2.23811f, 15.0758f, 1.58091f, 14.9512f, 1.09866f, 14.5291f);
            instancePath.cubicTo(1.05712f, 14.494f, 1.01862f, 14.4554f, 0.982509f, 14.4138f);
            instancePath.cubicTo(0.931847f, 14.3554f, 0.887335f, 14.2931f, 0.846802f, 14.2267f);
            instancePath.lineTo(0.788717f, 14.1239f);
            instancePath.lineTo(0.717001f, 13.9757f);
            instancePath.cubicTo(-0.0618521f, 12.2925f, 0.267008f, 10.2978f, 1.59134f, 8.97343f);
            instancePath.cubicTo(1.89495f, 8.66981f, 2.26749f, 8.40372f, 2.50784f, 8.27102f);
            instancePath.cubicTo(5.35391f, 6.48404f, 8.64179f, 5.5555f, 12.0001f, 5.55566f);
            instancePath.cubicTo(15.2124f, 5.55582f, 18.3603f, 6.40566f, 21.1487f, 8.06419f);
            instancePath.lineTo(21.5267f, 8.29536f);
            instancePath.lineTo(21.8004f, 8.47661f);
            instancePath.cubicTo(22.0265f, 8.63241f, 22.2279f, 8.7932f, 22.4091f, 8.9744f);
            instancePath.cubicTo(23.6826f, 10.2479f, 24.0358f, 12.1411f, 23.363f, 13.7933f);
            instancePath.lineTo(23.2773f, 13.9903f);
            instancePath.lineTo(23.1936f, 14.1491f);
            instancePath.cubicTo(23.1428f, 14.2378f, 23.088f, 14.3209f, 23.0266f, 14.3971f);
            instancePath.lineTo(22.9808f, 14.4512f);
            instancePath.lineTo(22.9209f, 14.5136f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
