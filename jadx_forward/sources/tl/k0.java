package tl;

/* loaded from: classes12.dex */
public class k0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f501590d;

    public k0(tl.p0 p0Var) {
        this.f501590d = p0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (!this.f501590d.m() || this.f501590d.f501606f == null) {
            tl.p0 p0Var = this.f501590d;
            java.lang.String str = p0Var.f501605e;
            if (str == null) {
                java.util.HashMap hashMap = w21.x0.f524044a;
            } else {
                w21.w0 j17 = w21.x0.j(str);
                if (j17 != null && j17.f524025i == 1) {
                    j17.f524025i = 2;
                    j17.f524017a = 64;
                    java.util.HashMap hashMap2 = w21.x0.f524044a;
                    synchronized (hashMap2) {
                        hashMap2.put(str, new java.lang.ref.WeakReference(p0Var));
                    }
                    w21.x0.w(j17);
                }
            }
            w21.p0.Bi().e();
        } else {
            dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
            qi3.b0 b0Var = this.f501590d.f501606f;
            ((ig0.o) fVar).getClass();
            if (b0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsgFeatureService", "startSync task is null");
            } else {
                if (!(b0Var instanceof qi3.c)) {
                    throw new java.lang.UnsupportedOperationException("startSync only support BaseSendMsgTask Type");
                }
                pu.t0 a17 = pu.t0.f439909i.a();
                qi3.c cVar = (qi3.c) b0Var;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);
                cVar.f445211g = b17;
                v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f439911f).mo141623x754a37bb(), null, new pu.r0(cVar, a17, null), 1, null);
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new ig0.l(b17, null), 1, null);
                }
            }
        }
        java.lang.String str2 = this.f501590d.f501605e;
        return false;
    }
}
