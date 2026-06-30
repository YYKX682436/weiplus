package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class p implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 f205632a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var) {
        this.f205632a = o0Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 10002) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            jz5.l[] lVarArr = new jz5.l[5];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = this.f205632a;
            lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(o0Var.b7()));
            lVarArr[1] = new jz5.l("source_feed_sessionbuffer", (java.lang.String) ((jz5.n) o0Var.D).mo141623x754a37bb());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[3] = new jz5.l("finder_context_id", b52.b.b());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = o0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            lVarArr[4] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
            hc2.v0.e(view, "recommend_to_friends", 8, 0, false, true, kz5.c1.k(lVarArr), null, 76, null);
        }
    }
}
