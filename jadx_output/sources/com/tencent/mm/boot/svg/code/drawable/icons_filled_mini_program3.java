package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mini_program3 extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.0f, 1.6666666f);
                instancePath.cubicTo(14.602373f, 1.6666666f, 18.333334f, 5.397627f, 18.333334f, 10.0f);
                instancePath.cubicTo(18.333334f, 14.602373f, 14.602373f, 18.333334f, 10.0f, 18.333334f);
                instancePath.cubicTo(5.397627f, 18.333334f, 1.6666666f, 14.602373f, 1.6666666f, 10.0f);
                instancePath.cubicTo(1.6666666f, 5.397627f, 5.397627f, 1.6666666f, 10.0f, 1.6666666f);
                instancePath.close();
                instancePath.moveTo(10.0f, 2.6666667f);
                instancePath.cubicTo(5.9499116f, 2.6666667f, 2.6666667f, 5.9499116f, 2.6666667f, 10.0f);
                instancePath.cubicTo(2.6666667f, 14.050088f, 5.9499116f, 17.333334f, 10.0f, 17.333334f);
                instancePath.cubicTo(14.050088f, 17.333334f, 17.333334f, 14.050088f, 17.333334f, 10.0f);
                instancePath.cubicTo(17.333334f, 5.9499116f, 14.050088f, 2.6666667f, 10.0f, 2.6666667f);
                instancePath.close();
                instancePath.moveTo(12.126263f, 5.75f);
                instancePath.cubicTo(13.564126f, 5.75f, 14.734848f, 6.799613f, 14.734848f, 8.106061f);
                instancePath.cubicTo(14.734848f, 9.263095f, 13.84426f, 10.22278f, 12.620338f, 10.4356365f);
                instancePath.lineTo(12.505051f, 10.436869f);
                instancePath.cubicTo(12.168754f, 10.436869f, 11.973833f, 10.200912f, 12.100172f, 9.916668f);
                instancePath.cubicTo(12.189519f, 9.708193f, 12.392883f, 9.543937f, 12.637012f, 9.4897f);
                instancePath.cubicTo(13.346996f, 9.318325f, 13.835858f, 8.760609f, 13.835858f, 8.106061f);
                instancePath.cubicTo(13.835858f, 7.3179913f, 13.088517f, 6.6742425f, 12.151515f, 6.6742425f);
                instancePath.cubicTo(11.214512f, 6.6742425f, 10.467172f, 7.3179913f, 10.467172f, 8.106061f);
                instancePath.lineTo(10.467172f, 11.893939f);
                instancePath.cubicTo(10.467172f, 13.200387f, 9.296449f, 14.25f, 7.8585854f, 14.25f);
                instancePath.cubicTo(6.420722f, 14.25f, 5.2499995f, 13.200387f, 5.2499995f, 11.893939f);
                instancePath.cubicTo(5.2499995f, 10.749266f, 6.155429f, 9.773588f, 7.3787875f, 9.588384f);
                instancePath.lineTo(7.479798f, 9.588384f);
                instancePath.cubicTo(7.7383895f, 9.588384f, 7.9166665f, 9.738512f, 7.9166665f, 9.949495f);
                instancePath.cubicTo(7.9167733f, 9.986204f, 7.916086f, 10.004064f, 7.912376f, 10.026326f);
                instancePath.cubicTo(7.9076443f, 10.054716f, 7.89836f, 10.081537f, 7.884676f, 10.108584f);
                instancePath.cubicTo(7.799879f, 10.306444f, 7.5798993f, 10.477539f, 7.347836f, 10.535552f);
                instancePath.cubicTo(6.641683f, 10.706003f, 6.1489897f, 11.26115f, 6.1489897f, 11.893939f);
                instancePath.cubicTo(6.1489897f, 12.682009f, 6.8963304f, 13.325758f, 7.833333f, 13.325758f);
                instancePath.cubicTo(8.770336f, 13.325758f, 9.517676f, 12.682009f, 9.517676f, 11.893939f);
                instancePath.lineTo(9.517676f, 8.106061f);
                instancePath.cubicTo(9.517676f, 6.799613f, 10.688399f, 5.75f, 12.126263f, 5.75f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(0.0f, 0.0f);
                instancePath2.lineTo(20.0f, 0.0f);
                instancePath2.lineTo(20.0f, 20.0f);
                instancePath2.lineTo(0.0f, 20.0f);
                instancePath2.lineTo(0.0f, 0.0f);
                instancePath2.close();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
