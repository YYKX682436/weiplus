package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class c0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.n4 f267283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f267284c;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f267282a = viewOnClickListenerC19428xb021cc2c;
        this.f267283b = n4Var;
        this.f267284c = layoutParams;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    public void a() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationEnd */
    public void mo54453xbb3aa236() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f267283b;
        if (n4Var != null) {
            n4Var.mo54453xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267282a;
        viewOnClickListenerC19428xb021cc2c.f267241e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.b0(viewOnClickListenerC19428xb021cc2c, this.f267284c));
        viewOnClickListenerC19428xb021cc2c.T = false;
        viewOnClickListenerC19428xb021cc2c.n();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationStart */
    public void mo54454xd7e2f2fd() {
        this.f267282a.T = true;
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f267283b;
        if (n4Var != null) {
            n4Var.mo54454xd7e2f2fd();
        }
    }
}
