package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class d extends p3325xe03a0797.p3326xc267989b.n {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c[] f391684d;

    public d(p3325xe03a0797.p3326xc267989b.e eVar, p3325xe03a0797.p3326xc267989b.c[] cVarArr) {
        this.f391684d = cVarArr;
    }

    @Override // p3325xe03a0797.p3326xc267989b.o
    public void a(java.lang.Throwable th6) {
        d();
    }

    public final void d() {
        for (p3325xe03a0797.p3326xc267989b.c cVar : this.f391684d) {
            p3325xe03a0797.p3326xc267989b.s1 s1Var = cVar.f391680i;
            if (s1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("handle");
                throw null;
            }
            s1Var.mo144008x63a5261f();
        }
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        d();
        return jz5.f0.f384359a;
    }

    /* renamed from: toString */
    public java.lang.String m143978x9616526c() {
        return "DisposeHandlersOnCancel[" + this.f391684d + ']';
    }
}
