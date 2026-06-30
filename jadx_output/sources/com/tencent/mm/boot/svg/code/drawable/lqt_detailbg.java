package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lqt_detailbg extends l95.c {
    private final int width = 750;
    private final int height = com.tencent.mm.plugin.appbrand.jsapi.liteapp.x.CTRL_INDEX;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 750;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.jsapi.liteapp.x.CTRL_INDEX;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-870400);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(750.0f, 0.0f);
            instancePath.lineTo(750.0f, 1334.0f);
            instancePath.lineTo(0.0f, 1334.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-877312);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(68.52344f, 1334.0f);
            instancePath2.lineTo(849.0469f, 377.4297f);
            instancePath2.lineTo(5.891446E-14f, 199.80469f);
            instancePath2.lineTo(0.0f, 1334.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.saveLayerAlpha(null, 69, 31);
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
            instancePaint7.setColor(-748799);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(801.0469f, 102.0f);
            instancePath3.lineTo(-62.109375f, 375.08594f);
            instancePath3.lineTo(-62.109375f, 657.77344f);
            instancePath3.lineTo(785.65625f, 1323.5469f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.saveLayerAlpha(null, 39, 31);
            android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint7, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint8);
            canvas.restore();
            android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
            instancePaint9.setColor(-25344);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(-88.0f, 1217.8438f);
            instancePath4.lineTo(903.0781f, 1441.7344f);
            instancePath4.lineTo(855.39844f, 671.83594f);
            instancePath4.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
            canvas.saveLayerAlpha(null, 103, 31);
            android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint9, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
            canvas.drawPath(instancePath4, instancePaint10);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
