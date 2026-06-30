package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_mini_window extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(58.5f, 9.0f);
        instancePath.cubicTo(60.15625f, 9.0f, 61.5f, 10.34375f, 61.5f, 12.0f);
        instancePath.lineTo(61.5f, 36.0f);
        instancePath.lineTo(57.898438f, 36.0f);
        instancePath.lineTo(57.898438f, 12.601562f);
        instancePath.lineTo(9.601562f, 12.601562f);
        instancePath.lineTo(9.601562f, 53.398438f);
        instancePath.lineTo(36.0f, 53.398438f);
        instancePath.lineTo(36.0f, 57.0f);
        instancePath.lineTo(9.0f, 57.0f);
        instancePath.cubicTo(7.34375f, 57.0f, 6.0f, 55.65625f, 6.0f, 54.0f);
        instancePath.lineTo(6.0f, 12.0f);
        instancePath.cubicTo(6.0f, 10.34375f, 7.34375f, 9.0f, 9.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(58.5f, 9.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(63.0f, 38.398438f);
        instancePath2.cubicTo(65.65234f, 38.398438f, 67.80078f, 40.55078f, 67.80078f, 43.19922f);
        instancePath2.lineTo(67.80078f, 60.0f);
        instancePath2.cubicTo(67.80078f, 62.652344f, 65.65234f, 64.80078f, 63.0f, 64.80078f);
        instancePath2.lineTo(43.19922f, 64.80078f);
        instancePath2.cubicTo(40.55078f, 64.80078f, 38.398438f, 62.652344f, 38.398438f, 60.0f);
        instancePath2.lineTo(38.398438f, 43.19922f);
        instancePath2.cubicTo(38.398438f, 40.55078f, 40.55078f, 38.398438f, 43.19922f, 38.398438f);
        instancePath2.close();
        instancePath2.moveTo(63.0f, 42.0f);
        instancePath2.lineTo(43.19922f, 42.0f);
        instancePath2.cubicTo(42.539062f, 42.0f, 42.0f, 42.539062f, 42.0f, 43.19922f);
        instancePath2.lineTo(42.0f, 60.0f);
        instancePath2.cubicTo(42.0f, 60.664062f, 42.539062f, 61.19922f, 43.19922f, 61.19922f);
        instancePath2.lineTo(63.0f, 61.19922f);
        instancePath2.cubicTo(63.664062f, 61.19922f, 64.19922f, 60.664062f, 64.19922f, 60.0f);
        instancePath2.lineTo(64.19922f, 43.19922f);
        instancePath2.cubicTo(64.19922f, 42.539062f, 63.664062f, 42.0f, 63.0f, 42.0f);
        instancePath2.close();
        instancePath2.moveTo(63.0f, 42.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.checkForImageDataURL("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAYAAABV7bNHAAAABmJLR0QA/wD/AP+gvaeTAAAA4ElEQVR4nO3SMQ4BQRhA4YdWo5J1D9G4hKNwARrHcQw3IHECLY0oKSzJJnbNym5MzPuSv9uZzL78IEmSJEmSJElqSK/Bu1bABTgGft8H5sA0n22Db4nOGrgBZ2ASeGaUn3nO31pQ/NETMA44l5FIoCGwo/izIZuUzAbBd5GSCgT1IyUXCOpFSjIQhEdKNhA8Iu2pjpR0IPgcKflAUB3JQLmySDMM9JIBB4pBrhio4N0mRR+o08Adg3xCZMCGR6w23hKlJeVbUWei1P31A2JnIEmSJEmSJEmSJEmSJEmS1IY7rPp8GRf5MfoAAAAASUVORK5CYII=");
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.503906f, 37.5f);
        instancePath3.lineTo(16.503906f, 33.898438f);
        instancePath3.lineTo(28.453125f, 33.898438f);
        instancePath3.lineTo(16.261719f, 21.703125f);
        instancePath3.lineTo(18.804688f, 19.15625f);
        instancePath3.lineTo(30.898438f, 31.25f);
        instancePath3.lineTo(30.902344f, 19.5f);
        instancePath3.lineTo(34.503906f, 19.5f);
        instancePath3.lineTo(34.5f, 34.847656f);
        instancePath3.lineTo(34.503906f, 34.85547f);
        instancePath3.lineTo(34.5f, 34.85547f);
        instancePath3.lineTo(34.503906f, 36.0f);
        instancePath3.cubicTo(34.503906f, 36.73828f, 33.972656f, 37.347656f, 33.273438f, 37.476562f);
        instancePath3.lineTo(33.003906f, 37.5f);
        instancePath3.close();
        instancePath3.moveTo(16.503906f, 37.5f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
