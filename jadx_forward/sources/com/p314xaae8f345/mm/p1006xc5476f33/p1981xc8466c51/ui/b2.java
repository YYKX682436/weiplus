package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class b2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f236888f;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf, java.util.List list, java.util.List list2) {
        this.f236888f = activityC16972xc3ec91bf;
        this.f236886d = list;
        this.f236887e = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        this.f236888f.f236854r.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f236886d;
            if (i17 >= list.size()) {
                return;
            }
            g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f236887e.get(i17));
            i17++;
        }
    }
}
