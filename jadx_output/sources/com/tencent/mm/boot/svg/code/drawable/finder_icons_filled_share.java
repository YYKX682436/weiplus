package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_filled_share extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-2565928);
            instancePaint5.setColor(-6842473);
            instancePaint5.setStrokeWidth(3.0f);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(1.5f, 1.5f);
            instancePath.lineTo(70.5f, 1.5f);
            instancePath.lineTo(70.5f, 70.5f);
            instancePath.lineTo(1.5f, 70.5f);
            instancePath.lineTo(1.5f, 1.5f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint5, looper);
            canvas.drawPath(instancePath, instancePaint6);
            canvas.drawPath(instancePath, instancePaint7);
            canvas.restore();
            android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint8.setColor(-16777216);
            instancePaint9.setColor(-16777216);
            instancePaint9.setStrokeWidth(3.6f);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(43.5f, 12.006086f);
            instancePath2.cubicTo(43.897823f, 12.006086f, 44.279354f, 12.164122f, 44.56066f, 12.445426f);
            instancePath2.lineTo(60.87868f, 28.763445f);
            instancePath2.cubicTo(62.05025f, 29.935019f, 62.05025f, 31.834513f, 60.87868f, 33.006084f);
            instancePath2.lineTo(44.56066f, 49.324104f);
            instancePath2.cubicTo(43.974873f, 49.909893f, 43.025127f, 49.909893f, 42.43934f, 49.324104f);
            instancePath2.cubicTo(42.158035f, 49.0428f, 42.0f, 48.66127f, 42.0f, 48.263447f);
            instancePath2.lineTo(41.999756f, 36.6111f);
            instancePath2.cubicTo(18.210701f, 36.019882f, 13.14624f, 63.715797f, 13.14624f, 60.714478f);
            instancePath2.cubicTo(11.452737f, 41.605106f, 20.863182f, 24.122755f, 41.999332f, 22.901964f);
            instancePath2.lineTo(42.0f, 13.506086f);
            instancePath2.cubicTo(42.0f, 12.677659f, 42.671574f, 12.006086f, 43.5f, 12.006086f);
            instancePath2.close();
            canvas.saveLayerAlpha(null, 230, 31);
            android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint8, looper);
            android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint9, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint10);
            canvas.drawPath(instancePath2, instancePaint11);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
