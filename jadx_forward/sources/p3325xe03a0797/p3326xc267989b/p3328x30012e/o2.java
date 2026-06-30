package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class o2 implements p3325xe03a0797.p3326xc267989b.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 f391885d;

    /* renamed from: e, reason: collision with root package name */
    public final long f391886e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f391887f;

    /* renamed from: g, reason: collision with root package name */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f391888g;

    public o2(p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var, long j17, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f391885d = q2Var;
        this.f391886e = j17;
        this.f391887f = obj;
        this.f391888g = interfaceC29045xdcb5ca57;
    }

    @Override // p3325xe03a0797.p3326xc267989b.s1
    /* renamed from: dispose */
    public void mo144008x63a5261f() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = this.f391885d;
        synchronized (q2Var) {
            if (this.f391886e < q2Var.p()) {
                return;
            }
            java.lang.Object[] objArr = q2Var.f391908n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            int i17 = (int) this.f391886e;
            if (objArr[(objArr.length - 1) & i17] != this) {
                return;
            }
            objArr[i17 & (objArr.length - 1)] = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.f391922a;
            q2Var.k();
        }
    }
}
