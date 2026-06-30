package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_grey_dark_small extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                instancePaint3.setColor(-16631268);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(60.0f, 30.37037f);
                instancePath.cubicTo(60.0f, 13.431111f, 46.56889f, 0.0f, 29.62963f, 0.0f);
                instancePath.cubicTo(13.431111f, 0.0f, 0.0f, 13.431111f, 0.0f, 30.37037f);
                instancePath.cubicTo(0.0f, 46.56889f, 13.431111f, 60.0f, 29.62963f, 60.0f);
                instancePath.cubicTo(46.56889f, 60.0f, 60.0f, 46.56889f, 60.0f, 30.37037f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(25.909903f, 38.28427f);
                instancePath2.lineTo(17.65165f, 30.02602f);
                instancePath2.lineTo(15.0f, 32.67767f);
                instancePath2.lineTo(24.142136f, 41.819805f);
                instancePath2.cubicTo(25.118446f, 42.796116f, 26.701359f, 42.796116f, 27.67767f, 41.819805f);
                instancePath2.lineTo(46.845825f, 22.65165f);
                instancePath2.lineTo(46.845825f, 22.65165f);
                instancePath2.lineTo(44.19417f, 20.0f);
                instancePath2.lineTo(25.909903f, 38.28427f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
