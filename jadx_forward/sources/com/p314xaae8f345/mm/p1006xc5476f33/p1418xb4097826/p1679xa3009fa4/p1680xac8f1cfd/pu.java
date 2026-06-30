package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class pu implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f217159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ru f217160e;

    public pu(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ru ruVar) {
        this.f217159d = c0Var;
        this.f217160e = ruVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MENU_ID_POST] red=");
        boolean z17 = false;
        sb6.append(z9Var != null && z9Var.f186860a);
        sb6.append("，hasShowQualityBottomSheet = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f217159d;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostQualityUIC", sb6.toString());
        if (z9Var != null && z9Var.f186860a) {
            z17 = true;
        }
        if (z17) {
            r45.f03 f03Var = z9Var.f186861b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var != null ? f03Var.f455422f : null, "temp") || c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_HAS_SHOWN_GET_POST_QUALITY_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ru ruVar = this.f217160e;
            ruVar.f217368d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ou(ruVar);
        }
    }
}
