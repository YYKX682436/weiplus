package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_screen_clear extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(17.0f, 12.0f);
                instancePath2.cubicTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f);
                instancePath2.cubicTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f);
                instancePath2.cubicTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f);
                instancePath2.cubicTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f);
                instancePath2.close();
                instancePath2.moveTo(18.5f, 2.5f);
                instancePath2.cubicTo(19.052284f, 2.5f, 19.5f, 2.9477153f, 19.5f, 3.5f);
                instancePath2.lineTo(19.501078f, 11.3251505f);
                instancePath2.cubicTo(19.119453f, 11.156712f, 18.717638f, 11.02564f, 18.300264f, 10.936569f);
                instancePath2.lineTo(18.3f, 3.7f);
                instancePath2.lineTo(5.7f, 3.7f);
                instancePath2.lineTo(5.7f, 20.3f);
                instancePath2.lineTo(11.75086f, 20.300999f);
                instancePath2.cubicTo(12.028432f, 20.741457f, 12.359909f, 21.144535f, 12.736031f, 21.50097f);
                instancePath2.lineTo(5.5f, 21.5f);
                instancePath2.cubicTo(4.9477153f, 21.5f, 4.5f, 21.052284f, 4.5f, 20.5f);
                instancePath2.lineTo(4.5f, 3.5f);
                instancePath2.cubicTo(4.5f, 2.9477153f, 4.9477153f, 2.5f, 5.5f, 2.5f);
                instancePath2.lineTo(18.5f, 2.5f);
                instancePath2.close();
                instancePath2.moveTo(13.9221945f, 14.770833f);
                instancePath2.cubicTo(13.467889f, 15.397004f, 13.2f, 16.167217f, 13.2f, 17.0f);
                instancePath2.cubicTo(13.2f, 19.098682f, 14.901318f, 20.8f, 17.0f, 20.8f);
                instancePath2.cubicTo(17.832783f, 20.8f, 18.602997f, 20.53211f, 19.229166f, 20.077806f);
                instancePath2.lineTo(13.9221945f, 14.770833f);
                instancePath2.close();
                instancePath2.moveTo(17.0f, 13.2f);
                instancePath2.cubicTo(16.167217f, 13.2f, 15.397004f, 13.467889f, 14.770833f, 13.9221945f);
                instancePath2.lineTo(20.077806f, 19.229166f);
                instancePath2.cubicTo(20.53211f, 18.602997f, 20.8f, 17.832783f, 20.8f, 17.0f);
                instancePath2.cubicTo(20.8f, 14.901318f, 19.098682f, 13.2f, 17.0f, 13.2f);
                instancePath2.close();
                instancePath2.moveTo(13.5f, 9.9f);
                instancePath2.lineTo(13.5f, 11.1f);
                instancePath2.lineTo(7.5f, 11.1f);
                instancePath2.lineTo(7.5f, 9.9f);
                instancePath2.lineTo(13.5f, 9.9f);
                instancePath2.close();
                instancePath2.moveTo(16.5f, 6.9f);
                instancePath2.lineTo(16.5f, 8.1f);
                instancePath2.lineTo(7.5f, 8.1f);
                instancePath2.lineTo(7.5f, 6.9f);
                instancePath2.lineTo(16.5f, 6.9f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
