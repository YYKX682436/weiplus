package bk4;

/* loaded from: classes11.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f21528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f21529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n80.c f21530f;

    public p0(android.view.View view, mj4.h hVar, n80.c cVar) {
        this.f21528d = view;
        this.f21529e = hVar;
        this.f21530f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper$setupGroupIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bk4.q0 q0Var = bk4.q0.f21538a;
        android.view.View view2 = this.f21528d;
        android.content.Context context = view2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        q0Var.b(context, this.f21529e, this.f21530f);
        qj4.s sVar = qj4.s.f363958a;
        android.content.Context context2 = view2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        qj4.s.m(sVar, context2, 96L, null, this.f21529e, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper$setupGroupIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
