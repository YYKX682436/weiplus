package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ad_living_description_icon extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePaint3.setColor(-40634);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(36.0f, 71.0f);
                instancePath.cubicTo(55.33f, 71.0f, 71.0f, 55.33f, 71.0f, 36.0f);
                instancePath.cubicTo(71.0f, 16.67f, 55.33f, 1.0f, 36.0f, 1.0f);
                instancePath.cubicTo(16.67f, 1.0f, 1.0f, 16.67f, 1.0f, 36.0f);
                instancePath.cubicTo(1.0f, 55.33f, 16.67f, 71.0f, 36.0f, 71.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(21.4166f, 27.4931f);
                instancePath2.lineTo(27.493f, 27.4931f);
                instancePath2.lineTo(27.493f, 44.507f);
                instancePath2.lineTo(21.4166f, 44.507f);
                instancePath2.cubicTo(20.0743f, 44.507f, 18.9861f, 43.4188f, 18.9861f, 42.0764f);
                instancePath2.lineTo(18.9861f, 29.9237f);
                instancePath2.cubicTo(18.9861f, 28.5813f, 20.0743f, 27.4931f, 21.4166f, 27.4931f);
                instancePath2.close();
                instancePath2.moveTo(29.9236f, 27.4931f);
                instancePath2.lineTo(47.6657f, 19.731f);
                instancePath2.cubicTo(48.2806f, 19.462f, 48.9971f, 19.7424f, 49.2661f, 20.3572f);
                instancePath2.cubicTo(49.3333f, 20.5108f, 49.368f, 20.6767f, 49.368f, 20.8444f);
                instancePath2.lineTo(49.368f, 51.1557f);
                instancePath2.cubicTo(49.368f, 51.827f, 48.824f, 52.371f, 48.1528f, 52.371f);
                instancePath2.cubicTo(47.9851f, 52.371f, 47.8193f, 52.3363f, 47.6657f, 52.2691f);
                instancePath2.lineTo(29.9236f, 44.507f);
                instancePath2.lineTo(29.9236f, 27.4931f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
