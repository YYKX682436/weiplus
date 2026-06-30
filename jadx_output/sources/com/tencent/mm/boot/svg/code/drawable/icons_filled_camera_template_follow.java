package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_camera_template_follow extends l95.c {
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
                instancePaint3.setColor(-352965);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.686f, 10.6664f);
                instancePath.lineTo(13.1909f, 12.1422f);
                instancePath.lineTo(14.6667f, 12.647f);
                instancePath.lineTo(13.1909f, 13.1519f);
                instancePath.lineTo(12.686f, 14.6664f);
                instancePath.lineTo(12.1812f, 13.1519f);
                instancePath.lineTo(10.6667f, 12.647f);
                instancePath.lineTo(12.1812f, 12.1422f);
                instancePath.lineTo(12.686f, 10.6664f);
                instancePath.close();
                instancePath.moveTo(6.59526f, 8.46167f);
                instancePath.lineTo(7.53815f, 9.4044f);
                instancePath.lineTo(2.47238f, 14.4711f);
                instancePath.lineTo(1.52949f, 13.5283f);
                instancePath.lineTo(6.59526f, 8.46167f);
                instancePath.close();
                instancePath.moveTo(8.09579f, 0.663838f);
                instancePath.lineTo(8.15055f, 0.698702f);
                instancePath.lineTo(10.775f, 2.66737f);
                instancePath.lineTo(13.8412f, 1.65356f);
                instancePath.cubicTo(14.1534f, 1.55032f, 14.4499f, 1.84681f, 14.3466f, 2.15894f);
                instancePath.lineTo(13.3323f, 5.22474f);
                instancePath.lineTo(15.3015f, 7.84963f);
                instancePath.cubicTo(15.4884f, 8.09879f, 15.3307f, 8.4468f, 15.0375f, 8.48607f);
                instancePath.lineTo(14.9727f, 8.48961f);
                instancePath.lineTo(11.7277f, 8.41709f);
                instancePath.lineTo(9.87958f, 11.048f);
                instancePath.cubicTo(9.70137f, 11.3017f, 9.32313f, 11.2614f, 9.19366f, 10.9958f);
                instancePath.lineTo(9.17122f, 10.9397f);
                instancePath.lineTo(8.17612f, 7.82312f);
                instancePath.lineTo(5.06043f, 6.82896f);
                instancePath.cubicTo(4.7651f, 6.73465f, 4.69054f, 6.36166f, 4.90534f, 6.15877f);
                instancePath.lineTo(4.95218f, 6.1206f);
                instancePath.lineTo(7.58262f, 4.27203f);
                instancePath.lineTo(7.51057f, 1.02751f);
                instancePath.cubicTo(7.50366f, 0.716075f, 7.83459f, 0.525051f, 8.09579f, 0.663838f);
                instancePath.close();
                instancePath.moveTo(2.69279f, 1.33303f);
                instancePath.lineTo(3.00579f, 2.32728f);
                instancePath.lineTo(4.00004f, 2.69245f);
                instancePath.lineTo(3.00579f, 3.00545f);
                instancePath.lineTo(2.69279f, 3.9997f);
                instancePath.lineTo(2.32762f, 3.00545f);
                instancePath.lineTo(1.33337f, 2.69245f);
                instancePath.lineTo(2.32762f, 2.32728f);
                instancePath.lineTo(2.69279f, 1.33303f);
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
