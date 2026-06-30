package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_note_todo extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(17.470392f, 4.0f);
                instancePath.lineTo(16.556477f, 5.133333f);
                instancePath.lineTo(5.144302f, 5.133333f);
                instancePath.lineTo(5.144302f, 18.866667f);
                instancePath.lineTo(18.903f, 18.90515f);
                instancePath.lineTo(18.903f, 11.298965f);
                instancePath.lineTo(20.047302f, 9.890863f);
                instancePath.lineTo(20.047302f, 19.094038f);
                instancePath.cubicTo(20.047302f, 19.61564f, 19.620367f, 20.038483f, 19.093718f, 20.038483f);
                instancePath.lineTo(4.9535847f, 20.0f);
                instancePath.cubicTo(4.4269342f, 20.0f, 4.0f, 19.577158f, 4.0f, 19.055555f);
                instancePath.lineTo(4.0f, 4.9444447f);
                instancePath.cubicTo(4.0f, 4.422842f, 4.4269342f, 4.0f, 4.9535847f, 4.0f);
                instancePath.lineTo(17.470392f, 4.0f);
                instancePath.close();
                instancePath.moveTo(19.67767f, 4.0f);
                instancePath.lineTo(20.738329f, 5.0606604f);
                instancePath.lineTo(12.064214f, 15.585379f);
                instancePath.cubicTo(12.043838f, 15.610102f, 12.022285f, 15.633832f, 11.999631f, 15.656486f);
                instancePath.cubicTo(11.609107f, 16.04701f, 10.975942f, 16.04701f, 10.585418f, 15.656486f);
                instancePath.lineTo(10.585418f, 15.656486f);
                instancePath.lineTo(7.0f, 12.071068f);
                instancePath.lineTo(8.06066f, 11.010407f);
                instancePath.lineTo(11.363961f, 14.313708f);
                instancePath.lineTo(19.67767f, 4.0f);
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
