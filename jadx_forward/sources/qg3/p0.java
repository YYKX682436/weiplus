package qg3;

/* loaded from: classes2.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f444375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yz5.l lVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(1);
        this.f444374d = lVar;
        this.f444375e = c19792x256d2725;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.aa1 aa1Var = (r45.aa1) obj;
        yz5.l lVar = this.f444374d;
        if (aa1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeCgiJavaStatic", "result is null");
            byte[] mo14344x5f01b1f6 = new bw5.kd0().mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            lVar.mo146xb9724478(mo14344x5f01b1f6);
        } else {
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189368f).mo141623x754a37bb()).c(this.f444375e.m76784x5db1b11());
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeCgiJavaStatic", "nextObject is null");
                byte[] mo14344x5f01b1f62 = new bw5.kd0().mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                lVar.mo146xb9724478(mo14344x5f01b1f62);
            } else {
                try {
                    bw5.zc0 zc0Var = new bw5.zc0();
                    zc0Var.d(new bw5.yr().mo11468x92b714fd(c17.mo14344x5f01b1f6()));
                    bw5.qg mo11468x92b714fd = new bw5.qg().mo11468x92b714fd(aa1Var.mo14344x5f01b1f6());
                    bw5.kd0 kd0Var = new bw5.kd0();
                    kd0Var.f110888g = zc0Var;
                    boolean[] zArr = kd0Var.f110889h;
                    zArr[4] = true;
                    kd0Var.f110887f = mo11468x92b714fd;
                    zArr[3] = true;
                    byte[] mo14344x5f01b1f63 = kd0Var.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
                    lVar.mo146xb9724478(mo14344x5f01b1f63);
                } catch (java.lang.Exception e17) {
                    byte[] mo14344x5f01b1f64 = new bw5.kd0().mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f64, "toByteArray(...)");
                    lVar.mo146xb9724478(mo14344x5f01b1f64);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NativeCgiJavaStatic", "fetchContinuePlayNextFeed ex " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
