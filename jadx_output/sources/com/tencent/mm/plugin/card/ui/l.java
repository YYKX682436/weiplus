package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class l implements tt1.i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.k f95061a;

    public l(com.tencent.mm.plugin.card.ui.k kVar) {
        this.f95061a = kVar;
    }

    @Override // tt1.i
    public tt1.j getItem(int i17) {
        com.tencent.mm.plugin.card.ui.k kVar = this.f95061a;
        if (kVar != null) {
            return (com.tencent.mm.plugin.card.model.CardInfo) kVar.getItem(i17);
        }
        return null;
    }

    @Override // tt1.i
    public void onCreate() {
        if (this.f95061a != null) {
            xt1.t0.cj().add(this.f95061a);
        }
    }

    @Override // tt1.i
    public void onDestroy() {
        if (this.f95061a != null) {
            xt1.t0.cj().remove(this.f95061a);
            this.f95061a.t();
            this.f95061a = null;
        }
    }

    @Override // tt1.i
    public void onNotify() {
        com.tencent.mm.plugin.card.ui.k kVar = this.f95061a;
        if (kVar != null) {
            kVar.f();
        }
    }
}
