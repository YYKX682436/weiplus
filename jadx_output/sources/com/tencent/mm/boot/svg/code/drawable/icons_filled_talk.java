package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_talk extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(41.938095f, 43.703377f);
                instancePath.lineTo(36.0f, 45.68274f);
                instancePath.lineTo(34.256554f, 56.14341f);
                instancePath.cubicTo(33.711784f, 59.412033f, 30.620419f, 61.62015f, 27.351797f, 61.07538f);
                instancePath.cubicTo(26.878267f, 60.99646f, 26.415922f, 60.860992f, 25.974676f, 60.671886f);
                instancePath.lineTo(13.818242f, 55.461987f);
                instancePath.cubicTo(12.715191f, 54.98925f, 12.0f, 53.904636f, 12.0f, 52.70455f);
                instancePath.lineTo(12.0f, 17.536842f);
                instancePath.cubicTo(12.0f, 16.400526f, 12.642007f, 15.361736f, 13.65836f, 14.85356f);
                instancePath.lineTo(24.250582f, 9.557449f);
                instancePath.cubicTo(27.214453f, 8.075514f, 30.818491f, 9.27686f, 32.300426f, 12.240731f);
                instancePath.cubicTo(32.36202f, 12.363917f, 32.419353f, 12.489188f, 32.472324f, 12.616321f);
                instancePath.lineTo(43.75864f, 39.70348f);
                instancePath.cubicTo(44.395893f, 41.232883f, 43.67266f, 42.989304f, 42.143257f, 43.626556f);
                instancePath.cubicTo(42.07583f, 43.65465f, 42.007393f, 43.680275f, 41.938095f, 43.703377f);
                instancePath.close();
                instancePath.moveTo(53.000713f, 53.000713f);
                instancePath.cubicTo(56.720272f, 49.28116f, 58.8f, 44.287937f, 58.8f, 39.0f);
                instancePath.cubicTo(58.8f, 33.712063f, 56.720272f, 28.718843f, 53.000713f, 24.999287f);
                instancePath.lineTo(52.57645f, 24.575022f);
                instancePath.lineTo(55.970562f, 21.180908f);
                instancePath.lineTo(56.394825f, 21.605173f);
                instancePath.cubicTo(60.978058f, 26.188404f, 63.6f, 32.38737f, 63.6f, 39.0f);
                instancePath.cubicTo(63.6f, 45.61263f, 60.978058f, 51.811596f, 56.394825f, 56.394825f);
                instancePath.lineTo(55.970562f, 56.81909f);
                instancePath.lineTo(52.57645f, 53.42498f);
                instancePath.lineTo(53.000713f, 53.000713f);
                instancePath.close();
                instancePath.moveTo(47.061016f, 47.061016f);
                instancePath.cubicTo(49.203735f, 44.9183f, 50.4f, 42.046177f, 50.4f, 39.0f);
                instancePath.cubicTo(50.4f, 35.953823f, 49.203735f, 33.0817f, 47.061016f, 30.938982f);
                instancePath.lineTo(46.636753f, 30.514719f);
                instancePath.lineTo(50.030865f, 27.120605f);
                instancePath.lineTo(50.45513f, 27.54487f);
                instancePath.cubicTo(53.47322f, 30.562963f, 55.2f, 34.645523f, 55.2f, 39.0f);
                instancePath.cubicTo(55.2f, 43.354477f, 53.47322f, 47.43704f, 50.45513f, 50.45513f);
                instancePath.lineTo(50.030865f, 50.879395f);
                instancePath.lineTo(46.636753f, 47.485283f);
                instancePath.lineTo(47.061016f, 47.061016f);
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
