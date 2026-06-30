package zl2;

/* loaded from: classes2.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f555316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555319i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.MenuItem menuItem, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.String str) {
        super(1);
        this.f555314d = abstractC14490x69736cb5;
        this.f555315e = h0Var;
        this.f555316f = menuItem;
        this.f555317g = context;
        this.f555318h = h0Var2;
        this.f555319i = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = this.f555314d.getFeedObject().getFeedObject();
        if (feedObject != null) {
            android.content.Context context = this.f555317g;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f555318h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555314d;
            java.lang.String str = this.f555319i;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f555315e;
            o25.y1 y1Var = (o25.y1) h0Var2.f391656d;
            if (y1Var != null) {
                android.view.MenuItem menuItem = this.f555316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).aj((db5.h4) menuItem, new zl2.f2(context, h0Var, abstractC14490x69736cb5, h0Var2, feedObject, menuItem, str));
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409503o, null, null, null, null, null, false, 126, null);
        }
        return jz5.f0.f384359a;
    }
}
