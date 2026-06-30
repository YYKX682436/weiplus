package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_gift extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
            instancePaint3.setColor(-2112620);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.8f, 17.3334f);
            instancePath.cubicTo(12.8f, 15.5654f, 14.232f, 14.1334f, 16.0f, 14.1334f);
            instancePath.cubicTo(17.768f, 14.1334f, 19.2f, 15.5654f, 19.2f, 17.3334f);
            instancePath.cubicTo(19.2f, 19.1014f, 17.768f, 20.5334f, 16.0f, 20.5334f);
            instancePath.cubicTo(14.232f, 20.5334f, 12.8f, 19.1014f, 12.8f, 17.3334f);
            instancePath.close();
            instancePath.moveTo(11.2134f, 19.1734f);
            instancePath.cubicTo(11.28f, 18.5441f, 11.592f, 17.9041f, 11.7334f, 17.3494f);
            instancePath.cubicTo(11.7334f, 17.3441f, 11.7334f, 17.3387f, 11.7334f, 17.3334f);
            instancePath.cubicTo(11.7334f, 17.3281f, 11.7334f, 17.3227f, 11.7334f, 17.3174f);
            instancePath.cubicTo(11.5734f, 16.6907f, 11.192f, 15.9547f, 11.1974f, 15.2481f);
            instancePath.cubicTo(11.2027f, 14.8027f, 11.4427f, 14.4027f, 11.8294f, 14.1814f);
            instancePath.cubicTo(12.448f, 13.8267f, 13.2747f, 13.7867f, 13.904f, 13.6134f);
            instancePath.cubicTo(14.352f, 13.1814f, 14.7787f, 12.5094f, 15.3654f, 12.1681f);
            instancePath.cubicTo(15.7574f, 11.9414f, 16.24f, 11.9414f, 16.6294f, 12.1681f);
            instancePath.cubicTo(17.2134f, 12.5094f, 17.6427f, 13.1814f, 18.0907f, 13.6134f);
            instancePath.cubicTo(18.6667f, 13.7707f, 19.4054f, 13.8214f, 20.0f, 14.0987f);
            instancePath.lineTo(25.064f, 11.1734f);
            instancePath.cubicTo(26.0534f, 10.6027f, 26.664f, 9.54408f, 26.664f, 8.40275f);
            instancePath.lineTo(26.664f, 6.13341f);
            instancePath.cubicTo(26.664f, 4.21875f, 25.112f, 2.66675f, 23.1974f, 2.66675f);
            instancePath.lineTo(8.80004f, 2.66675f);
            instancePath.cubicTo(6.88537f, 2.66675f, 5.33337f, 4.21875f, 5.33337f, 6.13341f);
            instancePath.lineTo(5.33337f, 22.5681f);
            instancePath.lineTo(11.2134f, 19.1734f);
            instancePath.close();
            instancePath.moveTo(20.7867f, 15.4934f);
            instancePath.cubicTo(20.72f, 16.1227f, 20.408f, 16.7627f, 20.2667f, 17.3174f);
            instancePath.cubicTo(20.2667f, 17.3227f, 20.2667f, 17.3281f, 20.2667f, 17.3334f);
            instancePath.cubicTo(20.2667f, 17.3387f, 20.2667f, 17.3441f, 20.2667f, 17.3494f);
            instancePath.cubicTo(20.4267f, 17.9761f, 20.808f, 18.7121f, 20.8027f, 19.4187f);
            instancePath.cubicTo(20.7974f, 19.8641f, 20.5574f, 20.2641f, 20.1707f, 20.4854f);
            instancePath.cubicTo(19.552f, 20.8401f, 18.7254f, 20.8801f, 18.096f, 21.0534f);
            instancePath.cubicTo(17.648f, 21.4854f, 17.2214f, 22.1574f, 16.6347f, 22.4987f);
            instancePath.cubicTo(16.2427f, 22.7254f, 15.76f, 22.7254f, 15.3707f, 22.4987f);
            instancePath.cubicTo(14.7867f, 22.1574f, 14.3574f, 21.4854f, 13.9094f, 21.0534f);
            instancePath.cubicTo(13.3334f, 20.8961f, 12.5947f, 20.8454f, 12.0f, 20.5681f);
            instancePath.lineTo(6.52271f, 23.7307f);
            instancePath.cubicTo(5.78671f, 24.1547f, 5.33604f, 24.9387f, 5.33604f, 25.7867f);
            instancePath.lineTo(5.33604f, 25.8667f);
            instancePath.cubicTo(5.33604f, 27.7814f, 6.88804f, 29.3334f, 8.80271f, 29.3334f);
            instancePath.lineTo(23.2027f, 29.3334f);
            instancePath.cubicTo(25.1174f, 29.3334f, 26.6694f, 27.7814f, 26.6694f, 25.8667f);
            instancePath.lineTo(26.6694f, 12.0987f);
            instancePath.lineTo(20.7894f, 15.4934f);
            instancePath.lineTo(20.7867f, 15.4934f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
