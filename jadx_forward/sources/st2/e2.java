package st2;

/* loaded from: classes3.dex */
public final class e2 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f493808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f493809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f493810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f493811d;

    public e2(gk2.e eVar, l81.b1 b1Var, long j17, boolean z17) {
        this.f493808a = eVar;
        this.f493809b = b1Var;
        this.f493810c = j17;
        this.f493811d = z17;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        st2.f2 f2Var = st2.f2.f493820a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "prerender mini pro fail,errCode:" + i17 + ",errMsg:" + str);
        if (this.f493811d) {
            f2Var.c(this.f493809b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[prepareEnv]");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Yf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170366x);
            st2.f2.f493821b = true;
        }
        gk2.e eVar = this.f493808a;
        if (eVar != null) {
            st2.k2.f493921a.a(eVar, this.f493809b, this.f493810c, java.lang.System.currentTimeMillis());
        }
    }

    @Override // l81.v0
    /* renamed from: onSuccess */
    public void mo50385xe05b4124() {
        st2.f2 f2Var = st2.f2.f493820a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "prerender mini pro success!");
        gk2.e eVar = this.f493808a;
        if (eVar != null) {
            st2.k2.f493921a.a(eVar, this.f493809b, this.f493810c, java.lang.System.currentTimeMillis());
        }
    }
}
