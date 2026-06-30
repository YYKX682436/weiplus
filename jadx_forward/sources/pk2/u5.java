package pk2;

/* loaded from: classes3.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.v5 f437818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437820f;

    public u5(pk2.v5 v5Var, pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f437818d = v5Var;
        this.f437819e = o9Var;
        this.f437820f = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk2.f.f(this.f437818d, false, 1, null);
        this.f437819e.j(qo0.b.L4, null);
        this.f437820f.h();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.D, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
