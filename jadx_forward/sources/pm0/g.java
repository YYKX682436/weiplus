package pm0;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f438303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438304e;

    public g(yz5.a aVar, android.view.View view) {
        this.f438304e = view;
        this.f438303d = new pm0.f(aVar, view, this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        yz5.a aVar = this.f438303d;
        android.view.View view2 = this.f438304e;
        if (view == null) {
            view2.removeCallbacks(new pm0.p(aVar));
            view2.removeOnLayoutChangeListener(this);
        } else {
            view2.removeCallbacks(new pm0.p(aVar));
            view2.postDelayed(new pm0.p(aVar), 100L);
        }
    }
}
