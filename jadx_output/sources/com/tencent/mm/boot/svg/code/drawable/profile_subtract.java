package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class profile_subtract extends l95.c {
    private final int width = 18;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 18;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15683841);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.0f, 1.5f);
        instancePath.cubicTo(13.1421f, 1.5f, 16.5f, 4.85786f, 16.5f, 9.0f);
        instancePath.cubicTo(16.5f, 13.1421f, 13.1421f, 16.5f, 9.0f, 16.5f);
        instancePath.cubicTo(4.85786f, 16.5f, 1.5f, 13.1421f, 1.5f, 9.0f);
        instancePath.cubicTo(1.5f, 4.85786f, 4.85786f, 1.5f, 9.0f, 1.5f);
        instancePath.close();
        instancePath.moveTo(11.8682f, 5.25293f);
        instancePath.cubicTo(11.6662f, 4.9048f, 11.1561f, 4.90488f, 10.9541f, 5.25293f);
        instancePath.lineTo(9.0f, 8.62207f);
        instancePath.lineTo(7.0459f, 5.25293f);
        instancePath.cubicTo(6.84392f, 4.90486f, 6.33377f, 4.90481f, 6.13184f, 5.25293f);
        instancePath.lineTo(4.26953f, 8.46484f);
        instancePath.cubicTo(4.07719f, 8.79669f, 4.07712f, 9.20432f, 4.26953f, 9.53613f);
        instancePath.lineTo(6.13184f, 12.7471f);
        instancePath.cubicTo(6.33377f, 13.0952f, 6.84394f, 13.0952f, 7.0459f, 12.7471f);
        instancePath.lineTo(9.0f, 9.37793f);
        instancePath.lineTo(10.9541f, 12.7471f);
        instancePath.cubicTo(11.1561f, 13.0952f, 11.6662f, 13.0952f, 11.8682f, 12.7471f);
        instancePath.lineTo(13.7305f, 9.53613f);
        instancePath.cubicTo(13.9229f, 9.20433f, 13.9228f, 8.79667f, 13.7305f, 8.46484f);
        instancePath.lineTo(11.8682f, 5.25293f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
