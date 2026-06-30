package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_rtoswatch extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.683946f, 0.5003838f);
        instancePath.cubicTo(15.356182f, 0.5164721f, 15.969986f, 1.0364932f, 16.10819f, 1.7014544f);
        instancePath.lineTo(16.112272f, 1.7230663f);
        instancePath.lineTo(16.817043f, 5.8671956f);
        instancePath.cubicTo(18.633425f, 7.295892f, 19.8f, 9.514156f, 19.8f, 12.005002f);
        instancePath.cubicTo(19.8f, 14.496301f, 18.633f, 16.714918f, 16.816051f, 18.143587f);
        instancePath.lineTo(16.112272f, 22.28018f);
        instancePath.lineTo(16.10819f, 22.301792f);
        instancePath.cubicTo(15.969986f, 22.966753f, 15.356182f, 23.486774f, 14.683946f, 23.502863f);
        instancePath.lineTo(14.651892f, 23.503246f);
        instancePath.lineTo(9.345087f, 23.503246f);
        instancePath.cubicTo(8.67163f, 23.503246f, 8.049007f, 22.99393f, 7.8957305f, 22.33336f);
        instancePath.lineTo(7.8887877f, 22.301792f);
        instancePath.lineTo(7.8847075f, 22.28018f);
        instancePath.lineTo(7.1809754f, 18.141249f);
        instancePath.cubicTo(5.3657274f, 16.7125f, 4.2f, 14.494943f, 4.2f, 12.005002f);
        instancePath.cubicTo(4.2f, 9.515514f, 5.3653035f, 7.2983117f, 7.179985f, 5.8695345f);
        instancePath.lineTo(7.8847075f, 1.7230663f);
        instancePath.lineTo(7.8887877f, 1.7014544f);
        instancePath.lineTo(7.8957305f, 1.6698858f);
        instancePath.cubicTo(8.049007f, 1.009315f, 8.67163f, 0.5f, 9.345087f, 0.5f);
        instancePath.lineTo(14.683946f, 0.5003838f);
        instancePath.close();
        instancePath.moveTo(8.4010315f, 18.929773f);
        instancePath.lineTo(9.065f, 22.063046f);
        instancePath.cubicTo(9.100064f, 22.186333f, 9.227836f, 22.293056f, 9.331161f, 22.302124f);
        instancePath.lineTo(14.651892f, 22.302746f);
        instancePath.cubicTo(14.757515f, 22.302746f, 14.895452f, 22.191483f, 14.9294815f, 22.072903f);
        instancePath.lineTo(14.932f, 22.062645f);
        instancePath.lineTo(15.595965f, 18.931337f);
        instancePath.cubicTo(14.519932f, 19.491592f, 13.296931f, 19.808254f, 12.0f, 19.808254f);
        instancePath.cubicTo(10.701862f, 19.808254f, 9.477793f, 19.491003f, 8.4010315f, 18.929773f);
        instancePath.close();
        instancePath.moveTo(12.0f, 5.402251f);
        instancePath.cubicTo(8.35492f, 5.402251f, 5.4f, 8.358403f, 5.4f, 12.005002f);
        instancePath.cubicTo(5.4f, 15.651601f, 8.35492f, 18.607754f, 12.0f, 18.607754f);
        instancePath.cubicTo(15.64508f, 18.607754f, 18.6f, 15.651601f, 18.6f, 12.005002f);
        instancePath.cubicTo(18.6f, 8.358403f, 15.64508f, 5.402251f, 12.0f, 5.402251f);
        instancePath.close();
        instancePath.moveTo(14.651892f, 1.7005002f);
        instancePath.lineTo(9.345087f, 1.7005002f);
        instancePath.lineTo(9.331161f, 1.7011226f);
        instancePath.cubicTo(9.227836f, 1.7101886f, 9.100064f, 1.8169131f, 9.067499f, 1.9303421f);
        instancePath.lineTo(9.065f, 1.9402001f);
        instancePath.lineTo(8.399031f, 5.0812755f);
        instancePath.cubicTo(9.476275f, 4.5193954f, 10.701058f, 4.2017508f, 12.0f, 4.2017508f);
        instancePath.cubicTo(13.297735f, 4.2017508f, 14.521449f, 4.5188055f, 15.597967f, 5.0797105f);
        instancePath.lineTo(14.932f, 1.9406003f);
        instancePath.lineTo(14.9294815f, 1.9303428f);
        instancePath.cubicTo(14.895452f, 1.8117635f, 14.757515f, 1.7005002f, 14.651892f, 1.7005002f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(16777215);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
