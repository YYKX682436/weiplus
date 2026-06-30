package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_game_center_default extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-352965);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(2.3050551f, 13.125f);
        instancePath2.cubicTo(2.4187791f, 12.8417225f, 2.5899003f, 12.576766f, 2.818128f, 12.348538f);
        instancePath2.lineTo(12.348538f, 2.818128f);
        instancePath2.cubicTo(12.577369f, 2.5892978f, 12.842251f, 2.41826f, 13.125f, 2.3047276f);
        instancePath2.lineTo(13.125f, 9.1779f);
        instancePath2.cubicTo(11.120219f, 9.539286f, 9.539286f, 11.120219f, 9.1779f, 13.125f);
        instancePath2.lineTo(2.3050551f, 13.125f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15683841);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(25.695272f, 13.125f);
        instancePath3.lineTo(18.8221f, 13.125f);
        instancePath3.cubicTo(18.460714f, 11.120219f, 16.879782f, 9.539286f, 14.875f, 9.1779f);
        instancePath3.lineTo(14.875f, 2.3050551f);
        instancePath3.cubicTo(15.1582775f, 2.4187791f, 15.423234f, 2.5899003f, 15.651462f, 2.818128f);
        instancePath3.lineTo(25.181871f, 12.348538f);
        instancePath3.cubicTo(25.410702f, 12.577369f, 25.58174f, 12.842251f, 25.695272f, 13.125f);
        instancePath3.lineTo(25.695272f, 13.125f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16268960);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(25.694944f, 14.875f);
        instancePath4.cubicTo(25.58122f, 15.1582775f, 25.410099f, 15.423234f, 25.181871f, 15.651462f);
        instancePath4.lineTo(15.651462f, 25.181871f);
        instancePath4.cubicTo(15.422631f, 25.410702f, 15.157749f, 25.58174f, 14.875f, 25.695272f);
        instancePath4.lineTo(14.875f, 18.8221f);
        instancePath4.cubicTo(16.879782f, 18.460714f, 18.460714f, 16.879782f, 18.8221f, 14.875f);
        instancePath4.lineTo(25.694944f, 14.875f);
        instancePath4.lineTo(25.694944f, 14.875f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-372399);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(2.3047276f, 14.875f);
        instancePath5.lineTo(9.1779f, 14.875f);
        instancePath5.cubicTo(9.539286f, 16.879782f, 11.120219f, 18.460714f, 13.125f, 18.8221f);
        instancePath5.lineTo(13.125f, 25.694944f);
        instancePath5.cubicTo(12.8417225f, 25.58122f, 12.576766f, 25.410099f, 12.348538f, 25.181871f);
        instancePath5.lineTo(2.818128f, 15.651462f);
        instancePath5.cubicTo(2.5892978f, 15.422631f, 2.41826f, 15.157749f, 2.3047276f, 14.875f);
        instancePath5.lineTo(2.3047276f, 14.875f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
