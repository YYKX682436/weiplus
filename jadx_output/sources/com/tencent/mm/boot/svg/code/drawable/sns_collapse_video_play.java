package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_collapse_video_play extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.saveLayerAlpha(null, 204, 31);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(60.0f, 115.0f);
        instancePath.cubicTo(90.37566f, 115.0f, 115.0f, 90.37566f, 115.0f, 60.0f);
        instancePath.cubicTo(115.0f, 29.624338f, 90.37566f, 5.0f, 60.0f, 5.0f);
        instancePath.cubicTo(29.624338f, 5.0f, 5.0f, 29.624338f, 5.0f, 60.0f);
        instancePath.cubicTo(5.0f, 90.37566f, 29.624338f, 115.0f, 60.0f, 115.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 120.0f);
        instancePath.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        instancePath.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        instancePath.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(46.5f, 38.223152f);
        instancePath2.cubicTo(46.5f, 36.562f, 47.656143f, 35.89766f, 49.079807f, 36.73782f);
        instancePath2.lineTo(85.92019f, 58.478794f);
        instancePath2.cubicTo(87.34498f, 59.31962f, 87.34386f, 60.68353f, 85.92019f, 61.52369f);
        instancePath2.lineTo(49.079807f, 83.26466f);
        instancePath2.cubicTo(47.655018f, 84.10549f, 46.5f, 83.43548f, 46.5f, 81.779335f);
        instancePath2.lineTo(46.5f, 38.223152f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(855638016);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(60.0f, 0.0f);
        instancePath3.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        instancePath3.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        instancePath3.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        instancePath3.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(60.0f, 117.0f);
        instancePath4.cubicTo(91.48023f, 117.0f, 117.0f, 91.48023f, 117.0f, 60.0f);
        instancePath4.cubicTo(117.0f, 28.51977f, 91.48023f, 3.0f, 60.0f, 3.0f);
        instancePath4.cubicTo(28.51977f, 3.0f, 3.0f, 28.51977f, 3.0f, 60.0f);
        instancePath4.cubicTo(3.0f, 91.48023f, 28.51977f, 117.0f, 60.0f, 117.0f);
        instancePath4.close();
        instancePath4.moveTo(60.0f, 120.0f);
        instancePath4.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        instancePath4.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath4.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        instancePath4.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(46.5f, 38.223152f);
        instancePath5.cubicTo(46.5f, 36.562f, 47.656143f, 35.89766f, 49.079807f, 36.73782f);
        instancePath5.lineTo(85.92019f, 58.478794f);
        instancePath5.cubicTo(87.34498f, 59.31962f, 87.34386f, 60.68353f, 85.92019f, 61.52369f);
        instancePath5.lineTo(49.079807f, 83.26466f);
        instancePath5.cubicTo(47.655018f, 84.10549f, 46.5f, 83.43548f, 46.5f, 81.779335f);
        instancePath5.lineTo(46.5f, 38.223152f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
