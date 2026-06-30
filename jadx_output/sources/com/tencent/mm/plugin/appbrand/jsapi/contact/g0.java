package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class g0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.h0 f80550a;

    public g0(com.tencent.mm.plugin.appbrand.jsapi.contact.h0 h0Var) {
        this.f80550a = h0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.h0 h0Var = this.f80550a;
        if (i17 != h0Var.f80559g.f80591y) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var = h0Var.f80558f;
        if (m0Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.contact.f0) m0Var).a(true, "ok", intent);
        }
        h0Var.f80556d.x();
        return true;
    }
}
