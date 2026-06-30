package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class story_icons_filled_star extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.0f, 0.0f);
        instancePath.lineTo(15.0f, 0.0f);
        instancePath.cubicTo(16.656855f, -3.043592E-16f, 18.0f, 1.3431457f, 18.0f, 3.0f);
        instancePath.lineTo(18.0f, 15.0f);
        instancePath.cubicTo(18.0f, 16.656855f, 16.656855f, 18.0f, 15.0f, 18.0f);
        instancePath.lineTo(3.0f, 18.0f);
        instancePath.cubicTo(1.3431457f, 18.0f, -6.852723E-16f, 16.656855f, -8.881784E-16f, 15.0f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.cubicTo(-2.0290612E-16f, 1.3431457f, 1.3431457f, -5.838192E-16f, 3.0f, -8.881784E-16f);
        instancePath.close();
        instancePath.moveTo(9.0f, 12.857142f);
        instancePath.lineTo(11.811378f, 14.335172f);
        instancePath.cubicTo(11.957373f, 14.411925f, 12.1245985f, 14.438412f, 12.287167f, 14.410529f);
        instancePath.cubicTo(12.695419f, 14.340508f, 12.96961f, 13.952791f, 12.89959f, 13.544539f);
        instancePath.lineTo(12.362664f, 10.414024f);
        instancePath.lineTo(14.637116f, 8.196981f);
        instancePath.cubicTo(14.755229f, 8.08185f, 14.832094f, 7.9309936f, 14.855813f, 7.7677655f);
        instancePath.cubicTo(14.915376f, 7.3578568f, 14.631365f, 6.977275f, 14.221457f, 6.9177117f);
        instancePath.lineTo(11.07824f, 6.4609756f);
        instancePath.lineTo(9.672552f, 3.6127393f);
        instancePath.cubicTo(9.599554f, 3.46483f, 9.479834f, 3.3451092f, 9.331924f, 3.2721117f);
        instancePath.cubicTo(8.9604845f, 3.0887947f, 8.510765f, 3.2412992f, 8.327448f, 3.6127393f);
        instancePath.lineTo(6.921759f, 6.4609756f);
        instancePath.lineTo(3.778544f, 6.9177117f);
        instancePath.cubicTo(3.6153162f, 6.94143f, 3.4644594f, 7.0182953f, 3.3493278f, 7.136408f);
        instancePath.cubicTo(3.060202f, 7.4330206f, 3.066271f, 7.9078555f, 3.3628838f, 8.196981f);
        instancePath.lineTo(5.637336f, 10.414024f);
        instancePath.lineTo(5.1004105f, 13.544539f);
        instancePath.cubicTo(5.072528f, 13.707108f, 5.099014f, 13.874333f, 5.1757684f, 14.0203285f);
        instancePath.cubicTo(5.368519f, 14.386962f, 5.821989f, 14.527922f, 6.1886225f, 14.335172f);
        instancePath.lineTo(9.0f, 12.857142f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
