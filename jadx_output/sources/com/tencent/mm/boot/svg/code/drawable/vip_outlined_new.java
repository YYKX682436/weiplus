package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class vip_outlined_new extends l95.c {
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.863f, 2.20425f);
        instancePath.cubicTo(12.3867f, 1.93202f, 11.6136f, 1.93182f, 11.137f, 2.20425f);
        instancePath.lineTo(3.86296f, 6.36221f);
        instancePath.cubicTo(3.38672f, 6.63443f, 3.0f, 7.29301f, 3.0f, 7.83273f);
        instancePath.lineTo(3.0f, 16.1673f);
        instancePath.cubicTo(3.0f, 16.7024f, 3.38636f, 17.3654f, 3.86296f, 17.6378f);
        instancePath.lineTo(11.137f, 21.7958f);
        instancePath.cubicTo(11.6133f, 22.068f, 12.3864f, 22.0682f, 12.863f, 21.7958f);
        instancePath.lineTo(20.137f, 17.6378f);
        instancePath.cubicTo(20.6133f, 17.3656f, 21.0f, 16.707f, 21.0f, 16.1673f);
        instancePath.lineTo(21.0f, 7.83273f);
        instancePath.cubicTo(21.0f, 7.29759f, 20.6136f, 6.63464f, 20.137f, 6.36221f);
        instancePath.lineTo(12.863f, 2.20425f);
        instancePath.close();
        instancePath.moveTo(4.2f, 7.83273f);
        instancePath.cubicTo(4.2f, 7.71164f, 4.35967f, 7.43961f, 4.4676f, 7.37791f);
        instancePath.lineTo(11.7417f, 3.21995f);
        instancePath.cubicTo(11.8445f, 3.16119f, 12.1556f, 3.16121f, 12.2583f, 3.21995f);
        instancePath.lineTo(19.5324f, 7.37791f);
        instancePath.cubicTo(19.6388f, 7.43872f, 19.8f, 7.71405f, 19.8f, 7.83273f);
        instancePath.lineTo(19.8f, 16.1673f);
        instancePath.cubicTo(19.8f, 16.2884f, 19.6403f, 16.5604f, 19.5324f, 16.6221f);
        instancePath.lineTo(12.2583f, 20.78f);
        instancePath.cubicTo(12.1555f, 20.8388f, 11.8444f, 20.8388f, 11.7417f, 20.78f);
        instancePath.lineTo(4.4676f, 16.6221f);
        instancePath.cubicTo(4.36122f, 16.5613f, 4.2f, 16.286f, 4.2f, 16.1673f);
        instancePath.lineTo(4.2f, 7.83273f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.0241f, 8.86849f);
        instancePath2.cubicTo(13.0241f, 9.68987f, 12.451f, 10.1371f, 12.0f, 10.1371f);
        instancePath2.cubicTo(11.549f, 10.1371f, 10.9758f, 9.68987f, 10.9758f, 8.86849f);
        instancePath2.cubicTo(10.9758f, 8.04711f, 11.549f, 7.5999f, 12.0f, 7.5999f);
        instancePath2.cubicTo(12.451f, 7.5999f, 13.0241f, 8.04711f, 13.0241f, 8.86849f);
        instancePath2.close();
        instancePath2.moveTo(12.0f, 11.3371f);
        instancePath2.cubicTo(13.2284f, 11.3371f, 14.2241f, 10.2318f, 14.2241f, 8.86849f);
        instancePath2.cubicTo(14.2241f, 7.50513f, 13.2284f, 6.3999f, 12.0f, 6.3999f);
        instancePath2.cubicTo(10.7716f, 6.3999f, 9.77583f, 7.50513f, 9.77583f, 8.86849f);
        instancePath2.cubicTo(9.77583f, 10.2318f, 10.7716f, 11.3371f, 12.0f, 11.3371f);
        instancePath2.close();
        instancePath2.moveTo(11.9999f, 12.0228f);
        instancePath2.cubicTo(10.5801f, 12.0228f, 9.44802f, 12.4223f, 8.65602f, 12.9888f);
        instancePath2.cubicTo(7.89158f, 13.5355f, 7.37048f, 14.3007f, 7.37048f, 15.0485f);
        instancePath2.cubicTo(7.37048f, 15.2952f, 7.38458f, 15.6322f, 7.56667f, 15.9317f);
        instancePath2.cubicTo(7.76665f, 16.2607f, 8.09034f, 16.4281f, 8.43838f, 16.5232f);
        instancePath2.cubicTo(8.77807f, 16.6162f, 9.22166f, 16.6625f, 9.78002f, 16.6888f);
        instancePath2.cubicTo(10.3468f, 16.7155f, 11.074f, 16.7228f, 11.9999f, 16.7228f);
        instancePath2.cubicTo(12.9262f, 16.7228f, 13.6536f, 16.7147f, 14.2208f, 16.687f);
        instancePath2.cubicTo(14.7797f, 16.6597f, 15.2233f, 16.612f, 15.563f, 16.5181f);
        instancePath2.cubicTo(15.9107f, 16.422f, 16.233f, 16.2544f, 16.4326f, 15.9274f);
        instancePath2.cubicTo(16.615f, 15.6285f, 16.6293f, 15.2932f, 16.6293f, 15.0485f);
        instancePath2.cubicTo(16.6293f, 14.3061f, 16.1071f, 13.5411f, 15.3445f, 12.994f);
        instancePath2.cubicTo(14.5531f, 12.4261f, 13.4209f, 12.0228f, 11.9999f, 12.0228f);
        instancePath2.close();
        instancePath2.moveTo(8.57048f, 15.0485f);
        instancePath2.cubicTo(8.57048f, 14.8393f, 8.75725f, 14.3917f, 9.35411f, 13.9648f);
        instancePath2.cubicTo(9.9234f, 13.5576f, 10.806f, 13.2228f, 11.9999f, 13.2228f);
        instancePath2.cubicTo(13.1926f, 13.2228f, 14.0751f, 13.5601f, 14.645f, 13.9689f);
        instancePath2.cubicTo(15.2436f, 14.3985f, 15.4293f, 14.8465f, 15.4293f, 15.0485f);
        instancePath2.cubicTo(15.4293f, 15.2131f, 15.4154f, 15.2771f, 15.4098f, 15.2964f);
        instancePath2.cubicTo(15.3915f, 15.3087f, 15.3448f, 15.3334f, 15.2433f, 15.3615f);
        instancePath2.cubicTo(15.0385f, 15.4181f, 14.7061f, 15.4619f, 14.1623f, 15.4884f);
        instancePath2.cubicTo(13.6269f, 15.5146f, 12.925f, 15.5228f, 11.9999f, 15.5228f);
        instancePath2.cubicTo(11.0744f, 15.5228f, 10.3723f, 15.5154f, 9.83643f, 15.4902f);
        instancePath2.cubicTo(9.29215f, 15.4645f, 8.9598f, 15.4218f, 8.75498f, 15.3658f);
        instancePath2.cubicTo(8.65519f, 15.3385f, 8.60881f, 15.3144f, 8.59035f, 15.3022f);
        instancePath2.cubicTo(8.58459f, 15.2823f, 8.57048f, 15.2169f, 8.57048f, 15.0485f);
        instancePath2.close();
        instancePath2.moveTo(15.4198f, 15.2882f);
        instancePath2.cubicTo(15.4201f, 15.2883f, 15.4188f, 15.2899f, 15.4151f, 15.2927f);
        instancePath2.cubicTo(15.4178f, 15.2895f, 15.4196f, 15.2881f, 15.4198f, 15.2882f);
        instancePath2.close();
        instancePath2.moveTo(8.57999f, 15.2938f);
        instancePath2.cubicTo(8.58024f, 15.2937f, 8.58212f, 15.2951f, 8.58487f, 15.2983f);
        instancePath2.cubicTo(8.58111f, 15.2955f, 8.57974f, 15.2939f, 8.57999f, 15.2938f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
