package pk2;

/* loaded from: classes3.dex */
public final class e7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.f7 f437242d;

    public e7(pk2.f7 f7Var) {
        this.f437242d = f7Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        pk2.f7 f7Var = this.f437242d;
        android.view.View view = f7Var.S;
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getHeight()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMMBottomSheet", sb6.toString());
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.view.View view2 = f7Var.S;
        ((b92.d1) zbVar).nj(f7Var, view2 != null ? view2.getHeight() : 0);
        android.view.View view3 = f7Var.S;
        if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
