package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_new_year_pag_video_add_emoji extends l95.c {
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
                instancePath.moveTo(20.6f, 16.0f);
                instancePath.lineTo(20.6f, 19.4f);
                instancePath.lineTo(24.0f, 19.4f);
                instancePath.lineTo(24.0f, 20.6f);
                instancePath.lineTo(20.6f, 20.6f);
                instancePath.lineTo(20.6f, 24.0f);
                instancePath.lineTo(19.4f, 24.0f);
                instancePath.lineTo(19.4f, 20.6f);
                instancePath.lineTo(16.0f, 20.6f);
                instancePath.lineTo(16.0f, 19.4f);
                instancePath.lineTo(19.4f, 19.4f);
                instancePath.lineTo(19.4f, 16.0f);
                instancePath.lineTo(20.6f, 16.0f);
                instancePath.close();
                instancePath.moveTo(11.0f, 2.0f);
                instancePath.cubicTo(16.522848f, 2.0f, 21.0f, 6.4771523f, 21.0f, 12.0f);
                instancePath.cubicTo(21.0f, 12.685278f, 20.93107f, 13.354457f, 20.799765f, 14.00098f);
                instancePath.lineTo(19.57154f, 14.000824f);
                instancePath.cubicTo(19.72099f, 13.358054f, 19.8f, 12.688254f, 19.8f, 12.0f);
                instancePath.cubicTo(19.8f, 7.139894f, 15.8601055f, 3.2f, 11.0f, 3.2f);
                instancePath.cubicTo(6.139894f, 3.2f, 2.2f, 7.139894f, 2.2f, 12.0f);
                instancePath.cubicTo(2.2f, 16.860106f, 6.139894f, 20.8f, 11.0f, 20.8f);
                instancePath.cubicTo(12.053849f, 20.8f, 13.064432f, 20.614754f, 14.000962f, 20.275047f);
                instancePath.lineTo(14.000882f, 21.54192f);
                instancePath.cubicTo(13.053585f, 21.839546f, 12.04553f, 22.0f, 11.0f, 22.0f);
                instancePath.cubicTo(5.4771523f, 22.0f, 1.0f, 17.522848f, 1.0f, 12.0f);
                instancePath.cubicTo(1.0f, 6.4771523f, 5.4771523f, 2.0f, 11.0f, 2.0f);
                instancePath.close();
                instancePath.moveTo(17.0f, 12.5f);
                instancePath.cubicTo(17.0f, 15.813708f, 14.313708f, 18.5f, 11.0f, 18.5f);
                instancePath.cubicTo(7.6862917f, 18.5f, 5.0f, 15.813708f, 5.0f, 12.5f);
                instancePath.lineTo(17.0f, 12.5f);
                instancePath.close();
                instancePath.moveTo(15.648779f, 13.7f);
                instancePath.lineTo(6.351221f, 13.7f);
                instancePath.cubicTo(6.8840723f, 15.770272f, 8.763392f, 17.3f, 11.0f, 17.3f);
                instancePath.cubicTo(13.236608f, 17.3f, 15.115928f, 15.770272f, 15.648779f, 13.7f);
                instancePath.close();
                instancePath.moveTo(7.5f, 7.5f);
                instancePath.cubicTo(8.328427f, 7.5f, 9.0f, 8.171573f, 9.0f, 9.0f);
                instancePath.cubicTo(9.0f, 9.828427f, 8.328427f, 10.5f, 7.5f, 10.5f);
                instancePath.cubicTo(6.6715727f, 10.5f, 6.0f, 9.828427f, 6.0f, 9.0f);
                instancePath.cubicTo(6.0f, 8.171573f, 6.6715727f, 7.5f, 7.5f, 7.5f);
                instancePath.close();
                instancePath.moveTo(14.5f, 7.5f);
                instancePath.cubicTo(15.328427f, 7.5f, 16.0f, 8.171573f, 16.0f, 9.0f);
                instancePath.cubicTo(16.0f, 9.828427f, 15.328427f, 10.5f, 14.5f, 10.5f);
                instancePath.cubicTo(13.671573f, 10.5f, 13.0f, 9.828427f, 13.0f, 9.0f);
                instancePath.cubicTo(13.0f, 8.171573f, 13.671573f, 7.5f, 14.5f, 7.5f);
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
