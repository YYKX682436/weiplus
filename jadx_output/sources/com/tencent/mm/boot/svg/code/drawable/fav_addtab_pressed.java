package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fav_addtab_pressed extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.2071068f, 14.207107f);
                instancePath.cubicTo(2.8165824f, 13.816583f, 2.8165824f, 13.183417f, 3.2071068f, 12.792893f);
                instancePath.lineTo(12.707107f, 3.2928932f);
                instancePath.cubicTo(12.894643f, 3.105357f, 13.148997f, 3.0f, 13.414213f, 3.0f);
                instancePath.lineTo(20.0f, 3.0f);
                instancePath.cubicTo(20.552284f, 3.0f, 21.0f, 3.4477153f, 21.0f, 4.0f);
                instancePath.lineTo(21.0f, 10.585787f);
                instancePath.cubicTo(21.0f, 10.851003f, 20.894644f, 11.105357f, 20.707108f, 11.292893f);
                instancePath.lineTo(11.207107f, 20.792892f);
                instancePath.cubicTo(10.816583f, 21.183418f, 10.183417f, 21.183418f, 9.792893f, 20.792892f);
                instancePath.lineTo(3.2071068f, 14.207107f);
                instancePath.close();
                instancePath.moveTo(16.0f, 10.0f);
                instancePath.cubicTo(17.10457f, 10.0f, 18.0f, 9.104569f, 18.0f, 8.0f);
                instancePath.cubicTo(18.0f, 6.8954306f, 17.10457f, 6.0f, 16.0f, 6.0f);
                instancePath.cubicTo(14.895431f, 6.0f, 14.0f, 6.8954306f, 14.0f, 8.0f);
                instancePath.cubicTo(14.0f, 9.104569f, 14.895431f, 10.0f, 16.0f, 10.0f);
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
