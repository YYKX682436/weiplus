package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_hdr extends l95.c {
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
        instancePath.moveTo(1.32812f, 20.0f);
        instancePath.lineTo(3.39258f, 20.0f);
        instancePath.lineTo(3.39258f, 15.8438f);
        instancePath.lineTo(7.83594f, 15.8438f);
        instancePath.lineTo(7.83594f, 20.0f);
        instancePath.lineTo(9.90039f, 20.0f);
        instancePath.lineTo(9.90039f, 10.1357f);
        instancePath.lineTo(7.83594f, 10.1357f);
        instancePath.lineTo(7.83594f, 14.1416f);
        instancePath.lineTo(3.39258f, 14.1416f);
        instancePath.lineTo(3.39258f, 10.1357f);
        instancePath.lineTo(1.32812f, 10.1357f);
        instancePath.lineTo(1.32812f, 20.0f);
        instancePath.close();
        instancePath.moveTo(11.541f, 20.0f);
        instancePath.lineTo(15.3076f, 20.0f);
        instancePath.cubicTo(18.2676f, 20.0f, 20.0107f, 18.1611f, 20.0107f, 15.0303f);
        instancePath.lineTo(20.0107f, 15.0166f);
        instancePath.cubicTo(20.0107f, 11.8926f, 18.2607f, 10.1357f, 15.3076f, 10.1357f);
        instancePath.lineTo(11.541f, 10.1357f);
        instancePath.lineTo(11.541f, 20.0f);
        instancePath.close();
        instancePath.moveTo(13.6055f, 18.291f);
        instancePath.lineTo(13.6055f, 11.8379f);
        instancePath.lineTo(15.0615f, 11.8379f);
        instancePath.cubicTo(16.873f, 11.8379f, 17.9053f, 12.9658f, 17.9053f, 15.0234f);
        instancePath.lineTo(17.9053f, 15.0371f);
        instancePath.cubicTo(17.9053f, 17.1699f, 16.9072f, 18.291f, 15.0615f, 18.291f);
        instancePath.lineTo(13.6055f, 18.291f);
        instancePath.close();
        instancePath.moveTo(21.3438f, 20.0f);
        instancePath.lineTo(23.4082f, 20.0f);
        instancePath.lineTo(23.4082f, 16.4248f);
        instancePath.lineTo(25.0625f, 16.4248f);
        instancePath.lineTo(26.9014f, 20.0f);
        instancePath.lineTo(29.2393f, 20.0f);
        instancePath.lineTo(27.1611f, 16.1172f);
        instancePath.cubicTo(28.2549f, 15.6865f, 28.9453f, 14.6064f, 28.9453f, 13.3076f);
        instancePath.lineTo(28.9453f, 13.2939f);
        instancePath.cubicTo(28.9453f, 11.3115f, 27.6328f, 10.1357f, 25.418f, 10.1357f);
        instancePath.lineTo(21.3438f, 10.1357f);
        instancePath.lineTo(21.3438f, 20.0f);
        instancePath.close();
        instancePath.moveTo(23.4082f, 14.8594f);
        instancePath.lineTo(23.4082f, 11.749f);
        instancePath.lineTo(25.165f, 11.749f);
        instancePath.cubicTo(26.1836f, 11.749f, 26.833f, 12.3506f, 26.833f, 13.2939f);
        instancePath.lineTo(26.833f, 13.3076f);
        instancePath.cubicTo(26.833f, 14.2783f, 26.2178f, 14.8594f, 25.1924f, 14.8594f);
        instancePath.lineTo(23.4082f, 14.8594f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
