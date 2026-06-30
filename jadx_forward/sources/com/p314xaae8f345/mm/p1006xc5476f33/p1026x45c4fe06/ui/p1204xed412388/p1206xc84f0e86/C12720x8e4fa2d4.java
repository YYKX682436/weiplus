package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage */
/* loaded from: classes4.dex */
public final class C12720x8e4fa2d4 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f171464g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f171465d;

    /* renamed from: e, reason: collision with root package name */
    public ck1.a f171466e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f171467f;

    public C12720x8e4fa2d4() {
        super(true);
        this.f171465d = jz5.h.a(jz5.i.f384364f, new ck1.h(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569641hd;
    }

    public final ck1.s0 l0() {
        return (ck1.s0) this.f171465d.mo141623x754a37bb();
    }

    public final void m0(ck1.a aVar) {
        if (this.f171466e == aVar) {
            return;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showActionbarDefault");
            mo78695xbf7c1df6("");
            ak1.f.b(this);
            ak1.f.e(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showActionbarWithTitle");
            mo78694xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a09);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = ak1.f.a(this);
            if (a17 != null) {
                a17.m78599xdf056fb4();
            }
            ak1.f.e(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        }
        this.f171466e = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        java.lang.String m78394x7e63ed49 = m78394x7e63ed49("appId");
        if (m78394x7e63ed49 == null || m78394x7e63ed49.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "checkContextOnCreateEarly, appId is empty");
            mo78641xb4098c93();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        mo78682x9c8c0d33(new ck1.c(this));
        m0(ck1.a.f123834d);
        ak1.f.f(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567384jb3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo26077x4ff8c0f0, "null cannot be cast to non-null type android.widget.Button");
        this.f171467f = (android.widget.Button) mo26077x4ff8c0f0;
        android.view.View mo26077x4ff8c0f02 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.oum);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = mo26077x4ff8c0f02 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo26077x4ff8c0f02 : null;
        if (c1163xf1deaba4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "initContentArea, findViewById return null");
            mo78641xb4098c93();
            return;
        }
        c1163xf1deaba4.setFadingEdgeLength(m7460x893a2f6f().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ajf));
        c1163xf1deaba4.setVerticalFadingEdgeEnabled(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext());
        ck1.k0 k0Var = new ck1.k0(this, new ck1.g(c1163xf1deaba4, this));
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.mo7960x6cab2c8d(k0Var);
        zk1.m.f554947l.a(c1163xf1deaba4, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        l0().f123908f.mo7806x9d92d11c(m7475xf3489164(), new ck1.e(c1163xf1deaba4, this, k0Var, c1162x665295de));
    }
}
