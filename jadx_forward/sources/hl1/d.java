package hl1;

/* loaded from: classes7.dex */
public final class d extends hl1.b {

    /* renamed from: e, reason: collision with root package name */
    public float f363622e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f363623f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f363624g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f363625h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime, int i17) {
        super(runtime, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
    }

    @Override // hl1.b, hl1.h
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f363614b.f156336n);
        if (d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HOME_PRESSED || d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.RECENT_APPS_PRESSED || d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_NATIVE_PAGE || d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM) {
            return;
        }
        android.graphics.Bitmap bitmap = this.f363623f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f363623f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    @Override // hl1.b, hl1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Canvas r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.d.f(android.graphics.Canvas, android.view.View):void");
    }

    @Override // hl1.b, hl1.h
    public android.view.View g() {
        mi1.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f363614b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = null;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = o6Var.f156329e;
            if (hcVar != null) {
                c11510xdd90c2f2 = hcVar.i(o6Var);
            }
        } catch (java.lang.Throwable unused) {
        }
        return (c11510xdd90c2f2 == null || (vVar = c11510xdd90c2f2.f156354z) == null) ? o6Var.f156343s : vVar.c();
    }

    @Override // hl1.b
    public void i(int i17, int i18, long j17, android.animation.ValueAnimator animation) {
        float intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (i17 - i18 == 0) {
            intValue = 1.0f;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animation.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
            intValue = (((java.lang.Integer) r3).intValue() - i17) / (i18 - i17);
        }
        this.f363622e = intValue;
    }

    @Override // hl1.b, hl1.h
    /* renamed from: type */
    public hl1.g mo133702x368f3a() {
        return hl1.g.f363629f;
    }
}
