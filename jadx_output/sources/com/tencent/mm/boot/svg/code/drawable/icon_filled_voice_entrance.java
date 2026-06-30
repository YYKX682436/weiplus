package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_voice_entrance extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(13.4348f, 3.39133f);
            instancePath.cubicTo(13.4348f, 2.59892f, 12.7924f, 1.95654f, 12.0f, 1.95654f);
            instancePath.cubicTo(11.2076f, 1.95654f, 10.5652f, 2.59892f, 10.5652f, 3.39133f);
            instancePath.lineTo(10.5652f, 20.6087f);
            instancePath.cubicTo(10.5652f, 21.4011f, 11.2076f, 22.0435f, 12.0f, 22.0435f);
            instancePath.cubicTo(12.7924f, 22.0435f, 13.4348f, 21.4011f, 13.4348f, 20.6087f);
            instancePath.cubicTo(13.4348f, 20.6087f, 13.4348f, 16.7826f, 13.4348f, 14.8696f);
            instancePath.cubicTo(13.4348f, 14.0488f, 14.1439f, 13.0329f, 15.3478f, 13.0329f);
            instancePath.cubicTo(16.5518f, 13.0329f, 17.2609f, 13.9131f, 17.2609f, 14.8696f);
            instancePath.cubicTo(17.2609f, 15.8261f, 17.2609f, 17.2609f, 17.2609f, 17.2609f);
            instancePath.cubicTo(17.2609f, 18.0533f, 17.9032f, 18.6957f, 18.6957f, 18.6957f);
            instancePath.cubicTo(19.4881f, 18.6957f, 20.1304f, 18.0533f, 20.1304f, 17.2609f);
            instancePath.cubicTo(20.1304f, 17.2609f, 20.1304f, 15.8261f, 20.1304f, 14.8696f);
            instancePath.cubicTo(20.1304f, 13.0329f, 21.6607f, 12.3706f, 23.0f, 12.0f);
            instancePath.cubicTo(21.6607f, 11.6295f, 20.1304f, 10.9239f, 20.1304f, 9.13046f);
            instancePath.cubicTo(20.1304f, 8.17393f, 20.1304f, 6.73915f, 20.1304f, 6.73915f);
            instancePath.cubicTo(20.1304f, 5.94674f, 19.4881f, 5.30437f, 18.6957f, 5.30437f);
            instancePath.cubicTo(17.9032f, 5.30437f, 17.2609f, 5.94674f, 17.2609f, 6.73915f);
            instancePath.cubicTo(17.2609f, 6.73915f, 17.2609f, 8.17393f, 17.2609f, 9.13046f);
            instancePath.cubicTo(17.2609f, 10.0151f, 16.5334f, 10.9239f, 15.3478f, 10.9239f);
            instancePath.cubicTo(14.1622f, 10.9239f, 13.4348f, 10.0151f, 13.4348f, 9.13046f);
            instancePath.cubicTo(13.4348f, 7.07596f, 13.4348f, 3.39133f, 13.4348f, 3.39133f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(5.30435f, 5.30437f);
            instancePath2.cubicTo(6.09676f, 5.30437f, 6.73913f, 5.94674f, 6.73913f, 6.73915f);
            instancePath2.lineTo(6.73913f, 17.2609f);
            instancePath2.cubicTo(6.73913f, 18.0533f, 6.09676f, 18.6957f, 5.30435f, 18.6957f);
            instancePath2.cubicTo(4.51194f, 18.6957f, 3.86957f, 18.0533f, 3.86957f, 17.2609f);
            instancePath2.cubicTo(3.86957f, 17.2609f, 3.86957f, 16.7062f, 3.86957f, 14.8696f);
            instancePath2.cubicTo(3.86957f, 13.0329f, 2.29418f, 12.3581f, 1.0f, 12.0f);
            instancePath2.cubicTo(2.35773f, 11.6244f, 3.86957f, 10.9239f, 3.86957f, 9.13046f);
            instancePath2.cubicTo(3.86957f, 7.33698f, 3.86957f, 6.73915f, 3.86957f, 6.73915f);
            instancePath2.cubicTo(3.86957f, 5.94674f, 4.51194f, 5.30437f, 5.30435f, 5.30437f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
