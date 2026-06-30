package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class r3 implements vg3.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.s3 f82891c;

    public r3(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.s3 s3Var) {
        this.f82889a = lVar;
        this.f82890b = i17;
        this.f82891c = s3Var;
    }

    @Override // vg3.h3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.jsapi.s3 s3Var = this.f82891c;
        int i17 = this.f82890b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82889a;
        if (z17) {
            if (str2 == null || str2.length() == 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("openId", str2);
                if (lVar != null) {
                    lVar.a(i17, s3Var.p("ok", hashMap));
                    return;
                }
                return;
            }
        }
        if (lVar != null) {
            lVar.a(i17, s3Var.o("fail"));
        }
    }
}
