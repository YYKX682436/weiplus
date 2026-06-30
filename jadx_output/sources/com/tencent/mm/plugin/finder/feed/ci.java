package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ci implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f106479d;

    public ci(com.tencent.mm.plugin.finder.feed.li liVar) {
        this.f106479d = liVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.tencent.mm.plugin.finder.feed.li liVar = this.f106479d;
            if (a07 >= liVar.f107294d.f109191p.size()) {
                return;
            }
            com.tencent.mm.plugin.finder.feed.uh uhVar = liVar.f107294d;
            java.lang.Object obj = uhVar.f109191p.get(a07);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            cd2.b bVar = (cd2.b) obj;
            com.tencent.mm.plugin.finder.feed.vh vhVar = liVar.f107295e;
            cd2.c mention = bVar.f40655d;
            if (vhVar != null) {
                kotlin.jvm.internal.o.g(mention, "mention");
            }
            com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", "onClick " + a07 + " id:" + mention.i() + " commentId:" + mention.a());
            int i18 = uhVar.f109182d == 1 ? 7 : 5;
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb.W3((c61.yb) c17, mention.l(), mention.m(), i18, uhVar.f109182d, "", true, null, null, 0L, null, false, false, null, null, 0, null, 57280, null).l().K(new com.tencent.mm.plugin.finder.feed.wh(i18));
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            java.lang.String l17 = com.tencent.mm.plugin.finder.feed.li.l(liVar);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            long l18 = bVar.f40655d.l();
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(l18));
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            a4Var.b(l17, b17, "person_page_message_page_message", gVar2);
        }
    }
}
