package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_music_list extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePath.moveTo(54.0f, 21.0f);
        instancePath.lineTo(18.0f, 21.0f);
        instancePath.lineTo(18.0f, 24.6f);
        instancePath.lineTo(54.0f, 24.6f);
        instancePath.lineTo(54.0f, 21.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.0f, 37.5f);
        instancePath2.lineTo(39.0f, 37.5f);
        instancePath2.lineTo(39.0f, 41.1f);
        instancePath2.lineTo(18.0f, 41.1f);
        instancePath2.lineTo(18.0f, 37.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(51.2692f, 34.875f);
        instancePath3.cubicTo(51.2692f, 33.8809f, 50.4634f, 33.075f, 49.4692f, 33.075f);
        instancePath3.cubicTo(48.4751f, 33.075f, 47.6692f, 33.8809f, 47.6692f, 34.875f);
        instancePath3.lineTo(47.6692f, 47.7962f);
        instancePath3.cubicTo(47.6692f, 48.0058f, 47.4594f, 48.1512f, 47.2588f, 48.0906f);
        instancePath3.cubicTo(46.645f, 47.9052f, 45.9861f, 47.8046f, 45.3003f, 47.8046f);
        instancePath3.cubicTo(41.9866f, 47.8046f, 39.3003f, 50.1551f, 39.3003f, 53.0546f);
        instancePath3.cubicTo(39.3003f, 55.9541f, 41.9866f, 58.3046f, 45.3003f, 58.3046f);
        instancePath3.cubicTo(48.614f, 58.3046f, 51.3003f, 55.9541f, 51.3003f, 53.0546f);
        instancePath3.cubicTo(51.3003f, 52.8731f, 51.2898f, 52.6938f, 51.2692f, 52.5171f);
        instancePath3.lineTo(51.2692f, 41.535f);
        instancePath3.cubicTo(51.2692f, 41.3062f, 51.5151f, 41.1616f, 51.715f, 41.2728f);
        instancePath3.lineTo(54.4613f, 42.7997f);
        instancePath3.cubicTo(55.3301f, 43.2828f, 56.4261f, 42.9701f, 56.9092f, 42.1012f);
        instancePath3.cubicTo(57.3922f, 41.2324f, 57.0795f, 40.1364f, 56.2107f, 39.6533f);
        instancePath3.lineTo(51.2692f, 36.9059f);
        instancePath3.lineTo(51.2692f, 34.875f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(9.0f, 6.0f);
        instancePath4.cubicTo(7.34315f, 6.0f, 6.0f, 7.34315f, 6.0f, 9.0f);
        instancePath4.lineTo(6.0f, 63.0f);
        instancePath4.cubicTo(6.0f, 64.6569f, 7.34315f, 66.0f, 9.0f, 66.0f);
        instancePath4.lineTo(63.0f, 66.0f);
        instancePath4.cubicTo(64.6569f, 66.0f, 66.0f, 64.6569f, 66.0f, 63.0f);
        instancePath4.lineTo(66.0f, 9.0f);
        instancePath4.cubicTo(66.0f, 7.34315f, 64.6569f, 6.0f, 63.0f, 6.0f);
        instancePath4.lineTo(9.0f, 6.0f);
        instancePath4.close();
        instancePath4.moveTo(9.6f, 9.6f);
        instancePath4.lineTo(9.6f, 62.4f);
        instancePath4.lineTo(62.4f, 62.4f);
        instancePath4.lineTo(62.4f, 9.6f);
        instancePath4.lineTo(9.6f, 9.6f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
