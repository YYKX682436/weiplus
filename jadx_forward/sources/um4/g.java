package um4;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback f510652d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback) {
        this.f510652d = iLiteAppUICallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        android.view.View rootView = ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) this.f510652d).getRootView();
        ((lf0.h0) g0Var).getClass();
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.og_);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/feature/topstory/TopStoryUIService", "hideNavBarShadow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/feature/topstory/TopStoryUIService", "hideNavBarShadow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
