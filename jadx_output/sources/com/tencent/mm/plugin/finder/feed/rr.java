package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f108940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f108941e;

    public rr(com.tencent.mm.plugin.finder.feed.xr xrVar, int i17) {
        this.f108940d = xrVar;
        this.f108941e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.c n17;
        com.tencent.mm.ui.MMActivity context = this.f108940d.f111095d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
            return;
        }
        n17.b(new com.tencent.mm.plugin.finder.report.z5(this.f108941e));
    }
}
