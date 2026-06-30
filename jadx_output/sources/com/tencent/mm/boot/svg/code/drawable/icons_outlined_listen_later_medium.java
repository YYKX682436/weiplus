package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_listen_later_medium extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePaint3.setColor(-16777216);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(6.8501f, 2.59998f);
                instancePath.lineTo(4.8501f, 2.59998f);
                instancePath.lineTo(4.8501f, 5.24997f);
                instancePath.lineTo(2.2f, 5.24997f);
                instancePath.lineTo(2.2f, 7.24996f);
                instancePath.lineTo(4.8501f, 7.24996f);
                instancePath.lineTo(4.8501f, 9.89997f);
                instancePath.lineTo(6.8501f, 9.89997f);
                instancePath.lineTo(6.8501f, 7.24996f);
                instancePath.lineTo(9.5f, 7.24996f);
                instancePath.lineTo(9.5f, 5.24997f);
                instancePath.lineTo(6.8501f, 5.24997f);
                instancePath.lineTo(6.8501f, 2.59998f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(21.4002f, 5.24997f);
                instancePath2.lineTo(10.9998f, 5.24997f);
                instancePath2.lineTo(10.9998f, 7.24996f);
                instancePath2.lineTo(21.4002f, 7.24996f);
                instancePath2.lineTo(21.4002f, 5.24997f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(21.3f, 11.45f);
                instancePath3.lineTo(4.5f, 11.45f);
                instancePath3.lineTo(4.5f, 13.45f);
                instancePath3.lineTo(21.3f, 13.45f);
                instancePath3.lineTo(21.3f, 11.45f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
                instancePaint6.setColor(-16777216);
                instancePaint6.setColor(-16777216);
                android.graphics.Path instancePath4 = l95.c.instancePath(looper);
                instancePath4.moveTo(21.4002f, 17.45f);
                instancePath4.lineTo(4.60019f, 17.45f);
                instancePath4.lineTo(4.60019f, 19.45f);
                instancePath4.lineTo(21.4002f, 19.45f);
                instancePath4.lineTo(21.4002f, 17.45f);
                instancePath4.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
