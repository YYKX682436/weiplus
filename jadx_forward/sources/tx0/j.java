package tx0;

/* loaded from: classes.dex */
public final class j implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f504054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f504055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f504056c;

    public j(java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f504054a = obj;
        this.f504055b = c0Var;
        this.f504056c = qVar;
    }

    @Override // u60.e
    /* renamed from: onLocationAddr */
    public void mo24721x71c058c5(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        java.lang.Object obj = this.f504054a;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f504055b;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f504056c;
        synchronized (obj) {
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Object obj2 = c11121x1f1011;
            if (c11121x1f1011 == null) {
                obj2 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("No Address"));
            }
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(obj2))));
        }
    }
}
