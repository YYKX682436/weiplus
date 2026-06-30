package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_quotation_circle extends l95.c {
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
                instancePaint3.setColor(-1946157056);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(20.8f, 12.0f);
                instancePath.cubicTo(20.8f, 16.8601f, 16.8601f, 20.8f, 12.0f, 20.8f);
                instancePath.cubicTo(7.13989f, 20.8f, 3.2f, 16.8601f, 3.2f, 12.0f);
                instancePath.cubicTo(3.2f, 7.13989f, 7.13989f, 3.2f, 12.0f, 3.2f);
                instancePath.cubicTo(16.8601f, 3.2f, 20.8f, 7.13989f, 20.8f, 12.0f);
                instancePath.close();
                instancePath.moveTo(9.0f, 9.70698f);
                instancePath.lineTo(10.193f, 9.70698f);
                instancePath.cubicTo(10.2698f, 8.7093f, 10.9395f, 8.08837f, 11.993f, 8.08837f);
                instancePath.cubicTo(13.0326f, 8.08837f, 13.7023f, 8.72326f, 13.7023f, 9.58837f);
                instancePath.cubicTo(13.7023f, 10.3349f, 13.3884f, 10.7744f, 12.5791f, 11.2698f);
                instancePath.cubicTo(11.6233f, 11.8419f, 11.1767f, 12.4698f, 11.1837f, 13.3907f);
                instancePath.lineTo(11.1837f, 14.0326f);
                instancePath.lineTo(12.4047f, 14.0326f);
                instancePath.lineTo(12.4047f, 13.5791f);
                instancePath.cubicTo(12.4047f, 12.8465f, 12.6558f, 12.4558f, 13.5419f, 11.9326f);
                instancePath.cubicTo(14.4349f, 11.3953f, 15.0f, 10.6209f, 15.0f, 9.52558f);
                instancePath.cubicTo(15.0f, 8.08837f, 13.8f, 7.0f, 12.0419f, 7.0f);
                instancePath.cubicTo(10.0814f, 7.0f, 9.07674f, 8.2f, 9.0f, 9.70698f);
                instancePath.close();
                instancePath.moveTo(12.593f, 16.4186f);
                instancePath.cubicTo(12.593f, 16.8651f, 12.2512f, 17.214f, 11.7977f, 17.214f);
                instancePath.cubicTo(11.3512f, 17.214f, 11.0023f, 16.8651f, 11.0023f, 16.4186f);
                instancePath.cubicTo(11.0023f, 15.9651f, 11.3512f, 15.6233f, 11.7977f, 15.6233f);
                instancePath.cubicTo(12.2512f, 15.6233f, 12.593f, 15.9651f, 12.593f, 16.4186f);
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
