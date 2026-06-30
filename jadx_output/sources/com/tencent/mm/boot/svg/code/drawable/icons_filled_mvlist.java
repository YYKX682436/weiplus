package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mvlist extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(15.75f, 14.685259f);
                instancePath.cubicTo(15.794264f, 14.685259f, 15.837733f, 14.697011f, 15.875968f, 14.719315f);
                instancePath.lineTo(21.129808f, 17.784056f);
                instancePath.cubicTo(21.249071f, 17.853626f, 21.289356f, 18.006704f, 21.219786f, 18.125967f);
                instancePath.cubicTo(21.198057f, 18.16322f, 21.16706f, 18.194216f, 21.129808f, 18.215944f);
                instancePath.lineTo(15.875968f, 21.280685f);
                instancePath.cubicTo(15.756704f, 21.350256f, 15.603625f, 21.30997f, 15.534056f, 21.190708f);
                instancePath.cubicTo(15.511752f, 21.152475f, 15.5f, 21.109005f, 15.5f, 21.064741f);
                instancePath.lineTo(15.5f, 14.935259f);
                instancePath.cubicTo(15.5f, 14.797188f, 15.611929f, 14.685259f, 15.75f, 14.685259f);
                instancePath.close();
                instancePath.moveTo(12.0f, 16.5f);
                instancePath.cubicTo(12.552284f, 16.5f, 13.0f, 16.947716f, 13.0f, 17.5f);
                instancePath.cubicTo(13.0f, 18.052284f, 12.552284f, 18.5f, 12.0f, 18.5f);
                instancePath.lineTo(4.0f, 18.5f);
                instancePath.cubicTo(3.4477153f, 18.5f, 3.0f, 18.052284f, 3.0f, 17.5f);
                instancePath.cubicTo(3.0f, 16.947716f, 3.4477153f, 16.5f, 4.0f, 16.5f);
                instancePath.lineTo(12.0f, 16.5f);
                instancePath.close();
                instancePath.moveTo(20.0f, 10.5f);
                instancePath.cubicTo(20.552284f, 10.5f, 21.0f, 10.947716f, 21.0f, 11.5f);
                instancePath.cubicTo(21.0f, 12.052284f, 20.552284f, 12.5f, 20.0f, 12.5f);
                instancePath.lineTo(4.0f, 12.5f);
                instancePath.cubicTo(3.4477153f, 12.5f, 3.0f, 12.052284f, 3.0f, 11.5f);
                instancePath.cubicTo(3.0f, 10.947716f, 3.4477153f, 10.5f, 4.0f, 10.5f);
                instancePath.lineTo(20.0f, 10.5f);
                instancePath.close();
                instancePath.moveTo(20.0f, 4.5f);
                instancePath.cubicTo(20.552284f, 4.5f, 21.0f, 4.9477153f, 21.0f, 5.5f);
                instancePath.cubicTo(21.0f, 6.0522847f, 20.552284f, 6.5f, 20.0f, 6.5f);
                instancePath.lineTo(4.0f, 6.5f);
                instancePath.cubicTo(3.4477153f, 6.5f, 3.0f, 6.0522847f, 3.0f, 5.5f);
                instancePath.cubicTo(3.0f, 4.9477153f, 3.4477153f, 4.5f, 4.0f, 4.5f);
                instancePath.lineTo(20.0f, 4.5f);
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
