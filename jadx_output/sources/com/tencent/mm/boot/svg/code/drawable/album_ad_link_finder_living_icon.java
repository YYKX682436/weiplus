package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_ad_link_finder_living_icon extends l95.c {
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
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(11.6673f, 8.00004f);
        instancePath.cubicTo(11.6673f, 5.975f, 10.0257f, 4.33337f, 8.00065f, 4.33337f);
        instancePath.cubicTo(5.97561f, 4.33337f, 4.33398f, 5.975f, 4.33398f, 8.00004f);
        instancePath.cubicTo(4.33398f, 10.0251f, 5.97561f, 11.6667f, 8.00065f, 11.6667f);
        instancePath.cubicTo(10.0257f, 11.6667f, 11.6673f, 10.0251f, 11.6673f, 8.00004f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.6673f, 8.00004f);
        instancePath2.cubicTo(14.6673f, 11.6819f, 11.6825f, 14.6667f, 8.00065f, 14.6667f);
        instancePath2.cubicTo(4.31875f, 14.6667f, 1.33398f, 11.6819f, 1.33398f, 8.00004f);
        instancePath2.cubicTo(1.33398f, 4.31814f, 4.31875f, 1.33337f, 8.00065f, 1.33337f);
        instancePath2.cubicTo(11.6825f, 1.33337f, 14.6673f, 4.31814f, 14.6673f, 8.00004f);
        instancePath2.close();
        instancePath2.moveTo(13.334f, 8.00004f);
        instancePath2.cubicTo(13.334f, 10.9456f, 10.9462f, 13.3334f, 8.00065f, 13.3334f);
        instancePath2.cubicTo(5.05513f, 13.3334f, 2.66732f, 10.9456f, 2.66732f, 8.00004f);
        instancePath2.cubicTo(2.66732f, 5.05452f, 5.05513f, 2.66671f, 8.00065f, 2.66671f);
        instancePath2.cubicTo(10.9462f, 2.66671f, 13.334f, 5.05452f, 13.334f, 8.00004f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
