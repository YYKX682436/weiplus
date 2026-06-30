package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_note_b extends l95.c {
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
                instancePath.moveTo(13.744681f, 20.0f);
                instancePath.cubicTo(15.297873f, 20.0f, 16.531916f, 19.663866f, 17.425531f, 19.036415f);
                instancePath.cubicTo(18.468084f, 18.27451f, 19.0f, 17.109243f, 19.0f, 15.540616f);
                instancePath.cubicTo(19.0f, 14.464986f, 18.702127f, 13.613445f, 18.148935f, 12.941176f);
                instancePath.cubicTo(17.595745f, 12.268908f, 16.829786f, 11.820728f, 15.829787f, 11.641457f);
                instancePath.cubicTo(16.595745f, 11.372549f, 17.212767f, 10.946778f, 17.680851f, 10.364145f);
                instancePath.cubicTo(18.127659f, 9.714286f, 18.361702f, 8.929972f, 18.361702f, 8.033613f);
                instancePath.cubicTo(18.361702f, 6.7787113f, 17.957447f, 5.792717f, 17.148935f, 5.07563f);
                instancePath.cubicTo(16.319149f, 4.3585434f, 15.191489f, 4.0f, 13.787234f, 4.0f);
                instancePath.lineTo(7.0f, 4.0f);
                instancePath.lineTo(7.0f, 20.0f);
                instancePath.lineTo(13.744681f, 20.0f);
                instancePath.close();
                instancePath.moveTo(13.361702f, 10.725f);
                instancePath.lineTo(8.74468f, 10.725f);
                instancePath.lineTo(8.74468f, 5.4545455f);
                instancePath.lineTo(13.382978f, 5.4545455f);
                instancePath.cubicTo(14.446809f, 5.4545455f, 15.255319f, 5.650909f, 15.808511f, 6.0872726f);
                instancePath.cubicTo(16.361702f, 6.5236363f, 16.638298f, 7.1781816f, 16.638298f, 8.050909f);
                instancePath.cubicTo(16.638298f, 8.945455f, 16.340425f, 9.621819f, 15.787234f, 10.08f);
                instancePath.cubicTo(15.234042f, 10.516363f, 14.425532f, 10.725f, 13.361702f, 10.725f);
                instancePath.close();
                instancePath.moveTo(13.595745f, 18.494545f);
                instancePath.lineTo(8.74468f, 18.494545f);
                instancePath.lineTo(8.74468f, 12.725f);
                instancePath.lineTo(13.595745f, 12.725f);
                instancePath.cubicTo(14.765958f, 12.725f, 15.6595745f, 12.930909f, 16.276596f, 13.410909f);
                instancePath.cubicTo(16.914894f, 13.890909f, 17.25532f, 14.632728f, 17.25532f, 15.636364f);
                instancePath.cubicTo(17.25532f, 16.64f, 16.872341f, 17.403637f, 16.127659f, 17.883636f);
                instancePath.cubicTo(15.489362f, 18.276363f, 14.6595745f, 18.494545f, 13.595745f, 18.494545f);
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
