package sz3;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.p f495596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495597e;

    public l(sz3.p pVar, sz3.m mVar) {
        this.f495596d = pVar;
        this.f495597e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.p pVar = this.f495596d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "requestGetProduct trackId: %s, session: %s", java.lang.Integer.valueOf(pVar.f495478b.f495492a.getId()), java.lang.Long.valueOf(pVar.f495479c));
        sz3.m mVar = this.f495597e;
        java.util.ArrayList arrayList = mVar.f495601d;
        xz3.f fVar = new xz3.f(pVar, mVar);
        mVar.k(fVar);
        arrayList.add(fVar);
        sz3.m.l(mVar);
    }
}
