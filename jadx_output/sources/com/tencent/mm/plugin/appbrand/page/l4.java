package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f86852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86854g;

    public l4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f86854g = i3Var;
        this.f86851d = str;
        this.f86852e = z17;
        this.f86853f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f86854g.z(this.f86851d, this.f86852e ? com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH : com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH, null, this.f86853f);
    }
}
