package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_colive_member_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-855638017);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.99805f, 3.5f);
            instancePath.cubicTo(5.84785f, 3.5f, 6.64228f, 3.73613f, 7.32031f, 4.14551f);
            instancePath.cubicTo(7.11561f, 4.34098f, 6.92548f, 4.55163f, 6.75391f, 4.77734f);
            instancePath.cubicTo(6.23229f, 4.49254f, 5.63424f, 4.33008f, 4.99805f, 4.33008f);
            instancePath.cubicTo(2.97116f, 4.33008f, 1.32812f, 5.97311f, 1.32812f, 8.0f);
            instancePath.cubicTo(1.32812f, 10.0269f, 2.97116f, 11.6699f, 4.99805f, 11.6699f);
            instancePath.cubicTo(5.6344f, 11.6699f, 6.23219f, 11.5066f, 6.75391f, 11.2217f);
            instancePath.cubicTo(6.92547f, 11.4474f, 7.11561f, 11.658f, 7.32031f, 11.8535f);
            instancePath.cubicTo(6.64219f, 12.2631f, 5.84803f, 12.5f, 4.99805f, 12.5f);
            instancePath.cubicTo(2.51277f, 12.5f, 0.498047f, 10.4853f, 0.498047f, 8.0f);
            instancePath.cubicTo(0.498047f, 5.51472f, 2.51277f, 3.5f, 4.99805f, 3.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint4.setColor(-855638017);
            instancePaint4.setStrokeWidth(0.83f);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(11.0f, 3.915f);
            instancePath2.cubicTo(13.2560835f, 3.915f, 15.085f, 5.7439165f, 15.085f, 8.0f);
            instancePath2.cubicTo(15.085f, 10.2560835f, 13.2560835f, 12.085f, 11.0f, 12.085f);
            instancePath2.cubicTo(8.7439165f, 12.085f, 6.915f, 10.2560835f, 6.915f, 8.0f);
            instancePath2.cubicTo(6.915f, 5.7439165f, 8.7439165f, 3.915f, 11.0f, 3.915f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
