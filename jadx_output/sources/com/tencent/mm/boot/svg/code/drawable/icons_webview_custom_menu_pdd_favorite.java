package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_webview_custom_menu_pdd_favorite extends l95.c {
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
        instancePath.moveTo(8.58033f, 5.64996f);
        instancePath.cubicTo(9.01804f, 4.17546f, 10.3834f, 3.09996f, 12.0f, 3.09996f);
        instancePath.cubicTo(13.6166f, 3.09996f, 14.982f, 4.17546f, 15.4197f, 5.64996f);
        instancePath.lineTo(8.58033f, 5.64996f);
        instancePath.close();
        instancePath.moveTo(7.34199f, 5.64996f);
        instancePath.cubicTo(7.8078f, 3.50586f, 9.71636f, 1.89996f, 12.0f, 1.89996f);
        instancePath.cubicTo(14.2836f, 1.89996f, 16.1922f, 3.50586f, 16.658f, 5.64996f);
        instancePath.lineTo(18.6667f, 5.64996f);
        instancePath.cubicTo(19.3845f, 5.64996f, 20.0353f, 5.94164f, 20.5051f, 6.41149f);
        instancePath.cubicTo(20.975f, 6.88134f, 21.2667f, 7.53216f, 21.2667f, 8.24996f);
        instancePath.lineTo(21.2667f, 19.5f);
        instancePath.cubicTo(21.2667f, 20.2178f, 20.975f, 20.8686f, 20.5051f, 21.3384f);
        instancePath.cubicTo(20.0353f, 21.8083f, 19.3845f, 22.1f, 18.6667f, 22.1f);
        instancePath.lineTo(5.33334f, 22.1f);
        instancePath.cubicTo(4.61553f, 22.1f, 3.96471f, 21.8083f, 3.49486f, 21.3384f);
        instancePath.cubicTo(3.02501f, 20.8686f, 2.73334f, 20.2178f, 2.73334f, 19.5f);
        instancePath.lineTo(2.73334f, 8.24996f);
        instancePath.cubicTo(2.73334f, 7.53216f, 3.02501f, 6.88134f, 3.49486f, 6.41149f);
        instancePath.cubicTo(3.96471f, 5.94164f, 4.61553f, 5.64996f, 5.33334f, 5.64996f);
        instancePath.lineTo(7.34199f, 5.64996f);
        instancePath.close();
        instancePath.moveTo(4.34339f, 7.26001f);
        instancePath.cubicTo(4.5974f, 7.00601f, 4.94657f, 6.84996f, 5.33334f, 6.84996f);
        instancePath.lineTo(18.6667f, 6.84996f);
        instancePath.cubicTo(19.0534f, 6.84996f, 19.4026f, 7.00601f, 19.6566f, 7.26001f);
        instancePath.cubicTo(19.9106f, 7.51402f, 20.0667f, 7.8632f, 20.0667f, 8.24996f);
        instancePath.lineTo(20.0667f, 19.5f);
        instancePath.cubicTo(20.0667f, 19.8867f, 19.9106f, 20.2359f, 19.6566f, 20.4899f);
        instancePath.cubicTo(19.4026f, 20.7439f, 19.0534f, 20.9f, 18.6667f, 20.9f);
        instancePath.lineTo(5.33334f, 20.9f);
        instancePath.cubicTo(4.94657f, 20.9f, 4.5974f, 20.7439f, 4.34339f, 20.4899f);
        instancePath.cubicTo(4.08938f, 20.2359f, 3.93334f, 19.8867f, 3.93334f, 19.5f);
        instancePath.lineTo(3.93334f, 8.24996f);
        instancePath.cubicTo(3.93334f, 7.8632f, 4.08938f, 7.51402f, 4.34339f, 7.26001f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.3592f, 12.0296f);
        instancePath2.cubicTo(15.0101f, 12.6804f, 15.0101f, 13.7357f, 14.3592f, 14.3866f);
        instancePath2.lineTo(12.5915f, 16.1544f);
        instancePath2.cubicTo(12.266f, 16.4798f, 11.7384f, 16.4798f, 11.4129f, 16.1544f);
        instancePath2.lineTo(9.64517f, 14.3866f);
        instancePath2.lineTo(9.56045f, 14.2954f);
        instancePath2.cubicTo(8.99565f, 13.6406f, 9.02389f, 12.6509f, 9.64517f, 12.0296f);
        instancePath2.cubicTo(10.296f, 11.3787f, 11.3513f, 11.3787f, 12.0022f, 12.0296f);
        instancePath2.lineTo(12.0934f, 11.9448f);
        instancePath2.cubicTo(12.7482f, 11.38f, 13.7379f, 11.4083f, 14.3592f, 12.0296f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
