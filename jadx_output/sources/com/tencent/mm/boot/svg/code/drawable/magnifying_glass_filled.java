package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class magnifying_glass_filled extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(15.2154f, 16.5889f);
                instancePath.cubicTo(14.0429f, 17.4747f, 12.5828f, 18.0f, 11.0f, 18.0f);
                instancePath.cubicTo(7.134f, 18.0f, 4.0f, 14.866f, 4.0f, 11.0f);
                instancePath.cubicTo(4.0f, 7.134f, 7.134f, 4.0f, 11.0f, 4.0f);
                instancePath.cubicTo(14.866f, 4.0f, 18.0f, 7.134f, 18.0f, 11.0f);
                instancePath.cubicTo(18.0f, 12.5648f, 17.4865f, 14.0097f, 16.6189f, 15.1754f);
                instancePath.cubicTo(16.6366f, 15.1889f, 16.6536f, 15.2037f, 16.6698f, 15.2199f);
                instancePath.lineTo(20.8662f, 19.4163f);
                instancePath.lineTo(19.452f, 20.8305f);
                instancePath.lineTo(15.2555f, 16.6341f);
                instancePath.cubicTo(15.2411f, 16.6197f, 15.2277f, 16.6046f, 15.2154f, 16.5889f);
                instancePath.close();
                instancePath.moveTo(16.0f, 11.0f);
                instancePath.cubicTo(16.0f, 13.7614f, 13.7614f, 16.0f, 11.0f, 16.0f);
                instancePath.cubicTo(8.23857f, 16.0f, 6.0f, 13.7614f, 6.0f, 11.0f);
                instancePath.cubicTo(6.0f, 8.23857f, 8.23857f, 6.0f, 11.0f, 6.0f);
                instancePath.cubicTo(13.7614f, 6.0f, 16.0f, 8.23857f, 16.0f, 11.0f);
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
