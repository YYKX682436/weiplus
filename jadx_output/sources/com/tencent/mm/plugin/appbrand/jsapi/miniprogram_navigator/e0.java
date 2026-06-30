package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class e0 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h0 f82225a;

    public e0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h0 h0Var) {
        this.f82225a = h0Var;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h0 h0Var = this.f82225a;
        h0Var.f82235g.getClass();
        ze.n nVar = h0Var.f82230b;
        android.content.Context r07 = nVar.r0();
        if (r07 == null) {
            r07 = nVar.f74795d;
        }
        fl1.g1 g1Var = r07 == null ? null : new fl1.g1(r07);
        g1Var.setTitle("");
        g1Var.setMessage(context.getString(com.tencent.mm.R.string.it));
        return g1Var;
    }
}
