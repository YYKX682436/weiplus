package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class text_status_icons_volume_up extends l95.c {
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
        canvas.saveLayerAlpha(null, 204, 31);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.707107f, 4.7028933f);
        instancePath.cubicTo(12.894643f, 4.8904295f, 13.0f, 5.1447835f, 13.0f, 5.41f);
        instancePath.lineTo(13.0f, 18.581573f);
        instancePath.cubicTo(13.0f, 19.133858f, 12.552284f, 19.581573f, 12.0f, 19.581573f);
        instancePath.cubicTo(11.734783f, 19.581573f, 11.48043f, 19.476215f, 11.292893f, 19.28868f);
        instancePath.lineTo(7.5f, 15.495787f);
        instancePath.lineTo(3.0f, 15.495787f);
        instancePath.cubicTo(2.4477153f, 15.495787f, 2.0f, 15.048071f, 2.0f, 14.495787f);
        instancePath.lineTo(2.0f, 9.495787f);
        instancePath.cubicTo(2.0f, 8.943501f, 2.4477153f, 8.495787f, 3.0f, 8.495787f);
        instancePath.lineTo(7.5f, 8.495787f);
        instancePath.lineTo(11.292893f, 4.7028933f);
        instancePath.cubicTo(11.683417f, 4.312369f, 12.316583f, 4.312369f, 12.707107f, 4.7028933f);
        instancePath.close();
        instancePath.moveTo(12.0f, 5.41f);
        instancePath.lineTo(7.9142137f, 9.495787f);
        instancePath.lineTo(3.0f, 9.495787f);
        instancePath.lineTo(3.0f, 14.495787f);
        instancePath.lineTo(7.9142137f, 14.495787f);
        instancePath.lineTo(12.0f, 18.581573f);
        instancePath.lineTo(12.0f, 5.41f);
        instancePath.close();
        instancePath.moveTo(18.156855f, 6.338932f);
        instancePath.cubicTo(19.60457f, 7.7866473f, 20.5f, 9.786648f, 20.5f, 11.995787f);
        instancePath.cubicTo(20.5f, 14.204926f, 19.60457f, 16.204926f, 18.156855f, 17.652641f);
        instancePath.lineTo(17.308327f, 16.804113f);
        instancePath.cubicTo(18.576122f, 15.536317f, 19.3f, 13.824877f, 19.3f, 11.995787f);
        instancePath.cubicTo(19.3f, 10.166697f, 18.576122f, 8.455256f, 17.308327f, 7.1874604f);
        instancePath.lineTo(18.156855f, 6.338932f);
        instancePath.close();
        instancePath.moveTo(16.176956f, 8.318831f);
        instancePath.cubicTo(17.11797f, 9.259846f, 17.7f, 10.559846f, 17.7f, 11.995787f);
        instancePath.cubicTo(17.7f, 13.431726f, 17.11797f, 14.731727f, 16.176956f, 15.672742f);
        instancePath.lineTo(15.328427f, 14.824214f);
        instancePath.cubicTo(16.07451f, 14.078131f, 16.5f, 13.072159f, 16.5f, 11.995787f);
        instancePath.cubicTo(16.5f, 10.919414f, 16.07451f, 9.913442f, 15.328427f, 9.167359f);
        instancePath.lineTo(16.176956f, 8.318831f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
