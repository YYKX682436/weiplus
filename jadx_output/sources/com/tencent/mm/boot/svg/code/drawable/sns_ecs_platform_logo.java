package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ecs_platform_logo extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(3.62241f, 9.05197f);
        instancePath.cubicTo(3.41574f, 9.05197f, 3.21174f, 9.03064f, 3.01574f, 8.9893f);
        instancePath.cubicTo(1.86774f, 8.74797f, 1.06641f, 7.8693f, 1.06641f, 6.85464f);
        instancePath.cubicTo(1.06641f, 6.58397f, 1.12241f, 6.3213f, 1.23307f, 6.0733f);
        instancePath.cubicTo(1.23441f, 6.06797f, 1.23707f, 6.06397f, 1.23841f, 6.0613f);
        instancePath.lineTo(2.57707f, 3.06264f);
        instancePath.cubicTo(2.58107f, 3.05197f, 2.58641f, 3.04264f, 2.59174f, 3.03197f);
        instancePath.cubicTo(2.97707f, 2.19997f, 3.81441f, 1.66397f, 4.73307f, 1.66397f);
        instancePath.lineTo(11.2664f, 1.66397f);
        instancePath.cubicTo(12.1904f, 1.66397f, 13.0317f, 2.20664f, 13.4144f, 3.04797f);
        instancePath.cubicTo(13.4237f, 3.0653f, 13.4317f, 3.08397f, 13.4397f, 3.10397f);
        instancePath.lineTo(14.7637f, 6.05997f);
        instancePath.cubicTo(14.8757f, 6.31464f, 14.9331f, 6.57997f, 14.9331f, 6.85064f);
        instancePath.cubicTo(14.9331f, 7.86664f, 14.1317f, 8.7453f, 12.9824f, 8.9853f);
        instancePath.cubicTo(12.5304f, 9.07997f, 12.0291f, 9.0653f, 11.5784f, 8.93864f);
        instancePath.cubicTo(11.0117f, 8.77864f, 10.5357f, 8.45597f, 10.2224f, 8.03464f);
        instancePath.cubicTo(9.71174f, 8.6293f, 8.88907f, 9.00131f, 7.99974f, 9.00131f);
        instancePath.cubicTo(7.11041f, 9.00131f, 6.29174f, 8.63064f, 5.77974f, 8.0373f);
        instancePath.cubicTo(5.46774f, 8.45997f, 4.98774f, 8.78397f, 4.41574f, 8.9453f);
        instancePath.cubicTo(4.16107f, 9.0173f, 3.89441f, 9.0533f, 3.62241f, 9.0533f);
        instancePath.lineTo(3.62241f, 9.05197f);
        instancePath.close();
        instancePath.moveTo(1.97174f, 6.3813f);
        instancePath.cubicTo(1.97174f, 6.3813f, 1.96774f, 6.39197f, 1.96641f, 6.39464f);
        instancePath.cubicTo(1.90107f, 6.5413f, 1.86641f, 6.69597f, 1.86641f, 6.85597f);
        instancePath.cubicTo(1.86641f, 7.4893f, 2.40641f, 8.0453f, 3.17974f, 8.20797f);
        instancePath.cubicTo(3.50907f, 8.2773f, 3.87441f, 8.26664f, 4.19841f, 8.17464f);
        instancePath.cubicTo(4.74774f, 8.01997f, 5.16641f, 7.66264f, 5.31707f, 7.2173f);
        instancePath.cubicTo(5.33041f, 7.17864f, 5.34107f, 7.14397f, 5.35041f, 7.1013f);
        instancePath.cubicTo(5.39041f, 6.9253f, 5.54374f, 6.7973f, 5.72507f, 6.79064f);
        instancePath.cubicTo(5.90241f, 6.7853f, 6.06907f, 6.89864f, 6.12241f, 7.07197f);
        instancePath.cubicTo(6.12774f, 7.09064f, 6.13574f, 7.10797f, 6.14241f, 7.12664f);
        instancePath.lineTo(6.15041f, 7.14797f);
        instancePath.cubicTo(6.42641f, 7.77864f, 7.16907f, 8.20264f, 7.99841f, 8.20264f);
        instancePath.cubicTo(8.82774f, 8.20264f, 9.57441f, 7.7773f, 9.84774f, 7.14397f);
        instancePath.cubicTo(9.86241f, 7.11197f, 9.87174f, 7.0853f, 9.88107f, 7.0573f);
        instancePath.cubicTo(9.93974f, 6.88797f, 10.1051f, 6.78264f, 10.2824f, 6.7893f);
        instancePath.cubicTo(10.4611f, 6.79997f, 10.6117f, 6.92797f, 10.6491f, 7.10264f);
        instancePath.cubicTo(10.6584f, 7.14397f, 10.6691f, 7.18264f, 10.6797f, 7.21597f);
        instancePath.cubicTo(10.8331f, 7.65997f, 11.2504f, 8.01597f, 11.7944f, 8.1693f);
        instancePath.cubicTo(12.1211f, 8.2613f, 12.4891f, 8.27197f, 12.8157f, 8.20264f);
        instancePath.cubicTo(13.5904f, 8.0413f, 14.1304f, 7.4853f, 14.1304f, 6.85064f);
        instancePath.cubicTo(14.1304f, 6.69197f, 14.0971f, 6.53597f, 14.0304f, 6.3853f);
        instancePath.lineTo(12.7051f, 3.42397f);
        instancePath.cubicTo(12.7051f, 3.42397f, 12.7011f, 3.41464f, 12.6984f, 3.4093f);
        instancePath.cubicTo(12.6931f, 3.39864f, 12.6931f, 3.39864f, 12.6877f, 3.38797f);
        instancePath.cubicTo(12.4371f, 2.82664f, 11.8784f, 2.46397f, 11.2637f, 2.46397f);
        instancePath.lineTo(4.73041f, 2.46397f);
        instancePath.cubicTo(4.11574f, 2.46397f, 3.55574f, 2.82664f, 3.30507f, 3.3893f);
        instancePath.cubicTo(3.30107f, 3.39864f, 3.29574f, 3.40797f, 3.29174f, 3.4173f);
        instancePath.lineTo(1.96907f, 6.38264f);
        instancePath.lineTo(1.97174f, 6.3813f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.0012f, 14.328f);
        instancePath2.cubicTo(5.29186f, 14.328f, 3.0532f, 12.6134f, 2.9052f, 10.424f);
        instancePath2.cubicTo(2.89053f, 10.204f, 3.0572f, 10.0134f, 3.2772f, 9.99736f);
        instancePath2.cubicTo(3.49853f, 9.98136f, 3.68786f, 10.1494f, 3.70386f, 10.3694f);
        instancePath2.cubicTo(3.82386f, 12.14f, 5.71186f, 13.528f, 8.0012f, 13.528f);
        instancePath2.cubicTo(10.2905f, 13.528f, 12.1785f, 12.1414f, 12.2985f, 10.3694f);
        instancePath2.cubicTo(12.3132f, 10.1494f, 12.5025f, 9.9827f, 12.7252f, 9.99736f);
        instancePath2.cubicTo(12.9452f, 10.012f, 13.1119f, 10.2027f, 13.0972f, 10.424f);
        instancePath2.cubicTo(12.9492f, 12.6134f, 10.7105f, 14.328f, 8.0012f, 14.328f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
