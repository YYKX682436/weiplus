package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_outlined_promote_medium extends l95.c {
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
        instancePath.moveTo(7.78451f, 4.42771f);
        instancePath.lineTo(7.52706f, 4.17626f);
        instancePath.cubicTo(6.22531f, 2.87451f, 4.11476f, 2.87451f, 2.81302f, 4.17626f);
        instancePath.cubicTo(2.16612f, 4.82316f, 1.84069f, 5.6698f, 1.83671f, 6.51769f);
        instancePath.lineTo(2.83536f, 6.51769f);
        instancePath.cubicTo(2.84043f, 5.92639f, 3.06847f, 5.33502f, 3.52012f, 4.88337f);
        instancePath.cubicTo(4.43135f, 3.97215f, 5.90873f, 3.97215f, 6.81995f, 4.88337f);
        instancePath.lineTo(7.0858f, 5.14311f);
        instancePath.lineTo(8.00007f, 6.01188f);
        instancePath.lineTo(8.99717f, 5.06013f);
        instancePath.lineTo(9.17112f, 4.88918f);
        instancePath.lineTo(9.27147f, 4.79443f);
        instancePath.cubicTo(10.193f, 3.97331f, 11.5981f, 4.00469f, 12.4768f, 4.88337f);
        instancePath.lineTo(12.57f, 4.98206f);
        instancePath.cubicTo(13.3781f, 5.88858f, 13.3572f, 7.27622f, 12.5022f, 8.15741f);
        instancePath.lineTo(7.99667f, 12.6626f);
        instancePath.lineTo(6.11543f, 10.7802f);
        instancePath.lineTo(5.40916f, 11.4864f);
        instancePath.lineTo(7.52706f, 13.6044f);
        instancePath.lineTo(7.58987f, 13.6599f);
        instancePath.cubicTo(7.85141f, 13.8632f, 8.22956f, 13.8447f, 8.46985f, 13.6043f);
        instancePath.lineTo(13.2199f, 8.85377f);
        instancePath.cubicTo(14.4855f, 7.54937f, 14.4736f, 5.4659f, 13.1839f, 4.17626f);
        instancePath.cubicTo(11.8822f, 2.87451f, 9.77162f, 2.87451f, 8.46987f, 4.17626f);
        instancePath.lineTo(8.3067f, 4.33676f);
        instancePath.lineTo(7.99847f, 4.63098f);
        instancePath.lineTo(7.78451f, 4.42771f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.78448f, 8.60994f);
        instancePath2.lineTo(7.52702f, 8.86138f);
        instancePath2.cubicTo(6.22528f, 10.1631f, 4.11473f, 10.1631f, 2.81298f, 8.86138f);
        instancePath2.cubicTo(2.16608f, 8.21448f, 1.84065f, 7.36784f, 1.83667f, 6.51995f);
        instancePath2.lineTo(2.83533f, 6.51995f);
        instancePath2.cubicTo(2.84039f, 7.11126f, 3.06843f, 7.70262f, 3.52009f, 8.15428f);
        instancePath2.cubicTo(4.43131f, 9.0655f, 5.90869f, 9.0655f, 6.81992f, 8.15428f);
        instancePath2.lineTo(7.08576f, 7.89453f);
        instancePath2.lineTo(8.00004f, 7.02576f);
        instancePath2.lineTo(8.24518f, 8.15428f);
        instancePath2.lineTo(7.78448f, 8.60994f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(6.2666f, 6.88672f);
        instancePath3.lineTo(6.2666f, 7.82278f);
        instancePath3.lineTo(7.27681f, 7.82278f);
        instancePath3.lineTo(7.8476f, 8.38337f);
        instancePath3.lineTo(7.8476f, 9.42278f);
        instancePath3.lineTo(8.77861f, 9.42278f);
        instancePath3.lineTo(8.77861f, 7.35345f);
        instancePath3.cubicTo(8.77861f, 7.09579f, 8.56968f, 6.88672f, 8.31188f, 6.88672f);
        instancePath3.lineTo(6.2666f, 6.88672f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
