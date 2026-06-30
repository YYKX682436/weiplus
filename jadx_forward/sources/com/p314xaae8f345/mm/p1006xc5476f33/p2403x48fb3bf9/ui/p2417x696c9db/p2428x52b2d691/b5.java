package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class b5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267504d;

    public b5(java.util.ArrayList arrayList) {
        this.f267504d = arrayList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        java.util.ArrayList arrayList = this.f267504d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            g4Var.f(i17, (java.lang.CharSequence) ((android.util.Pair) arrayList.get(i17)).second);
        }
    }
}
