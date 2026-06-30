package ug5;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f509169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f509170g;

    public n(ug5.v vVar, android.view.View view, android.view.Window window, android.widget.FrameLayout frameLayout) {
        this.f509167d = vVar;
        this.f509168e = view;
        this.f509169f = window;
        this.f509170g = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do Animation start, params: ");
        ug5.v vVar = this.f509167d;
        sb6.append(vVar.f509191a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", sb6.toString());
        this.f509168e.postDelayed(new ug5.m(vVar, this.f509169f, this.f509170g), 60L);
    }
}
