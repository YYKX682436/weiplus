package r01;

/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final kk.t f449764a = new kk.t(64);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f449765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r01.x f449766c;

    public s(r01.x xVar, r01.r rVar) {
        this.f449766c = xVar;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = true;
        if (!o45.wf.f424566k && !j62.e.g().l("clicfg_enable_bizinfo_cache", false, true, true)) {
            z17 = false;
        }
        this.f449765b = z17;
        if (z17) {
            xVar.add(new l75.q0() { // from class: r01.s$$a
                @Override // l75.q0
                /* renamed from: onNotifyChange */
                public final void mo735xb0dfc7d8(java.lang.String str2, l75.w0 w0Var) {
                    r01.s sVar = r01.s.this;
                    sVar.getClass();
                    java.lang.Object obj = w0Var.f398509d;
                    if ((obj instanceof qk.o) && w0Var.f398508c == sVar.f449766c) {
                        qk.o oVar = (qk.o) obj;
                        int i17 = w0Var.f398507b;
                        if (i17 == 3 || i17 == 4) {
                            sVar.f449764a.b(oVar.f66748xdec927b, oVar);
                            return;
                        }
                        if (i17 != 5) {
                            return;
                        }
                        kk.t tVar = sVar.f449764a;
                        java.lang.String str3 = oVar.f66748xdec927b;
                        synchronized (tVar) {
                            kk.s sVar2 = (kk.s) tVar.f390009c.remove(str3);
                            if (sVar2 == null) {
                                return;
                            }
                            int i18 = sVar2.f390006g;
                            int i19 = tVar.f390010d - 1;
                            tVar.f390010d = i19;
                            tVar.d(i18, i19);
                            tVar.c(sVar2.f390006g);
                        }
                    }
                }
            });
        }
    }
}
