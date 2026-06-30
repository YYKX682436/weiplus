package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class l6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f103895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f103896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f103897i;

    public l6(com.tencent.mm.plugin.finder.convert.q6 q6Var, android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, zy2.gc gcVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f103892d = q6Var;
        this.f103893e = context;
        this.f103894f = finderItem;
        this.f103895g = z17;
        this.f103896h = gcVar;
        this.f103897i = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$setFeedMusicTopicLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f103894f;
        long id6 = finderItem.getId();
        java.lang.String objectNonceId = finderItem.getObjectNonceId();
        boolean z17 = !this.f103895g;
        this.f103892d.getClass();
        android.content.Context context = this.f103893e;
        im5.b bVar = context instanceof im5.b ? (im5.b) context : null;
        if (bVar != null) {
            java.lang.String string = context.getResources().getString(z17 ? com.tencent.mm.R.string.cpm : com.tencent.mm.R.string.f491312cq1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", string, true, false, null);
            if (Q != null) {
                Q.show();
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0 b0Var = hb2.b0.f280025e;
            com.tencent.mm.plugin.finder.convert.d5 d5Var = new com.tencent.mm.plugin.finder.convert.d5(Q, this.f103896h, context, z17);
            b0Var.getClass();
            kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
            r45.wh2 wh2Var = new r45.wh2();
            wh2Var.set(0, java.lang.Long.valueOf(id6));
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
        this.f103897i.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$setFeedMusicTopicLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
