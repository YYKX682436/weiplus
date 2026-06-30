package ql2;

/* loaded from: classes.dex */
public final class y implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f446102a;

    public y(android.view.View view) {
        this.f446102a = view;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        if (i17 == 2) {
            android.view.View view = this.f446102a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/status/LivePullDownView$1$1", "onLiveStatusCallback", "(JILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/status/LivePullDownView$1$1", "onLiveStatusCallback", "(JILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
