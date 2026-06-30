package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class h1 implements ym5.z4 {

    /* renamed from: a, reason: collision with root package name */
    public float f268773a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public float f268774b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f268775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 f268776d;

    public h1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var) {
        this.f268775c = z17;
        this.f268776d = m1Var;
    }

    public void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        boolean z17 = this.f268775c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = this.f268776d;
        if (z17) {
            if (view.getTranslationX() == this.f268774b) {
                return;
            }
            this.f268774b = view.getTranslationX();
            float abs = java.lang.Math.abs(view.getTranslationX());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var.f362934g);
            float width = abs / r0.getWidth();
            java.util.Iterator it = m1Var.Q.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a1) it.next()).b(1.0f - width);
            }
            return;
        }
        if (view.getTranslationY() == this.f268773a) {
            return;
        }
        this.f268773a = view.getTranslationY();
        float abs2 = java.lang.Math.abs(view.getTranslationY());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var.f362934g);
        float height = abs2 / r0.getHeight();
        java.util.Iterator it6 = m1Var.Q.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a1) it6.next()).b(1.0f - height);
        }
    }
}
