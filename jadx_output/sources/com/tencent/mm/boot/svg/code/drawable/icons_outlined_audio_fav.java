package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_audio_fav extends l95.c {
    private final int width = 25;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 25;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.448f, 7.33594f);
        instancePath.cubicTo(16.0003f, 7.33594f, 16.448f, 6.88822f, 16.448f, 6.33594f);
        instancePath.cubicTo(16.448f, 5.78365f, 16.0003f, 5.33594f, 15.448f, 5.33594f);
        instancePath.cubicTo(14.8957f, 5.33594f, 14.448f, 5.78365f, 14.448f, 6.33594f);
        instancePath.cubicTo(14.448f, 6.88822f, 14.8957f, 7.33594f, 15.448f, 7.33594f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.35504f, 9.13903f);
        instancePath2.cubicTo(4.35504f, 8.80766f, 4.62367f, 8.53903f, 4.95504f, 8.53903f);
        instancePath2.cubicTo(5.28641f, 8.53903f, 5.55504f, 8.80766f, 5.55504f, 9.13903f);
        instancePath2.lineTo(5.55504f, 13.939f);
        instancePath2.cubicTo(5.55504f, 14.2704f, 5.28641f, 14.539f, 4.95504f, 14.539f);
        instancePath2.cubicTo(4.62367f, 14.539f, 4.35504f, 14.2704f, 4.35504f, 13.939f);
        instancePath2.lineTo(4.35504f, 9.13903f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(9.6131f, 10.4452f);
        instancePath3.cubicTo(9.6131f, 10.1139f, 9.88173f, 9.84525f, 10.2131f, 9.84525f);
        instancePath3.cubicTo(10.5445f, 9.84525f, 10.8131f, 10.1139f, 10.8131f, 10.4452f);
        instancePath3.lineTo(10.8131f, 20.3703f);
        instancePath3.cubicTo(10.8131f, 20.7017f, 10.5445f, 20.9703f, 10.2131f, 20.9703f);
        instancePath3.cubicTo(9.88173f, 20.9703f, 9.6131f, 20.7017f, 9.6131f, 20.3703f);
        instancePath3.lineTo(9.6131f, 10.4452f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(14.8712f, 9.13903f);
        instancePath4.cubicTo(14.8712f, 8.80766f, 15.1398f, 8.53903f, 15.4712f, 8.53903f);
        instancePath4.cubicTo(15.8025f, 8.53903f, 16.0712f, 8.80766f, 16.0712f, 9.13903f);
        instancePath4.lineTo(16.0712f, 16.5855f);
        instancePath4.cubicTo(16.0712f, 16.9169f, 15.8025f, 17.1855f, 15.4712f, 17.1855f);
        instancePath4.cubicTo(15.1398f, 17.1855f, 14.8712f, 16.9169f, 14.8712f, 16.5855f);
        instancePath4.lineTo(14.8712f, 9.13903f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(20.1292f, 10.4096f);
        instancePath5.cubicTo(20.1292f, 10.0782f, 20.3978f, 9.8096f, 20.7292f, 9.8096f);
        instancePath5.cubicTo(21.0606f, 9.8096f, 21.3292f, 10.0782f, 21.3292f, 10.4096f);
        instancePath5.lineTo(21.3292f, 13.939f);
        instancePath5.cubicTo(21.3292f, 14.2704f, 21.0606f, 14.539f, 20.7292f, 14.539f);
        instancePath5.cubicTo(20.3978f, 14.539f, 20.1292f, 14.2704f, 20.1292f, 13.939f);
        instancePath5.lineTo(20.1292f, 10.4096f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
