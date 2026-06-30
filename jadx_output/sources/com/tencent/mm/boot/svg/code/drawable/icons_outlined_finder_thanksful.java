package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_finder_thanksful extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.69269f, 9.96612f);
                instancePath.cubicTo(2.83411f, 9.79641f, 3.08634f, 9.77349f, 3.25605f, 9.91491f);
                instancePath.lineTo(6.58938f, 12.6928f);
                instancePath.cubicTo(6.75909f, 12.8342f, 6.78202f, 13.0864f, 6.64059f, 13.2561f);
                instancePath.cubicTo(6.49916f, 13.4258f, 6.24693f, 13.4488f, 6.07723f, 13.3073f);
                instancePath.lineTo(2.74389f, 10.5295f);
                instancePath.cubicTo(2.57418f, 10.3881f, 2.55126f, 10.1358f, 2.69269f, 9.96612f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(13.3072f, 9.96612f);
                instancePath2.cubicTo(13.4487f, 10.1358f, 13.4257f, 10.3881f, 13.256f, 10.5295f);
                instancePath2.lineTo(9.9227f, 13.3073f);
                instancePath2.cubicTo(9.753f, 13.4488f, 9.50077f, 13.4258f, 9.35934f, 13.2561f);
                instancePath2.cubicTo(9.21791f, 13.0864f, 9.24084f, 12.8342f, 9.41055f, 12.6928f);
                instancePath2.lineTo(12.7439f, 9.91491f);
                instancePath2.cubicTo(12.9136f, 9.77349f, 13.1658f, 9.79641f, 13.3072f, 9.96612f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(6.57033f, 4.25688f);
                instancePath3.cubicTo(6.7142f, 3.99249f, 6.94236f, 3.61954f, 7.21871f, 3.31808f);
                instancePath3.cubicTo(7.50832f, 3.00216f, 7.77741f, 2.8446f, 8.00001f, 2.8446f);
                instancePath3.cubicTo(8.22261f, 2.8446f, 8.4917f, 3.00216f, 8.78131f, 3.31808f);
                instancePath3.cubicTo(9.05766f, 3.61954f, 9.28582f, 3.99249f, 9.42969f, 4.25688f);
                instancePath3.cubicTo(9.62469f, 4.61525f, 10.0662f, 4.75612f, 10.43f, 4.59939f);
                instancePath3.cubicTo(10.6334f, 4.51172f, 10.897f, 4.41696f, 11.1465f, 4.37806f);
                instancePath3.cubicTo(11.4106f, 4.3369f, 11.5695f, 4.37178f, 11.6489f, 4.43132f);
                instancePath3.cubicTo(11.8298f, 4.56696f, 11.893f, 4.72948f, 11.8974f, 4.97827f);
                instancePath3.cubicTo(11.901f, 5.18026f, 11.8675f, 5.38571f, 11.8268f, 5.63539f);
                instancePath3.cubicTo(11.8086f, 5.74716f, 11.7889f, 5.8678f, 11.7705f, 6.00096f);
                instancePath3.cubicTo(11.5289f, 7.74586f, 10.9698f, 8.67434f, 10.3263f, 9.1785f);
                instancePath3.cubicTo(9.68135f, 9.68374f, 8.87948f, 9.82092f, 8.01598f, 9.82258f);
                instancePath3.cubicTo(8.01065f, 9.82237f, 8.00529f, 9.82227f, 7.9999f, 9.82227f);
                instancePath3.cubicTo(7.99452f, 9.82227f, 7.98916f, 9.82237f, 7.98382f, 9.82258f);
                instancePath3.cubicTo(7.12041f, 9.8209f, 6.31863f, 9.6837f, 5.67379f, 9.1785f);
                instancePath3.cubicTo(5.03028f, 8.67434f, 4.47118f, 7.74586f, 4.22956f, 6.00095f);
                instancePath3.cubicTo(4.21113f, 5.86782f, 4.19146f, 5.7472f, 4.17324f, 5.63544f);
                instancePath3.cubicTo(4.13252f, 5.38574f, 4.09902f, 5.18028f, 4.10259f, 4.97828f);
                instancePath3.cubicTo(4.10698f, 4.72949f, 4.17025f, 4.56696f, 4.35112f, 4.43132f);
                instancePath3.cubicTo(4.43051f, 4.37178f, 4.58945f, 4.3369f, 4.85347f, 4.37806f);
                instancePath3.cubicTo(5.10299f, 4.41696f, 5.36658f, 4.51172f, 5.57005f, 4.59939f);
                instancePath3.cubicTo(5.93381f, 4.75612f, 6.37533f, 4.61525f, 6.57033f, 4.25688f);
                instancePath3.close();
                instancePath3.moveTo(7.5999f, 10.6131f);
                instancePath3.cubicTo(6.77846f, 10.5721f, 5.91763f, 10.3858f, 5.18042f, 9.80825f);
                instancePath3.cubicTo(4.31699f, 9.1318f, 3.69554f, 7.97688f, 3.43712f, 6.11068f);
                instancePath3.cubicTo(3.42543f, 6.02624f, 3.41046f, 5.93435f, 3.39477f, 5.83807f);
                instancePath3.lineTo(3.39477f, 5.83806f);
                instancePath3.cubicTo(3.34929f, 5.55893f, 3.29779f, 5.24285f, 3.30271f, 4.96416f);
                instancePath3.cubicTo(3.31009f, 4.54572f, 3.43832f, 4.11591f, 3.87112f, 3.79131f);
                instancePath3.cubicTo(4.21367f, 3.53441f, 4.64618f, 3.53608f, 4.97671f, 3.58761f);
                instancePath3.cubicTo(5.31628f, 3.64055f, 5.6452f, 3.76133f, 5.87557f, 3.85995f);
                instancePath3.cubicTo(6.03349f, 3.57136f, 6.29471f, 3.14215f, 6.629f, 2.77749f);
                instancePath3.cubicTo(6.9557f, 2.42111f, 7.42668f, 2.0446f, 8.00001f, 2.0446f);
                instancePath3.cubicTo(8.57334f, 2.0446f, 9.04432f, 2.42111f, 9.37102f, 2.77749f);
                instancePath3.cubicTo(9.70531f, 3.14215f, 9.96653f, 3.57136f, 10.1244f, 3.85995f);
                instancePath3.cubicTo(10.3548f, 3.76133f, 10.6837f, 3.64055f, 11.0233f, 3.58761f);
                instancePath3.cubicTo(11.3538f, 3.53608f, 11.7863f, 3.53441f, 12.1289f, 3.79131f);
                instancePath3.cubicTo(12.5617f, 4.11591f, 12.6899f, 4.54572f, 12.6973f, 4.96416f);
                instancePath3.cubicTo(12.7022f, 5.24283f, 12.6507f, 5.55889f, 12.6053f, 5.83802f);
                instancePath3.lineTo(12.6052f, 5.83804f);
                instancePath3.cubicTo(12.5896f, 5.93433f, 12.5746f, 6.02623f, 12.5629f, 6.11067f);
                instancePath3.cubicTo(12.3045f, 7.97688f, 11.6831f, 9.1318f, 10.8196f, 9.80825f);
                instancePath3.cubicTo(10.0823f, 10.3859f, 9.22141f, 10.5721f, 8.3999f, 10.6131f);
                instancePath3.lineTo(8.3999f, 13.5557f);
                instancePath3.cubicTo(8.3999f, 13.7766f, 8.22081f, 13.9557f, 7.9999f, 13.9557f);
                instancePath3.cubicTo(7.77899f, 13.9557f, 7.5999f, 13.7766f, 7.5999f, 13.5557f);
                instancePath3.lineTo(7.5999f, 10.6131f);
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
