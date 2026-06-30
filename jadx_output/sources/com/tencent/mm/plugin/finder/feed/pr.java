package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f108744d;

    public pr(com.tencent.mm.plugin.finder.feed.xr xrVar) {
        this.f108744d = xrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f108744d;
        if (xrVar.f111097f.m().getLastBuffer() != null) {
            xrVar.f111097f.m().slideUpPullTop();
            return;
        }
        com.tencent.mm.plugin.finder.feed.kr krVar = xrVar.f111097f;
        krVar.getClass();
        com.tencent.mm.plugin.finder.feed.er erVar = new com.tencent.mm.plugin.finder.feed.er(krVar);
        long j17 = krVar.f107236m;
        java.lang.String str = krVar.f107237n;
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5);
        int i17 = krVar.C;
        java.lang.String str2 = krVar.f107241r;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        pq5.g l17 = new db2.g4(j17, str, integer, i17, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, krVar.f107240q, null, 0, 0, krVar.f107239p, null, false, null, null, 519032768, null).l();
        l17.f(activity);
        l17.h(new com.tencent.mm.plugin.finder.feed.jp(krVar, erVar));
    }
}
