package xu2;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f538743d;

    public m(xu2.n nVar) {
        this.f538743d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xu2.n nVar = this.f538743d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f538748e, "showFeedBackFrameOne");
        android.view.ViewGroup viewGroup = nVar.f538749f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view = nVar.f538750g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = nVar.f538751h;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup2 = nVar.f538749f;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
        }
    }
}
