package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_promote_cloum_page_icon extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(19.002f, 1.99951f);
                instancePath.cubicTo(19.5542f, 1.99951f, 20.002f, 2.44723f, 20.002f, 2.99951f);
                instancePath.lineTo(20.002f, 20.9995f);
                instancePath.cubicTo(20.002f, 21.5518f, 19.5542f, 21.9995f, 19.002f, 21.9995f);
                instancePath.lineTo(5.00195f, 21.9995f);
                instancePath.cubicTo(4.44967f, 21.9995f, 4.00195f, 21.5518f, 4.00195f, 20.9995f);
                instancePath.lineTo(4.00195f, 2.99951f);
                instancePath.cubicTo(4.00195f, 2.44723f, 4.44967f, 1.99951f, 5.00195f, 1.99951f);
                instancePath.lineTo(19.002f, 1.99951f);
                instancePath.close();
                instancePath.moveTo(12.124f, 17.2493f);
                instancePath.lineTo(12.124f, 18.4493f);
                instancePath.lineTo(8.12402f, 18.4493f);
                instancePath.lineTo(8.12402f, 17.2493f);
                instancePath.lineTo(12.124f, 17.2493f);
                instancePath.close();
                instancePath.moveTo(15.8715f, 14.7495f);
                instancePath.lineTo(15.8715f, 15.9495f);
                instancePath.lineTo(8.12402f, 15.9495f);
                instancePath.lineTo(8.12402f, 14.7495f);
                instancePath.lineTo(15.8715f, 14.7495f);
                instancePath.close();
                instancePath.moveTo(8.2832f, 12.9375f);
                instancePath.cubicTo(8.04158f, 12.9375f, 7.8457f, 12.7416f, 7.8457f, 12.5f);
                instancePath.lineTo(7.8457f, 12.2005f);
                instancePath.cubicTo(7.8457f, 11.9008f, 8.06364f, 11.5515f, 8.33312f, 11.42f);
                instancePath.lineTo(10.8095f, 10.2115f);
                instancePath.cubicTo(11.1687f, 10.0362f, 11.2522f, 9.64805f, 10.9928f, 9.34066f);
                instancePath.lineTo(10.8347f, 9.15319f);
                instancePath.cubicTo(10.5128f, 8.77175f, 10.252f, 8.05916f, 10.252f, 7.56031f);
                instancePath.lineTo(10.252f, 6.81232f);
                instancePath.cubicTo(10.252f, 5.84592f, 11.0374f, 5.0625f, 12.002f, 5.0625f);
                instancePath.cubicTo(12.9685f, 5.0625f, 13.752f, 5.84693f, 13.752f, 6.81259f);
                instancePath.lineTo(13.752f, 7.56071f);
                instancePath.cubicTo(13.752f, 8.05907f, 13.4899f, 8.77375f, 13.1692f, 9.15381f);
                instancePath.lineTo(13.0111f, 9.34131f);
                instancePath.cubicTo(12.7532f, 9.64704f, 12.8337f, 10.0362f, 13.1944f, 10.2121f);
                instancePath.lineTo(15.6708f, 11.4201f);
                instancePath.cubicTo(15.94f, 11.5514f, 16.1582f, 11.8985f, 16.1582f, 12.2005f);
                instancePath.lineTo(16.1582f, 12.5f);
                instancePath.cubicTo(16.1582f, 12.7416f, 15.9623f, 12.9375f, 15.7207f, 12.9375f);
                instancePath.lineTo(8.2832f, 12.9375f);
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
