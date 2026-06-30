package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class thumb_medium extends l95.c {
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
                instancePath.moveTo(15.6544f, 6.79722f);
                instancePath.lineTo(15.4772f, 9.55466f);
                instancePath.lineTo(19.4862f, 9.55466f);
                instancePath.cubicTo(20.833f, 9.55466f, 21.8455f, 10.94f, 21.6418f, 12.318f);
                instancePath.lineTo(21.6152f, 12.4655f);
                instancePath.lineTo(20.1864f, 19.2095f);
                instancePath.cubicTo(19.9745f, 20.202f, 19.1663f, 20.9225f, 18.2096f, 20.9921f);
                instancePath.lineTo(18.0574f, 20.9976f);
                instancePath.lineTo(4.3501f, 20.9924f);
                instancePath.cubicTo(3.79796f, 20.9919f, 3.35047f, 20.5442f, 3.3501f, 19.9921f);
                instancePath.lineTo(3.3501f, 11.4118f);
                instancePath.cubicTo(3.3501f, 10.8595f, 3.79781f, 10.4118f, 4.3501f, 10.4118f);
                instancePath.lineTo(6.7913f, 10.4118f);
                instancePath.lineTo(8.05324f, 10.3821f);
                instancePath.lineTo(8.47038f, 10.3637f);
                instancePath.lineTo(8.63817f, 10.3493f);
                instancePath.lineTo(8.66647f, 10.3443f);
                instancePath.cubicTo(10.0216f, 10.0291f, 11.0566f, 7.93788f, 11.2466f, 6.06791f);
                instancePath.lineTo(11.2569f, 5.90795f);
                instancePath.lineTo(11.2787f, 5.33552f);
                instancePath.lineTo(11.3008f, 5.06045f);
                instancePath.cubicTo(11.3741f, 4.35257f, 11.5999f, 3.52042f, 12.3812f, 3.17748f);
                instancePath.cubicTo(14.435f, 2.27605f, 15.7671f, 5.01232f, 15.6544f, 6.79722f);
                instancePath.close();
                instancePath.moveTo(12.9841f, 4.551f);
                instancePath.cubicTo(12.9334f, 4.57325f, 12.8592f, 4.71823f, 12.8122f, 5.04821f);
                instancePath.lineTo(12.796f, 5.18075f);
                instancePath.lineTo(12.7776f, 5.39248f);
                instancePath.lineTo(12.7538f, 6.00447f);
                instancePath.lineTo(12.7389f, 6.21958f);
                instancePath.cubicTo(12.4748f, 8.81819f, 11.0487f, 11.3302f, 9.00633f, 11.8053f);
                instancePath.lineTo(8.88356f, 11.8284f);
                instancePath.lineTo(8.76689f, 11.8437f);
                instancePath.lineTo(8.5001f, 11.864f);
                instancePath.lineTo(8.5001f, 19.494f);
                instancePath.lineTo(18.003f, 19.4986f);
                instancePath.lineTo(18.1008f, 19.496f);
                instancePath.cubicTo(18.3543f, 19.4776f, 18.5877f, 19.2911f, 18.6879f, 19.0088f);
                instancePath.lineTo(18.719f, 18.8986f);
                instancePath.lineTo(20.1389f, 12.2002f);
                instancePath.lineTo(20.1579f, 12.0986f);
                instancePath.cubicTo(20.2315f, 11.6006f, 19.9026f, 11.1273f, 19.5642f, 11.0623f);
                instancePath.lineTo(19.4862f, 11.0547f);
                instancePath.lineTo(13.8777f, 11.0547f);
                instancePath.lineTo(14.1574f, 6.70268f);
                instancePath.cubicTo(14.237f, 5.44156f, 13.4451f, 4.34864f, 12.9841f, 4.551f);
                instancePath.close();
                instancePath.moveTo(7.0001f, 11.906f);
                instancePath.lineTo(6.7913f, 11.9118f);
                instancePath.lineTo(4.8491f, 11.911f);
                instancePath.lineTo(4.8491f, 19.492f);
                instancePath.lineTo(7.0001f, 19.493f);
                instancePath.lineTo(7.0001f, 11.906f);
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
