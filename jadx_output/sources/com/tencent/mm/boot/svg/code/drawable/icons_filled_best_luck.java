package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_best_luck extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-469939);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.134f, 5.35831f);
                instancePath.cubicTo(11.6284f, 5.11063f, 11.9678f, 4.59927f, 11.9678f, 4.00863f);
                instancePath.cubicTo(11.9678f, 3.17544f, 11.2924f, 2.5f, 10.4592f, 2.5f);
                instancePath.cubicTo(9.626f, 2.5f, 8.95056f, 3.17544f, 8.95056f, 4.00863f);
                instancePath.cubicTo(8.95056f, 4.59929f, 9.29f, 5.11066f, 9.78445f, 5.35833f);
                instancePath.lineTo(7.9809f, 8.96543f);
                instancePath.cubicTo(7.70028f, 9.52668f, 6.97987f, 9.69675f, 6.47788f, 9.32025f);
                instancePath.lineTo(5.74132f, 8.76783f);
                instancePath.cubicTo(5.86357f, 8.54989f, 5.93328f, 8.29851f, 5.93328f, 8.03085f);
                instancePath.cubicTo(5.93328f, 7.19765f, 5.25784f, 6.52222f, 4.42465f, 6.52222f);
                instancePath.cubicTo(3.59145f, 6.52222f, 2.91602f, 7.19765f, 2.91602f, 8.03085f);
                instancePath.cubicTo(2.91602f, 8.86404f, 3.59145f, 9.53948f, 4.42465f, 9.53948f);
                instancePath.lineTo(4.44673f, 9.53932f);
                instancePath.cubicTo(5.16979f, 11.4421f, 5.93333f, 13.7777f, 5.93333f, 15.0721f);
                instancePath.cubicTo(5.93333f, 17.0836f, 14.9851f, 17.0836f, 14.9851f, 15.0721f);
                instancePath.cubicTo(14.9851f, 13.9734f, 15.3452f, 11.5243f, 15.8031f, 9.52792f);
                instancePath.cubicTo(15.8646f, 9.53555f, 15.9273f, 9.53948f, 15.9908f, 9.53948f);
                instancePath.cubicTo(16.824f, 9.53948f, 17.4994f, 8.86404f, 17.4994f, 8.03085f);
                instancePath.cubicTo(17.4994f, 7.19765f, 16.824f, 6.52222f, 15.9908f, 6.52222f);
                instancePath.cubicTo(15.1576f, 6.52222f, 14.4822f, 7.19765f, 14.4822f, 8.03085f);
                instancePath.cubicTo(14.4822f, 8.31884f, 14.5629f, 8.58799f, 14.7029f, 8.81691f);
                instancePath.lineTo(14.4632f, 9.05661f);
                instancePath.cubicTo(13.9778f, 9.54203f, 13.1594f, 9.40923f, 12.8524f, 8.79522f);
                instancePath.lineTo(11.134f, 5.35831f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-807101);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(10.4586f, 13.56347f);
                instancePath2.cubicTo(12.680452f, 13.56347f, 14.48162f, 14.238906f, 14.48162f, 15.0721f);
                instancePath2.cubicTo(14.48162f, 15.905293f, 12.680452f, 16.58073f, 10.4586f, 16.58073f);
                instancePath2.cubicTo(8.236748f, 16.58073f, 6.4355803f, 15.905293f, 6.4355803f, 15.0721f);
                instancePath2.cubicTo(6.4355803f, 14.238906f, 8.236748f, 13.56347f, 10.4586f, 13.56347f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
