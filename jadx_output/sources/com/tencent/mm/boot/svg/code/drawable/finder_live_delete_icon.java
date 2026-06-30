package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_delete_icon extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 6.0f);
            instancePath.cubicTo(52.570312f, 6.0f, 66.0f, 19.429688f, 66.0f, 36.0f);
            instancePath.cubicTo(66.0f, 52.570312f, 52.570312f, 66.0f, 36.0f, 66.0f);
            instancePath.cubicTo(19.429688f, 66.0f, 6.0f, 52.570312f, 6.0f, 36.0f);
            instancePath.cubicTo(6.0f, 19.429688f, 19.429688f, 6.0f, 36.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 9.601562f);
            instancePath.cubicTo(21.417969f, 9.601562f, 9.601562f, 21.417969f, 9.601562f, 36.0f);
            instancePath.cubicTo(9.601562f, 50.58203f, 21.417969f, 62.398438f, 36.0f, 62.398438f);
            instancePath.cubicTo(50.58203f, 62.398438f, 62.398438f, 50.58203f, 62.398438f, 36.0f);
            instancePath.cubicTo(62.398438f, 21.417969f, 50.58203f, 9.601562f, 36.0f, 9.601562f);
            instancePath.close();
            instancePath.moveTo(51.0f, 34.19922f);
            instancePath.lineTo(51.0f, 37.80078f);
            instancePath.lineTo(21.0f, 37.80078f);
            instancePath.lineTo(21.0f, 34.19922f);
            instancePath.close();
            instancePath.moveTo(51.0f, 34.19922f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
