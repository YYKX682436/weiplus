package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes.dex */
public final class s implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f176036d;

    public s(java.util.List list) {
        this.f176036d = list;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f176036d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.t(i17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a) obj).f175628a, false);
            i17 = i18;
        }
    }
}
