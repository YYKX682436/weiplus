package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_mini_program_regular extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.8499f, 8.47164f);
                instancePath.cubicTo(20.8499f, 6.08393f, 18.7042f, 4.15039f, 16.0494f, 4.15039f);
                instancePath.cubicTo(13.3946f, 4.15039f, 11.2489f, 6.08393f, 11.2489f, 8.47164f);
                instancePath.lineTo(11.2489f, 15.6601f);
                instancePath.cubicTo(11.2489f, 17.2498f, 9.7522f, 18.5274f, 7.90246f, 18.5274f);
                instancePath.cubicTo(6.05272f, 18.5274f, 4.55597f, 17.2498f, 4.55597f, 15.6601f);
                instancePath.cubicTo(4.55597f, 14.3883f, 5.53924f, 13.276f, 6.94472f, 12.9367f);
                instancePath.cubicTo(7.40766f, 12.821f, 7.91194f, 12.4288f, 7.91061f, 11.97f);
                instancePath.cubicTo(7.91061f, 11.5045f, 7.48679f, 11.3688f, 7.06229f, 11.433f);
                instancePath.cubicTo(4.80828f, 11.7743f, 3.1499f, 13.5677f, 3.1499f, 15.6601f);
                instancePath.cubicTo(3.1499f, 18.0478f, 5.29557f, 19.9814f, 7.95038f, 19.9814f);
                instancePath.cubicTo(10.6052f, 19.9814f, 12.7509f, 18.0478f, 12.7509f, 15.6601f);
                instancePath.lineTo(12.7509f, 8.47164f);
                instancePath.cubicTo(12.7509f, 6.88193f, 14.2476f, 5.60438f, 16.0973f, 5.60438f);
                instancePath.cubicTo(17.9471f, 5.60438f, 19.4438f, 6.88193f, 19.4438f, 8.47164f);
                instancePath.cubicTo(19.4438f, 9.78192f, 18.4707f, 10.9013f, 17.0512f, 11.2439f);
                instancePath.cubicTo(16.6371f, 11.3359f, 16.289f, 11.6139f, 16.137f, 11.9687f);
                instancePath.cubicTo(15.8661f, 12.5781f, 16.4622f, 12.8328f, 16.9732f, 12.7428f);
                instancePath.cubicTo(19.2359f, 12.3441f, 20.8499f, 10.5737f, 20.8499f, 8.47164f);
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
