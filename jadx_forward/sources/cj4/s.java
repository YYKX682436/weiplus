package cj4;

/* loaded from: classes11.dex */
public final class s extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f123564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123565b;

    public s(cj4.a0 a0Var, java.lang.String str) {
        this.f123564a = a0Var;
        this.f123565b = str;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        bk4.c2 c2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        cj4.a0 a0Var = this.f123564a;
        java.lang.String str = a0Var.D1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e = a0Var.f123478g;
        if (c18612x3f06d82e != null) {
            c18612x3f06d82e.getTextviewSuffixWrapper();
        }
        if (z17) {
            java.lang.String str2 = this.f123565b;
            if ((str2 == null || str2.length() == 0) || (c2Var = a0Var.P1) == null) {
                return;
            }
            if (!c2Var.f102947e) {
                c2Var.f102953k = new cj4.r(a0Var, view, c2Var);
            } else {
                java.lang.String str3 = a0Var.D1;
                a0Var.S(c2Var.f102946d);
            }
        }
    }
}
