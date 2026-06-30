package aj2;

/* loaded from: classes8.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f86829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj2.a f86830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj2.c f86831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f86832g;

    public b(in5.s0 s0Var, aj2.a aVar, aj2.c cVar, int i17) {
        this.f86829d = s0Var;
        this.f86830e = aVar;
        this.f86831f = cVar;
        this.f86832g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View p17 = this.f86829d.p(com.p314xaae8f345.mm.R.id.hxe);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        aj2.a aVar = this.f86830e;
        aVar.f86826e = true;
        this.f86831f.f86834f.mo146xb9724478(new aj2.e(aVar.f86825d, this.f86832g));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
