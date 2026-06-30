package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class doc_ai_filled extends l95.c {
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
        instancePath.moveTo(16.8193f, 15.1572f);
        instancePath.cubicTo(16.9126f, 14.9999f, 17.1125f, 14.9426f, 17.2744f, 15.0273f);
        instancePath.cubicTo(17.375f, 15.0804f, 17.5233f, 15.3896f, 17.8184f, 16.0059f);
        instancePath.cubicTo(18.1508f, 16.7002f, 18.317f, 17.0479f, 18.5508f, 17.3105f);
        instancePath.cubicTo(18.9206f, 17.7259f, 19.4195f, 18.0054f, 19.9668f, 18.1045f);
        instancePath.cubicTo(20.3128f, 18.1671f, 20.7004f, 18.1279f, 21.4746f, 18.0488f);
        instancePath.cubicTo(22.2159f, 17.9732f, 22.5867f, 17.9349f, 22.6875f, 17.999f);
        instancePath.cubicTo(22.8366f, 18.0941f, 22.8885f, 18.2866f, 22.8086f, 18.4443f);
        instancePath.cubicTo(22.7543f, 18.5508f, 22.4212f, 18.7055f, 21.7549f, 19.0127f);
        instancePath.lineTo(21.6582f, 19.0576f);
        instancePath.cubicTo(21.0107f, 19.3562f, 20.6866f, 19.5056f, 20.4355f, 19.7139f);
        instancePath.cubicTo(19.9845f, 20.0884f, 19.6792f, 20.6105f, 19.5752f, 21.1875f);
        instancePath.cubicTo(19.5174f, 21.5086f, 19.5469f, 21.869f, 19.6064f, 22.5889f);
        instancePath.cubicTo(19.6557f, 23.1842f, 19.6811f, 23.4831f, 19.6338f, 23.5732f);
        instancePath.cubicTo(19.5401f, 23.7485f, 19.3163f, 23.8091f, 19.1475f, 23.7041f);
        instancePath.cubicTo(19.0614f, 23.6502f, 18.9358f, 23.3828f, 18.6846f, 22.8506f);
        instancePath.cubicTo(18.3848f, 22.2156f, 18.2347f, 21.8978f, 18.0293f, 21.6523f);
        instancePath.cubicTo(17.6362f, 21.1829f, 17.0836f, 20.8748f, 16.4775f, 20.7871f);
        instancePath.cubicTo(16.1607f, 20.7413f, 15.8058f, 20.7813f, 15.0967f, 20.8613f);
        instancePath.cubicTo(14.4474f, 20.9346f, 14.122f, 20.9714f, 14.0273f, 20.9209f);
        instancePath.cubicTo(13.8579f, 20.8301f, 13.796f, 20.617f, 13.8896f, 20.4492f);
        instancePath.cubicTo(13.9427f, 20.3556f, 14.2304f, 20.2139f, 14.8047f, 19.9316f);
        instancePath.lineTo(14.8623f, 19.9043f);
        instancePath.cubicTo(15.5448f, 19.5689f, 15.8862f, 19.4005f, 16.1445f, 19.167f);
        instancePath.cubicTo(16.5559f, 18.7952f, 16.8311f, 18.2962f, 16.9268f, 17.75f);
        instancePath.cubicTo(16.9867f, 17.4071f, 16.9466f, 17.0286f, 16.8672f, 16.2725f);
        instancePath.cubicTo(16.796f, 15.5946f, 16.7615f, 15.2553f, 16.8193f, 15.1572f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.126f, 6.6084f);
        instancePath2.cubicTo(11.1261f, 7.85091f, 12.1334f, 8.85838f, 13.376f, 8.8584f);
        instancePath2.lineTo(19.0f, 8.8584f);
        instancePath2.lineTo(19.0f, 13.9697f);
        instancePath2.cubicTo(18.9978f, 13.9665f, 18.9954f, 13.9632f, 18.9932f, 13.96f);
        instancePath2.cubicTo(18.9307f, 13.8718f, 18.6744f, 13.5049f, 18.208f, 13.2588f);
        instancePath2.lineTo(18.2061f, 13.2568f);
        instancePath2.lineTo(17.9951f, 13.1592f);
        instancePath2.cubicTo(16.93f, 12.7266f, 15.6942f, 13.1347f, 15.0996f, 14.1367f);
        instancePath2.lineTo(15.0986f, 14.1387f);
        instancePath2.cubicTo(14.8314f, 14.5905f, 14.8052f, 15.0342f, 14.7979f, 15.1436f);
        instancePath2.cubicTo(14.7859f, 15.3222f, 14.792f, 15.4919f, 14.7988f, 15.6113f);
        instancePath2.cubicTo(14.8126f, 15.8521f, 14.8455f, 16.1637f, 14.8789f, 16.4814f);
        instancePath2.cubicTo(14.9207f, 16.879f, 14.9441f, 17.1048f, 14.9531f, 17.2734f);
        instancePath2.cubicTo(14.9571f, 17.3474f, 14.9567f, 17.3895f, 14.9561f, 17.4082f);
        instancePath2.cubicTo(14.9368f, 17.5139f, 14.8834f, 17.6114f, 14.8037f, 17.6836f);
        instancePath2.cubicTo(14.8275f, 17.6621f, 14.8187f, 17.6783f, 14.6885f, 17.751f);
        instancePath2.cubicTo(14.5426f, 17.8324f, 14.3413f, 17.931f, 13.9883f, 18.1045f);
        instancePath2.lineTo(13.9492f, 18.124f);
        instancePath2.lineTo(13.9365f, 18.1299f);
        instancePath2.lineTo(13.9238f, 18.1367f);
        instancePath2.cubicTo(13.6551f, 18.2688f, 13.3897f, 18.3986f, 13.1904f, 18.5078f);
        instancePath2.cubicTo(13.0915f, 18.5621f, 12.9529f, 18.6415f, 12.8154f, 18.7393f);
        instancePath2.cubicTo(12.7309f, 18.7994f, 12.3922f, 19.0373f, 12.1504f, 19.4639f);
        instancePath2.lineTo(12.1445f, 19.4736f);
        instancePath2.cubicTo(11.7842f, 20.1186f, 11.7607f, 20.863f, 12.0186f, 21.5f);
        instancePath2.lineTo(4.5f, 21.5f);
        instancePath2.cubicTo(3.67157f, 21.5f, 3.0f, 20.8284f, 3.0f, 20.0f);
        instancePath2.lineTo(3.0f, 3.0f);
        instancePath2.cubicTo(3.0f, 2.17157f, 3.67157f, 1.5f, 4.5f, 1.5f);
        instancePath2.lineTo(11.126f, 1.5f);
        instancePath2.lineTo(11.126f, 6.6084f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(18.8486f, 7.3584f);
        instancePath3.lineTo(13.376f, 7.3584f);
        instancePath3.cubicTo(12.9619f, 7.35838f, 12.6261f, 7.02248f, 12.626f, 6.6084f);
        instancePath3.lineTo(12.626f, 1.52441f);
        instancePath3.lineTo(18.8486f, 7.3584f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
