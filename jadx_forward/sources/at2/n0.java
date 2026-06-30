package at2;

/* loaded from: classes2.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f95243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f95245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f95246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, android.view.MenuItem menuItem) {
        super(1);
        this.f95243d = context;
        this.f95244e = k0Var;
        this.f95245f = c19792x256d2725;
        this.f95246g = menuItem;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "onClick onMenuItemSelect");
        android.content.Context context = this.f95243d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(this.f95245f, 16384);
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            a17.m59367x7b6790db(c1Var != null ? c1Var.f410319c3 : null);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.view.MenuItem menuItem = this.f95246g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(menuItem);
            ((c61.p2) ybVar).Nj(activityC0065xcd7aa112, userName, (db5.h4) menuItem, a17, at2.m0.f95239d);
        }
        this.f95244e.u();
        return jz5.f0.f384359a;
    }
}
