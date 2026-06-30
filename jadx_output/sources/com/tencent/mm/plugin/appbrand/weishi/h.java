package com.tencent.mm.plugin.appbrand.weishi;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f90969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.weishi.i f90970e;

    public h(com.tencent.mm.plugin.appbrand.weishi.i iVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f90970e = iVar;
        this.f90969d = n7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.weishi.i.C(this.f90970e);
        this.f90969d.K(this);
    }
}
