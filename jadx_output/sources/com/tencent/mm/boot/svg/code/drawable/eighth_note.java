package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class eighth_note extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.3168f, 15.7185f);
                instancePath.cubicTo(12.3581f, 15.7419f, 12.4094f, 15.7409f, 12.4521f, 15.7184f);
                instancePath.cubicTo(12.4937f, 15.6964f, 12.5157f, 15.6609f, 12.5157f, 15.6212f);
                instancePath.lineTo(12.5157f, 2.70557f);
                instancePath.cubicTo(12.5157f, 2.29136f, 12.8515f, 1.95557f, 13.2657f, 1.95557f);
                instancePath.cubicTo(13.6799f, 1.95557f, 14.0157f, 2.29134f, 14.0157f, 2.70557f);
                instancePath.lineTo(14.0157f, 3.09281f);
                instancePath.cubicTo(14.0157f, 3.25913f, 14.1366f, 3.41125f, 14.3133f, 3.46365f);
                instancePath.cubicTo(15.4227f, 3.79265f, 16.7409f, 4.65137f, 17.4679f, 5.93742f);
                instancePath.cubicTo(18.2017f, 7.23561f, 18.3222f, 8.95028f, 17.0606f, 10.9497f);
                instancePath.cubicTo(16.8964f, 11.2096f, 16.5222f, 11.076f, 16.5149f, 10.7949f);
                instancePath.cubicTo(16.4831f, 9.5886f, 16.3202f, 8.55823f, 15.9391f, 7.78706f);
                instancePath.cubicTo(15.5622f, 7.02459f, 14.9716f, 6.51311f, 14.0624f, 6.33328f);
                instancePath.cubicTo(14.0427f, 6.32938f, 14.0157f, 6.34452f, 14.0157f, 6.37735f);
                instancePath.lineTo(14.0157f, 18.3624f);
                instancePath.cubicTo(14.1112f, 20.2555f, 12.4501f, 21.901f, 10.4242f, 22.3877f);
                instancePath.cubicTo(9.30352f, 22.657f, 8.13183f, 22.56f, 7.1741f, 22.1333f);
                instancePath.cubicTo(6.2148f, 21.706f, 5.4642f, 20.9441f, 5.21004f, 19.8862f);
                instancePath.cubicTo(4.95588f, 18.8283f, 5.27847f, 17.8086f, 5.93894f, 16.9921f);
                instancePath.cubicTo(6.59834f, 16.177f, 7.59809f, 15.5583f, 8.71874f, 15.2891f);
                instancePath.moveTo(12.3168f, 15.7185f);
                instancePath.cubicTo(11.3037f, 15.1463f, 9.97831f, 14.9865f, 8.71874f, 15.2891f);
                instancePath.close();
                instancePath.moveTo(9.06914f, 16.7476f);
                instancePath.cubicTo(7.28579f, 17.1761f, 6.42934f, 18.5402f, 6.66854f, 19.5358f);
                instancePath.cubicTo(6.90775f, 20.5314f, 8.29043f, 21.3577f, 10.0738f, 20.9292f);
                instancePath.cubicTo(11.8572f, 20.5008f, 12.7136f, 19.1366f, 12.4744f, 18.141f);
                instancePath.cubicTo(12.2352f, 17.1454f, 10.8525f, 16.3192f, 9.06914f, 16.7476f);
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
