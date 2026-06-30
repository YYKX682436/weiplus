package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class music_page_rest_darkmode extends l95.c {
    private final int width = 240;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 240;
        }
        if (i17 == 1) {
            return 48;
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
            instancePaint3.setColor(637534208);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 22.5f);
            instancePath.lineTo(72.0f, 22.5f);
            instancePath.lineTo(72.0f, 25.5f);
            instancePath.lineTo(0.0f, 25.5f);
            instancePath.lineTo(0.0f, 22.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(637534208);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(168.0f, 22.5f);
            instancePath2.lineTo(240.0f, 22.5f);
            instancePath2.lineTo(240.0f, 25.5f);
            instancePath2.lineTo(168.0f, 25.5f);
            instancePath2.lineTo(168.0f, 22.5f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(637534208);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(115.881f, 0.188201f);
            instancePath3.lineTo(125.992f, 13.762f);
            instancePath3.cubicTo(126.491f, 14.4316f, 126.51f, 15.3587f, 126.04f, 16.0501f);
            instancePath3.lineTo(122.194f, 21.7072f);
            instancePath3.cubicTo(120.808f, 23.7445f, 120.838f, 26.4693f, 122.267f, 28.474f);
            instancePath3.lineTo(127.627f, 35.9911f);
            instancePath3.cubicTo(127.782f, 36.204f, 127.736f, 36.5058f, 127.527f, 36.6624f);
            instancePath3.cubicTo(127.401f, 36.7573f, 127.237f, 36.7806f, 127.091f, 36.7219f);
            instancePath3.cubicTo(123.533f, 35.3372f, 120.936f, 35.6908f, 119.3f, 37.7828f);
            instancePath3.cubicTo(117.737f, 39.7801f, 118.319f, 42.9386f, 121.046f, 47.2583f);
            instancePath3.cubicTo(121.188f, 47.4804f, 121.126f, 47.7791f, 120.909f, 47.9235f);
            instancePath3.cubicTo(120.743f, 48.0341f, 120.528f, 48.0248f, 120.375f, 47.8954f);
            instancePath3.lineTo(114.867f, 43.4838f);
            instancePath3.cubicTo(112.202f, 41.3492f, 111.518f, 37.5085f, 113.22f, 34.5461f);
            instancePath3.lineTo(113.449f, 34.1749f);
            instancePath3.cubicTo(115.315f, 31.3f, 118.944f, 30.3268f, 121.911f, 31.8477f);
            instancePath3.lineTo(122.238f, 32.027f);
            instancePath3.lineTo(113.444f, 20.8929f);
            instancePath3.cubicTo(113.164f, 20.5393f, 113.163f, 20.0318f, 113.44f, 19.6765f);
            instancePath3.lineTo(117.407f, 14.5905f);
            instancePath3.cubicTo(119.364f, 12.082f, 119.608f, 8.58109f, 118.019f, 5.80836f);
            instancePath3.lineTo(115.11f, 0.728596f);
            instancePath3.cubicTo(114.978f, 0.499246f, 115.051f, 0.203214f, 115.273f, 0.0673914f);
            instancePath3.cubicTo(115.476f, -0.0568995f, 115.737f, -0.00505792f, 115.881f, 0.188201f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
