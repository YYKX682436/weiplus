package qo1;

/* loaded from: classes5.dex */
public final class y0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f447096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qo1.c1 f447097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f447098c;

    public y0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, qo1.c1 c1Var, yz5.a aVar) {
        this.f447096a = f0Var;
        this.f447097b = c1Var;
        this.f447098c = aVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f1
    public final void a(int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamRestoreTask", "Get backed-up list complete. error=" + i17 + ", convList.siz=" + fVar.f297357d.size());
        this.f447096a.f391649d = i17 == 0 ? 0 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4;
        qo1.c1 c1Var = this.f447097b;
        c1Var.f447025r = fVar;
        c1Var.f447024q = this.f447098c;
        ku5.u0 u0Var = ku5.t0.f394148d;
        final qo1.c1 c1Var2 = this.f447097b;
        ((ku5.t0) u0Var).h(new java.lang.Runnable() { // from class: qo1.x0
            @Override // java.lang.Runnable
            public final void run() {
                qo1.c1.this.i();
            }
        }, c1Var2.f446991x);
    }
}
