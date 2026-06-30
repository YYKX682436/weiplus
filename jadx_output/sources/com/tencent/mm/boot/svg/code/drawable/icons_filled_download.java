package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_download extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.999252f, 14.071f);
        instancePath.lineTo(8.464466f, 11.535534f);
        instancePath.lineTo(7.0502524f, 12.949747f);
        instancePath.lineTo(11.646446f, 17.545942f);
        instancePath.cubicTo(11.820013f, 17.719507f, 12.0894375f, 17.738792f, 12.284306f, 17.603798f);
        instancePath.lineTo(12.353554f, 17.545942f);
        instancePath.lineTo(16.949747f, 12.949747f);
        instancePath.lineTo(15.535534f, 11.535534f);
        instancePath.lineTo(12.999252f, 14.071f);
        instancePath.lineTo(13.0f, 6.0f);
        instancePath.lineTo(19.0f, 6.0f);
        instancePath.cubicTo(19.552284f, 6.0f, 20.0f, 6.4477153f, 20.0f, 7.0f);
        instancePath.lineTo(20.0f, 20.5f);
        instancePath.cubicTo(20.0f, 21.052284f, 19.552284f, 21.5f, 19.0f, 21.5f);
        instancePath.lineTo(5.0f, 21.5f);
        instancePath.cubicTo(4.4477153f, 21.5f, 4.0f, 21.052284f, 4.0f, 20.5f);
        instancePath.lineTo(4.0f, 7.0f);
        instancePath.cubicTo(4.0f, 6.4477153f, 4.4477153f, 6.0f, 5.0f, 6.0f);
        instancePath.lineTo(11.0f, 6.0f);
        instancePath.lineTo(11.0f, 2.0f);
        instancePath.lineTo(13.0f, 2.0f);
        instancePath.lineTo(13.0f, 6.25f);
        instancePath.lineTo(11.0f, 6.25f);
        instancePath.lineTo(10.999252f, 14.071f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
