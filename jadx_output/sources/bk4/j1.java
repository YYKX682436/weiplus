package bk4;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f21492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f21493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f21494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f21495g;

    public j1(android.view.View view, long j17, android.view.View.OnClickListener onClickListener, yz5.a aVar) {
        this.f21492d = view;
        this.f21493e = j17;
        this.f21494f = onClickListener;
        this.f21495g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextStatusUtilsKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f21492d;
        view2.setClickable(false);
        view2.postDelayed(new bk4.i1(view2), this.f21493e);
        android.view.View.OnClickListener onClickListener = this.f21494f;
        if (onClickListener != null) {
            onClickListener.onClick(view2);
        }
        yz5.a aVar = this.f21495g;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextStatusUtilsKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
