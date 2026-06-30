package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class z implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.a0 f80625a;

    public z(com.tencent.mm.plugin.appbrand.jsapi.contact.a0 a0Var) {
        this.f80625a = a0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.a0 a0Var = this.f80625a;
        if (i17 != a0Var.f80508h.f80538r) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.b0 b0Var = a0Var.f80507g;
        if (b0Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.contact.w) b0Var).a(true, "ok", intent);
        }
        a0Var.f80504d.x();
        return true;
    }
}
