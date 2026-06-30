package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87160f;

    public v3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, boolean z17, com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        this.f87160f = i3Var;
        this.f87158d = z17;
        this.f87159e = w2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f87158d) {
            this.f87160f.Z(this.f87159e);
        }
    }
}
