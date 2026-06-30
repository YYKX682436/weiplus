package hb2;

/* loaded from: classes2.dex */
public final class e0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f361570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f361571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f361572f;

    public e0(so2.j5 j5Var, boolean z17, android.content.Context context) {
        this.f361570d = j5Var;
        this.f361571e = z17;
        this.f361572f = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ci2 req = (r45.ci2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        android.content.Context context = this.f361572f;
        if (m75939xb282bd08 != 0) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572890mh5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f361570d).getFeedObject();
        boolean z17 = this.f361571e;
        feedObject.m59366x5162d7dc(z17);
        java.lang.String string2 = z17 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574834jo0) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var2.f293309c = string2;
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var2.c();
    }
}
