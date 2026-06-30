package cm5;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f124962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f124963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f124964g;

    public e(android.view.View view, long j17, android.view.View.OnClickListener onClickListener, yz5.a aVar) {
        this.f124961d = view;
        this.f124962e = j17;
        this.f124963f = onClickListener;
        this.f124964g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/utils/CommonKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f124961d;
        view2.setClickable(false);
        view2.postDelayed(new cm5.d(view2), this.f124962e);
        android.view.View.OnClickListener onClickListener = this.f124963f;
        if (onClickListener != null) {
            onClickListener.onClick(view2);
        }
        yz5.a aVar = this.f124964g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/utils/CommonKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
