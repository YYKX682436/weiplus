package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_voice2txt_cursor extends l95.c {
    private final int width = 24;
    private final int height = 10;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 10;
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
            instancePath.moveTo(0.5f, -2.1316282E-14f);
            instancePath.lineTo(23.500662f, -2.1316282E-14f);
            instancePath.cubicTo(22.163176f, -2.1316282E-14f, 20.431269f, 1.6341983f, 19.457546f, 2.697338f);
            instancePath.lineTo(14.130131f, 8.638686f);
            instancePath.cubicTo(13.588587f, 9.242793f, 12.756226f, 9.584702f, 12.0f, 9.584702f);
            instancePath.cubicTo(11.231155f, 9.584702f, 10.457203f, 9.293136f, 9.870531f, 8.638686f);
            instancePath.lineTo(4.6710873f, 2.8385649f);
            instancePath.cubicTo(3.727653f, 1.7861383f, 1.8982798f, -2.1316282E-14f, 0.5f, -2.1316282E-14f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
