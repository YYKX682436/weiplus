package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_list_tag extends l95.c {
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
                instancePath.moveTo(4.25911f, 13.9146f);
                instancePath.cubicTo(3.91363f, 13.5691f, 3.91363f, 13.009f, 4.25911f, 12.6635f);
                instancePath.lineTo(12.6635f, 4.25911f);
                instancePath.cubicTo(12.8294f, 4.09321f, 13.0544f, 4.0f, 13.2891f, 4.0f);
                instancePath.lineTo(19.1153f, 4.0f);
                instancePath.cubicTo(19.6039f, 4.0f, 20.0f, 4.39608f, 20.0f, 4.88467f);
                instancePath.lineTo(20.0f, 10.7109f);
                instancePath.cubicTo(20.0f, 10.9456f, 19.9068f, 11.1706f, 19.7409f, 11.3365f);
                instancePath.lineTo(11.3365f, 19.7409f);
                instancePath.cubicTo(10.991f, 20.0864f, 10.4309f, 20.0864f, 10.0854f, 19.7409f);
                instancePath.lineTo(4.25911f, 13.9146f);
                instancePath.close();
                instancePath.moveTo(18.8002f, 10.6938f);
                instancePath.lineTo(18.8002f, 5.2f);
                instancePath.lineTo(13.3064f, 5.2f);
                instancePath.lineTo(5.2002f, 13.3062f);
                instancePath.lineTo(10.694f, 18.8f);
                instancePath.lineTo(18.8002f, 10.6938f);
                instancePath.close();
                instancePath.moveTo(15.75f, 9.5f);
                instancePath.cubicTo(16.4404f, 9.5f, 17.0f, 8.94036f, 17.0f, 8.25f);
                instancePath.cubicTo(17.0f, 7.55964f, 16.4404f, 7.0f, 15.75f, 7.0f);
                instancePath.cubicTo(15.0596f, 7.0f, 14.5f, 7.55964f, 14.5f, 8.25f);
                instancePath.cubicTo(14.5f, 8.94036f, 15.0596f, 9.5f, 15.75f, 9.5f);
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
