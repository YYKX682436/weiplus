package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_item_biz_qq_music_watermark extends l95.c {
    private final int width = 39;
    private final int height = 39;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 39;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
                float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
                canvas.saveLayerAlpha(null, 128, 31);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-4210753);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -267.0f, 0.0f, 1.0f, -942.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(290.74658f, 962.3673f);
                instancePath.lineTo(281.66696f, 950.38226f);
                instancePath.cubicTo(281.66696f, 950.38226f, 280.0749f, 947.686f, 281.897f, 946.12305f);
                instancePath.cubicTo(285.0006f, 943.46094f, 288.86172f, 945.6186f, 292.41647f, 942.0f);
                instancePath.cubicTo(293.6008f, 943.90704f, 293.0603f, 947.8834f, 290.84427f, 948.8545f);
                instancePath.cubicTo(288.6282f, 949.82556f, 285.94733f, 949.9153f, 285.94733f, 949.9153f);
                instancePath.lineTo(295.2846f, 966.53125f);
                instancePath.lineTo(295.0269f, 966.30566f);
                instancePath.cubicTo(295.32394f, 967.01917f, 295.48572f, 967.7877f, 295.48572f, 968.5886f);
                instancePath.cubicTo(295.48572f, 972.3405f, 291.93597f, 975.38196f, 287.55713f, 975.38196f);
                instancePath.cubicTo(283.1783f, 975.38196f, 279.62857f, 972.3405f, 279.62857f, 968.5886f);
                instancePath.cubicTo(279.62857f, 964.8368f, 283.1783f, 961.7953f, 287.55713f, 961.7953f);
                instancePath.cubicTo(288.6917f, 961.7953f, 289.77066f, 961.9995f, 290.74658f, 962.3673f);
                instancePath.close();
                instancePath.moveTo(278.57144f, 946.18054f);
                instancePath.lineTo(278.57144f, 948.52997f);
                instancePath.cubicTo(273.52835f, 951.2919f, 270.1143f, 956.6069f, 270.1143f, 962.7102f);
                instancePath.cubicTo(270.1143f, 971.657f, 277.4504f, 978.9097f, 286.5f, 978.9097f);
                instancePath.cubicTo(295.5496f, 978.9097f, 302.8857f, 971.657f, 302.8857f, 962.7102f);
                instancePath.cubicTo(302.8857f, 957.0437f, 299.94287f, 952.0567f, 295.48572f, 949.1616f);
                instancePath.lineTo(295.48572f, 946.719f);
                instancePath.cubicTo(301.1608f, 949.8425f, 305.0f, 955.8331f, 305.0f, 962.7102f);
                instancePath.cubicTo(305.0f, 972.8114f, 296.71725f, 981.0f, 286.5f, 981.0f);
                instancePath.cubicTo(276.28275f, 981.0f, 268.0f, 972.8114f, 268.0f, 962.7102f);
                instancePath.cubicTo(268.0f, 955.4142f, 272.3212f, 949.11597f, 278.57144f, 946.18054f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
