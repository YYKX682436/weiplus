package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wechat_pay_medium extends l95.c {
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
                instancePath.moveTo(5.1001f, 20.4315f);
                instancePath.cubicTo(5.04821f, 20.8243f, 5.45199f, 21.1185f, 5.80999f, 20.9488f);
                instancePath.lineTo(8.76815f, 19.5463f);
                instancePath.cubicTo(9.78194f, 19.8404f, 10.869f, 20.0f, 12.0f, 20.0f);
                instancePath.cubicTo(17.5228f, 20.0f, 22.0f, 16.1944f, 22.0f, 11.5f);
                instancePath.cubicTo(22.0f, 6.80558f, 17.5228f, 3.0f, 12.0f, 3.0f);
                instancePath.cubicTo(6.47715f, 3.0f, 2.0f, 6.80558f, 2.0f, 11.5f);
                instancePath.cubicTo(2.0f, 14.0581f, 3.32945f, 16.3523f, 5.43312f, 17.9105f);
                instancePath.lineTo(5.1001f, 20.4315f);
                instancePath.close();
                instancePath.moveTo(6.82784f, 18.8062f);
                instancePath.lineTo(7.0359f, 17.2311f);
                instancePath.lineTo(6.32596f, 16.7052f);
                instancePath.cubicTo(4.54095f, 15.383f, 3.5f, 13.5092f, 3.5f, 11.5f);
                instancePath.cubicTo(3.5f, 7.85334f, 7.06775f, 4.5f, 12.0f, 4.5f);
                instancePath.cubicTo(14.9155f, 4.5f, 17.3542f, 5.67168f, 18.8611f, 7.38304f);
                instancePath.lineTo(10.303f, 11.2123f);
                instancePath.cubicTo(9.97563f, 11.3598f, 9.59424f, 11.3205f, 9.30386f, 11.1092f);
                instancePath.lineTo(6.8974f, 9.35812f);
                instancePath.cubicTo(6.56664f, 9.11744f, 6.13059f, 9.46971f, 6.29638f, 9.84367f);
                instancePath.lineTo(8.32891f, 14.407f);
                instancePath.cubicTo(8.52538f, 14.8481f, 9.06491f, 15.0159f, 9.47692f, 14.7641f);
                instancePath.lineTo(19.6826f, 8.52602f);
                instancePath.cubicTo(20.2105f, 9.4464f, 20.5f, 10.4613f, 20.5f, 11.5f);
                instancePath.cubicTo(20.5f, 15.1467f, 16.9323f, 18.5f, 12.0f, 18.5f);
                instancePath.cubicTo(11.0102f, 18.5f, 10.0638f, 18.3603f, 9.18609f, 18.1057f);
                instancePath.lineTo(8.63967f, 17.9472f);
                instancePath.lineTo(6.82784f, 18.8062f);
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
