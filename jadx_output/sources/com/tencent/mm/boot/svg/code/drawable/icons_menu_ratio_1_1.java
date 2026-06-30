package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_ratio_1_1 extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
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
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.75f, 20.0f);
        instancePath.lineTo(9.75f, 12.0293f);
        instancePath.lineTo(9.70898f, 12.0293f);
        instancePath.lineTo(7.19336f, 13.7383f);
        instancePath.lineTo(7.19336f, 11.9062f);
        instancePath.lineTo(9.74316f, 10.1357f);
        instancePath.lineTo(11.7939f, 10.1357f);
        instancePath.lineTo(11.7939f, 20.0f);
        instancePath.lineTo(9.75f, 20.0f);
        instancePath.close();
        instancePath.moveTo(15.0f, 13.7383f);
        instancePath.cubicTo(14.3779f, 13.7383f, 13.8926f, 13.2529f, 13.8926f, 12.6309f);
        instancePath.cubicTo(13.8926f, 12.0156f, 14.3779f, 11.5234f, 15.0f, 11.5234f);
        instancePath.cubicTo(15.6152f, 11.5234f, 16.1074f, 12.0156f, 16.1074f, 12.6309f);
        instancePath.cubicTo(16.1074f, 13.2529f, 15.6152f, 13.7383f, 15.0f, 13.7383f);
        instancePath.close();
        instancePath.moveTo(15.0f, 18.6055f);
        instancePath.cubicTo(14.3779f, 18.6055f, 13.8926f, 18.1133f, 13.8926f, 17.498f);
        instancePath.cubicTo(13.8926f, 16.876f, 14.3779f, 16.3906f, 15.0f, 16.3906f);
        instancePath.cubicTo(15.6152f, 16.3906f, 16.1074f, 16.876f, 16.1074f, 17.498f);
        instancePath.cubicTo(16.1074f, 18.1133f, 15.6152f, 18.6055f, 15.0f, 18.6055f);
        instancePath.close();
        instancePath.moveTo(19.8535f, 20.0f);
        instancePath.lineTo(19.8535f, 12.0293f);
        instancePath.lineTo(19.8125f, 12.0293f);
        instancePath.lineTo(17.2969f, 13.7383f);
        instancePath.lineTo(17.2969f, 11.9062f);
        instancePath.lineTo(19.8467f, 10.1357f);
        instancePath.lineTo(21.8975f, 10.1357f);
        instancePath.lineTo(21.8975f, 20.0f);
        instancePath.lineTo(19.8535f, 20.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
