package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_report_problem extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(35.995144f, 13.200261f);
            instancePath.lineTo(9.23486f, 59.562687f);
            instancePath.lineTo(62.764397f, 59.5582f);
            instancePath.lineTo(35.995144f, 13.200261f);
            instancePath.close();
            instancePath.moveTo(8.195969f, 63.162773f);
            instancePath.cubicTo(6.539114f, 63.16291f, 5.1958556f, 61.819878f, 5.195717f, 60.163025f);
            instancePath.cubicTo(5.195673f, 59.636444f, 5.334232f, 59.11913f, 5.597469f, 58.66307f);
            instancePath.lineTo(33.396782f, 10.500515f);
            instancePath.cubicTo(34.225044f, 9.065542f, 36.05976f, 8.573707f, 37.49473f, 9.40197f);
            instancePath.cubicTo(37.950855f, 9.665244f, 38.32964f, 10.043954f, 38.593f, 10.50003f);
            instancePath.lineTo(66.401634f, 58.657925f);
            instancePath.cubicTo(67.23016f, 60.092743f, 66.73867f, 61.927547f, 65.303856f, 62.75608f);
            instancePath.cubicTo(64.847824f, 63.019413f, 64.33051f, 63.15807f, 63.803913f, 63.15811f);
            instancePath.lineTo(8.195969f, 63.162773f);
            instancePath.close();
            instancePath.moveTo(34.117676f, 29.862305f);
            instancePath.lineTo(37.882324f, 29.862305f);
            instancePath.lineTo(37.589355f, 44.027344f);
            instancePath.lineTo(34.410645f, 44.027344f);
            instancePath.lineTo(34.117676f, 29.862305f);
            instancePath.close();
            instancePath.moveTo(35.992676f, 51.29297f);
            instancePath.cubicTo(34.806152f, 51.29297f, 33.868652f, 50.370117f, 33.868652f, 49.21289f);
            instancePath.cubicTo(33.868652f, 48.055664f, 34.806152f, 47.14746f, 35.992676f, 47.14746f);
            instancePath.cubicTo(37.193848f, 47.14746f, 38.131348f, 48.055664f, 38.131348f, 49.21289f);
            instancePath.cubicTo(38.131348f, 50.370117f, 37.193848f, 51.29297f, 35.992676f, 51.29297f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
