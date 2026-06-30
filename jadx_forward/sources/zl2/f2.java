package zl2;

/* loaded from: classes2.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f555294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f555295i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555296m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, android.view.MenuItem menuItem, java.lang.String str) {
        super(1);
        this.f555290d = context;
        this.f555291e = h0Var;
        this.f555292f = abstractC14490x69736cb5;
        this.f555293g = h0Var2;
        this.f555294h = c19792x256d2725;
        this.f555295i = menuItem;
        this.f555296m = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "onClick onMenuItemSelect");
        android.content.Context context = this.f555290d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555292f;
        if (activityC0065xcd7aa112 != null) {
            r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
            if (pk5Var != null) {
                pk5Var.f464669h = ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) this.f555293g.f391656d)).f270255e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(this.f555294h, 16384);
            a17.m59422xb121f1ef(abstractC14490x69736cb5.getFeedObject().getShareScene());
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            a17.m59367x7b6790db(c1Var != null ? c1Var.f410319c3 : null);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.view.MenuItem menuItem = this.f555295i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(menuItem);
            ((c61.p2) ybVar).Nj(activityC0065xcd7aa112, userName, (db5.h4) menuItem, a17, new zl2.e2(abstractC14490x69736cb5, this.f555296m));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f555291e.f391656d;
        if (k0Var != null) {
            k0Var.u();
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.t1 t1Var = ml2.t1.f409506p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((b92.d1) zbVar).rj(t1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6());
        return jz5.f0.f384359a;
    }
}
