package oh4;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh4.n f427016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph4.b f427017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.rs4 f427018g;

    public m(java.lang.String str, oh4.n nVar, ph4.b bVar, r45.rs4 rs4Var) {
        this.f427015d = str;
        this.f427016e = nVar;
        this.f427017f = bVar;
        this.f427018g = rs4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f427015d;
        android.graphics.Bitmap L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, 512, 512);
        oh4.n nVar = this.f427016e;
        ph4.b bVar = this.f427017f;
        if (L == null) {
            bVar.f435995e.post(new oh4.l(nVar, bVar, this.f427018g));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f427019b, "use cover path: " + str);
        bVar.f435995e.post(new oh4.k(bVar, L));
    }
}
