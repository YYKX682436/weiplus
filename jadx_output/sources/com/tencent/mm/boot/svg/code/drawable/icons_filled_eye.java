package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_eye extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(36.0f, 15.0f);
                instancePath.cubicTo(50.423954f, 15.0f, 62.9172f, 23.543571f, 69.00072f, 36.001507f);
                instancePath.cubicTo(62.915207f, 48.45779f, 50.422802f, 57.0f, 36.0f, 57.0f);
                instancePath.cubicTo(21.577196f, 57.0f, 9.084794f, 48.45779f, 3.000719f, 36.001472f);
                instancePath.cubicTo(9.082803f, 23.543571f, 21.576046f, 15.0f, 36.0f, 15.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 21.6f);
                instancePath.cubicTo(25.721823f, 21.6f, 16.340965f, 26.970743f, 10.780168f, 35.613647f);
                instancePath.lineTo(10.539f, 36.0f);
                instancePath.lineTo(10.780209f, 36.38798f);
                instancePath.cubicTo(16.173777f, 44.768288f, 25.157724f, 50.071552f, 35.068256f, 50.385265f);
                instancePath.lineTo(36.0f, 50.4f);
                instancePath.cubicTo(46.277203f, 50.4f, 55.65782f, 45.0302f, 61.22107f, 36.387615f);
                instancePath.lineTo(61.461f, 36.0f);
                instancePath.lineTo(61.221107f, 35.614056f);
                instancePath.cubicTo(55.82773f, 27.23264f, 46.84316f, 21.928503f, 36.93182f, 21.614737f);
                instancePath.lineTo(36.0f, 21.6f);
                instancePath.close();
                instancePath.moveTo(36.0f, 28.5f);
                instancePath.cubicTo(40.142136f, 28.5f, 43.5f, 31.857864f, 43.5f, 36.0f);
                instancePath.cubicTo(43.5f, 40.142136f, 40.142136f, 43.5f, 36.0f, 43.5f);
                instancePath.cubicTo(31.857864f, 43.5f, 28.5f, 40.142136f, 28.5f, 36.0f);
                instancePath.cubicTo(28.5f, 31.857864f, 31.857864f, 28.5f, 36.0f, 28.5f);
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
