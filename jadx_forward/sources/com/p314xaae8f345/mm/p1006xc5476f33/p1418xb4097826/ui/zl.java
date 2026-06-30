package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class zl implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f211646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f211647e;

    public zl(java.util.List list, java.util.List list2) {
        this.f211646d = list;
        this.f211647e = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.util.List list = this.f211646d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            g4Var.f(((java.lang.Number) this.f211647e.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17));
        }
    }
}
