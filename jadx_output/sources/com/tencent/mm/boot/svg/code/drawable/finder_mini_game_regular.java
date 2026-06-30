package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_mini_game_regular extends l95.c {
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
                instancePath.moveTo(19.081f, 2.08f);
                instancePath.cubicTo(19.3009f, 2.03f, 19.5108f, 2.0f, 19.7208f, 2.0f);
                instancePath.cubicTo(21.1004f, 2.0f, 22.43f, 3.13f, 22.8599f, 4.78f);
                instancePath.cubicTo(23.3598f, 6.68f, 22.48f, 8.56f, 20.8904f, 8.98f);
                instancePath.cubicTo(20.6705f, 9.03f, 20.4606f, 9.06f, 20.2506f, 9.06f);
                instancePath.cubicTo(18.871f, 9.06f, 17.5414f, 7.93f, 17.1115f, 6.28f);
                instancePath.cubicTo(16.6116f, 4.38f, 17.4914f, 2.5f, 19.081f, 2.08f);
                instancePath.close();
                instancePath.moveTo(21.7002f, 5.09f);
                instancePath.cubicTo(21.4203f, 4.01f, 20.5705f, 3.2f, 19.7208f, 3.2f);
                instancePath.cubicTo(19.6108f, 3.2f, 19.5008f, 3.21f, 19.3909f, 3.24f);
                instancePath.cubicTo(18.4611f, 3.48f, 17.9513f, 4.74f, 18.2712f, 5.98f);
                instancePath.cubicTo(18.5511f, 7.06f, 19.4009f, 7.87f, 20.2506f, 7.87f);
                instancePath.cubicTo(20.3606f, 7.87f, 20.4706f, 7.86f, 20.5805f, 7.83f);
                instancePath.cubicTo(21.0004f, 7.72f, 21.3503f, 7.41f, 21.5703f, 6.94f);
                instancePath.cubicTo(21.8202f, 6.41f, 21.8702f, 5.73f, 21.7002f, 5.09f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(11.5335f, 8.07007f);
                instancePath2.cubicTo(10.4138f, 8.07007f, 9.40407f, 8.57007f, 8.90421f, 9.50007f);
                instancePath2.cubicTo(8.12443f, 10.9501f, 8.90421f, 12.8801f, 10.6437f, 13.8101f);
                instancePath2.cubicTo(11.2735f, 14.1501f, 11.9334f, 14.3101f, 12.5632f, 14.3101f);
                instancePath2.cubicTo(13.6829f, 14.3101f, 14.6926f, 13.8101f, 15.1925f, 12.8801f);
                instancePath2.cubicTo(15.9722f, 11.4301f, 15.1925f, 9.50007f, 13.4529f, 8.57007f);
                instancePath2.cubicTo(12.8231f, 8.23007f, 12.1633f, 8.07007f, 11.5335f, 8.07007f);
                instancePath2.close();
                instancePath2.moveTo(11.5335f, 9.27007f);
                instancePath2.cubicTo(11.9933f, 9.27007f, 12.4532f, 9.39007f, 12.8931f, 9.62007f);
                instancePath2.cubicTo(13.4729f, 9.93007f, 13.9428f, 10.4301f, 14.1627f, 10.9701f);
                instancePath2.cubicTo(14.3527f, 11.4501f, 14.3527f, 11.9201f, 14.1427f, 12.3001f);
                instancePath2.cubicTo(13.8728f, 12.8001f, 13.293f, 13.1001f, 12.5732f, 13.1001f);
                instancePath2.cubicTo(12.1133f, 13.1001f, 11.6534f, 12.9801f, 11.2136f, 12.7501f);
                instancePath2.cubicTo(10.6337f, 12.4401f, 10.1639f, 11.9401f, 9.94392f, 11.4001f);
                instancePath2.cubicTo(9.75397f, 10.9201f, 9.75397f, 10.4501f, 9.96391f, 10.0701f);
                instancePath2.cubicTo(10.2338f, 9.57007f, 10.8137f, 9.27007f, 11.5335f, 9.27007f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(9.33417f, 4.67993f);
                instancePath3.cubicTo(7.23475f, 4.67993f, 5.24531f, 5.44993f, 3.8357f, 7.00993f);
                instancePath3.cubicTo(0.91652f, 10.2199f, 1.54634f, 15.5399f, 5.24531f, 18.8999f);
                instancePath3.cubicTo(7.14478f, 20.6299f, 9.48413f, 21.4999f, 11.7135f, 21.4999f);
                instancePath3.cubicTo(13.8129f, 21.4999f, 15.8024f, 20.7299f, 17.212f, 19.1699f);
                instancePath3.cubicTo(20.1312f, 15.9599f, 19.5013f, 10.6399f, 15.8024f, 7.27993f);
                instancePath3.cubicTo(13.9029f, 5.54993f, 11.5635f, 4.67993f, 9.33417f, 4.67993f);
                instancePath3.close();
                instancePath3.moveTo(9.33417f, 5.87993f);
                instancePath3.cubicTo(11.3636f, 5.87993f, 13.373f, 6.68993f, 14.9926f, 8.16993f);
                instancePath3.cubicTo(18.1917f, 11.0799f, 18.7815f, 15.6499f, 16.3222f, 18.3599f);
                instancePath3.cubicTo(15.1825f, 19.6099f, 13.553f, 20.2999f, 11.7135f, 20.2999f);
                instancePath3.cubicTo(9.68407f, 20.2999f, 7.67463f, 19.4899f, 6.05508f, 18.0099f);
                instancePath3.cubicTo(4.48552f, 16.5799f, 3.4858f, 14.7199f, 3.25587f, 12.7599f);
                instancePath3.cubicTo(3.03593f, 10.8699f, 3.55578f, 9.10993f, 4.72546f, 7.81993f);
                instancePath3.cubicTo(5.86514f, 6.56993f, 7.49468f, 5.87993f, 9.33417f, 5.87993f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
