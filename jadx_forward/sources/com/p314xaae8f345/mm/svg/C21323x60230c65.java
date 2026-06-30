package com.p314xaae8f345.mm.svg;

/* renamed from: com.tencent.mm.svg.WeChatSVGRenderC2Java */
/* loaded from: classes15.dex */
public class C21323x60230c65 {
    /* renamed from: addPath */
    public static void m78184xbb881866(android.graphics.Path path, android.graphics.Matrix matrix, android.graphics.Path path2, boolean z17) {
        if (z17) {
            path.setFillType(path2.getFillType());
        }
        path.addPath(path2, matrix);
    }

    /* renamed from: addTextPath */
    public static void m78185x8a196ab3(android.graphics.Paint paint, android.graphics.Path path, java.lang.String str, float f17, float f18) {
        android.graphics.Path path2 = new android.graphics.Path();
        paint.getTextPath(str, 0, str.length(), f17, f18, path2);
        path.addPath(path2);
    }

    /* renamed from: checkForImageDataURL */
    public static android.graphics.Bitmap m78186x630020cb(java.lang.String str) {
        return null;
    }

    /* renamed from: computePathBound */
    public static float[] m78187x726e99e2(android.graphics.Path path, android.graphics.Matrix matrix) {
        if (matrix != null) {
            path.transform(matrix);
        }
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        return new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom};
    }

    /* renamed from: doNonScalingStroke */
    public static void m78188x9805717d(android.graphics.Canvas canvas, android.graphics.Path path, android.graphics.Paint paint) {
        android.graphics.Matrix matrix = canvas.getMatrix();
        android.graphics.Path path2 = new android.graphics.Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new android.graphics.Matrix());
        android.graphics.Shader shader = paint.getShader();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, paint);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* renamed from: getPathMeasureLength */
    public static float m78189xe94ac509(android.graphics.Path path, android.graphics.Matrix matrix) {
        if (matrix != null) {
            path.transform(matrix);
        }
        return new android.graphics.PathMeasure(path, false).getLength();
    }

    /* renamed from: getTextBounds */
    public static float[] m78190x3f5a8a38(android.graphics.Paint paint, java.lang.String str) {
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        return new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom};
    }

    /* renamed from: invert */
    public static void m78191xb9721fd6(android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        matrix.invert(matrix2);
    }

    /* renamed from: setFillType */
    public static void m78192x4b1e1ddf(android.graphics.Path path, int i17) {
        if (i17 == 0 || i17 == 1) {
            path.setFillType(android.graphics.Path.FillType.WINDING);
        } else {
            if (i17 != 2) {
                return;
            }
            path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        }
    }

    /* renamed from: setLinearGradient */
    public static void m78193x7fec2a77(android.graphics.Paint paint, float f17, float f18, float f19, float f27, int[] iArr, float[] fArr, android.graphics.Matrix matrix, int i17) {
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        if (i17 != 0) {
            if (i17 == 2) {
                tileMode = android.graphics.Shader.TileMode.MIRROR;
            } else if (i17 == 3) {
                tileMode = android.graphics.Shader.TileMode.REPEAT;
            }
        }
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f17, f18, f19, f27, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
    }

    /* renamed from: setRadialGradient */
    public static void m78194xe40e6b71(android.graphics.Paint paint, float f17, float f18, float f19, int[] iArr, float[] fArr, android.graphics.Matrix matrix, int i17) {
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        if (i17 != 0) {
            if (i17 == 2) {
                tileMode = android.graphics.Shader.TileMode.MIRROR;
            } else if (i17 == 3) {
                tileMode = android.graphics.Shader.TileMode.REPEAT;
            }
        }
        android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(f17, f18, f19, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
    }
}
