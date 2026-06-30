package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
public class m implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f81543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f81546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.liteapp.u f81548i;

    public m(com.tencent.mm.plugin.appbrand.jsapi.liteapp.u uVar, java.lang.Object[] objArr, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, q80.d0 d0Var, android.content.Context context) {
        this.f81548i = uVar;
        this.f81543d = objArr;
        this.f81544e = e9Var;
        this.f81545f = i17;
        this.f81546g = d0Var;
        this.f81547h = context;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        java.lang.Object[] objArr = this.f81543d;
        java.lang.Object obj2 = objArr[0];
        if (obj2 != null) {
            ((com.tencent.mm.ui.widget.dialog.u3) obj2).cancel();
        }
        objArr[1] = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81544e;
        if (iPCLong != null) {
            long j17 = iPCLong.f68405d;
            if (j17 >= 0) {
                q80.d0 d0Var = this.f81546g;
                if (j17 > 0) {
                    d0Var.f360663o = j17;
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(e9Var.getF147807d(), d0Var, new com.tencent.mm.plugin.appbrand.jsapi.liteapp.l(this));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenLiteApp", "Open LiteApp fail");
        e9Var.a(this.f81545f, this.f81548i.o("fail"));
    }
}
