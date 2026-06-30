package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(0);
        this.f194877d = v3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f194877d;
        km2.b bVar = v3Var.S;
        java.lang.Integer num = null;
        if ((bVar != null ? bVar.f390603t : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "showReplayCancelWidget:finishInfo.liveInfo is null");
        } else {
            java.lang.Integer valueOf = (bVar == null || (nw1Var2 = bVar.f390603t) == null) ? null : java.lang.Integer.valueOf(nw1Var2.m75939xb282bd08(31));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "Current replay status: " + valueOf);
            if (valueOf != null && valueOf.intValue() == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t1 t1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t1(v3Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "[cancelLongFeedGen]");
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 0);
                r45.r02 r02Var = new r45.r02();
                r02Var.set(0, 0);
                r02Var.set(1, 0);
                r02Var.set(2, 0);
                r02Var.set(3, 0);
                r02Var.set(4, 0);
                r02Var.set(5, 1);
                r02Var.set(6, 0);
                hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r02Var.mo14344x5f01b1f6()));
                v3Var.t1(hx0Var, t1Var);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                android.view.ViewGroup viewGroup = v3Var.f446856d;
                java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nv7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                android.content.Context context = viewGroup.getContext();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = string;
                e4Var.c();
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showReplayCancelWidget Unexpected replay status: ");
                km2.b bVar2 = v3Var.S;
                if (bVar2 != null && (nw1Var = bVar2.f390603t) != null) {
                    num = java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(31));
                }
                sb6.append(num);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", sb6.toString());
            }
        }
        return jz5.f0.f384359a;
    }
}
