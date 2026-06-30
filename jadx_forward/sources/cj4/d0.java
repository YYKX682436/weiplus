package cj4;

/* loaded from: classes11.dex */
public final class d0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e f123453b;

    public d0(cj4.i1 i1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e) {
        this.f123452a = i1Var;
        this.f123453b = c18612x3f06d82e;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        bk4.c2 textviewSuffixWrapper;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        cj4.i1 i1Var = this.f123452a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e = i1Var.f123478g;
        if (c18612x3f06d82e != null) {
            c18612x3f06d82e.getTextviewSuffixWrapper();
        }
        if (!z17 || (textviewSuffixWrapper = this.f123453b.getTextviewSuffixWrapper()) == null) {
            return;
        }
        if (textviewSuffixWrapper.f102947e) {
            i1Var.S(textviewSuffixWrapper.f102946d);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e2 = i1Var.f123478g;
        if (c18612x3f06d82e2 != null) {
            c18612x3f06d82e2.m71761x229d1221(new cj4.c0(view, i1Var));
        }
    }
}
