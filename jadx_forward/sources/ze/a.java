package ze;

/* loaded from: classes7.dex */
public abstract class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public int f553248d;

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = this.f553248d + 1;
        this.f553248d = i39;
        ze.d dVar = (ze.d) this;
        android.view.View view2 = dVar.f553253e;
        if (i39 == 10) {
            view2.removeOnLayoutChangeListener(dVar);
            return;
        }
        boolean z17 = i17 == i18 && i17 == i27 && i17 == i19;
        if (i17 == i28 && i19 == i37 && i27 == i38 && i18 == i29 && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "onLayoutChange: no changed, ignore");
            return;
        }
        ze.g gVar = dVar.f553254f;
        if (gVar.m178758xe21a8068() != null) {
            ze.g.m178756x68124904(gVar, "onConfigurationChanged", false, 2, null);
        }
        view2.removeOnLayoutChangeListener(dVar);
    }
}
