package ws2;

/* loaded from: classes3.dex */
public final class m1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public ws2.s0 f530632d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 f530633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ayc;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        ws2.u0 u0Var = ws2.k1.f530599r;
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        if (!(jVar != null && jVar.f303813x)) {
            ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar2 != null) {
                jVar2.Y6(true);
            }
            return super.mo2274xbdc3c5dc();
        }
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        if (c1Var != null) {
            c1Var.O1 = false;
        }
        u0Var.c();
        m158354x19263085().finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = this.f530633e;
        if (c14931xe48fc583 == null || (c14929x59565fb6 = c14931xe48fc583.f206418n.f530682a) == null) {
            return;
        }
        c14929x59565fb6.onConfigurationChanged(newConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0327  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.m1.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ws2.s0 s0Var = this.f530632d;
        if (s0Var != null) {
            s0Var.mo979x3f5eee52();
        }
    }
}
