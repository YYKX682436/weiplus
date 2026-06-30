package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_edit_photo_eraser extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.2569f, 12.2506f);
                instancePath.lineTo(14.0449f, 5.46262f);
                instancePath.lineTo(19.7017f, 11.1195f);
                instancePath.lineTo(12.9138f, 17.9074f);
                instancePath.lineTo(7.2569f, 12.2506f);
                instancePath.close();
                instancePath.moveTo(6.12553f, 11.1192f);
                instancePath.lineTo(13.4792f, 3.76556f);
                instancePath.cubicTo(13.7916f, 3.45315f, 14.2981f, 3.45315f, 14.6105f, 3.76556f);
                instancePath.lineTo(21.3988f, 10.5538f);
                instancePath.cubicTo(21.7112f, 10.8662f, 21.7112f, 11.3727f, 21.3988f, 11.6852f);
                instancePath.lineTo(12.2841f, 20.7998f);
                instancePath.lineTo(12.284f, 20.7998f);
                instancePath.lineTo(6.75476f, 20.7998f);
                instancePath.lineTo(6.75463f, 20.7998f);
                instancePath.lineTo(2.16547f, 16.2106f);
                instancePath.cubicTo(1.85305f, 15.8982f, 1.85305f, 15.3917f, 2.16547f, 15.0793f);
                instancePath.lineTo(2.29732f, 14.9474f);
                instancePath.cubicTo(2.30049f, 14.9442f, 2.30367f, 14.9409f, 2.30689f, 14.9377f);
                instancePath.lineTo(6.12547f, 11.1191f);
                instancePath.lineTo(6.12553f, 11.1192f);
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
