package cm5;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f43428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f43429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f43430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f43431g;

    public e(android.view.View view, long j17, android.view.View.OnClickListener onClickListener, yz5.a aVar) {
        this.f43428d = view;
        this.f43429e = j17;
        this.f43430f = onClickListener;
        this.f43431g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/utils/CommonKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f43428d;
        view2.setClickable(false);
        view2.postDelayed(new cm5.d(view2), this.f43429e);
        android.view.View.OnClickListener onClickListener = this.f43430f;
        if (onClickListener != null) {
            onClickListener.onClick(view2);
        }
        yz5.a aVar = this.f43431g;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/utils/CommonKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
