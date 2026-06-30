package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ci implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188012d;

    public ci(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar) {
        this.f188012d = liVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f188012d;
            if (a07 >= liVar.f188827d.f190724p.size()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar = liVar.f188827d;
            java.lang.Object obj = uhVar.f190724p.get(a07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            cd2.b bVar = (cd2.b) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vh vhVar = liVar.f188828e;
            cd2.c mention = bVar.f122188d;
            if (vhVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", "onClick " + a07 + " id:" + mention.i() + " commentId:" + mention.a());
            int i18 = uhVar.f190715d == 1 ? 7 : 5;
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb.W3((c61.yb) c17, mention.l(), mention.m(), i18, uhVar.f190715d, "", true, null, null, 0L, null, false, false, null, null, 0, null, 57280, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wh(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li.l(liVar);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            long l18 = bVar.f122188d.l();
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(l18));
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            a4Var.b(l17, b17, "person_page_message_page_message", gVar2);
        }
    }
}
