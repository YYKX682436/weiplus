package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class avatar_del_btn_normal extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(12.0f, 15.0f);
            instancePath.lineTo(45.0f, 15.0f);
            instancePath.lineTo(45.0f, 48.0f);
            instancePath.lineTo(12.0f, 48.0f);
            instancePath.lineTo(12.0f, 15.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-764844);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(30.0f, 28.37868f);
            instancePath2.lineTo(20.454058f, 18.832739f);
            instancePath2.lineTo(18.332739f, 20.954058f);
            instancePath2.lineTo(27.87868f, 30.5f);
            instancePath2.lineTo(18.332739f, 40.04594f);
            instancePath2.lineTo(20.454058f, 42.167263f);
            instancePath2.lineTo(30.0f, 32.62132f);
            instancePath2.lineTo(39.54594f, 42.167263f);
            instancePath2.lineTo(41.667263f, 40.04594f);
            instancePath2.lineTo(32.12132f, 30.5f);
            instancePath2.lineTo(41.667263f, 20.954058f);
            instancePath2.lineTo(39.54594f, 18.832739f);
            instancePath2.lineTo(30.0f, 28.37868f);
            instancePath2.close();
            instancePath2.moveTo(30.0f, 60.0f);
            instancePath2.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
            instancePath2.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            instancePath2.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
            instancePath2.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
