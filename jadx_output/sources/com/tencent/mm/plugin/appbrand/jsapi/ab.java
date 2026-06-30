package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class ab implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f78700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bb f78702f;

    public ab(com.tencent.mm.plugin.appbrand.jsapi.bb bbVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f78702f = bbVar;
        this.f78700d = d0Var;
        this.f78701e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("ret", "fail");
        string.equals("ok");
        java.lang.String o17 = this.f78702f.o(string);
        int i17 = this.f78701e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f78700d;
        d0Var.a(i17, o17);
        if (bundle.getInt("closeWindow", 0) == 1) {
            d0Var.t3().S();
        }
    }
}
