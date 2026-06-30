package pm0;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438309e;

    public j(android.view.View view, yz5.a aVar) {
        this.f438308d = view;
        this.f438309e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        pm0.i iVar = new pm0.i(this.f438309e);
        android.view.View view2 = this.f438308d;
        view2.post(iVar);
        view2.removeOnLayoutChangeListener(this);
    }
}
