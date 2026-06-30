package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_attach_file_icon_ppt_in_gird extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 80;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(26.302921f, 41.794167f);
                instancePath.lineTo(26.302921f, 19.211407f);
                instancePath.lineTo(42.211685f, 19.211407f);
                instancePath.cubicTo(45.428864f, 19.211407f, 48.29014f, 20.02573f, 49.282246f, 20.948542f);
                instancePath.cubicTo(51.91206f, 23.283072f, 54.585167f, 22.735918f, 54.585167f, 29.634218f);
                instancePath.cubicTo(54.585167f, 36.532516f, 51.91206f, 37.73257f, 49.282246f, 40.05703f);
                instancePath.cubicTo(48.29014f, 41.03853f, 45.428864f, 41.8407f, 42.211685f, 41.794167f);
                instancePath.lineTo(26.302921f, 41.794167f);
                instancePath.close();
                instancePath.moveTo(21.0f, 14.0f);
                instancePath.lineTo(21.0f, 66.11406f);
                instancePath.lineTo(26.302921f, 66.11406f);
                instancePath.lineTo(26.302921f, 47.005573f);
                instancePath.lineTo(43.979324f, 47.005573f);
                instancePath.cubicTo(49.142723f, 47.14359f, 53.855812f, 44.454838f, 56.352806f, 41.794167f);
                instancePath.cubicTo(58.849804f, 39.133495f, 59.88809f, 35.37987f, 59.88809f, 31.371353f);
                instancePath.cubicTo(59.88809f, 25.94755f, 58.53579f, 22.28079f, 56.352806f, 19.211407f);
                instancePath.cubicTo(53.8633f, 15.711034f, 49.142723f, 14.0f, 43.979324f, 14.0f);
                instancePath.lineTo(21.0f, 14.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
