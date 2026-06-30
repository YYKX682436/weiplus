package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_profile_publish_pic_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePath.moveTo(1.99445f, 2.66663f);
                instancePath.lineTo(14.0054f, 2.66663f);
                instancePath.cubicTo(14.363f, 2.66663f, 14.6666f, 2.98738f, 14.6666f, 3.38306f);
                instancePath.lineTo(14.6666f, 12.6169f);
                instancePath.cubicTo(14.6666f, 13.0141f, 14.3706f, 13.3333f, 14.0054f, 13.3333f);
                instancePath.lineTo(1.99445f, 13.3333f);
                instancePath.cubicTo(1.63679f, 13.3333f, 1.33325f, 13.0125f, 1.33325f, 12.6169f);
                instancePath.lineTo(1.33325f, 3.38306f);
                instancePath.cubicTo(1.33325f, 2.98586f, 1.62928f, 2.66663f, 1.99445f, 2.66663f);
                instancePath.close();
                instancePath.moveTo(13.3333f, 9.1209f);
                instancePath.lineTo(12.1702f, 8.06335f);
                instancePath.cubicTo(11.8711f, 7.79491f, 11.3808f, 7.78958f, 11.0727f, 8.05162f);
                instancePath.lineTo(9.5512f, 9.34544f);
                instancePath.lineTo(6.56692f, 6.72335f);
                instancePath.cubicTo(6.26967f, 6.46218f, 5.77445f, 6.45008f, 5.46608f, 6.69946f);
                instancePath.lineTo(2.66659f, 8.96346f);
                instancePath.lineTo(2.66659f, 3.99996f);
                instancePath.lineTo(13.3333f, 3.99996f);
                instancePath.lineTo(13.3333f, 9.1209f);
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
