package fo5;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fo5.r0 r0Var) {
        super(0);
        this.f346614d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "flipCamera");
        fo5.r0 r0Var = this.f346614d;
        if (r0Var.p()) {
            if (r0Var.t()) {
                r0Var.l();
            } else {
                ro5.b bVar = r0Var.f346630p;
                if (bVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                    throw null;
                }
                int i17 = bVar.b() ? 9 : 10;
                long j17 = r0Var.f346638x;
                long j18 = r0Var.f346639y;
                long j19 = r0Var.f346616b.f337699d;
                boolean z17 = r0Var.f346640z;
                long j27 = r0Var.f346637w;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 c7011xe05dc99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99();
                c7011xe05dc99.f143237d = j17;
                c7011xe05dc99.f143238e = j18;
                c7011xe05dc99.f143239f = j19 == 0 ? 1L : 2L;
                c7011xe05dc99.p(java.lang.String.valueOf(i17));
                c7011xe05dc99.f143240g = z17 ? 1L : 2L;
                c7011xe05dc99.f143243j = j27;
                c7011xe05dc99.f143242i = java.lang.System.currentTimeMillis();
                c7011xe05dc99.q("");
                c7011xe05dc99.k();
            }
        }
        r0Var.w();
        r0Var.i();
        r0Var.h();
        return jz5.f0.f384359a;
    }
}
