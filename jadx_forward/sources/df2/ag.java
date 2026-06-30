package df2;

/* loaded from: classes3.dex */
public final class ag implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f311247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f311248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f311249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f311250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f311251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.ug f311252i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f311253m;

    public ag(yz5.l lVar, dk2.zf zfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, df2.ug ugVar, android.view.View view2) {
        this.f311247d = lVar;
        this.f311248e = zfVar;
        this.f311249f = mgVar;
        this.f311250g = view;
        this.f311251h = c14197x319b1b9e;
        this.f311252i = ugVar;
        this.f311253m = view2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dk2.zf msg = this.f311248e;
        if (itemId != 163) {
            yz5.l lVar = this.f311247d;
            if (itemId == 165) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(3, mm2.j2.F.a(msg.p()));
            } else if (itemId != 166) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq zqVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq.f215023a;
                android.content.Context context = this.f311250g.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                gk2.e liveRoomData = this.f311251h.getLiveRoomData();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f311252i.f372632e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
                zqVar.d(2, context, liveRoomData, k0Var != null ? k0Var.m57691xa0fa63f9() : null, this.f311253m, this.f311249f, menuItem, i17, this.f311248e);
            } else {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(7, mm2.j2.F.a(msg.p()));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg commentPlugin = this.f311249f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentPlugin, "commentPlugin");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", msg.a());
            bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 2);
            bundle.putString("PARAM_MEMBERS_PROFILE_MESSAGE_ID", msg.v());
            bundle.putLong("PARAM_MEMBERS_PROFILE_MESSAGE_SEQ", msg.m());
            commentPlugin.f195036p.mo46557x60d69242(qo0.b.f446909l1, bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
    }
}
