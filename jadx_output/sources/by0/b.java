package by0;

/* loaded from: classes5.dex */
public abstract class b {
    public static final java.lang.Float a(com.tencent.maas.moviecomposing.c cVar) {
        kotlin.jvm.internal.o.g(cVar, "<this>");
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_235x100) {
            return java.lang.Float.valueOf(2.35f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_16x9) {
            return java.lang.Float.valueOf(1.7777778f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_9x16) {
            return java.lang.Float.valueOf(0.5625f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_1080x1916) {
            return java.lang.Float.valueOf(0.56367433f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_16x10) {
            return java.lang.Float.valueOf(1.6f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_10x16) {
            return java.lang.Float.valueOf(0.625f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_6x7) {
            return java.lang.Float.valueOf(0.85714287f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_4x5) {
            return java.lang.Float.valueOf(0.8f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_4x3) {
            return java.lang.Float.valueOf(1.3333334f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_3x4) {
            return java.lang.Float.valueOf(0.75f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_3x2) {
            return java.lang.Float.valueOf(1.5f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_2x3) {
            return java.lang.Float.valueOf(0.6666667f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_2x1) {
            return java.lang.Float.valueOf(2.0f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_1x2) {
            return java.lang.Float.valueOf(0.5f);
        }
        if (cVar == com.tencent.maas.moviecomposing.c.ASPECT_RATIO_1x1) {
            return java.lang.Float.valueOf(1.0f);
        }
        if (cVar != com.tencent.maas.moviecomposing.c.ASPECT_RATIO_OTHER && cVar != com.tencent.maas.moviecomposing.c.ASPECT_RATIO_INVALID) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        return null;
    }

    public static final void b(android.view.View view, float f17, float f18, float f19) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (f18 / f19 > f17) {
            float f27 = f17 * f19;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = (int) f19;
            layoutParams.width = (int) f27;
            view.setLayoutParams(layoutParams);
            return;
        }
        float f28 = f18 / f17;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = (int) f28;
        layoutParams2.width = (int) f18;
        view.setLayoutParams(layoutParams2);
    }
}
