package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ecs_regular_colorful extends l95.c {
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
        instancePaint3.setColor(-40634);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.43398f, 13.578f);
        instancePath.cubicTo(5.12398f, 13.578f, 4.81798f, 13.546f, 4.52398f, 13.484f);
        instancePath.cubicTo(2.80198f, 13.122f, 1.59998f, 11.804f, 1.59998f, 10.282f);
        instancePath.cubicTo(1.59998f, 9.87597f, 1.68398f, 9.48197f, 1.84998f, 9.10997f);
        instancePath.cubicTo(1.85198f, 9.10197f, 1.85598f, 9.09597f, 1.85798f, 9.09197f);
        instancePath.lineTo(3.86598f, 4.59397f);
        instancePath.cubicTo(3.87198f, 4.57797f, 3.87998f, 4.56397f, 3.88798f, 4.54797f);
        instancePath.cubicTo(4.46598f, 3.29997f, 5.72198f, 2.49597f, 7.09998f, 2.49597f);
        instancePath.lineTo(16.9f, 2.49597f);
        instancePath.cubicTo(18.286f, 2.49597f, 19.548f, 3.30997f, 20.122f, 4.57197f);
        instancePath.cubicTo(20.136f, 4.59797f, 20.148f, 4.62597f, 20.16f, 4.65597f);
        instancePath.lineTo(22.146f, 9.08997f);
        instancePath.cubicTo(22.314f, 9.47197f, 22.4f, 9.86997f, 22.4f, 10.276f);
        instancePath.cubicTo(22.4f, 11.8f, 21.198f, 13.118f, 19.474f, 13.478f);
        instancePath.cubicTo(18.796f, 13.62f, 18.044f, 13.598f, 17.368f, 13.408f);
        instancePath.cubicTo(16.518f, 13.168f, 15.804f, 12.684f, 15.334f, 12.052f);
        instancePath.cubicTo(14.568f, 12.944f, 13.334f, 13.502f, 12.0f, 13.502f);
        instancePath.cubicTo(10.666f, 13.502f, 9.43797f, 12.946f, 8.66997f, 12.056f);
        instancePath.cubicTo(8.20197f, 12.69f, 7.48198f, 13.176f, 6.62398f, 13.418f);
        instancePath.cubicTo(6.24198f, 13.526f, 5.84198f, 13.58f, 5.43398f, 13.58f);
        instancePath.lineTo(5.43398f, 13.578f);
        instancePath.close();
        instancePath.moveTo(2.95798f, 9.57197f);
        instancePath.cubicTo(2.95798f, 9.57197f, 2.95198f, 9.58797f, 2.94998f, 9.59197f);
        instancePath.cubicTo(2.85198f, 9.81197f, 2.79998f, 10.044f, 2.79998f, 10.284f);
        instancePath.cubicTo(2.79998f, 11.234f, 3.60998f, 12.068f, 4.76998f, 12.312f);
        instancePath.cubicTo(5.26398f, 12.416f, 5.81198f, 12.4f, 6.29798f, 12.262f);
        instancePath.cubicTo(7.12198f, 12.03f, 7.74998f, 11.494f, 7.97598f, 10.826f);
        instancePath.cubicTo(7.99598f, 10.768f, 8.01198f, 10.716f, 8.02598f, 10.652f);
        instancePath.cubicTo(8.08598f, 10.388f, 8.31597f, 10.196f, 8.58798f, 10.186f);
        instancePath.cubicTo(8.85397f, 10.178f, 9.10397f, 10.348f, 9.18397f, 10.608f);
        instancePath.cubicTo(9.19197f, 10.636f, 9.20398f, 10.662f, 9.21397f, 10.69f);
        instancePath.lineTo(9.22598f, 10.722f);
        instancePath.cubicTo(9.63998f, 11.668f, 10.754f, 12.304f, 11.998f, 12.304f);
        instancePath.cubicTo(13.242f, 12.304f, 14.362f, 11.666f, 14.772f, 10.716f);
        instancePath.cubicTo(14.794f, 10.668f, 14.808f, 10.628f, 14.822f, 10.586f);
        instancePath.cubicTo(14.91f, 10.332f, 15.158f, 10.174f, 15.424f, 10.184f);
        instancePath.cubicTo(15.692f, 10.2f, 15.918f, 10.392f, 15.974f, 10.654f);
        instancePath.cubicTo(15.988f, 10.716f, 16.004f, 10.774f, 16.02f, 10.824f);
        instancePath.cubicTo(16.25f, 11.49f, 16.876f, 12.024f, 17.692f, 12.254f);
        instancePath.cubicTo(18.182f, 12.392f, 18.734f, 12.408f, 19.224f, 12.304f);
        instancePath.cubicTo(20.386f, 12.062f, 21.196f, 11.228f, 21.196f, 10.276f);
        instancePath.cubicTo(21.196f, 10.038f, 21.146f, 9.80397f, 21.046f, 9.57797f);
        instancePath.lineTo(19.058f, 5.13597f);
        instancePath.cubicTo(19.058f, 5.13597f, 19.052f, 5.12197f, 19.048f, 5.11397f);
        instancePath.cubicTo(19.04f, 5.09797f, 19.04f, 5.09797f, 19.032f, 5.08197f);
        instancePath.cubicTo(18.656f, 4.23997f, 17.818f, 3.69597f, 16.896f, 3.69597f);
        instancePath.lineTo(7.09598f, 3.69597f);
        instancePath.cubicTo(6.17397f, 3.69597f, 5.33398f, 4.23997f, 4.95798f, 5.08397f);
        instancePath.cubicTo(4.95198f, 5.09797f, 4.94398f, 5.11197f, 4.93798f, 5.12597f);
        instancePath.lineTo(2.95398f, 9.57397f);
        instancePath.lineTo(2.95798f, 9.57197f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-40634);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.0f, 21.492f);
        instancePath2.cubicTo(7.93596f, 21.492f, 4.57796f, 18.92f, 4.35596f, 15.636f);
        instancePath2.cubicTo(4.33396f, 15.306f, 4.58396f, 15.02f, 4.91396f, 14.996f);
        instancePath2.cubicTo(5.24596f, 14.972f, 5.52996f, 15.224f, 5.55396f, 15.554f);
        instancePath2.cubicTo(5.73396f, 18.21f, 8.56596f, 20.292f, 12.0f, 20.292f);
        instancePath2.cubicTo(15.434f, 20.292f, 18.266f, 18.212f, 18.446f, 15.554f);
        instancePath2.cubicTo(18.468f, 15.224f, 18.752f, 14.974f, 19.086f, 14.996f);
        instancePath2.cubicTo(19.416f, 15.018f, 19.666f, 15.304f, 19.644f, 15.636f);
        instancePath2.cubicTo(19.422f, 18.92f, 16.064f, 21.492f, 12.0f, 21.492f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
