package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class device_profile_ui_add_followers_logo extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.saveLayerAlpha(null, 51, 31);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(29.73f, 4.822f);
                instancePath.cubicTo(15.804f, 4.822f, 4.514f, 16.111f, 4.514f, 30.038f);
                instancePath.cubicTo(4.514f, 43.965f, 15.804f, 55.253f, 29.73f, 55.253f);
                instancePath.cubicTo(43.656f, 55.253f, 54.946f, 43.963997f, 54.946f, 30.036999f);
                instancePath.cubicTo(54.946f, 16.11f, 43.656f, 4.822f, 29.73f, 4.822f);
                instancePath.close();
                instancePath.moveTo(29.73f, 53.27f);
                instancePath.cubicTo(16.898998f, 53.27f, 6.4969997f, 42.868f, 6.4969997f, 30.037f);
                instancePath.cubicTo(6.4969997f, 17.206001f, 16.899f, 6.805f, 29.73f, 6.805f);
                instancePath.cubicTo(42.561f, 6.805f, 52.962997f, 17.207f, 52.962997f, 30.038f);
                instancePath.cubicTo(52.962997f, 42.869f, 42.561f, 53.27f, 29.73f, 53.27f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(31.23f, 15.037f);
                instancePath2.lineTo(28.23f, 15.037f);
                instancePath2.lineTo(28.23f, 28.537f);
                instancePath2.lineTo(14.73f, 28.537f);
                instancePath2.lineTo(14.73f, 31.537f);
                instancePath2.lineTo(28.23f, 31.537f);
                instancePath2.lineTo(28.23f, 45.037f);
                instancePath2.lineTo(31.23f, 45.037f);
                instancePath2.lineTo(31.23f, 31.537f);
                instancePath2.lineTo(44.73f, 31.537f);
                instancePath2.lineTo(44.73f, 28.537f);
                instancePath2.lineTo(31.23f, 28.537f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
