package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_finder_play_icon extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.524097f, 4.9379063f);
        instancePath.lineTo(19.616055f, 11.148342f);
        instancePath.cubicTo(20.086412f, 11.437793f, 20.233067f, 12.05374f, 19.943617f, 12.524097f);
        instancePath.cubicTo(19.861572f, 12.657418f, 19.749376f, 12.769615f, 19.616055f, 12.851658f);
        instancePath.lineTo(9.524097f, 19.062094f);
        instancePath.cubicTo(9.05374f, 19.351545f, 8.437793f, 19.204891f, 8.148342f, 18.734533f);
        instancePath.cubicTo(8.0513525f, 18.576925f, 8.0f, 18.395494f, 8.0f, 18.210436f);
        instancePath.lineTo(8.0f, 5.7895646f);
        instancePath.cubicTo(8.0f, 5.23728f, 8.447715f, 4.7895646f, 9.0f, 4.7895646f);
        instancePath.cubicTo(9.18506f, 4.7895646f, 9.366489f, 4.8409166f, 9.524097f, 4.9379063f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(9.524097f, 4.9379063f);
        instancePath2.lineTo(19.616055f, 11.148342f);
        instancePath2.cubicTo(20.086412f, 11.437793f, 20.233067f, 12.05374f, 19.943617f, 12.524097f);
        instancePath2.cubicTo(19.861572f, 12.657418f, 19.749376f, 12.769615f, 19.616055f, 12.851658f);
        instancePath2.lineTo(9.524097f, 19.062094f);
        instancePath2.cubicTo(9.05374f, 19.351545f, 8.437793f, 19.204891f, 8.148342f, 18.734533f);
        instancePath2.cubicTo(8.0513525f, 18.576925f, 8.0f, 18.395494f, 8.0f, 18.210436f);
        instancePath2.lineTo(8.0f, 5.7895646f);
        instancePath2.cubicTo(8.0f, 5.23728f, 8.447715f, 4.7895646f, 9.0f, 4.7895646f);
        instancePath2.cubicTo(9.18506f, 4.7895646f, 9.366489f, 4.8409166f, 9.524097f, 4.9379063f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
