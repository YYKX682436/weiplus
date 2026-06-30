package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mini_shop_icon_white extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 12;
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
        instancePaint3.setColor(-1);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.71661f, 6.86407f);
        instancePath.cubicTo(2.55661f, 6.86407f, 2.39861f, 6.84807f, 2.24561f, 6.81607f);
        instancePath.cubicTo(1.34961f, 6.62707f, 0.724609f, 5.93907f, 0.724609f, 5.14207f);
        instancePath.cubicTo(0.724609f, 4.92907f, 0.768609f, 4.72207f, 0.855609f, 4.52607f);
        instancePath.cubicTo(0.857609f, 4.52207f, 0.858609f, 4.51807f, 0.859609f, 4.51607f);
        instancePath.lineTo(1.86361f, 2.26707f);
        instancePath.cubicTo(1.86761f, 2.25807f, 1.87161f, 2.24907f, 1.87661f, 2.24107f);
        instancePath.cubicTo(2.17861f, 1.59207f, 2.83261f, 1.17407f, 3.54961f, 1.17407f);
        instancePath.lineTo(8.44961f, 1.17407f);
        instancePath.cubicTo(9.17161f, 1.17407f, 9.82861f, 1.59807f, 10.1286f, 2.25507f);
        instancePath.cubicTo(10.1356f, 2.26907f, 10.1426f, 2.28407f, 10.1486f, 2.30007f);
        instancePath.lineTo(11.1406f, 4.51607f);
        instancePath.cubicTo(11.2296f, 4.71707f, 11.2746f, 4.92607f, 11.2746f, 5.14007f);
        instancePath.cubicTo(11.2746f, 5.93807f, 10.6486f, 6.62707f, 9.75261f, 6.81407f);
        instancePath.cubicTo(9.40061f, 6.88807f, 9.01261f, 6.87607f, 8.66461f, 6.77707f);
        instancePath.cubicTo(8.25661f, 6.66207f, 7.90761f, 6.43707f, 7.66361f, 6.14307f);
        instancePath.cubicTo(7.26461f, 6.56607f, 6.65461f, 6.82707f, 6.00061f, 6.82707f);
        instancePath.cubicTo(5.34661f, 6.82707f, 4.74061f, 6.56707f, 4.33961f, 6.14507f);
        instancePath.cubicTo(4.09561f, 6.44007f, 3.74561f, 6.66607f, 3.33261f, 6.78207f);
        instancePath.cubicTo(3.13561f, 6.83707f, 2.92861f, 6.86607f, 2.71761f, 6.86607f);
        instancePath.lineTo(2.71661f, 6.86407f);
        instancePath.close();
        instancePath.moveTo(1.54761f, 4.81607f);
        instancePath.cubicTo(1.54761f, 4.81607f, 1.54361f, 4.82407f, 1.54261f, 4.82707f);
        instancePath.cubicTo(1.49761f, 4.92707f, 1.47461f, 5.03307f, 1.47461f, 5.14207f);
        instancePath.cubicTo(1.47461f, 5.58107f, 1.85561f, 5.96707f, 2.39961f, 6.08207f);
        instancePath.cubicTo(2.63461f, 6.13107f, 2.89661f, 6.12307f, 3.12861f, 6.05807f);
        instancePath.cubicTo(3.51161f, 5.95107f, 3.81261f, 5.69407f, 3.91661f, 5.38807f);
        instancePath.cubicTo(3.92661f, 5.36107f, 3.93261f, 5.33707f, 3.93961f, 5.30907f);
        instancePath.cubicTo(3.97761f, 5.14307f, 4.12161f, 5.02407f, 4.29061f, 5.01707f);
        instancePath.cubicTo(4.46261f, 5.01107f, 4.61361f, 5.11907f, 4.66361f, 5.28107f);
        instancePath.cubicTo(4.66761f, 5.29307f, 4.67261f, 5.30407f, 4.67661f, 5.31607f);
        instancePath.lineTo(4.68261f, 5.33107f);
        instancePath.cubicTo(4.87861f, 5.77707f, 5.40661f, 6.07607f, 5.99961f, 6.07607f);
        instancePath.cubicTo(6.59261f, 6.07607f, 7.12461f, 5.77507f, 7.31761f, 5.32707f);
        instancePath.cubicTo(7.32761f, 5.30407f, 7.33461f, 5.28607f, 7.34061f, 5.26707f);
        instancePath.cubicTo(7.39561f, 5.10807f, 7.54961f, 5.00407f, 7.71761f, 5.01607f);
        instancePath.cubicTo(7.88561f, 5.02607f, 8.02561f, 5.14607f, 8.06161f, 5.31007f);
        instancePath.cubicTo(8.06761f, 5.33807f, 8.07461f, 5.36407f, 8.08261f, 5.38607f);
        instancePath.cubicTo(8.18961f, 5.69607f, 8.48361f, 5.94507f, 8.86861f, 6.05307f);
        instancePath.cubicTo(9.10161f, 6.11907f, 9.36361f, 6.12707f, 9.59861f, 6.07707f);
        instancePath.cubicTo(10.1446f, 5.96307f, 10.5246f, 5.57607f, 10.5246f, 5.13707f);
        instancePath.cubicTo(10.5246f, 5.02907f, 10.5016f, 4.92207f, 10.4556f, 4.81907f);
        instancePath.lineTo(9.46161f, 2.59907f);
        instancePath.cubicTo(9.46161f, 2.59907f, 9.45861f, 2.59307f, 9.45761f, 2.59007f);
        instancePath.cubicTo(9.45461f, 2.58407f, 9.45161f, 2.57807f, 9.44861f, 2.57207f);
        instancePath.cubicTo(9.27261f, 2.17807f, 8.88061f, 1.92407f, 8.44961f, 1.92407f);
        instancePath.lineTo(3.54961f, 1.92407f);
        instancePath.cubicTo(3.11761f, 1.92407f, 2.72561f, 2.17907f, 2.54961f, 2.57307f);
        instancePath.cubicTo(2.54561f, 2.58107f, 2.54261f, 2.58907f, 2.53861f, 2.59607f);
        instancePath.lineTo(1.54761f, 4.81707f);
        instancePath.lineTo(1.54761f, 4.81607f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.99944f, 10.8209f);
        instancePath2.cubicTo(3.92844f, 10.8209f, 2.21644f, 9.50387f, 2.10244f, 7.82287f);
        instancePath2.cubicTo(2.08844f, 7.61587f, 2.24444f, 7.43687f, 2.45144f, 7.42287f);
        instancePath2.cubicTo(2.65944f, 7.40887f, 2.83744f, 7.56487f, 2.85144f, 7.77187f);
        instancePath2.cubicTo(2.93844f, 9.06087f, 4.32144f, 10.0709f, 6.00044f, 10.0709f);
        instancePath2.cubicTo(7.67944f, 10.0709f, 9.06144f, 9.06087f, 9.14844f, 7.77187f);
        instancePath2.cubicTo(9.16244f, 7.56487f, 9.34044f, 7.40787f, 9.54844f, 7.42287f);
        instancePath2.cubicTo(9.75544f, 7.43687f, 9.91144f, 7.61587f, 9.89744f, 7.82287f);
        instancePath2.cubicTo(9.78344f, 9.50387f, 8.07144f, 10.8209f, 6.00044f, 10.8209f);
        instancePath2.lineTo(5.99944f, 10.8209f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
