package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class download_regular extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.8f, 8.2f);
        instancePath.lineTo(16.0f, 8.2f);
        instancePath.lineTo(16.0f, 7.0f);
        instancePath.lineTo(19.001f, 7.0f);
        instancePath.cubicTo(19.5509f, 7.0f, 20.0f, 7.44584f, 20.0f, 7.99581f);
        instancePath.lineTo(20.0f, 21.0042f);
        instancePath.cubicTo(20.0f, 21.5511f, 19.5542f, 22.0f, 19.0042f, 22.0f);
        instancePath.lineTo(4.99581f, 22.0f);
        instancePath.cubicTo(4.44892f, 22.0f, 4.0f, 21.5542f, 4.0f, 21.0042f);
        instancePath.lineTo(4.0f, 7.99581f);
        instancePath.cubicTo(4.0f, 7.44892f, 4.44725f, 7.0f, 4.99896f, 7.0f);
        instancePath.lineTo(8.0f, 7.0f);
        instancePath.lineTo(8.0f, 8.2f);
        instancePath.lineTo(5.2f, 8.2f);
        instancePath.lineTo(5.2f, 20.8f);
        instancePath.lineTo(18.8f, 20.8f);
        instancePath.lineTo(18.8f, 8.2f);
        instancePath.close();
        instancePath.moveTo(12.6f, 12.6172f);
        instancePath.lineTo(14.687f, 10.5302f);
        instancePath.lineTo(15.5355f, 11.3787f);
        instancePath.lineTo(12.7071f, 14.2071f);
        instancePath.cubicTo(12.3166f, 14.5976f, 11.6834f, 14.5976f, 11.2929f, 14.2071f);
        instancePath.lineTo(8.46447f, 11.3787f);
        instancePath.lineTo(9.31299f, 10.5302f);
        instancePath.lineTo(11.4f, 12.6172f);
        instancePath.lineTo(11.4f, 2.0f);
        instancePath.lineTo(12.6f, 2.0f);
        instancePath.lineTo(12.6f, 12.6172f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
