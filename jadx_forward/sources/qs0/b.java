package qs0;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qs0.b f447741a = new qs0.b();

    public static final float b(float f17) {
        float f18 = 1.0f;
        if (f17 <= 1.0f) {
            f18 = 0.0f;
            if (f17 >= 0.0f) {
                return f17;
            }
        }
        return f18;
    }

    public final float[] a(int i17, int i18, int i19, android.graphics.Point textureValidLTPoint, android.graphics.Point textureValidRBPoint, int i27, int i28, int i29, android.graphics.Rect rect) {
        float f17;
        float f18;
        float f19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidLTPoint, "textureValidLTPoint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidRBPoint, "textureValidRBPoint");
        float[] copyOf = java.util.Arrays.copyOf(rs0.i.f480832d, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        float f27 = i18;
        float f28 = 1;
        float f29 = i19;
        android.graphics.RectF rectF = new android.graphics.RectF(textureValidLTPoint.x / f27, (textureValidLTPoint.y - f28) / f29, (textureValidRBPoint.x - f28) / f27, textureValidRBPoint.y / f29);
        float f37 = rectF.left;
        float f38 = rectF.top;
        float f39 = rectF.right;
        float f47 = rectF.bottom;
        if (i17 == 2) {
            boolean z17 = i27 == 90 || i27 == 270;
            int i37 = textureValidRBPoint.x - textureValidLTPoint.x;
            int i38 = textureValidLTPoint.y - textureValidRBPoint.y;
            int i39 = z17 ? i38 : i37;
            if (!z17) {
                i37 = i38;
            }
            float f48 = i28;
            float f49 = i39;
            float f57 = f48 / f49;
            float f58 = i29;
            float f59 = i37;
            float f66 = f58 / f59;
            float f67 = 0.0f;
            if (f57 < f66) {
                f67 = f49 - (f48 / f66);
                f17 = 0.0f;
            } else {
                f17 = f57 > f66 ? f59 - (f58 / f57) : 0.0f;
            }
            if (z17) {
                f19 = (f17 / 2.0f) / f59;
                f18 = (f67 / 2.0f) / f49;
            } else {
                float f68 = (f67 / 2.0f) / f49;
                f18 = (f17 / 2.0f) / f59;
                f19 = f68;
            }
            f37 += f19;
            f39 -= f19;
            f47 += f18;
            f38 -= f18;
        } else if (i17 != 3) {
            if (i17 == 4 && rect != null) {
                float b17 = b(rect.left / f27);
                float b18 = b(rect.right / f27);
                float b19 = b(rect.bottom / f29);
                float b27 = b(rect.top / f29);
                float abs = java.lang.Math.abs(f39 - f37);
                float abs2 = java.lang.Math.abs(f47 - f38);
                f37 += b17 * abs;
                f39 = f37 + (abs * b18);
                f47 = java.lang.Math.min(f38, f47) + (b19 * abs2);
                f38 = java.lang.Math.min(f38, f47) + (abs2 * b27);
            }
        } else if (rect != null) {
            int width = rect.width();
            int height = rect.height();
            if (rect.left == 0) {
                float f69 = (i18 - width) / f27;
                f37 = f69;
                f39 = 1.0f - f69;
            } else {
                float f76 = (i18 - width) / f27;
                f39 = f76;
                f37 = 1.0f - f76;
            }
            if (rect.top == 0) {
                f38 = (i19 - height) / f29;
                f47 = 1.0f - f38;
            } else {
                f47 = (i19 - height) / f29;
                f38 = 1.0f - f47;
            }
        }
        copyOf[0] = f37;
        copyOf[1] = f38;
        copyOf[2] = f39;
        copyOf[3] = f38;
        copyOf[4] = f37;
        copyOf[5] = f47;
        copyOf[6] = f39;
        copyOf[7] = f47;
        return copyOf;
    }
}
