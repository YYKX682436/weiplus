package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class s2 extends v26.d {

    /* renamed from: a, reason: collision with root package name */
    public long f391935a = -1;

    /* renamed from: b, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f391936b;

    @Override // v26.d
    public boolean a(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) obj;
        if (this.f391935a >= 0) {
            return false;
        }
        long j17 = q2Var.f391909o;
        if (j17 < q2Var.f391910p) {
            q2Var.f391910p = j17;
        }
        this.f391935a = j17;
        return true;
    }

    @Override // v26.d
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] b(java.lang.Object obj) {
        long j17 = this.f391935a;
        this.f391935a = -1L;
        this.f391936b = null;
        return ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) obj).v(j17);
    }
}
