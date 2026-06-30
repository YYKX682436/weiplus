package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_activity_music2 extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 28;
        }
        if (i17 != 2) {
            return 0;
        }
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(28.0f, 0.0f);
        instancePath.lineTo(28.0f, 28.0f);
        instancePath.lineTo(0.0f, 28.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.381605f, 0.0f, 1.0f, 3.821266f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.0209f, 2.5954418f);
        instancePath2.cubicTo(18.030598f, 2.6427667f, 18.033382f, 2.691247f, 18.029173f, 2.739371f);
        instancePath2.lineTo(17.019957f, 14.274774f);
        instancePath2.cubicTo(16.90764f, 15.558535f, 15.775899f, 16.508179f, 14.492138f, 16.395864f);
        instancePath2.cubicTo(13.208377f, 16.28355f, 12.258733f, 15.151808f, 12.371047f, 13.868047f);
        instancePath2.cubicTo(12.478682f, 12.637776f, 13.522562f, 11.714359f, 14.739249f, 11.738396f);
        instancePath2.lineTo(14.898865f, 11.746956f);
        instancePath2.cubicTo(15.286044f, 11.783475f, 15.4913f, 11.668397f, 15.51463f, 11.401722f);
        instancePath2.lineTo(16.12098f, 4.4711175f);
        instancePath2.lineTo(8.369749f, 6.059096f);
        instancePath2.lineTo(7.518775f, 15.785774f);
        instancePath2.cubicTo(7.406461f, 17.069536f, 6.2747183f, 18.01918f, 4.9909573f, 17.906866f);
        instancePath2.cubicTo(3.7071967f, 17.794552f, 2.757552f, 16.66281f, 2.8698666f, 15.379048f);
        instancePath2.cubicTo(2.9775012f, 14.148777f, 4.0213814f, 13.22536f, 5.2380686f, 13.249396f);
        instancePath2.lineTo(5.397684f, 13.257957f);
        instancePath2.cubicTo(5.7848635f, 13.294476f, 5.990119f, 13.179398f, 6.0134497f, 12.912723f);
        instancePath2.lineTo(6.726393f, 4.763745f);
        instancePath2.cubicTo(6.7456713f, 4.543391f, 6.9074445f, 4.3618913f, 7.124139f, 4.317497f);
        instancePath2.lineTo(17.430723f, 2.2059672f);
        instancePath2.cubicTo(17.701246f, 2.1505446f, 17.965479f, 2.3249183f, 18.0209f, 2.5954418f);
        instancePath2.close();
        instancePath2.moveTo(3.7977285f, 0.0f);
        instancePath2.lineTo(3.9234502f, 1.2771603f);
        instancePath2.lineTo(2.6037674f, 1.4066441f);
        instancePath2.lineTo(3.2467964f, 5.459111f);
        instancePath2.cubicTo(3.3879106f, 6.3500705f, 2.780041f, 7.1867313f, 1.8890818f, 7.3278456f);
        instancePath2.cubicTo(0.99812263f, 7.4689593f, 0.16146195f, 6.8610897f, 0.020347882f, 5.970131f);
        instancePath2.cubicTo(-0.120766185f, 5.0791717f, 0.48710337f, 4.242511f, 1.3780626f, 4.1013966f);
        instancePath2.cubicTo(1.4970437f, 4.082552f, 1.6150566f, 4.0770645f, 1.7305739f, 4.083824f);
        instancePath2.lineTo(1.1659915f, 0.52507484f);
        instancePath2.cubicTo(1.1474781f, 0.40818515f, 1.2131902f, 0.2974015f, 1.318221f, 0.25453275f);
        instancePath2.lineTo(1.3884224f, 0.23716874f);
        instancePath2.lineTo(3.7977285f, 0.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
