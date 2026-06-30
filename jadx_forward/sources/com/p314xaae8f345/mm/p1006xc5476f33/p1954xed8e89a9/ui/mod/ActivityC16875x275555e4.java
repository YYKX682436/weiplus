package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/mod/ContactAssembleModRemarkUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.mod.ContactAssembleModRemarkUI */
/* loaded from: classes11.dex */
public final class ActivityC16875x275555e4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3v;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((vf5.j) m80391xac8f1cfd(vf5.j.class)).f517959g = i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).P6(iy1.c.WeChatNotesandTabsPage);
        mo64405x4dab7448(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: onVasBackPressed */
    public boolean mo67645x241a3cb2() {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20629x68ff2372()) == 1) {
            if (((kr3.q1) pf5.z.f435481a.a(this).a(kr3.q1.class)).V6()) {
                return false;
            }
        } else if (((kr3.q0) pf5.z.f435481a.a(this).a(kr3.q0.class)).V6()) {
            return false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20629x68ff2372()) == 1) {
            set.add(kr3.q1.class);
        } else {
            set.add(kr3.q0.class);
        }
        set.add(vf5.j.class);
        set.add(hr3.w1.class);
        set.add(la5.x.class);
        set.add(kr3.r1.class);
        set.add(gc0.p2.class);
        if (getIntent().getBooleanExtra("view_only", false)) {
            return;
        }
        set.add(or3.k.class);
        set.add(j93.n.class);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20629x68ff2372()) == 1 ? ((kr3.q1) pf5.z.f435481a.a(this).a(kr3.q1.class)).S6() : ((kr3.q0) pf5.z.f435481a.a(this).a(kr3.q0.class)).S6()) {
            return false;
        }
        return super.mo52922x430f73e();
    }
}
