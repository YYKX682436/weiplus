package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class c extends p3325xe03a0797.p3326xc267989b.w2 {

    /* renamed from: _disposer */
    private volatile /* synthetic */ java.lang.Object f72695x1664cf92 = null;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f391679h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.s1 f391680i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.e f391681m;

    public c(p3325xe03a0797.p3326xc267989b.e eVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f391681m = eVar;
        this.f391679h = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f384359a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.g0
    public void u(java.lang.Throwable th6) {
        if (th6 != null) {
            p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) this.f391679h;
            rVar.getClass();
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 w17 = rVar.w(new p3325xe03a0797.p3326xc267989b.e0(th6, false, 2, null), null, null);
            if (w17 != null) {
                ((p3325xe03a0797.p3326xc267989b.r) this.f391679h).e(w17);
                p3325xe03a0797.p3326xc267989b.d dVar = (p3325xe03a0797.p3326xc267989b.d) this.f72695x1664cf92;
                if (dVar != null) {
                    dVar.d();
                    return;
                }
                return;
            }
            return;
        }
        if (p3325xe03a0797.p3326xc267989b.e.f391702b.decrementAndGet(this.f391681m) == 0) {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f391679h;
            p3325xe03a0797.p3326xc267989b.f1[] f1VarArr = this.f391681m.f391703a;
            java.util.ArrayList arrayList = new java.util.ArrayList(f1VarArr.length);
            for (p3325xe03a0797.p3326xc267989b.f1 f1Var : f1VarArr) {
                arrayList.add(f1Var.f());
            }
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList));
        }
    }

    public final void x(p3325xe03a0797.p3326xc267989b.d dVar) {
        this.f72695x1664cf92 = dVar;
    }
}
