package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sign_unread_regular extends l95.c {
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
                instancePaint3.setColor(-436207616);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.35352f, 15.8945f);
                instancePath.cubicTo(3.35352f, 16.7018f, 3.41536f, 17.4229f, 3.53906f, 18.0576f);
                instancePath.cubicTo(3.66276f, 18.6924f, 3.95573f, 19.2344f, 4.41797f, 19.6836f);
                instancePath.cubicTo(4.86719f, 20.1328f, 5.40918f, 20.4242f, 6.04395f, 20.5576f);
                instancePath.cubicTo(6.67871f, 20.6911f, 7.39974f, 20.7578f, 8.20703f, 20.7578f);
                instancePath.lineTo(15.375f, 20.7578f);
                instancePath.cubicTo(16.1823f, 20.7578f, 16.9033f, 20.6911f, 17.5381f, 20.5576f);
                instancePath.cubicTo(18.1729f, 20.4242f, 18.7181f, 20.1328f, 19.1738f, 19.6836f);
                instancePath.cubicTo(19.623f, 19.2279f, 19.9111f, 18.6842f, 20.0381f, 18.0527f);
                instancePath.cubicTo(20.165f, 17.4212f, 20.2285f, 16.7018f, 20.2285f, 15.8945f);
                instancePath.lineTo(20.2285f, 9.49805f);
                instancePath.cubicTo(20.0527f, 9.55664f, 19.8688f, 9.59896f, 19.6768f, 9.625f);
                instancePath.cubicTo(19.4847f, 9.65104f, 19.291f, 9.65755f, 19.0957f, 9.64453f);
                instancePath.cubicTo(19.0566f, 9.65104f, 19.0208f, 9.65755f, 18.9883f, 9.66406f);
                instancePath.cubicTo(18.9557f, 9.67057f, 18.9199f, 9.67383f, 18.8809f, 9.67383f);
                instancePath.lineTo(18.8809f, 16.1484f);
                instancePath.cubicTo(18.8809f, 16.6497f, 18.8337f, 17.1299f, 18.7393f, 17.5889f);
                instancePath.cubicTo(18.6449f, 18.0479f, 18.4609f, 18.4173f, 18.1875f, 18.6973f);
                instancePath.cubicTo(17.9076f, 18.9772f, 17.5365f, 19.1644f, 17.0742f, 19.2588f);
                instancePath.cubicTo(16.612f, 19.3532f, 16.1302f, 19.4004f, 15.6289f, 19.4004f);
                instancePath.lineTo(7.96289f, 19.4004f);
                instancePath.cubicTo(7.45508f, 19.4004f, 6.97168f, 19.3532f, 6.5127f, 19.2588f);
                instancePath.cubicTo(6.05371f, 19.1644f, 5.68424f, 18.9772f, 5.4043f, 18.6973f);
                instancePath.cubicTo(5.12435f, 18.4173f, 4.9388f, 18.0479f, 4.84766f, 17.5889f);
                instancePath.cubicTo(4.75651f, 17.1299f, 4.71094f, 16.6497f, 4.71094f, 16.1484f);
                instancePath.lineTo(4.71094f, 8.58008f);
                instancePath.cubicTo(4.71094f, 8.06576f, 4.75488f, 7.57747f, 4.84277f, 7.11523f);
                instancePath.cubicTo(4.93066f, 6.65299f, 5.11784f, 6.2819f, 5.4043f, 6.00195f);
                instancePath.cubicTo(5.68424f, 5.72201f, 6.05697f, 5.5332f, 6.52246f, 5.43555f);
                instancePath.cubicTo(6.98796f, 5.33789f, 7.47786f, 5.28906f, 7.99219f, 5.28906f);
                instancePath.lineTo(14.4961f, 5.28906f);
                instancePath.cubicTo(14.4961f, 5.25651f, 14.4977f, 5.22233f, 14.501f, 5.18652f);
                instancePath.cubicTo(14.5042f, 5.15072f, 14.5124f, 5.11328f, 14.5254f, 5.07422f);
                instancePath.cubicTo(14.5124f, 4.87891f, 14.5189f, 4.68522f, 14.5449f, 4.49316f);
                instancePath.cubicTo(14.571f, 4.30111f, 14.61f, 4.11719f, 14.6621f, 3.94141f);
                instancePath.lineTo(8.16797f, 3.94141f);
                instancePath.cubicTo(7.38021f, 3.94141f, 6.67057f, 4.00814f, 6.03906f, 4.1416f);
                instancePath.cubicTo(5.40755f, 4.27507f, 4.86719f, 4.56641f, 4.41797f, 5.01562f);
                instancePath.cubicTo(3.96875f, 5.47135f, 3.67904f, 6.01335f, 3.54883f, 6.6416f);
                instancePath.cubicTo(3.41862f, 7.26986f, 3.35352f, 7.97461f, 3.35352f, 8.75586f);
                instancePath.lineTo(3.35352f, 15.8945f);
                instancePath.close();
                instancePath.moveTo(18.8223f, 8.50195f);
                instancePath.cubicTo(19.3952f, 8.50195f, 19.9193f, 8.36035f, 20.3945f, 8.07715f);
                instancePath.cubicTo(20.8698f, 7.79395f, 21.249f, 7.41471f, 21.5322f, 6.93945f);
                instancePath.cubicTo(21.8154f, 6.46419f, 21.957f, 5.93685f, 21.957f, 5.35742f);
                instancePath.cubicTo(21.957f, 4.78451f, 21.8154f, 4.26042f, 21.5322f, 3.78516f);
                instancePath.cubicTo(21.249f, 3.3099f, 20.8698f, 2.93066f, 20.3945f, 2.64746f);
                instancePath.cubicTo(19.9193f, 2.36426f, 19.3952f, 2.22266f, 18.8223f, 2.22266f);
                instancePath.cubicTo(18.2428f, 2.22266f, 17.7155f, 2.36426f, 17.2402f, 2.64746f);
                instancePath.cubicTo(16.765f, 2.93066f, 16.3857f, 3.3099f, 16.1025f, 3.78516f);
                instancePath.cubicTo(15.8193f, 4.26042f, 15.6777f, 4.78451f, 15.6777f, 5.35742f);
                instancePath.cubicTo(15.6777f, 5.93685f, 15.8193f, 6.46419f, 16.1025f, 6.93945f);
                instancePath.cubicTo(16.3857f, 7.41471f, 16.765f, 7.79395f, 17.2402f, 8.07715f);
                instancePath.cubicTo(17.7155f, 8.36035f, 18.2428f, 8.50195f, 18.8223f, 8.50195f);
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
