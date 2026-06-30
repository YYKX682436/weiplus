package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class exclamation_mark_triangle_filled extends l95.c {
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
                instancePath.moveTo(21.268f, 21.0526f);
                instancePath.cubicTo(22.0378f, 21.0526f, 22.5189f, 20.2192f, 22.1339f, 19.5526f);
                instancePath.lineTo(12.8644f, 3.49994f);
                instancePath.cubicTo(12.4794f, 2.83328f, 11.5171f, 2.83337f, 11.1323f, 3.5001f);
                instancePath.lineTo(1.86588f, 19.5543f);
                instancePath.cubicTo(1.48106f, 20.221f, 1.96226f, 21.0543f, 2.73204f, 21.0542f);
                instancePath.lineTo(21.268f, 21.0526f);
                instancePath.close();
                instancePath.moveTo(13.0082f, 9.0f);
                instancePath.lineTo(10.9918f, 9.0f);
                instancePath.lineTo(11.1194f, 15.166f);
                instancePath.lineTo(12.8806f, 15.166f);
                instancePath.lineTo(13.0082f, 9.0f);
                instancePath.close();
                instancePath.moveTo(10.8975f, 17.7051f);
                instancePath.cubicTo(10.8975f, 18.3106f, 11.389f, 18.7871f, 11.9971f, 18.7871f);
                instancePath.cubicTo(12.6099f, 18.7871f, 13.1025f, 18.3117f, 13.1025f, 17.7051f);
                instancePath.cubicTo(13.1025f, 17.0962f, 12.6076f, 16.6289f, 11.9971f, 16.6289f);
                instancePath.cubicTo(11.3913f, 16.6289f, 10.8975f, 17.0973f, 10.8975f, 17.7051f);
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
