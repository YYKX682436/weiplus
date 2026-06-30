package bm2;

/* loaded from: classes2.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f103943e;

    public w5(android.content.Context context, r45.h32 h32Var) {
        this.f103942d = context;
        this.f103943e = h32Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f103942d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", xy2.c.e(context));
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f103943e.mo14344x5f01b1f6());
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Hj(context, intent, 1013);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
