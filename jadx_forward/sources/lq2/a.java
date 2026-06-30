package lq2;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f401987d;

    /* renamed from: e, reason: collision with root package name */
    public iq2.d0 f401988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f401987d = "LiveStreamTabFragmentUIC";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.azv;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        iq2.d0 d0Var = this.f401988e;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        d0Var.H.mo48814x2efc64();
        d0Var.I.mo48814x2efc64();
        d0Var.f375249J.mo48814x2efc64();
        java.util.ArrayList arrayList = (java.util.ArrayList) d0Var.f375266q;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = d0Var.f375259j;
            if (c14594x9de071a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c14594x9de071a.removeCallbacks(runnable);
        }
        arrayList.clear();
        p3325xe03a0797.p3326xc267989b.z0.e(d0Var.f375257h, null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e(d0Var.f375258i, null, 1, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy isManaualDestroy: ");
        sb6.append(d0Var.A);
        sb6.append(" pos: ");
        jq2.a aVar = d0Var.f375252c;
        sb6.append(aVar.f382628a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, sb6.toString());
        if (!(d0Var.A && aVar.f382628a == 0)) {
            d0Var.l();
        }
        gp2.l0 l0Var = d0Var.E;
        if (l0Var != null) {
            l0Var.o();
        }
        d0Var.f375275z = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        iq2.d0 d0Var = this.f401988e;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        boolean mo78538xecd98af8 = d0Var.f375250a.mo78538xecd98af8();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "onPause: activityIsPause=" + mo78538xecd98af8);
        d0Var.k("onPause", mo78538xecd98af8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        iq2.d0 d0Var = this.f401988e;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "onResume: ");
        d0Var.d("onResume");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        if (this.f401988e != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        iq2.d0 d0Var = this.f401988e;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "onStop");
        d0Var.k("onStop", true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        boolean g17;
        super.mo58275xd317978f();
        iq2.d0 d0Var = this.f401988e;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        java.lang.String str = "onUserVisibleFocused: isFirstUserVisibleFocus=" + d0Var.f375275z;
        java.lang.String str2 = d0Var.f375254e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        d0Var.f375274y = true;
        java.lang.System.currentTimeMillis();
        jq2.a aVar = d0Var.f375252c;
        hq2.c cVar = aVar.f382636i;
        int hashCode = cVar != null ? cVar.hashCode() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] ADD caller=");
        iq2.b0 b0Var = d0Var.L;
        sb6.append(b0Var);
        sb6.append(", tabPage.hashCode=");
        sb6.append(hashCode);
        sb6.append(", size before=");
        fq2.a aVar2 = aVar.f382634g;
        sb6.append(((java.util.ArrayList) ((gq2.j) aVar2).f356096f.f492530a).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        ((java.util.ArrayList) ((gq2.j) aVar2).f356096f.f492530a).add(b0Var);
        if (d0Var.f375275z) {
            ((gp2.v0) pf5.u.f435469a.e(wo2.k.class).a(gp2.v0.class)).N6(d0Var.f375250a);
            java.util.ArrayList arrayList = d0Var.f375265p;
            if (arrayList == null || arrayList.isEmpty()) {
                int f17 = d0Var.f();
                eq2.b bVar = d0Var.C;
                int i17 = d0Var.f375253d;
                if (!(java.lang.System.currentTimeMillis() - bVar.N6(i17, f17).f337414e > ((long) bVar.f337418g)) || i17 == 88890) {
                    java.lang.Integer num = (java.lang.Integer) bVar.f337417f.get(java.lang.Integer.valueOf(i17));
                    int intValue = num == null ? 0 : num.intValue();
                    kq2.c cVar2 = d0Var.f375264o;
                    if (cVar2 != null) {
                        cVar2.f392798e = intValue;
                    }
                    g17 = d0Var.g(d0Var.f());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "#onCreate loadCacheData=" + g17 + " pullType: 0");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "#onCreate cache timeout =false pullType: 0");
                    g17 = false;
                }
                if (g17) {
                    d0Var.i();
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = d0Var.f375271v;
                    if (c22627xa933f8e4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                        throw null;
                    }
                    c22627xa933f8e4.setVisibility(0);
                    d0Var.c(0);
                }
            }
            d0Var.f375275z = false;
        }
        d0Var.f375249J.mo48813x58998cd();
        d0Var.H.mo48813x58998cd();
        d0Var.I.mo48813x58998cd();
        d0Var.d("onUserVisibleFocused");
        p3325xe03a0797.p3326xc267989b.l.d(d0Var.f375257h, null, null, new iq2.a0(d0Var, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        iq2.d0 d0Var = this.f401988e;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        d0Var.H.mo48814x2efc64();
        d0Var.I.mo48814x2efc64();
        d0Var.f375249J.mo48814x2efc64();
        d0Var.f375274y = false;
        java.lang.String str = d0Var.f375254e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onUserVisibleUnFocused");
        d0Var.k("onUserVisibleUnFocused", false);
        jq2.a aVar = d0Var.f375252c;
        hq2.c cVar = aVar.f382636i;
        int hashCode = cVar != null ? cVar.hashCode() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
        iq2.b0 b0Var = d0Var.L;
        sb6.append(b0Var);
        sb6.append(", tabPage.hashCode=");
        sb6.append(hashCode);
        sb6.append(", size before=");
        gq2.j jVar = (gq2.j) aVar.f382634g;
        sb6.append(((java.util.ArrayList) jVar.f356096f.f492530a).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ((java.util.ArrayList) jVar.f356096f.f492530a).remove(b0Var);
    }
}
