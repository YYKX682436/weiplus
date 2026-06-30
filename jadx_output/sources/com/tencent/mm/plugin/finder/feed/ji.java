package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ji extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f107108a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f107109b;

    public ji(com.tencent.mm.plugin.finder.feed.li liVar) {
        this.f107109b = liVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                cd2.b bVar = obj instanceof cd2.b ? (cd2.b) obj : null;
                if (bVar != null) {
                    java.util.HashSet hashSet = this.f107108a;
                    if (!hashSet.contains(java.lang.Long.valueOf(bVar.getItemId()))) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChildExposeChanged:");
                        sb6.append(s0Var.getAdapterPosition());
                        sb6.append(",feedId:");
                        sb6.append(bVar.getItemId());
                        sb6.append(",commentScene:");
                        com.tencent.mm.plugin.finder.feed.li liVar = this.f107109b;
                        sb6.append(com.tencent.mm.plugin.finder.feed.li.l(liVar));
                        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
                        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
                        java.lang.String l17 = com.tencent.mm.plugin.finder.feed.li.l(liVar);
                        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                        java.lang.String b17 = b52.b.b();
                        long l18 = bVar.f40655d.l();
                        cl0.g gVar = new cl0.g();
                        gVar.h("feedid", pm0.v.u(l18));
                        java.lang.String gVar2 = gVar.toString();
                        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                        a4Var.a(l17, "", b17, "person_page_message_page_message", gVar2);
                        hashSet.add(java.lang.Long.valueOf(bVar.getItemId()));
                    }
                }
            }
        }
    }
}
