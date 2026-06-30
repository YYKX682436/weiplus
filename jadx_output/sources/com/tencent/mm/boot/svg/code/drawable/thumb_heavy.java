package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class thumb_heavy extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.7823f, 3.17761f);
                instancePath.cubicTo(15.8133f, 3.9624f, 16.2402f, 5.77677f, 16.1757f, 6.79735f);
                instancePath.lineTo(15.9985f, 9.55479f);
                instancePath.lineTo(19.4862f, 9.55479f);
                instancePath.cubicTo(20.833f, 9.55479f, 21.8455f, 10.9401f, 21.6418f, 12.3181f);
                instancePath.lineTo(21.6152f, 12.4657f);
                instancePath.lineTo(20.1864f, 19.2096f);
                instancePath.cubicTo(19.9745f, 20.2021f, 19.1663f, 20.9226f, 18.2096f, 20.9922f);
                instancePath.lineTo(18.0574f, 20.9977f);
                instancePath.lineTo(4.3501f, 20.9926f);
                instancePath.cubicTo(3.79796f, 20.992f, 3.35047f, 20.5443f, 3.3501f, 19.9922f);
                instancePath.lineTo(3.3501f, 11.412f);
                instancePath.cubicTo(3.3501f, 10.8597f, 3.79781f, 10.412f, 4.3501f, 10.412f);
                instancePath.lineTo(5.77001f, 10.412f);
                instancePath.lineTo(7.55324f, 10.3822f);
                instancePath.lineTo(7.97039f, 10.3638f);
                instancePath.lineTo(8.13818f, 10.3494f);
                instancePath.lineTo(8.16648f, 10.3444f);
                instancePath.cubicTo(9.52165f, 10.0292f, 10.5566f, 7.93802f, 10.7466f, 6.06805f);
                instancePath.lineTo(10.7569f, 5.90808f);
                instancePath.lineTo(10.7787f, 5.33566f);
                instancePath.lineTo(10.8008f, 5.06059f);
                instancePath.cubicTo(10.8741f, 4.35271f, 11.2773f, 3.48838f, 12.0599f, 3.03913f);
                instancePath.cubicTo(12.8425f, 2.58989f, 14.0101f, 2.58989f, 14.7823f, 3.17761f);
                instancePath.close();
                instancePath.moveTo(13.1509f, 4.96238f);
                instancePath.cubicTo(13.0492f, 5.0455f, 13.0041f, 5.33662f, 12.9788f, 5.63671f);
                instancePath.lineTo(12.9353f, 6.29049f);
                instancePath.cubicTo(12.6667f, 8.93416f, 11.3022f, 11.5034f, 9.20133f, 12.3212f);
                instancePath.lineTo(9.2001f, 18.7947f);
                instancePath.lineTo(17.9776f, 18.7992f);
                instancePath.lineTo(18.05f, 18.798f);
                instancePath.cubicTo(18.0276f, 18.7996f, 18.0249f, 18.7974f, 18.0287f, 18.7786f);
                instancePath.lineTo(19.4654f, 11.9964f);
                instancePath.cubicTo(19.4817f, 11.8864f, 19.4263f, 11.7919f, 19.4565f, 11.7635f);
                instancePath.lineTo(19.4862f, 11.7548f);
                instancePath.lineTo(13.6526f, 11.7548f);
                instancePath.lineTo(13.9801f, 6.6587f);
                instancePath.cubicTo(14.0051f, 6.2627f, 13.9698f, 5.63925f, 13.7839f, 5.26173f);
                instancePath.cubicTo(13.5904f, 4.86875f, 13.3373f, 4.81001f, 13.1509f, 4.96238f);
                instancePath.close();
                instancePath.moveTo(7.0001f, 12.5907f);
                instancePath.lineTo(5.77001f, 12.612f);
                instancePath.lineTo(5.5491f, 12.6111f);
                instancePath.lineTo(5.5491f, 18.7931f);
                instancePath.lineTo(7.0001f, 18.7937f);
                instancePath.lineTo(7.0001f, 12.5907f);
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
