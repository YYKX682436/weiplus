package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ji extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f188641a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188642b;

    public ji(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar) {
        this.f188642b = liVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                cd2.b bVar = obj instanceof cd2.b ? (cd2.b) obj : null;
                if (bVar != null) {
                    java.util.HashSet hashSet = this.f188641a;
                    if (!hashSet.contains(java.lang.Long.valueOf(bVar.mo2128x1ed62e84()))) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChildExposeChanged:");
                        sb6.append(s0Var.m8183xf806b362());
                        sb6.append(",feedId:");
                        sb6.append(bVar.mo2128x1ed62e84());
                        sb6.append(",commentScene:");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f188642b;
                        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li.l(liVar));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
                        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li.l(liVar);
                        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                        java.lang.String b17 = b52.b.b();
                        long l18 = bVar.f122188d.l();
                        cl0.g gVar = new cl0.g();
                        gVar.h("feedid", pm0.v.u(l18));
                        java.lang.String gVar2 = gVar.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                        a4Var.a(l17, "", b17, "person_page_message_page_message", gVar2);
                        hashSet.add(java.lang.Long.valueOf(bVar.mo2128x1ed62e84()));
                    }
                }
            }
        }
    }
}
