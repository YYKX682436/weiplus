package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.i4 f75564d;

    public h4(com.tencent.mm.plugin.appbrand.appcache.i4 i4Var) {
        this.f75564d = i4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appcache.i4 i4Var = this.f75564d;
        com.tencent.mm.plugin.appbrand.appcache.r4 r4Var = i4Var.f75589a.f75606d;
        if (r4Var.f75940i) {
            r4Var.o(r4Var.f75945q);
        } else {
            r4Var.o(r4Var.f75944p);
        }
        i4Var.f75589a.f75606d.l(0);
    }
}
