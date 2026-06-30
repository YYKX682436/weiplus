package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.j2 f86553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean[] f86554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86556g;

    public e2(com.tencent.mm.plugin.appbrand.page.y1 y1Var, com.tencent.mm.plugin.appbrand.page.j2 j2Var, boolean[] zArr, java.lang.String str) {
        this.f86556g = y1Var;
        this.f86553d = j2Var;
        this.f86554e = zArr;
        this.f86555f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.j2 j2Var = this.f86553d;
        if (j2Var != null) {
            boolean z17 = this.f86554e[0];
            com.tencent.mm.plugin.appbrand.page.y1 y1Var = this.f86556g;
            if (z17) {
                j2Var.a(y1Var, this.f86555f);
            } else {
                y1Var.post(new com.tencent.mm.plugin.appbrand.page.d2(this));
            }
        }
    }
}
