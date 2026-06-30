package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes8.dex */
public class y implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182649e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd, java.util.List list, java.util.List list2) {
        this.f182648d = list;
        this.f182649e = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f182648d;
            if (i17 >= list.size()) {
                return;
            }
            g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f182649e.get(i17));
            i17++;
        }
    }
}
