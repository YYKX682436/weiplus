package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ad_native_half_egg_pre_anim_default extends l95.c {
    private final int width = 50;
    private final int height = 50;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 50;
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
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(46.0004f, 25.9146f);
                instancePath.cubicTo(45.8952f, 26.1389f, 45.7492f, 26.3491f, 45.5624f, 26.5341f);
                instancePath.lineTo(26.549f, 45.365f);
                instancePath.cubicTo(25.6936f, 46.2121f, 24.3068f, 46.2121f, 23.4514f, 45.365f);
                instancePath.lineTo(4.43805f, 26.5341f);
                instancePath.cubicTo(4.25123f, 26.3491f, 4.10521f, 26.1389f, 4.0f, 25.9146f);
                instancePath.lineTo(18.459f, 25.9146f);
                instancePath.cubicTo(18.5078f, 25.9166f, 18.5568f, 25.9176f, 18.606f, 25.9176f);
                instancePath.lineTo(22.4038f, 25.9176f);
                instancePath.cubicTo(21.0798f, 27.1992f, 19.0429f, 28.8787f, 16.3002f, 30.9477f);
                instancePath.lineTo(17.4375f, 32.4264f);
                instancePath.cubicTo(20.2907f, 30.2741f, 22.4081f, 28.5243f, 23.797f, 27.168f);
                instancePath.lineTo(24.6892f, 26.2967f);
                instancePath.lineTo(25.6008f, 27.1869f);
                instancePath.cubicTo(26.9856f, 28.5391f, 29.0965f, 30.2826f, 31.9412f, 32.4267f);
                instancePath.lineTo(33.0778f, 30.9474f);
                instancePath.cubicTo(30.3305f, 28.8767f, 28.2936f, 27.1972f, 26.9744f, 25.9176f);
                instancePath.lineTo(30.7728f, 25.9176f);
                instancePath.cubicTo(30.822f, 25.9176f, 30.871f, 25.9166f, 30.9197f, 25.9146f);
                instancePath.lineTo(46.0004f, 25.9146f);
                instancePath.close();
                instancePath.moveTo(45.9861f, 24.0558f);
                instancePath.lineTo(33.86f, 24.0558f);
                instancePath.cubicTo(34.0966f, 23.597f, 34.23f, 23.0782f, 34.23f, 22.5283f);
                instancePath.cubicTo(34.23f, 20.6539f, 32.6792f, 19.1397f, 30.7728f, 19.1397f);
                instancePath.cubicTo(29.8285f, 19.1397f, 28.9418f, 19.5141f, 28.2953f, 20.1649f);
                instancePath.lineTo(24.6891f, 23.6863f);
                instancePath.lineTo(21.005f, 20.0889f);
                instancePath.cubicTo(20.3521f, 19.4785f, 19.5046f, 19.1397f, 18.606f, 19.1397f);
                instancePath.cubicTo(16.6996f, 19.1397f, 15.1484f, 20.6539f, 15.1484f, 22.5283f);
                instancePath.cubicTo(15.1484f, 23.0781f, 15.2818f, 23.597f, 15.5184f, 24.0558f);
                instancePath.lineTo(4.01433f, 24.0558f);
                instancePath.cubicTo(4.11833f, 23.8427f, 4.25957f, 23.643f, 4.43805f, 23.4663f);
                instancePath.lineTo(23.4514f, 4.63537f);
                instancePath.cubicTo(24.3068f, 3.78821f, 25.6936f, 3.78821f, 26.549f, 4.63537f);
                instancePath.lineTo(45.5624f, 23.4663f);
                instancePath.cubicTo(45.7409f, 23.643f, 45.8821f, 23.8427f, 45.9861f, 24.0558f);
                instancePath.close();
                instancePath.moveTo(26.984f, 24.0558f);
                instancePath.lineTo(30.8728f, 24.0558f);
                instancePath.cubicTo(31.7017f, 24.0058f, 32.3531f, 23.3385f, 32.3531f, 22.5283f);
                instancePath.cubicTo(32.3531f, 21.6865f, 31.6485f, 20.9986f, 30.7728f, 20.9986f);
                instancePath.cubicTo(30.3359f, 20.9986f, 29.9298f, 21.1701f, 29.6231f, 21.4786f);
                instancePath.lineTo(26.984f, 24.0558f);
                instancePath.close();
                instancePath.moveTo(17.0253f, 22.5283f);
                instancePath.cubicTo(17.0253f, 23.3384f, 17.677f, 24.0058f, 18.506f, 24.0558f);
                instancePath.lineTo(22.3943f, 24.0558f);
                instancePath.lineTo(19.7022f, 21.4268f);
                instancePath.cubicTo(19.4098f, 21.1536f, 19.022f, 20.9986f, 18.606f, 20.9986f);
                instancePath.cubicTo(17.7301f, 20.9986f, 17.0253f, 21.6866f, 17.0253f, 22.5283f);
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
