package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_topbar_bg extends l95.c {
    private final int width = 1125;
    private final int height = 450;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 1125;
        }
        if (i17 == 1) {
            return 450;
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
            instancePaint3.setColor(-830141);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(1125.0f, 0.0f);
            instancePath.lineTo(1125.0f, 450.0f);
            instancePath.lineTo(0.0f, 450.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-7503);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(935.0221f, 137.7136f);
            instancePath2.lineTo(922.7129f, 142.13159f);
            instancePath2.lineTo(927.98267f, 153.08679f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-7503);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(361.60098f, 63.0f);
            instancePath3.cubicTo(356.8312f, 63.0f, 351.0058f, 70.35558f, 356.30338f, 74.58397f);
            instancePath3.cubicTo(361.60098f, 78.81235f, 366.37076f, 63.0f, 361.60098f, 63.0f);
            instancePath3.close();
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint6, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
            instancePaint8.setColor(-2130713935);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(196.39885f, 372.45007f);
            instancePath4.cubicTo(191.62906f, 372.45007f, 185.80365f, 379.80566f, 191.10124f, 384.03406f);
            instancePath4.cubicTo(196.39885f, 388.26242f, 201.16862f, 372.45007f, 196.39885f, 372.45007f);
            instancePath4.close();
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint8, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
            canvas.drawPath(instancePath4, instancePaint9);
            canvas.restore();
            android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint, looper);
            instancePaint10.setColor(-7503);
            android.graphics.Path instancePath5 = l95.c.instancePath(looper);
            instancePath5.moveTo(331.1989f, 330.99368f);
            instancePath5.cubicTo(331.1989f, 330.99368f, 331.79904f, 337.22104f, 334.81866f, 340.22473f);
            instancePath5.cubicTo(337.8383f, 343.22842f, 336.03473f, 330.85147f, 336.03473f, 330.85147f);
            instancePath5.lineTo(331.1989f, 330.99368f);
            instancePath5.close();
            canvas.saveLayerAlpha(null, 51, 31);
            android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint10, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
            canvas.drawPath(instancePath5, instancePaint11);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
