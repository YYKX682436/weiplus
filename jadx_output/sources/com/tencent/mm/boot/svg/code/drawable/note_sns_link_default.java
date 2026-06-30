package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_sns_link_default extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 90;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(86.0f, 0.0f);
        instancePath.cubicTo(88.20914f, 0.0f, 90.0f, 1.7908609f, 90.0f, 4.0f);
        instancePath.lineTo(90.0f, 86.0f);
        instancePath.cubicTo(90.0f, 88.20914f, 88.20914f, 90.0f, 86.0f, 90.0f);
        instancePath.lineTo(4.0f, 90.0f);
        instancePath.cubicTo(1.7908609f, 90.0f, 0.0f, 88.20914f, 0.0f, 86.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 25.0f, 0.0f, 1.0f, 23.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16731650);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(1.330489f, 10.218908f);
        instancePath2.lineTo(18.69964f, 20.085167f);
        instancePath2.cubicTo(19.419216f, 20.49391f, 20.589544f, 20.491829f, 21.305456f, 20.085167f);
        instancePath2.lineTo(38.674606f, 10.218908f);
        instancePath2.cubicTo(39.394184f, 9.810165f, 39.379704f, 9.183529f, 38.635887f, 8.816125f);
        instancePath2.lineTo(21.34418f, 0.27502382f);
        instancePath2.cubicTo(20.603216f, -0.09096857f, 19.404737f, -0.09237996f, 18.660917f, 0.27502382f);
        instancePath2.lineTo(1.3692116f, 8.816125f);
        instancePath2.cubicTo(0.6282494f, 9.182117f, 0.6145759f, 9.812246f, 1.330489f, 10.218908f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-371630);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(22.305946f, 22.062408f);
        instancePath3.cubicTo(21.584692f, 22.468164f, 21.0f, 23.469671f, 21.0f, 24.294716f);
        instancePath3.lineTo(21.0f, 42.597317f);
        instancePath3.cubicTo(21.0f, 43.42443f, 21.579006f, 43.74706f, 22.28357f, 43.32374f);
        instancePath3.lineTo(38.71643f, 33.450405f);
        instancePath3.cubicTo(39.425327f, 33.024483f, 40.0f, 32.006466f, 40.0f, 31.183224f);
        instancePath3.lineTo(40.0f, 13.604286f);
        instancePath3.cubicTo(40.0f, 12.77808f, 39.410534f, 12.439923f, 38.694054f, 12.842992f);
        instancePath3.lineTo(22.305946f, 22.062408f);
        instancePath3.lineTo(22.305946f, 22.062408f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-14313);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(17.694054f, 22.062408f);
        instancePath4.cubicTo(18.415308f, 22.468164f, 19.0f, 23.469671f, 19.0f, 24.294716f);
        instancePath4.lineTo(19.0f, 42.597317f);
        instancePath4.cubicTo(19.0f, 43.42443f, 18.420994f, 43.74706f, 17.71643f, 43.32374f);
        instancePath4.lineTo(1.2835687f, 33.450405f);
        instancePath4.cubicTo(0.5746733f, 33.024483f, 0.0f, 32.006466f, 0.0f, 31.183224f);
        instancePath4.lineTo(0.0f, 13.604286f);
        instancePath4.cubicTo(0.0f, 12.77808f, 0.5894669f, 12.439923f, 1.305947f, 12.842992f);
        instancePath4.lineTo(17.694054f, 22.062408f);
        instancePath4.lineTo(17.694054f, 22.062408f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
