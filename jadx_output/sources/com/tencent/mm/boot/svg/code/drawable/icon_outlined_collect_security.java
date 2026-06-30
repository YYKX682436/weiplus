package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_outlined_collect_security extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(7.9993334f, 10.666333f);
        instancePath.lineTo(1.3333334f, 10.666667f);
        instancePath.lineTo(1.3333334f, 10.666667f);
        instancePath.lineTo(1.3333334f, 9.333333f);
        instancePath.cubicTo(1.3333334f, 5.819692f, 4.0515366f, 2.940921f, 7.499815f, 2.685148f);
        instancePath.lineTo(7.5f, 1.8333334f);
        instancePath.lineTo(7.5080557f, 1.7434577f);
        instancePath.cubicTo(7.5503917f, 1.5102085f, 7.75454f, 1.3333334f, 8.0f, 1.3333334f);
        instancePath.cubicTo(8.276142f, 1.3333334f, 8.5f, 1.557191f, 8.5f, 1.8333334f);
        instancePath.lineTo(8.500185f, 2.685148f);
        instancePath.cubicTo(11.948463f, 2.940921f, 14.666667f, 5.819692f, 14.666667f, 9.333333f);
        instancePath.lineTo(14.666667f, 9.333333f);
        instancePath.lineTo(14.666667f, 10.666667f);
        instancePath.lineTo(8.999333f, 10.666333f);
        instancePath.lineTo(9.0f, 12.666667f);
        instancePath.cubicTo(9.0f, 13.771236f, 8.104569f, 14.666667f, 7.0f, 14.666667f);
        instancePath.cubicTo(5.8954306f, 14.666667f, 5.0f, 13.771236f, 5.0f, 12.666667f);
        instancePath.lineTo(6.0f, 12.666667f);
        instancePath.cubicTo(6.0f, 13.218951f, 6.4477153f, 13.666667f, 7.0f, 13.666667f);
        instancePath.cubicTo(7.5522847f, 13.666667f, 8.0f, 13.218951f, 8.0f, 12.666667f);
        instancePath.lineTo(7.9993334f, 10.666333f);
        instancePath.close();
        instancePath.moveTo(8.0f, 3.6666667f);
        instancePath.cubicTo(4.8703866f, 3.6666667f, 2.3333333f, 6.2037196f, 2.3333333f, 9.333333f);
        instancePath.lineTo(2.3333333f, 9.333333f);
        instancePath.lineTo(2.3333333f, 9.666667f);
        instancePath.lineTo(13.666667f, 9.666667f);
        instancePath.lineTo(13.666667f, 9.333333f);
        instancePath.cubicTo(13.666667f, 6.2037196f, 11.129614f, 3.6666667f, 8.0f, 3.6666667f);
        instancePath.close();
        instancePath.moveTo(9.646446f, 4.9797797f);
        instancePath.lineTo(10.353554f, 5.686887f);
        instancePath.lineTo(7.686887f, 8.353554f);
        instancePath.cubicTo(7.4916244f, 8.548816f, 7.175042f, 8.548816f, 6.9797797f, 8.353554f);
        instancePath.lineTo(6.9797797f, 8.353554f);
        instancePath.lineTo(5.6464467f, 7.0202203f);
        instancePath.lineTo(6.3535533f, 6.313113f);
        instancePath.lineTo(7.3333335f, 7.2928934f);
        instancePath.lineTo(9.646446f, 4.9797797f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
