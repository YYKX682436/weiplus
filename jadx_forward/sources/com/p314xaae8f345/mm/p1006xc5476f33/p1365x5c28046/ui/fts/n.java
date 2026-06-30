package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts;

/* loaded from: classes8.dex */
public class n implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179557e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5, java.util.List list, java.util.List list2) {
        this.f179556d = list;
        this.f179557e = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f179556d;
            if (i17 >= list.size()) {
                return;
            }
            g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f179557e.get(i17));
            i17++;
        }
    }
}
