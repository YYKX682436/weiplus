package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class l implements tt1.i {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k f176594a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k kVar) {
        this.f176594a = kVar;
    }

    @Override // tt1.i
    /* renamed from: getItem */
    public tt1.j mo54455xfb80e389(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k kVar = this.f176594a;
        if (kVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) kVar.getItem(i17);
        }
        return null;
    }

    @Override // tt1.i
    /* renamed from: onCreate */
    public void mo54456x3e5a77bb() {
        if (this.f176594a != null) {
            xt1.t0.cj().add(this.f176594a);
        }
    }

    @Override // tt1.i
    /* renamed from: onDestroy */
    public void mo54457xac79a11b() {
        if (this.f176594a != null) {
            xt1.t0.cj().mo49775xc84af884(this.f176594a);
            this.f176594a.t();
            this.f176594a = null;
        }
    }

    @Override // tt1.i
    /* renamed from: onNotify */
    public void mo54458x50fc6e08() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k kVar = this.f176594a;
        if (kVar != null) {
            kVar.f();
        }
    }
}
