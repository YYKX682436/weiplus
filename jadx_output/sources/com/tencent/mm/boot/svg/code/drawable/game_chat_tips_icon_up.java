package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_chat_tips_icon_up extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.816f, 11.328f);
        instancePath.lineTo(12.032f, 12.112f);
        instancePath.lineTo(8.0f, 8.122f);
        instancePath.lineTo(3.982f, 12.112f);
        instancePath.lineTo(3.184f, 11.328f);
        instancePath.lineTo(7.482f, 7.086f);
        instancePath.cubicTo(7.63133f, 6.93667f, 7.804f, 6.862f, 8.0f, 6.862f);
        instancePath.cubicTo(8.20533f, 6.862f, 8.378f, 6.93667f, 8.518f, 7.086f);
        instancePath.lineTo(12.816f, 11.328f);
        instancePath.close();
        instancePath.moveTo(12.816f, 6.764f);
        instancePath.lineTo(12.032f, 7.548f);
        instancePath.lineTo(8.014f, 3.558f);
        instancePath.lineTo(3.996f, 7.548f);
        instancePath.lineTo(3.198f, 6.764f);
        instancePath.lineTo(7.482f, 2.522f);
        instancePath.cubicTo(7.63133f, 2.37267f, 7.80867f, 2.298f, 8.014f, 2.298f);
        instancePath.cubicTo(8.21933f, 2.298f, 8.392f, 2.37267f, 8.532f, 2.522f);
        instancePath.lineTo(12.816f, 6.764f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
