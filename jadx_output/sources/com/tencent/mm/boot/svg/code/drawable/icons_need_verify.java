package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_need_verify extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                instancePaint3.setColor(-15616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.0f, 5.3333335f);
                instancePath.cubicTo(46.727592f, 5.3333335f, 58.666668f, 17.272408f, 58.666668f, 32.0f);
                instancePath.cubicTo(58.666668f, 46.727592f, 46.727592f, 58.666668f, 32.0f, 58.666668f);
                instancePath.cubicTo(17.272408f, 58.666668f, 5.3333335f, 46.727592f, 5.3333335f, 32.0f);
                instancePath.cubicTo(5.3333335f, 17.272408f, 17.272408f, 5.3333335f, 32.0f, 5.3333335f);
                instancePath.close();
                instancePath.moveTo(31.988022f, 40.903645f);
                instancePath.cubicTo(30.657293f, 40.903645f, 29.6f, 41.92448f, 29.6f, 43.255207f);
                instancePath.cubicTo(29.6f, 44.585938f, 30.657293f, 45.60677f, 31.988022f, 45.60677f);
                instancePath.cubicTo(33.35521f, 45.60677f, 34.39427f, 44.585938f, 34.39427f, 43.255207f);
                instancePath.cubicTo(34.39427f, 41.92448f, 33.35521f, 40.903645f, 31.988022f, 40.903645f);
                instancePath.close();
                instancePath.moveTo(34.02969f, 16.361979f);
                instancePath.lineTo(29.964584f, 16.361979f);
                instancePath.lineTo(30.25625f, 36.619793f);
                instancePath.lineTo(33.73802f, 36.619793f);
                instancePath.lineTo(34.02969f, 16.361979f);
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
