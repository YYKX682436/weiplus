package bk4;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f103026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f103027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103028g;

    public j1(android.view.View view, long j17, android.view.View.OnClickListener onClickListener, yz5.a aVar) {
        this.f103025d = view;
        this.f103026e = j17;
        this.f103027f = onClickListener;
        this.f103028g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextStatusUtilsKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f103025d;
        view2.setClickable(false);
        view2.postDelayed(new bk4.i1(view2), this.f103026e);
        android.view.View.OnClickListener onClickListener = this.f103027f;
        if (onClickListener != null) {
            onClickListener.onClick(view2);
        }
        yz5.a aVar = this.f103028g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextStatusUtilsKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
