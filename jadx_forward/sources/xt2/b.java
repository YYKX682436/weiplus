package xt2;

/* loaded from: classes3.dex */
public final class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f538158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.d f538159e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, xt2.d dVar) {
        this.f538158d = lVar;
        this.f538159e = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean a17 = this.f538158d.a1();
        xt2.d dVar = this.f538159e;
        if (a17) {
            dVar.f538199o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f538200p, "watchShoppingEntrancePosition removeOnGlobalLayoutListener:" + this);
            return;
        }
        int i17 = dVar.f538201q;
        dVar.f538201q = i17 + 1;
        if (i17 >= Integer.MAX_VALUE) {
            dVar.f538201q = 0;
        }
    }
}
