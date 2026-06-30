package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_filled_fav extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-40634);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.99995f, 12.2061f);
        instancePath.lineTo(4.61006f, 13.9882f);
        instancePath.cubicTo(4.08375f, 14.2649f, 3.45917f, 13.7956f, 3.55732f, 13.2234f);
        instancePath.lineTo(4.20473f, 9.44869f);
        instancePath.lineTo(1.46225f, 6.77543f);
        instancePath.cubicTo(1.03646f, 6.36039f, 1.28978f, 5.62135f, 1.86436f, 5.53786f);
        instancePath.lineTo(5.65438f, 4.98714f);
        instancePath.lineTo(7.34932f, 1.5528f);
        instancePath.cubicTo(7.61247f, 1.0196f, 8.39362f, 1.03215f, 8.65058f, 1.5528f);
        instancePath.lineTo(10.3455f, 4.98714f);
        instancePath.lineTo(14.1355f, 5.53786f);
        instancePath.cubicTo(14.724f, 5.62337f, 14.9534f, 6.37015f, 14.5376f, 6.77543f);
        instancePath.lineTo(11.7952f, 9.44869f);
        instancePath.lineTo(12.4426f, 13.2234f);
        instancePath.cubicTo(12.5431f, 13.8094f, 11.9038f, 14.2584f, 11.3898f, 13.9882f);
        instancePath.lineTo(7.99995f, 12.2061f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
