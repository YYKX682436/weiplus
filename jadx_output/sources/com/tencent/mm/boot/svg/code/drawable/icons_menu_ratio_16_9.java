package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_ratio_16_9 extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
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
            instancePaint3.setColor(-855638017);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.1709f, 20.0f);
            instancePath.lineTo(5.66797f, 20.0f);
            instancePath.lineTo(5.66797f, 10.1357f);
            instancePath.lineTo(4.15723f, 10.1357f);
            instancePath.lineTo(1.55957f, 11.9814f);
            instancePath.lineTo(1.55957f, 13.4307f);
            instancePath.lineTo(4.13672f, 11.6533f);
            instancePath.lineTo(4.1709f, 11.6533f);
            instancePath.lineTo(4.1709f, 20.0f);
            instancePath.close();
            instancePath.moveTo(11.7861f, 20.1641f);
            instancePath.cubicTo(13.8643f, 20.1641f, 15.3887f, 18.749f, 15.3887f, 16.7803f);
            instancePath.lineTo(15.3887f, 16.7666f);
            instancePath.cubicTo(15.3887f, 14.9004f, 14.0283f, 13.5264f, 12.1416f, 13.5264f);
            instancePath.cubicTo(10.8018f, 13.5264f, 9.80371f, 14.2236f, 9.41406f, 15.1123f);
            instancePath.lineTo(9.37988f, 15.1123f);
            instancePath.cubicTo(9.37988f, 15.0234f, 9.37988f, 14.9346f, 9.38672f, 14.8457f);
            instancePath.cubicTo(9.44824f, 12.8906f, 10.1387f, 11.2568f, 11.834f, 11.2568f);
            instancePath.cubicTo(12.7773f, 11.2568f, 13.4199f, 11.7217f, 13.7002f, 12.46f);
            instancePath.lineTo(13.7207f, 12.5283f);
            instancePath.lineTo(15.2588f, 12.5283f);
            instancePath.lineTo(15.2383f, 12.4463f);
            instancePath.cubicTo(14.9238f, 10.9766f, 13.6045f, 9.97168f, 11.8477f, 9.97168f);
            instancePath.cubicTo(9.37988f, 9.97168f, 7.91016f, 11.9131f, 7.91016f, 15.2012f);
            instancePath.lineTo(7.91016f, 15.2148f);
            instancePath.cubicTo(7.91016f, 18.7627f, 9.76953f, 20.1641f, 11.7861f, 20.1641f);
            instancePath.close();
            instancePath.moveTo(9.68066f, 16.7871f);
            instancePath.lineTo(9.68066f, 16.7803f);
            instancePath.cubicTo(9.68066f, 15.6113f, 10.5898f, 14.7705f, 11.7861f, 14.7705f);
            instancePath.cubicTo(12.9893f, 14.7705f, 13.8643f, 15.6182f, 13.8643f, 16.8076f);
            instancePath.lineTo(13.8643f, 16.8213f);
            instancePath.cubicTo(13.8643f, 17.9697f, 12.9346f, 18.8789f, 11.7656f, 18.8789f);
            instancePath.cubicTo(10.5967f, 18.8789f, 9.68066f, 17.9561f, 9.68066f, 16.7871f);
            instancePath.close();
            instancePath.moveTo(17.6992f, 13.3965f);
            instancePath.cubicTo(18.1982f, 13.3965f, 18.5947f, 13.0f, 18.5947f, 12.4941f);
            instancePath.cubicTo(18.5947f, 11.9951f, 18.1982f, 11.5986f, 17.6992f, 11.5986f);
            instancePath.cubicTo(17.1934f, 11.5986f, 16.7969f, 11.9951f, 16.7969f, 12.4941f);
            instancePath.cubicTo(16.7969f, 13.0f, 17.1934f, 13.3965f, 17.6992f, 13.3965f);
            instancePath.close();
            instancePath.moveTo(17.6992f, 18.5303f);
            instancePath.cubicTo(18.1982f, 18.5303f, 18.5947f, 18.1338f, 18.5947f, 17.6348f);
            instancePath.cubicTo(18.5947f, 17.1289f, 18.1982f, 16.7393f, 17.6992f, 16.7393f);
            instancePath.cubicTo(17.1934f, 16.7393f, 16.7969f, 17.1289f, 16.7969f, 17.6348f);
            instancePath.cubicTo(16.7969f, 18.1338f, 17.1934f, 18.5303f, 17.6992f, 18.5303f);
            instancePath.close();
            instancePath.moveTo(23.6123f, 9.97168f);
            instancePath.cubicTo(21.5273f, 9.97168f, 20.0029f, 11.3867f, 20.0029f, 13.3555f);
            instancePath.lineTo(20.0029f, 13.3691f);
            instancePath.cubicTo(20.0029f, 15.2354f, 21.3701f, 16.6094f, 23.2568f, 16.6094f);
            instancePath.cubicTo(24.5967f, 16.6094f, 25.5947f, 15.9121f, 25.9844f, 15.0234f);
            instancePath.lineTo(26.0186f, 15.0234f);
            instancePath.cubicTo(26.0186f, 15.1123f, 26.0186f, 15.2012f, 26.0117f, 15.29f);
            instancePath.cubicTo(25.9502f, 17.2451f, 25.2598f, 18.8789f, 23.5645f, 18.8789f);
            instancePath.cubicTo(22.6211f, 18.8789f, 21.9785f, 18.4141f, 21.6982f, 17.6758f);
            instancePath.lineTo(21.6709f, 17.6074f);
            instancePath.lineTo(20.1396f, 17.6074f);
            instancePath.lineTo(20.1602f, 17.6895f);
            instancePath.cubicTo(20.4746f, 19.1592f, 21.7939f, 20.1641f, 23.5508f, 20.1641f);
            instancePath.cubicTo(26.0186f, 20.1641f, 27.4883f, 18.2227f, 27.4883f, 14.9346f);
            instancePath.lineTo(27.4883f, 14.9209f);
            instancePath.cubicTo(27.4883f, 11.373f, 25.6289f, 9.97168f, 23.6123f, 9.97168f);
            instancePath.close();
            instancePath.moveTo(23.6055f, 15.3652f);
            instancePath.cubicTo(22.4092f, 15.3652f, 21.5273f, 14.5176f, 21.5273f, 13.3281f);
            instancePath.lineTo(21.5273f, 13.3145f);
            instancePath.cubicTo(21.5273f, 12.166f, 22.4639f, 11.2568f, 23.626f, 11.2568f);
            instancePath.cubicTo(24.8018f, 11.2568f, 25.7178f, 12.1797f, 25.7178f, 13.3486f);
            instancePath.lineTo(25.7178f, 13.3555f);
            instancePath.cubicTo(25.7178f, 14.5244f, 24.8086f, 15.3652f, 23.6055f, 15.3652f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
