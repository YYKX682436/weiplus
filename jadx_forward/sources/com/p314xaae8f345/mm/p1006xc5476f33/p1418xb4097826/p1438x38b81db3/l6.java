package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class l6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f185425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f185427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f185428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f185429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f185430i;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, zy2.gc gcVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f185425d = q6Var;
        this.f185426e = context;
        this.f185427f = c14994x9b99c079;
        this.f185428g = z17;
        this.f185429h = gcVar;
        this.f185430i = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$setFeedMusicTopicLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f185427f;
        long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
        java.lang.String objectNonceId = c14994x9b99c079.m59276x6c285d75();
        boolean z17 = !this.f185428g;
        this.f185425d.getClass();
        android.content.Context context = this.f185426e;
        im5.b bVar = context instanceof im5.b ? (im5.b) context : null;
        if (bVar != null) {
            java.lang.String string = context.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.cpm : com.p314xaae8f345.mm.R.C30867xcad56011.f572845cq1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, "", string, true, false, null);
            if (Q != null) {
                Q.show();
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0 b0Var = hb2.b0.f361558e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d5 d5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d5(Q, this.f185429h, context, z17);
            b0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
            r45.wh2 wh2Var = new r45.wh2();
            wh2Var.set(0, java.lang.Long.valueOf(m59251x5db1b11));
            wh2Var.set(1, 5);
            wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
            wh2Var.set(3, objectNonceId);
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 4);
            hx0Var.set(1, b0Var.c(wh2Var));
            android.content.Context context2 = bVar instanceof android.content.Context ? (android.content.Context) bVar : null;
            java.lang.String f17 = xy2.c.f(context2 != null ? xy2.c.d(context2) : null);
            pq5.g l17 = new hb2.a(f17, kz5.b0.c(hx0Var), false, 0, null, 24, null).l();
            l17.f(bVar);
            l17.K(new hb2.u0(b0Var, f17, wh2Var, d5Var));
        }
        this.f185430i.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$setFeedMusicTopicLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
