package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_audio_tips extends l95.c {
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
                canvas.saveLayerAlpha(null, 230, 31);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.571068f, 4.5f);
                instancePath.cubicTo(15.380712f, 6.4194174f, 16.5f, 9.071068f, 16.5f, 12.0f);
                instancePath.cubicTo(16.5f, 14.928932f, 15.380712f, 17.580582f, 13.571068f, 19.5f);
                instancePath.lineTo(12.510407f, 18.375f);
                instancePath.cubicTo(14.095152f, 16.694124f, 15.0f, 14.425054f, 15.0f, 12.0f);
                instancePath.cubicTo(15.0f, 9.574946f, 14.095152f, 7.305876f, 12.510407f, 5.625f);
                instancePath.lineTo(13.571068f, 4.5f);
                instancePath.close();
                instancePath.moveTo(11.096194f, 7.125f);
                instancePath.cubicTo(12.272463f, 8.372622f, 13.0f, 10.096194f, 13.0f, 12.0f);
                instancePath.cubicTo(13.0f, 13.903806f, 12.272463f, 15.627378f, 11.096194f, 16.875f);
                instancePath.lineTo(10.035534f, 15.75f);
                instancePath.cubicTo(10.968138f, 14.760825f, 11.5f, 13.427082f, 11.5f, 12.0f);
                instancePath.cubicTo(11.5f, 10.572918f, 10.968138f, 9.239176f, 10.035534f, 8.25f);
                instancePath.lineTo(11.096194f, 7.125f);
                instancePath.close();
                instancePath.moveTo(8.621321f, 9.75f);
                instancePath.cubicTo(9.164213f, 10.325825f, 9.5f, 11.121321f, 9.5f, 12.0f);
                instancePath.cubicTo(9.5f, 12.878679f, 9.164213f, 13.674175f, 8.621321f, 14.25f);
                instancePath.lineTo(8.621321f, 14.25f);
                instancePath.lineTo(6.5f, 12.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
