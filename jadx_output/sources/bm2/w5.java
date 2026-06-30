package bm2;

/* loaded from: classes2.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f22410e;

    public w5(android.content.Context context, r45.h32 h32Var) {
        this.f22409d = context;
        this.f22410e = h32Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f22409d;
        kotlin.jvm.internal.o.f(context, "$context");
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", xy2.c.e(context));
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f22410e.toByteArray());
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(context, "$context");
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Hj(context, intent, 1013);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveNoticeAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
