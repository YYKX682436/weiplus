package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class k0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.l0 f80569a;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.contact.l0 l0Var) {
        this.f80569a = l0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.l0 l0Var = this.f80569a;
        if (i17 != l0Var.f80574g.f80591y) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var = l0Var.f80573f;
        if (m0Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.contact.f0) m0Var).a(true, "ok", intent);
        }
        l0Var.f80571d.x();
        return true;
    }
}
