package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_notidymsg_item_follow_btn_plus extends l95.c {
    private final int width = 10;
    private final int height = 10;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 10;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePath.moveTo(4.5835f, 4.58325f);
                instancePath.lineTo(4.5835f, 1.45825f);
                instancePath.lineTo(5.41683f, 1.45825f);
                instancePath.lineTo(5.41683f, 4.58325f);
                instancePath.lineTo(8.54183f, 4.58325f);
                instancePath.lineTo(8.54183f, 5.41659f);
                instancePath.lineTo(5.41683f, 5.41659f);
                instancePath.lineTo(5.41683f, 8.54159f);
                instancePath.lineTo(4.5835f, 8.54159f);
                instancePath.lineTo(4.5835f, 5.41659f);
                instancePath.lineTo(1.4585f, 5.41659f);
                instancePath.lineTo(1.4585f, 4.58325f);
                instancePath.lineTo(4.5835f, 4.58325f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
