package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_subtract extends l95.c {
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
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(13.1335f, 11.8001f);
            instancePath.lineTo(15.4668f, 11.8001f);
            instancePath.lineTo(15.4668f, 13.1335f);
            instancePath.lineTo(13.1335f, 13.1335f);
            instancePath.lineTo(13.1335f, 15.4668f);
            instancePath.lineTo(11.8001f, 15.4668f);
            instancePath.lineTo(11.8001f, 13.1335f);
            instancePath.lineTo(9.4668f, 13.1335f);
            instancePath.lineTo(9.4668f, 11.8001f);
            instancePath.lineTo(11.8001f, 11.8001f);
            instancePath.lineTo(11.8001f, 9.4668f);
            instancePath.lineTo(13.1335f, 9.4668f);
            instancePath.lineTo(13.1335f, 11.8001f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(10.748f, 1.21289f);
            instancePath2.cubicTo(11.1876f, 1.14198f, 11.6185f, 1.41324f, 11.7363f, 1.85254f);
            instancePath2.lineTo(12.4189f, 4.40039f);
            instancePath2.lineTo(2.13477f, 7.15625f);
            instancePath2.lineTo(12.7773f, 7.15625f);
            instancePath2.lineTo(12.7773f, 8.46582f);
            instancePath2.lineTo(10.8008f, 8.46582f);
            instancePath2.lineTo(10.8008f, 10.7988f);
            instancePath2.lineTo(8.46777f, 10.7988f);
            instancePath2.lineTo(8.46777f, 14.001f);
            instancePath2.lineTo(2.22852f, 14.001f);
            instancePath2.cubicTo(1.74371f, 14.0009f, 1.35066f, 13.6066f, 1.34961f, 13.1221f);
            instancePath2.lineTo(1.34961f, 7.24121f);
            instancePath2.lineTo(0.698242f, 4.81055f);
            instancePath2.cubicTo(0.572741f, 4.3419f, 0.850891f, 3.86032f, 1.31934f, 3.73438f);
            instancePath2.lineTo(10.6602f, 1.23145f);
            instancePath2.lineTo(10.748f, 1.21289f);
            instancePath2.close();
            instancePath2.moveTo(11.8008f, 11.7988f);
            instancePath2.lineTo(11.8008f, 11.7998f);
            instancePath2.lineTo(9.46777f, 11.7998f);
            instancePath2.lineTo(9.46777f, 11.7988f);
            instancePath2.lineTo(11.8008f, 11.7988f);
            instancePath2.close();
            instancePath2.moveTo(1.7627f, 4.70703f);
            instancePath2.lineTo(2.12598f, 6.06543f);
            instancePath2.lineTo(4.66113f, 5.38574f);
            instancePath2.lineTo(3.61816f, 4.20898f);
            instancePath2.lineTo(1.7627f, 4.70703f);
            instancePath2.close();
            instancePath2.moveTo(4.88477f, 3.87012f);
            instancePath2.lineTo(5.72949f, 4.82324f);
            instancePath2.cubicTo(5.79242f, 4.89472f, 5.83315f, 4.97903f, 5.85547f, 5.06543f);
            instancePath2.lineTo(8.04004f, 4.47949f);
            instancePath2.lineTo(7.06445f, 3.37891f);
            instancePath2.cubicTo(7.04332f, 3.35504f, 7.02528f, 3.32694f, 7.00879f, 3.30078f);
            instancePath2.lineTo(4.88477f, 3.87012f);
            instancePath2.close();
            instancePath2.moveTo(8.26465f, 2.96484f);
            instancePath2.lineTo(9.24609f, 4.07227f);
            instancePath2.cubicTo(9.26511f, 4.09402f, 9.28157f, 4.11904f, 9.29688f, 4.14258f);
            instancePath2.lineTo(11.127f, 3.65332f);
            instancePath2.lineTo(10.7627f, 2.2959f);
            instancePath2.lineTo(8.26465f, 2.96484f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
