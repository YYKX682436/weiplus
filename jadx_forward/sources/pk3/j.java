package pk3;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.l f437984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f437985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn5.a f437987g;

    public j(pk3.l lVar, boolean z17, boolean z18, qn5.a aVar) {
        this.f437984d = lVar;
        this.f437985e = z17;
        this.f437986f = z18;
        this.f437987g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk3.e eVar = this.f437984d.f437991d;
        boolean z17 = eVar != null;
        qn5.a aVar = this.f437987g;
        if (!z17) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (eVar != null) {
            if (eVar.f437974a == null) {
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hide MultiTaskFloatBallView, transAnim:");
            boolean z18 = this.f437985e;
            sb6.append(z18);
            sb6.append(", alphaAnim:");
            boolean z19 = this.f437986f;
            sb6.append(z19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222 = eVar.f437974a;
            if (c16602xcd2cf222 != null) {
                c16602xcd2cf222.l(z18, z19, aVar);
            }
        }
    }
}
