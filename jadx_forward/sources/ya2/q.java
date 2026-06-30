package ya2;

/* loaded from: classes.dex */
public final class q implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f542055b;

    public q(int i17, android.content.Context context, long j17) {
        this.f542054a = context;
        this.f542055b = j17;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 1) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "close_and_clear");
            aVar.ik(view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de, 25496);
            android.content.Context context = this.f542054a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
            lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            lVarArr[2] = new jz5.l("collection_id", pm0.v.u(this.f542055b));
            aVar.gk(view, kz5.c1.k(lVarArr));
        }
    }
}
