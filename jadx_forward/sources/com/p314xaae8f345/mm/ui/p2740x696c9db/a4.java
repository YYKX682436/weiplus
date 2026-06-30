package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f291802b;

    /* renamed from: a, reason: collision with root package name */
    public final long f291803a = f291802b;

    static {
        java.lang.Object d17 = bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20091xf10fa750());
        java.lang.Long l17 = d17 instanceof java.lang.Long ? (java.lang.Long) d17 : null;
        f291802b = l17 != null ? l17.longValue() : 200L;
    }

    public static final void a(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, android.view.View view, int[] iArr, int i17, int i18, android.graphics.Rect rect, com.p314xaae8f345.mm.ui.p2740x696c9db.v3 v3Var, float f39, float f47, float f48) {
        int i19;
        float f49 = 0.0f;
        float e17 = e06.p.e(f48, 0.0f, 1.0f);
        float f57 = ((f18 - f17) * e17) + f17;
        float f58 = f19 + ((f27 - f19) * e17);
        float f59 = f28 + ((f29 - f28) * e17);
        float f66 = f37 + ((f38 - f37) * e17);
        view.getLocationOnScreen(iArr);
        float f67 = iArr[0];
        float f68 = iArr[1];
        float scaleX = (view.getScaleX() > 0.0f ? 1 : (view.getScaleX() == 0.0f ? 0 : -1)) == 0 ? 1.0f : view.getScaleX();
        float scaleY = view.getScaleY() == 0.0f ? 1.0f : view.getScaleY();
        float f69 = (f57 - f67) / scaleX;
        float f76 = (f58 - f68) / scaleY;
        float f77 = (f59 - f67) / scaleX;
        float f78 = (f66 - f68) / scaleY;
        if (f69 < 0.0f) {
            f69 = 0.0f;
        }
        if (f76 < 0.0f) {
            i19 = i17;
        } else {
            i19 = i17;
            f49 = f76;
        }
        float f79 = i19;
        if (f77 > f79) {
            f77 = f79;
        }
        float f86 = i18;
        if (f78 > f86) {
            f78 = f86;
        }
        if (f77 < f69) {
            f77 = f69;
        }
        if (f78 < f49) {
            f78 = f49;
        }
        rect.set((int) f69, (int) f49, (int) f77, (int) f78);
        view.setClipBounds(rect);
        if (v3Var != null) {
            v3Var.f292369a.set(rect);
            float min = java.lang.Math.min(rect.width(), rect.height()) * 0.5f;
            float f87 = f39 + ((f47 - f39) * e17);
            if (f87 <= min) {
                min = f87;
            }
            v3Var.f292370b = min;
            view.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r59, android.view.View r60, com.p314xaae8f345.mm.ui.p2740x696c9db.q3 r61, android.view.View r62, com.p314xaae8f345.mm.ui.p2740x696c9db.p3 r63) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.a4.b(android.view.View, android.view.View, com.tencent.mm.ui.tools.q3, android.view.View, com.tencent.mm.ui.tools.p3):void");
    }

    public final jz5.l c(boolean z17, float f17, float f18) {
        return z17 ? new jz5.l(java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17)) : new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }
}
