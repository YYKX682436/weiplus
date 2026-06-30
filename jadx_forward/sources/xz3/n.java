package xz3;

/* loaded from: classes15.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f539767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.p f539768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f539769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f539770g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f539771h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539772i;

    public n(int i17, xz3.p pVar, java.util.List list, int i18, int i19, java.lang.String str) {
        this.f539767d = i17;
        this.f539768e = pVar;
        this.f539769f = list;
        this.f539770g = i18;
        this.f539771h = i19;
        this.f539772i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f539767d;
        xz3.p pVar = this.f539768e;
        long j17 = pVar.f539778e;
        sz3.p pVar2 = pVar.f539779f;
        sz3.x0 x0Var = new sz3.x0(i17, j17, pVar2.f495477a, pVar2.f495481e);
        x0Var.f495685f = pVar.f539779f.f495478b.f495497f;
        java.util.Iterator it = this.f539769f.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList = x0Var.f495684e;
            sz3.w0 w0Var = new sz3.w0();
            pVar.a(pVar.f539779f, w0Var);
            w0Var.f495671i = intValue;
            w0Var.f495670h = 3;
            arrayList.add(w0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageUploadTask", "onUploadFailed source: %d, scanImageType: %s, requestTrackIdList: %s", java.lang.Integer.valueOf(this.f539767d), java.lang.Integer.valueOf(pVar.f539779f.f495477a), kz5.n0.g0(this.f539769f, ",", null, null, 0, null, null, 62, null));
        pVar.f539780g.d(x0Var, this.f539767d, pVar.f539778e, this.f539770g, this.f539771h, this.f539772i);
    }
}
