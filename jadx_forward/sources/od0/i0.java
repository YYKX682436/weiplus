package od0;

/* loaded from: classes13.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb f426080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ od0.v f426082f;

    public i0(od0.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb, int i17) {
        this.f426082f = vVar;
        this.f426080d = c16751xb808cbcb;
        this.f426081e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af;
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397 c16753xd2202397;
        od0.v vVar = this.f426082f;
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
            if (c17 != null && (binderC11173x1cfac0af = c17.f153526n) != null && binderC11173x1cfac0af.mo9865x7b0e9c5f()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397 c16753xd22023972 = ko3.a0.INSTANCE.f391467d;
                synchronized (c16753xd22023972) {
                    c16753xd2202397 = new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397();
                    c16753xd2202397.a(c16753xd22023972);
                }
                byte[] v86 = fo3.s.INSTANCE.v8(currentTimeMillis, c16753xd2202397, this.f426080d, vVar.f426115f, vVar.f426113d, vVar.f426114e);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(v86);
                k57Var.f459943w = cu5Var;
                vVar.Ai(this.f426081e, k57Var.mo14344x5f01b1f6(), false);
                vVar.f426113d.a(c16753xd2202397);
                com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb = vVar.f426114e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb2 = this.f426080d;
                c16751xb808cbcb.getClass();
                c16751xb808cbcb.f233934d = c16751xb808cbcb2.f233934d;
                c16751xb808cbcb.f233935e = c16751xb808cbcb2.f233935e;
                c16751xb808cbcb.f233936f = c16751xb808cbcb2.f233936f;
                c16751xb808cbcb.f233937g = c16751xb808cbcb2.f233937g;
                vVar.f426115f = currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report cai suc");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report cai error, msg:" + th6);
        }
    }
}
