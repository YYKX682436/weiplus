package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_awesome_bold extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-419430401);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(33.87176f, 18.193398f);
                instancePath.lineTo(35.030296f, 19.324907f);
                instancePath.lineTo(35.99308f, 20.239637f);
                instancePath.lineTo(37.380127f, 18.915659f);
                instancePath.lineTo(38.1144f, 18.193398f);
                instancePath.cubicTo(43.972263f, 12.335534f, 53.469738f, 12.335534f, 59.327602f, 18.193398f);
                instancePath.cubicTo(65.13098f, 23.996773f, 65.18496f, 33.37236f, 59.48955f, 39.242195f);
                instancePath.lineTo(38.11429f, 60.619694f);
                instancePath.cubicTo(37.032997f, 61.701305f, 35.331314f, 61.78459f, 34.154396f, 60.86958f);
                instancePath.lineTo(33.87176f, 60.619804f);
                instancePath.lineTo(12.495378f, 39.243423f);
                instancePath.cubicTo(6.801199f, 33.37236f, 6.8551817f, 23.996773f, 12.658556f, 18.193398f);
                instancePath.cubicTo(18.51642f, 12.335534f, 28.013895f, 12.335534f, 33.87176f, 18.193398f);
                instancePath.close();
                instancePath.moveTo(29.62912f, 22.436039f);
                instancePath.cubicTo(26.1144f, 18.92132f, 20.415916f, 18.92132f, 16.901197f, 22.436039f);
                instancePath.cubicTo(13.562268f, 25.774967f, 13.391701f, 31.093847f, 16.351715f, 34.57543f);
                instancePath.lineTo(16.738018f, 35.000782f);
                instancePath.lineTo(35.991f, 54.255f);
                instancePath.lineTo(55.183414f, 35.064014f);
                instancePath.cubicTo(58.466125f, 31.680769f, 58.56064f, 26.36075f, 55.48582f, 22.863438f);
                instancePath.lineTo(55.084965f, 22.436039f);
                instancePath.cubicTo(51.710835f, 19.061909f, 46.324146f, 18.926945f, 42.757923f, 22.061974f);
                instancePath.lineTo(42.321907f, 22.470886f);
                instancePath.lineTo(41.522945f, 23.255825f);
                instancePath.lineTo(36.002728f, 28.525042f);
                instancePath.lineTo(30.838024f, 23.617325f);
                instancePath.lineTo(29.62912f, 22.436039f);
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
