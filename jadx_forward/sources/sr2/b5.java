package sr2;

/* loaded from: classes5.dex */
public final class b5 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493054d;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493054d = c14609xb4d6eef6;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", "oldBottom " + i38 + ", bottom " + i27);
        if (i38 != i27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.Y6(this.f493054d, null, true, 1, null);
        }
    }
}
