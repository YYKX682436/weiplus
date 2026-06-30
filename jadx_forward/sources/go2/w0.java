package go2;

/* loaded from: classes2.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f355610g;

    public w0(android.content.Context context, int i17, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f355607d = context;
        this.f355608e = i17;
        this.f355609f = str;
        this.f355610g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$showMemberBecomeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f355607d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        boolean d17 = eo2.f.f337098a.d(java.lang.Integer.valueOf(this.f355608e));
        java.lang.String str = this.f355609f;
        if (d17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Gk(context, intent, str);
        } else {
            km5.d T = pm0.v.T(new ho2.c(V6, this.f355609f, 0, 4, null).l(), new go2.v0(context, intent, str));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            T.f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context);
        }
        this.f355610g.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$showMemberBecomeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
