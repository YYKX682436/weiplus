package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class new_voice2txt_trans_ch extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.43397f, 6.03613f);
                instancePath.lineTo(3.42343f, 8.03946f);
                instancePath.lineTo(6.42482f, 8.03946f);
                instancePath.cubicTo(7.23945f, 10.8326f, 8.70752f, 13.2789f, 10.8289f, 15.3978f);
                instancePath.cubicTo(8.76643f, 17.093f, 6.15346f, 18.3258f, 3.00969f, 19.1155f);
                instancePath.lineTo(4.10614f, 20.8877f);
                instancePath.cubicTo(7.3294f, 20.0016f, 10.0618f, 18.5954f, 12.2833f, 16.6884f);
                instancePath.cubicTo(14.3675f, 18.3836f, 16.9862f, 19.809f, 20.1395f, 20.9648f);
                instancePath.lineTo(21.2938f, 19.2504f);
                instancePath.cubicTo(18.2981f, 18.1717f, 15.7775f, 16.8618f, 13.752f, 15.2823f);
                instancePath.cubicTo(15.5788f, 13.3367f, 16.9737f, 10.9289f, 17.9367f, 8.03946f);
                instancePath.lineTo(20.9184f, 8.03946f);
                instancePath.lineTo(20.9289f, 6.03613f);
                instancePath.lineTo(13.4649f, 6.03613f);
                instancePath.cubicTo(12.8792f, 4.78405f, 12.2332f, 3.70534f, 11.5271f, 2.79999f);
                instancePath.lineTo(9.44994f, 3.53197f);
                instancePath.cubicTo(10.1566f, 4.32175f, 10.7644f, 5.15004f, 11.2534f, 6.03613f);
                instancePath.lineTo(3.43397f, 6.03613f);
                instancePath.close();
                instancePath.moveTo(8.39942f, 8.03946f);
                instancePath.lineTo(15.8042f, 8.03946f);
                instancePath.cubicTo(15.0218f, 10.3703f, 13.8463f, 12.3736f, 12.2973f, 14.0302f);
                instancePath.cubicTo(10.4898f, 12.2965f, 9.19704f, 10.3125f, 8.39942f, 8.03946f);
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
