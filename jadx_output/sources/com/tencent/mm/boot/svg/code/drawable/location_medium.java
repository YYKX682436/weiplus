package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class location_medium extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePath.moveTo(12.0001f, 5.8501f);
                instancePath.cubicTo(9.70811f, 5.8501f, 7.8501f, 7.70812f, 7.8501f, 10.0001f);
                instancePath.cubicTo(7.8501f, 12.2921f, 9.70811f, 14.1501f, 12.0001f, 14.1501f);
                instancePath.cubicTo(14.2921f, 14.1501f, 16.1501f, 12.2921f, 16.1501f, 10.0001f);
                instancePath.cubicTo(16.1501f, 7.70812f, 14.2921f, 5.8501f, 12.0001f, 5.8501f);
                instancePath.close();
                instancePath.moveTo(9.3501f, 10.0001f);
                instancePath.cubicTo(9.3501f, 8.53654f, 10.5365f, 7.3501f, 12.0001f, 7.3501f);
                instancePath.cubicTo(13.4637f, 7.3501f, 14.6501f, 8.53654f, 14.6501f, 10.0001f);
                instancePath.cubicTo(14.6501f, 11.4637f, 13.4637f, 12.6501f, 12.0001f, 12.6501f);
                instancePath.cubicTo(10.5365f, 12.6501f, 9.3501f, 11.4637f, 9.3501f, 10.0001f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(12.8315f, 22.2522f);
                instancePath2.lineTo(12.3519f, 21.6757f);
                instancePath2.cubicTo(12.8315f, 22.2522f, 12.8315f, 22.2522f, 12.8315f, 22.2522f);
                instancePath2.lineTo(12.8324f, 22.2515f);
                instancePath2.lineTo(12.8339f, 22.2502f);
                instancePath2.lineTo(12.8389f, 22.2461f);
                instancePath2.lineTo(12.8562f, 22.2315f);
                instancePath2.cubicTo(12.8711f, 22.2189f, 12.8925f, 22.2007f, 12.9199f, 22.1772f);
                instancePath2.cubicTo(12.9747f, 22.1301f, 13.0537f, 22.0613f, 13.1536f, 21.9724f);
                instancePath2.cubicTo(13.3533f, 21.7945f, 13.6364f, 21.5356f, 13.9752f, 21.2071f);
                instancePath2.cubicTo(14.6518f, 20.5512f, 15.5553f, 19.6135f, 16.4606f, 18.4871f);
                instancePath2.cubicTo(18.2438f, 16.2683f, 20.1501f, 13.1763f, 20.1501f, 10.0001f);
                instancePath2.cubicTo(20.1501f, 7.74974f, 19.2371f, 5.71122f, 17.763f, 4.23718f);
                instancePath2.cubicTo(16.289f, 2.76314f, 14.2505f, 1.8501f, 12.0001f, 1.8501f);
                instancePath2.cubicTo(9.74974f, 1.8501f, 7.71122f, 2.76314f, 6.23718f, 4.23718f);
                instancePath2.cubicTo(4.76314f, 5.71122f, 3.8501f, 7.74974f, 3.8501f, 10.0001f);
                instancePath2.cubicTo(3.8501f, 13.1795f, 5.75825f, 16.2721f, 7.63896f, 18.5009f);
                instancePath2.cubicTo(8.5923f, 19.6308f, 9.56952f, 20.5752f, 10.3604f, 21.242f);
                instancePath2.cubicTo(10.7549f, 21.5747f, 11.1119f, 21.8457f, 11.4036f, 22.0382f);
                instancePath2.cubicTo(11.5482f, 22.1337f, 11.689f, 22.218f, 11.818f, 22.2815f);
                instancePath2.cubicTo(11.9098f, 22.3266f, 12.1175f, 22.4257f, 12.3519f, 22.4257f);
                instancePath2.lineTo(12.6231f, 22.4257f);
                instancePath2.lineTo(12.8315f, 22.2522f);
                instancePath2.close();
                instancePath2.moveTo(7.29784f, 5.29784f);
                instancePath2.cubicTo(8.50207f, 4.0936f, 10.1635f, 3.3501f, 12.0001f, 3.3501f);
                instancePath2.cubicTo(13.8367f, 3.3501f, 15.4981f, 4.0936f, 16.7024f, 5.29784f);
                instancePath2.cubicTo(17.9066f, 6.50207f, 18.6501f, 8.16354f, 18.6501f, 10.0001f);
                instancePath2.cubicTo(18.6501f, 12.6356f, 17.0322f, 15.3814f, 15.2914f, 17.5474f);
                instancePath2.cubicTo(14.4346f, 18.6134f, 13.576f, 19.505f, 12.9311f, 20.1301f);
                instancePath2.cubicTo(12.6496f, 20.403f, 12.4097f, 20.6243f, 12.2297f, 20.7862f);
                instancePath2.cubicTo(12.0012f, 20.6354f, 11.6923f, 20.403f, 11.3273f, 20.0952f);
                instancePath2.cubicTo(10.5988f, 19.481f, 9.68201f, 18.5962f, 8.78536f, 17.5336f);
                instancePath2.cubicTo(6.96607f, 15.3776f, 5.3501f, 12.6324f, 5.3501f, 10.0001f);
                instancePath2.cubicTo(5.3501f, 8.16354f, 6.0936f, 6.50207f, 7.29784f, 5.29784f);
                instancePath2.close();
                instancePath2.moveTo(12.5056f, 20.9474f);
                instancePath2.cubicTo(12.5141f, 20.9501f, 12.5189f, 20.9524f, 12.5189f, 20.9524f);
                instancePath2.cubicTo(12.5189f, 20.9524f, 12.5148f, 20.9513f, 12.5056f, 20.9474f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
