package xc5;

/* loaded from: classes12.dex */
public final class d0 implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f534943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534944b;

    public d0(xc5.h0 h0Var, mf3.k kVar) {
        this.f534943a = h0Var;
        this.f534944b = kVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        long j17 = (n1Var == null || (gVar2 = n1Var.f152640e) == null) ? 0L : gVar2.f69496x83ec3dd;
        long j18 = (n1Var == null || (gVar = n1Var.f152640e) == null) ? 0L : gVar.f69500x8ab84c59;
        if (j18 <= 0) {
            return;
        }
        float f17 = ((float) j17) / ((float) j18);
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        xc5.h0 h0Var = this.f534943a;
        p3325xe03a0797.p3326xc267989b.l.d(h0Var.f535001z, null, null, new xc5.c0(h0Var, this.f534944b, f17, null), 3, null);
    }
}
