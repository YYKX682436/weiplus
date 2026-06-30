package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_unmic extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.527894f, 0.0f, 1.0f, 7.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(20.23103f, 8.164366f);
            instancePath.lineTo(20.297962f, 8.0938f);
            instancePath.cubicTo(20.307646f, 8.082565f, 20.318556f, 8.069564f, 20.332088f, 8.05325f);
            instancePath.cubicTo(20.389454f, 7.982036f, 20.44023f, 7.905081f, 20.48715f, 7.8230815f);
            instancePath.lineTo(20.563541f, 7.6782856f);
            instancePath.cubicTo(21.24576f, 6.2042356f, 21.000505f, 4.4837265f, 19.923157f, 3.2871835f);
            instancePath.lineTo(19.728563f, 3.085673f);
            instancePath.cubicTo(19.62838f, 2.9890015f, 19.520746f, 2.8948276f, 19.406267f, 2.8019001f);
            instancePath.lineTo(19.134733f, 2.5927136f);
            instancePath.lineTo(18.971924f, 2.4744697f);
            instancePath.cubicTo(16.360523f, 0.83257943f, 13.506758f, 1.4184027E-4f, 10.550111f, -2.9309888E-14f);
            instancePath.cubicTo(7.6919336f, -1.3711637E-4f, 4.8314257f, 0.76805276f, 2.3711886f, 2.2189596f);
            instancePath.lineTo(2.0052054f, 2.4417055f);
            instancePath.cubicTo(1.9394922f, 2.4778318f, 1.8231404f, 2.5622165f, 1.6891474f, 2.669822f);
            instancePath.lineTo(1.4790517f, 2.8455162f);
            instancePath.cubicTo(1.3715131f, 2.9389415f, 1.2633319f, 3.038387f, 1.1684289f, 3.13329f);
            instancePath.cubicTo(0.018984007f, 4.282735f, -0.30243534f, 5.9897118f, 0.293455f, 7.471324f);
            instancePath.lineTo(0.39396304f, 7.7015576f);
            instancePath.lineTo(0.4417898f, 7.798392f);
            instancePath.cubicTo(0.49369118f, 7.897172f, 0.55187345f, 7.987426f, 0.623686f, 8.07016f);
            instancePath.cubicTo(0.6581719f, 8.10989f, 0.6950621f, 8.146816f, 0.7350248f, 8.180632f);
            instancePath.cubicTo(1.1833949f, 8.573054f, 1.7970804f, 8.689403f, 2.3408508f, 8.468977f);
            instancePath.lineTo(5.37499f, 7.093953f);
            instancePath.cubicTo(5.5514073f, 7.006169f, 5.6697493f, 6.9061933f, 5.7572126f, 6.7659354f);
            instancePath.lineTo(5.797236f, 6.6980276f);
            instancePath.lineTo(5.8300524f, 6.624305f);
            instancePath.lineTo(6.0179677f, 6.1070313f);
            instancePath.lineTo(6.427961f, 4.9329853f);
            instancePath.lineTo(6.623103f, 4.4062576f);
            instancePath.cubicTo(6.672669f, 4.246407f, 6.7290287f, 4.1497855f, 6.816272f, 4.0625424f);
            instancePath.cubicTo(6.9030385f, 3.9757757f, 7.0067396f, 3.91994f, 7.1319394f, 3.8901362f);
            instancePath.cubicTo(8.313796f, 3.5846367f, 9.403701f, 3.430304f, 10.439208f, 3.4390554f);
            instancePath.cubicTo(11.478026f, 3.4391236f, 12.572776f, 3.596893f, 13.735821f, 3.8977327f);
            instancePath.cubicTo(13.864459f, 3.9284663f, 13.980065f, 3.9913955f, 14.06129f, 4.0726194f);
            instancePath.cubicTo(14.142986f, 4.1543164f, 14.206742f, 4.2625465f, 14.241527f, 4.3784785f);
            instancePath.lineTo(14.390891f, 4.731164f);
            instancePath.lineTo(14.686146f, 5.4604845f);
            instancePath.cubicTo(14.829515f, 5.825132f, 14.963401f, 6.181762f, 15.0738535f, 6.4943905f);
            instancePath.cubicTo(15.157607f, 6.7817426f, 15.287243f, 6.966929f, 15.576158f, 7.101767f);
            instancePath.lineTo(18.596296f, 8.471175f);
            instancePath.cubicTo(19.166029f, 8.702629f, 19.786522f, 8.580193f, 20.23103f, 8.164366f);
            instancePath.close();
            instancePath.moveTo(18.002157f, 3.0954547f);
            instancePath.lineTo(18.385036f, 3.3284464f);
            instancePath.lineTo(18.602386f, 3.4893f);
            instancePath.cubicTo(18.703577f, 3.5661232f, 18.7983f, 3.642627f, 18.884876f, 3.7185504f);
            instancePath.lineTo(19.044588f, 3.867481f);
            instancePath.cubicTo(19.932865f, 4.7557583f, 20.153738f, 6.094713f, 19.629116f, 7.2286673f);
            instancePath.lineTo(19.58701f, 7.3080096f);
            instancePath.lineTo(19.520178f, 7.409729f);
            instancePath.lineTo(19.454805f, 7.461806f);
            instancePath.cubicTo(19.315134f, 7.558542f, 19.152355f, 7.577996f, 19.005264f, 7.5183587f);
            instancePath.lineTo(16.062426f, 6.1836057f);
            instancePath.lineTo(16.06025f, 6.1753144f);
            instancePath.cubicTo(15.822677f, 5.5006547f, 15.49897f, 4.6762857f, 15.213456f, 4.0220494f);
            instancePath.cubicTo(15.151372f, 3.8021586f, 14.999243f, 3.5439057f, 14.794623f, 3.339286f);
            instancePath.cubicTo(14.574773f, 3.119436f, 14.287681f, 2.963161f, 13.985804f, 2.8912718f);
            instancePath.cubicTo(12.752424f, 2.5721393f, 11.572108f, 2.402038f, 10.443615f, 2.401984f);
            instancePath.cubicTo(9.314752f, 2.3924253f, 8.136614f, 2.559252f, 6.882042f, 2.883654f);
            instancePath.cubicTo(6.584992f, 2.9542673f, 6.3096037f, 3.102544f, 6.082938f, 3.329209f);
            instancePath.cubicTo(5.8716135f, 3.5405338f, 5.7276044f, 3.7874205f, 5.642733f, 4.0703664f);
            instancePath.lineTo(5.5472126f, 4.320626f);
            instancePath.lineTo(4.8915524f, 6.1751204f);
            instancePath.lineTo(1.9319446f, 7.516134f);
            instancePath.cubicTo(1.8002442f, 7.569127f, 1.633961f, 7.548739f, 1.4816529f, 7.447648f);
            instancePath.lineTo(1.4068882f, 7.3903437f);
            instancePath.lineTo(1.3772393f, 7.3471746f);
            instancePath.lineTo(1.3107885f, 7.2135615f);
            instancePath.cubicTo(0.79286164f, 6.0936956f, 1.0136023f, 4.754783f, 1.9017622f, 3.8666234f);
            instancePath.lineTo(1.9895285f, 3.7817051f);
            instancePath.lineTo(2.17898f, 3.611673f);
            instancePath.lineTo(2.3582697f, 3.462624f);
            instancePath.lineTo(2.4929323f, 3.3600502f);
            instancePath.lineTo(2.532758f, 3.334158f);
            instancePath.cubicTo(4.9298997f, 1.8299248f, 7.7421613f, 1.0369552f, 10.550061f, 1.03709f);
            instancePath.cubicTo(13.165078f, 1.0372154f, 15.692633f, 1.7343571f, 18.002157f, 3.0954547f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
