package ue2;

/* loaded from: classes3.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f508401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f508402e;

    public y(ue2.e0 e0Var, boolean z17) {
        this.f508401d = e0Var;
        this.f508402e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ue2.e0 e0Var = this.f508401d;
        e0Var.setVisibility(8);
        android.view.View view = e0Var.f508339f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog$dismiss$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog$dismiss$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = e0Var.f508338e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        e0Var.f508341h = false;
        e0Var.f508342i = false;
        ue2.i0 i0Var = e0Var.f508340g;
        if (i0Var != null) {
            ue2.g gVar = (ue2.g) i0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ue2.o.f508360y, "onDismiss: 内部弹窗已取消");
            if (this.f508402e) {
                ue2.o.r(gVar.f508346a);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "dismiss: 弹窗隐藏完成");
    }
}
