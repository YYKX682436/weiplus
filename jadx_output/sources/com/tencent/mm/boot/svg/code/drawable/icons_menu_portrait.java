package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_portrait extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 30;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint3.setColor(-855638017);
                instancePaint3.setStrokeWidth(1.5f);
                instancePaint3.setStrokeJoin(android.graphics.Paint.Join.MITER);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.25f, 3.75f);
                instancePath.lineTo(7.5f, 3.75f);
                instancePath.lineTo(3.75f, 3.75f);
                instancePath.lineTo(3.75f, 11.25f);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint4.setColor(-855638017);
                instancePaint4.setStrokeWidth(1.5f);
                instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(20.0f, 3.75f);
                instancePath2.lineTo(23.125f, 3.75f);
                instancePath2.lineTo(26.25f, 3.75f);
                instancePath2.lineTo(26.25f, 11.25f);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint5.setColor(-855638017);
                instancePaint5.setStrokeWidth(1.5f);
                instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(20.0f, 26.25f);
                instancePath3.lineTo(23.125f, 26.25f);
                instancePath3.lineTo(26.25f, 26.25f);
                instancePath3.lineTo(26.25f, 18.75f);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint6.setColor(-855638017);
                instancePaint6.setStrokeWidth(1.5f);
                instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
                android.graphics.Path instancePath4 = l95.c.instancePath(looper);
                instancePath4.moveTo(11.25f, 26.25f);
                instancePath4.lineTo(7.5f, 26.25f);
                instancePath4.lineTo(3.75f, 26.25f);
                instancePath4.lineTo(3.75f, 18.75f);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
                instancePaint7.setColor(-855638017);
                android.graphics.Path instancePath5 = l95.c.instancePath(looper);
                instancePath5.moveTo(7.61764f, 22.9412f);
                instancePath5.cubicTo(7.06536f, 22.9412f, 6.61765f, 22.4935f, 6.61765f, 21.9412f);
                instancePath5.lineTo(6.61765f, 21.4548f);
                instancePath5.cubicTo(6.61765f, 20.8503f, 7.05719f, 20.1458f, 7.60067f, 19.8806f);
                instancePath5.lineTo(12.5951f, 17.4434f);
                instancePath5.cubicTo(13.3194f, 17.0899f, 13.4879f, 16.307f, 12.9648f, 15.687f);
                instancePath5.lineTo(12.6458f, 15.309f);
                instancePath5.cubicTo(11.9967f, 14.5397f, 11.4706f, 13.1025f, 11.4706f, 12.0964f);
                instancePath5.lineTo(11.4706f, 10.5879f);
                instancePath5.cubicTo(11.4706f, 8.63884f, 13.0547f, 7.05884f, 15.0f, 7.05884f);
                instancePath5.cubicTo(16.9492f, 7.05884f, 18.5294f, 8.64088f, 18.5294f, 10.5884f);
                instancePath5.lineTo(18.5294f, 12.0972f);
                instancePath5.cubicTo(18.5294f, 13.1023f, 18.0008f, 14.5437f, 17.3542f, 15.3102f);
                instancePath5.lineTo(17.0352f, 15.6884f);
                instancePath5.cubicTo(16.515f, 16.305f, 16.6775f, 17.0898f, 17.4049f, 17.4446f);
                instancePath5.lineTo(22.3993f, 19.8808f);
                instancePath5.cubicTo(22.9422f, 20.1456f, 23.3823f, 20.8458f, 23.3823f, 21.4548f);
                instancePath5.lineTo(23.3823f, 21.9412f);
                instancePath5.cubicTo(23.3823f, 22.4935f, 22.9346f, 22.9412f, 22.3823f, 22.9412f);
                instancePath5.lineTo(7.61764f, 22.9412f);
                instancePath5.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
                canvas.drawPath(instancePath5, instancePaint7);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
