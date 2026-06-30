package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_menu_game_introduction_regular extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePath.moveTo(22.8574f, 6.0f);
                instancePath.lineTo(9.14109f, 6.0f);
                instancePath.cubicTo(6.46318f, 6.0f, 4.21351f, 8.12853f, 3.91778f, 10.942f);
                instancePath.lineTo(2.68328f, 22.6871f);
                instancePath.cubicTo(2.67178f, 22.7965f, 2.66602f, 22.9064f, 2.66602f, 23.0165f);
                instancePath.cubicTo(2.66602f, 24.6643f, 3.92961f, 26.0f, 5.48833f, 26.0f);
                instancePath.lineTo(6.02934f, 26.0f);
                instancePath.cubicTo(7.70194f, 26.0f, 9.30603f, 25.2976f, 10.4887f, 24.0474f);
                instancePath.lineTo(12.4106f, 22.0158f);
                instancePath.cubicTo(13.3623f, 21.0097f, 14.6532f, 20.4444f, 15.9992f, 20.4444f);
                instancePath.cubicTo(17.3452f, 20.4444f, 18.6361f, 21.0097f, 19.5879f, 22.0158f);
                instancePath.lineTo(21.5097f, 24.0474f);
                instancePath.cubicTo(22.6924f, 25.2976f, 24.2965f, 26.0f, 25.9691f, 26.0f);
                instancePath.lineTo(26.5101f, 26.0f);
                instancePath.cubicTo(26.6143f, 26.0f, 26.7183f, 25.9939f, 26.8218f, 25.9818f);
                instancePath.cubicTo(28.371f, 25.7998f, 29.4873f, 24.3247f, 29.3152f, 22.6871f);
                instancePath.lineTo(28.0807f, 10.942f);
                instancePath.cubicTo(27.7849f, 8.12853f, 25.5353f, 6.0f, 22.8574f, 6.0f);
                instancePath.close();
                instancePath.moveTo(5.48232f, 11.0871f);
                instancePath.cubicTo(5.68891f, 9.10189f, 7.26056f, 7.6f, 9.13139f, 7.6f);
                instancePath.lineTo(22.8205f, 7.6f);
                instancePath.cubicTo(24.6913f, 7.6f, 26.2629f, 9.10189f, 26.4695f, 11.0871f);
                instancePath.lineTo(27.7016f, 22.9261f);
                instancePath.cubicTo(27.7774f, 23.6547f, 27.2857f, 24.3109f, 26.6033f, 24.3919f);
                instancePath.cubicTo(26.5577f, 24.3973f, 26.5119f, 24.4f, 26.466f, 24.4f);
                instancePath.lineTo(25.9261f, 24.4f);
                instancePath.cubicTo(24.6741f, 24.4f, 23.4734f, 23.869f, 22.5881f, 22.9238f);
                instancePath.lineTo(20.6701f, 20.876f);
                instancePath.cubicTo(19.4251f, 19.5468f, 17.7366f, 18.8f, 15.9759f, 18.8f);
                instancePath.cubicTo(14.2153f, 18.8f, 12.5267f, 19.5468f, 11.2818f, 20.876f);
                instancePath.lineTo(9.36373f, 22.9238f);
                instancePath.cubicTo(8.47845f, 23.869f, 7.27777f, 24.4f, 6.02581f, 24.4f);
                instancePath.lineTo(5.48586f, 24.4f);
                instancePath.cubicTo(4.79926f, 24.4f, 4.24265f, 23.8057f, 4.24265f, 23.0727f);
                instancePath.cubicTo(4.24265f, 23.0237f, 4.24519f, 22.9747f, 4.25026f, 22.9261f);
                instancePath.lineTo(5.48232f, 11.0871f);
                instancePath.close();
                instancePath.moveTo(9.33268f, 12.4f);
                instancePath.lineTo(9.33268f, 10.0f);
                instancePath.lineTo(10.9327f, 10.0f);
                instancePath.lineTo(10.9327f, 12.4f);
                instancePath.lineTo(13.3327f, 12.4f);
                instancePath.lineTo(13.3327f, 14.0f);
                instancePath.lineTo(10.9327f, 14.0f);
                instancePath.lineTo(10.9327f, 16.4f);
                instancePath.lineTo(9.33268f, 16.4f);
                instancePath.lineTo(9.33268f, 14.0f);
                instancePath.lineTo(6.93267f, 14.0f);
                instancePath.lineTo(6.93267f, 12.4f);
                instancePath.lineTo(9.33268f, 12.4f);
                instancePath.close();
                instancePath.moveTo(21.866f, 16.4f);
                instancePath.cubicTo(23.6333f, 16.4f, 25.066f, 14.9673f, 25.066f, 13.2f);
                instancePath.cubicTo(25.066f, 11.4327f, 23.6333f, 10.0f, 21.866f, 10.0f);
                instancePath.cubicTo(20.0987f, 10.0f, 18.666f, 11.4327f, 18.666f, 13.2f);
                instancePath.cubicTo(18.666f, 14.9673f, 20.0987f, 16.4f, 21.866f, 16.4f);
                instancePath.close();
                instancePath.moveTo(21.866f, 14.7954f);
                instancePath.cubicTo(20.9824f, 14.7954f, 20.266f, 14.0791f, 20.266f, 13.1954f);
                instancePath.cubicTo(20.266f, 12.3117f, 20.9824f, 11.5954f, 21.866f, 11.5954f);
                instancePath.cubicTo(22.7497f, 11.5954f, 23.466f, 12.3117f, 23.466f, 13.1954f);
                instancePath.cubicTo(23.466f, 14.0791f, 22.7497f, 14.7954f, 21.866f, 14.7954f);
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
