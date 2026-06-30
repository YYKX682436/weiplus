package sc2;

/* loaded from: classes2.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.i f487429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f487430e;

    public g(sc2.i iVar, android.content.Context context) {
        this.f487429d = iVar;
        this.f487430e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        sc2.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        r45.xl2 m76946x746418e4;
        if (menuItem.getItemId() != 2000 || (abstractC14490x69736cb5 = (iVar = this.f487429d).f487492e) == null) {
            return;
        }
        iVar.getClass();
        android.content.Context context = this.f487430e;
        java.lang.String e17 = xy2.c.e(context);
        long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
        long m75942xfb822ef2 = (m76802x2dd01666 == null || (m76946x746418e4 = m76802x2dd01666.m76946x746418e4()) == null) ? 0L : m76946x746418e4.m75942xfb822ef2(0);
        java.lang.Long valueOf = java.lang.Long.valueOf(m75942xfb822ef2);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(m59251x5db1b11);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        db2.g2 g2Var = new db2.g2(2, valueOf, e17, valueOf2, nyVar != null ? nyVar.V6() : null);
        g2Var.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        pq5.g l17 = g2Var.l();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        }
        l17.K(new sc2.e(abstractC14490x69736cb5, m75942xfb822ef2, context));
    }
}
