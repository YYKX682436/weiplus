package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_webview_custom_menu_pdd_index extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.0f, 3.18712f);
        instancePath.cubicTo(11.6834f, 3.18712f, 11.3679f, 3.29372f, 11.1092f, 3.50709f);
        instancePath.lineTo(3.36286f, 9.89618f);
        instancePath.cubicTo(3.23235f, 10.0038f, 3.15676f, 10.1642f, 3.15676f, 10.3333f);
        instancePath.cubicTo(3.15676f, 10.49f, 3.21953f, 10.6308f, 3.32273f, 10.734f);
        instancePath.cubicTo(3.42593f, 10.8372f, 3.56678f, 10.9f, 3.72342f, 10.9f);
        instancePath.lineTo(5.6f, 10.9f);
        instancePath.lineTo(5.6f, 19.5f);
        instancePath.cubicTo(5.6f, 19.8868f, 5.75605f, 20.236f, 6.01005f, 20.49f);
        instancePath.cubicTo(6.26406f, 20.744f, 6.61324f, 20.9f, 7.0f, 20.9f);
        instancePath.lineTo(17.0f, 20.9f);
        instancePath.cubicTo(17.3868f, 20.9f, 17.7359f, 20.744f, 17.99f, 20.49f);
        instancePath.cubicTo(18.244f, 20.236f, 18.4f, 19.8868f, 18.4f, 19.5f);
        instancePath.lineTo(18.4f, 10.9f);
        instancePath.lineTo(20.2766f, 10.9f);
        instancePath.cubicTo(20.4458f, 10.9f, 20.6061f, 10.8244f, 20.7137f, 10.6939f);
        instancePath.cubicTo(20.8134f, 10.5731f, 20.8546f, 10.4245f, 20.8407f, 10.2792f);
        instancePath.cubicTo(20.8267f, 10.1339f, 20.758f, 9.99585f, 20.6371f, 9.89618f);
        instancePath.lineTo(12.8908f, 3.50709f);
        instancePath.cubicTo(12.6321f, 3.29372f, 12.3166f, 3.18712f, 12.0f, 3.18712f);
        instancePath.close();
        instancePath.moveTo(10.3457f, 2.58134f);
        instancePath.cubicTo(10.8259f, 2.18525f, 11.4135f, 1.98712f, 12.0f, 1.98712f);
        instancePath.cubicTo(12.5865f, 1.98712f, 13.1741f, 2.18525f, 13.6543f, 2.58134f);
        instancePath.lineTo(21.4007f, 8.97044f);
        instancePath.cubicTo(21.7769f, 9.28075f, 21.992f, 9.71535f, 22.0352f, 10.1645f);
        instancePath.cubicTo(22.0783f, 10.6136f, 21.9498f, 11.0812f, 21.6395f, 11.4574f);
        instancePath.cubicTo(21.3039f, 11.8643f, 20.804f, 12.1f, 20.2766f, 12.1f);
        instancePath.lineTo(19.6f, 12.1f);
        instancePath.lineTo(19.6f, 19.5f);
        instancePath.cubicTo(19.6f, 20.2178f, 19.3083f, 20.8686f, 18.8385f, 21.3385f);
        instancePath.cubicTo(18.3686f, 21.8083f, 17.7178f, 22.1f, 17.0f, 22.1f);
        instancePath.lineTo(7.0f, 22.1f);
        instancePath.cubicTo(6.2822f, 22.1f, 5.63138f, 21.8083f, 5.16153f, 21.3385f);
        instancePath.cubicTo(4.69168f, 20.8686f, 4.4f, 20.2178f, 4.4f, 19.5f);
        instancePath.lineTo(4.4f, 12.1f);
        instancePath.lineTo(3.72342f, 12.1f);
        instancePath.cubicTo(3.23574f, 12.1f, 2.79325f, 11.9016f, 2.4742f, 11.5826f);
        instancePath.cubicTo(2.15515f, 11.2635f, 1.95676f, 10.821f, 1.95676f, 10.3333f);
        instancePath.cubicTo(1.95676f, 9.8059f, 2.19242f, 9.30604f, 2.59932f, 8.97044f);
        instancePath.lineTo(10.3457f, 2.58134f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.25f, 13.25f);
        instancePath2.cubicTo(13.25f, 12.5596f, 12.6904f, 12.0f, 12.0f, 12.0f);
        instancePath2.cubicTo(11.3096f, 12.0f, 10.75f, 12.5596f, 10.75f, 13.25f);
        instancePath2.lineTo(10.75f, 16.5833f);
        instancePath2.cubicTo(10.75f, 17.2737f, 11.3096f, 17.8333f, 12.0f, 17.8333f);
        instancePath2.cubicTo(12.6904f, 17.8333f, 13.25f, 17.2737f, 13.25f, 16.5833f);
        instancePath2.lineTo(13.25f, 13.25f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
