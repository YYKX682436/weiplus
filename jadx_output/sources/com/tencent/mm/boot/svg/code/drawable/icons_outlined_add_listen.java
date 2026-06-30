package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_add_listen extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(48.7913f, 10.8538f);
                instancePath.cubicTo(41.8433f, 9.62979f, 34.5623f, 12.7678f, 30.8303f, 19.2328f);
                instancePath.cubicTo(26.0603f, 27.4948f, 28.8893f, 38.0608f, 37.1513f, 42.8308f);
                instancePath.cubicTo(38.1713f, 43.4188f, 39.2273f, 43.8898f, 40.3013f, 44.2498f);
                instancePath.lineTo(33.2033f, 56.5468f);
                instancePath.cubicTo(31.2923f, 59.8558f, 32.4263f, 64.0858f, 35.7353f, 65.9968f);
                instancePath.cubicTo(36.4553f, 66.4108f, 37.2203f, 66.6838f, 37.9943f, 66.8188f);
                instancePath.cubicTo(40.7753f, 67.3108f, 43.6913f, 66.0538f, 45.1853f, 63.4648f);
                instancePath.lineTo(60.7493f, 36.5068f);
                instancePath.cubicTo(65.5193f, 28.2448f, 62.6903f, 17.6818f, 54.4253f, 12.9088f);
                instancePath.cubicTo(52.6283f, 11.8738f, 50.7233f, 11.1958f, 48.7913f, 10.8538f);
                instancePath.moveTo(48.1673f, 14.3998f);
                instancePath.cubicTo(49.7333f, 14.6758f, 51.2333f, 15.2248f, 52.6253f, 16.0288f);
                instancePath.cubicTo(59.1563f, 19.7968f, 61.4033f, 28.1788f, 57.6323f, 34.7068f);
                instancePath.lineTo(42.0683f, 61.6648f);
                instancePath.cubicTo(41.3723f, 62.8678f, 39.9863f, 63.5158f, 38.6183f, 63.2728f);
                instancePath.cubicTo(38.2403f, 63.2068f, 37.8743f, 63.0748f, 37.5353f, 62.8768f);
                instancePath.cubicTo(36.7673f, 62.4358f, 36.2183f, 61.7188f, 35.9903f, 60.8638f);
                instancePath.cubicTo(35.7593f, 60.0088f, 35.8793f, 59.1118f, 36.3203f, 58.3468f);
                instancePath.lineTo(43.4183f, 46.0498f);
                instancePath.lineTo(45.6203f, 42.2398f);
                instancePath.lineTo(41.4503f, 40.8388f);
                instancePath.cubicTo(40.5803f, 40.5478f, 39.7403f, 40.1668f, 38.9513f, 39.7138f);
                instancePath.cubicTo(35.7893f, 37.8868f, 33.5273f, 34.9378f, 32.5823f, 31.4098f);
                instancePath.cubicTo(31.6342f, 27.8818f, 32.1202f, 24.1948f, 33.9473f, 21.0328f);
                instancePath.cubicTo(36.8123f, 16.0708f, 42.5273f, 13.4038f, 48.1673f, 14.3998f);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(37.9355f, 29.2655f);
                instancePath2.cubicTo(37.7285f, 29.2295f, 37.5275f, 29.1575f, 37.3355f, 29.0465f);
                instancePath2.cubicTo(36.4565f, 28.5395f, 36.1565f, 27.4175f, 36.6635f, 26.5355f);
                instancePath2.lineTo(39.3215f, 21.9335f);
                instancePath2.cubicTo(39.8285f, 21.0515f, 40.9505f, 20.7485f, 41.8325f, 21.2615f);
                instancePath2.cubicTo(42.7115f, 21.7655f, 43.0115f, 22.8905f, 42.5045f, 23.7695f);
                instancePath2.lineTo(39.8465f, 28.3745f);
                instancePath2.cubicTo(39.4475f, 29.0615f, 38.6735f, 29.3945f, 37.9355f, 29.2655f);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(16.8f, 19.2f);
                instancePath3.lineTo(16.8f, 12.0f);
                instancePath3.lineTo(13.2f, 12.0f);
                instancePath3.lineTo(13.2f, 19.2f);
                instancePath3.lineTo(6.0f, 19.2f);
                instancePath3.lineTo(6.0f, 22.8f);
                instancePath3.lineTo(13.2f, 22.8f);
                instancePath3.lineTo(13.2f, 30.0f);
                instancePath3.lineTo(16.8f, 30.0f);
                instancePath3.lineTo(16.8f, 22.8f);
                instancePath3.lineTo(24.0f, 22.8f);
                instancePath3.lineTo(24.0f, 19.2f);
                instancePath3.lineTo(16.8f, 19.2f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
