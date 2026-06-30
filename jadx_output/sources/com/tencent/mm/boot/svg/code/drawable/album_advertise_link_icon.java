package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_advertise_link_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.8281f, 7.05714f);
        instancePath.lineTo(11.7709f, 7.99995f);
        instancePath.lineTo(13.1852f, 6.58573f);
        instancePath.cubicTo(14.2266f, 5.54433f, 14.2266f, 3.85589f, 13.1852f, 2.8145f);
        instancePath.cubicTo(12.1438f, 1.7731f, 10.4553f, 1.7731f, 9.41392f, 2.8145f);
        instancePath.lineTo(6.58549f, 5.64292f);
        instancePath.cubicTo(5.54409f, 6.68432f, 5.54409f, 8.37276f, 6.58549f, 9.41416f);
        instancePath.lineTo(7.5283f, 8.47135f);
        instancePath.cubicTo(7.0076f, 7.95065f, 7.0076f, 7.10643f, 7.5283f, 6.58573f);
        instancePath.lineTo(10.3567f, 3.7573f);
        instancePath.cubicTo(10.8774f, 3.23661f, 11.7216f, 3.23661f, 12.2423f, 3.7573f);
        instancePath.cubicTo(12.763f, 4.278f, 12.763f, 5.12222f, 12.2423f, 5.64292f);
        instancePath.lineTo(10.8281f, 7.05714f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.17127f, 8.94275f);
        instancePath2.lineTo(4.22847f, 7.99995f);
        instancePath2.lineTo(2.81425f, 9.41416f);
        instancePath2.cubicTo(1.77285f, 10.4556f, 1.77285f, 12.144f, 2.81425f, 13.1854f);
        instancePath2.cubicTo(3.85565f, 14.2268f, 5.54409f, 14.2268f, 6.58549f, 13.1854f);
        instancePath2.lineTo(9.41392f, 10.357f);
        instancePath2.cubicTo(10.4553f, 9.31557f, 10.4553f, 7.62713f, 9.41392f, 6.58573f);
        instancePath2.lineTo(8.47111f, 7.52854f);
        instancePath2.cubicTo(8.99181f, 8.04924f, 8.99181f, 8.89346f, 8.47111f, 9.41416f);
        instancePath2.lineTo(5.64268f, 12.2426f);
        instancePath2.cubicTo(5.12198f, 12.7633f, 4.27776f, 12.7633f, 3.75706f, 12.2426f);
        instancePath2.cubicTo(3.23636f, 11.7219f, 3.23636f, 10.8777f, 3.75706f, 10.357f);
        instancePath2.lineTo(5.17127f, 8.94275f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
