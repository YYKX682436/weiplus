package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_filled_voice extends l95.c {
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 22.0f);
                instancePath.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
                instancePath.close();
                instancePath.moveTo(12.308326f, 16.808327f);
                instancePath.lineTo(13.156855f, 17.656855f);
                instancePath.cubicTo(14.604569f, 16.209139f, 15.5f, 14.209139f, 15.5f, 12.0f);
                instancePath.cubicTo(15.5f, 9.790861f, 14.604569f, 7.790861f, 13.156855f, 6.343146f);
                instancePath.lineTo(12.308326f, 7.1916738f);
                instancePath.cubicTo(13.576121f, 8.45947f, 14.3f, 10.17091f, 14.3f, 12.0f);
                instancePath.cubicTo(14.3f, 13.82909f, 13.576121f, 15.54053f, 12.308326f, 16.808327f);
                instancePath.close();
                instancePath.moveTo(10.328427f, 14.828427f);
                instancePath.lineTo(11.176955f, 15.676955f);
                instancePath.cubicTo(12.11797f, 14.73594f, 12.7f, 13.435941f, 12.7f, 12.0f);
                instancePath.cubicTo(12.7f, 10.564059f, 12.11797f, 9.26406f, 11.176955f, 8.323045f);
                instancePath.lineTo(10.328427f, 9.171573f);
                instancePath.cubicTo(11.07451f, 9.917656f, 11.5f, 10.923627f, 11.5f, 12.0f);
                instancePath.cubicTo(11.5f, 13.076373f, 11.07451f, 14.082344f, 10.328427f, 14.828427f);
                instancePath.close();
                instancePath.moveTo(9.197056f, 13.697057f);
                instancePath.cubicTo(9.631371f, 13.262742f, 9.9f, 12.662742f, 9.9f, 12.0f);
                instancePath.cubicTo(9.9f, 11.337258f, 9.631371f, 10.737258f, 9.197056f, 10.302943f);
                instancePath.lineTo(7.5f, 12.0f);
                instancePath.lineTo(9.197056f, 13.697057f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
