package im2;

/* loaded from: classes3.dex */
public final class d5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f373826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f373827f;

    public d5(im2.h6 h6Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, boolean z17) {
        this.f373825d = h6Var;
        this.f373826e = c19782x23db1cfa;
        this.f373827f = z17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        im2.h6 h6Var = this.f373825d;
        if (itemId == h6Var.Q) {
            h6Var.N = null;
            im2.h6.f(h6Var, false, this.f373826e, this.f373827f);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            h6Var.Y().f492192n.m75942xfb822ef2(0);
            long j17 = h6Var.Y().f492181c;
            int i18 = !h6Var.Y().f492187i ? 1 : 0;
            r0Var.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("is_finder", java.lang.String.valueOf(i18));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.L1, hashMap, null, null, null, null, false, 124, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, liveid = " + ((java.lang.String) hashMap.get("liveid")) + ", feedid = " + ((java.lang.String) hashMap.get("feedid")) + ", is_finder = " + ((java.lang.String) hashMap.get("is_finder")));
        }
    }
}
