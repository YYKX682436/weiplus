package xz3;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f539754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.j f539755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539757g;

    public h(int i17, xz3.j jVar, int i18, java.lang.String str) {
        this.f539754d = i17;
        this.f539755e = jVar;
        this.f539756f = i18;
        this.f539757g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f539754d;
        xz3.j jVar = this.f539755e;
        long j17 = jVar.f539761e;
        sz3.n request = jVar.f539762f;
        sz3.x0 x0Var = new sz3.x0(i17, j17, request.f495477a, request.f495481e);
        x0Var.f495685f = request.f495478b.f495497f;
        java.util.ArrayList arrayList = jVar.f539766m;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList2 = x0Var.f495684e;
            sz3.w0 w0Var = new sz3.w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            w0Var.f495664b = request.f495480d;
            w0Var.f495665c = request.f495479c;
            w0Var.f495666d = request.f495477a;
            w0Var.f495667e = request.f495478b;
            w0Var.f495671i = intValue;
            w0Var.f495670h = 5;
            arrayList2.add(w0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageRetrievalTask", "onRetrievalFailed source: %d, requestTrackIdList: %s", java.lang.Integer.valueOf(this.f539754d), kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        jVar.f539763g.a(x0Var, this.f539754d, jVar.f539761e, this.f539756f, this.f539757g);
    }
}
