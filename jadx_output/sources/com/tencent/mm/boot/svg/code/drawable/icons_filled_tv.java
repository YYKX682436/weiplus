package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_tv extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(33.653908f, 23.862305f);
            instancePath.lineTo(18.900002f, 23.862305f);
            instancePath.lineTo(18.900002f, 27.509766f);
            instancePath.lineTo(25.008398f, 27.509766f);
            instancePath.lineTo(25.008398f, 45.0f);
            instancePath.lineTo(29.432226f, 45.0f);
            instancePath.lineTo(29.432226f, 27.509766f);
            instancePath.lineTo(34.879837f, 27.509766f);
            instancePath.lineTo(40.7584f, 45.0f);
            instancePath.lineTo(46.09043f, 45.0f);
            instancePath.lineTo(53.194923f, 23.862305f);
            instancePath.lineTo(48.375587f, 23.862305f);
            instancePath.lineTo(43.541603f, 40.444336f);
            instancePath.lineTo(43.439064f, 40.444336f);
            instancePath.lineTo(38.60508f, 23.862305f);
            instancePath.lineTo(33.653908f, 23.862305f);
            instancePath.close();
            instancePath.moveTo(6.0f, 15.0f);
            instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
            instancePath.lineTo(63.0f, 12.0f);
            instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
            instancePath.lineTo(66.0f, 54.0f);
            instancePath.cubicTo(66.0f, 55.656853f, 64.65685f, 57.0f, 63.0f, 57.0f);
            instancePath.lineTo(9.0f, 57.0f);
            instancePath.cubicTo(7.343146f, 57.0f, 6.0f, 55.656853f, 6.0f, 54.0f);
            instancePath.lineTo(6.0f, 15.0f);
            instancePath.close();
            instancePath.moveTo(24.0f, 63.149998f);
            instancePath.cubicTo(24.0f, 61.907356f, 25.000694f, 60.899998f, 26.257862f, 60.899998f);
            instancePath.lineTo(45.742138f, 60.899998f);
            instancePath.cubicTo(46.98912f, 60.899998f, 48.0f, 61.898693f, 48.0f, 63.149998f);
            instancePath.lineTo(48.0f, 65.399994f);
            instancePath.lineTo(24.0f, 65.399994f);
            instancePath.lineTo(24.0f, 63.149998f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
