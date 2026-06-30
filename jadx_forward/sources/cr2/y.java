package cr2;

/* loaded from: classes2.dex */
public final class y extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public cr2.x f303454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.azy;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        cr2.x xVar = this.f303454d;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f303434g, "onConfigurationChanged orientation: " + newConfig.orientation);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = xVar.f303440m;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.post(new cr2.t(xVar, newConfig));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        cr2.x xVar = this.f303454d;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        xVar.C.mo48814x2efc64();
        p3325xe03a0797.p3326xc267989b.z0.e(xVar.f303438k, null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e(xVar.f303439l, null, 1, null);
        java.util.ArrayList arrayList = xVar.f303444q;
        if (!arrayList.isEmpty()) {
            zo2.e eVar = xVar.f303453z;
            int i17 = eVar != null ? eVar.f556383b : 0;
            int i18 = eVar != null ? eVar.f556384c : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f303434g, "onDestroy position: " + i17 + " offset: " + i18);
            xq2.b bVar = xVar.f303452y;
            java.lang.String str = xVar.f303432e;
            java.lang.String str2 = xVar.f303433f;
            r45.yz2 yz2Var = xVar.f303447t;
            bVar.Q6(str, str2, i17, i18, arrayList, yz2Var != null ? yz2Var.f473055i : null, yz2Var);
        }
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.o();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        cr2.x xVar = this.f303454d;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = xVar.A;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        cr2.x xVar = this.f303454d;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        if (this.f303454d != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        cr2.x xVar = this.f303454d;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f303434g, "onStop");
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = xVar.A;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo58275xd317978f() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr2.y.mo58275xd317978f():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        cr2.x xVar = this.f303454d;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
            throw null;
        }
        xVar.C.mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f303434g, "onUserVisibleUnFocused");
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.J(false);
        }
        gp2.l0 l0Var2 = xVar.A;
        if (l0Var2 != null) {
            l0Var2.m();
        }
        gp2.l0 l0Var3 = xVar.A;
        if (l0Var3 != null) {
            c50.m0.c(l0Var3, null, 1, null);
        }
    }
}
