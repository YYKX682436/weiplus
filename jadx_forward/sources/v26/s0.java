package v26;

/* loaded from: classes14.dex */
public final class s0 extends p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 {
    public s0(int i17) {
        super(1, Integer.MAX_VALUE, u26.u.DROP_OLDEST);
        e(java.lang.Integer.valueOf(i17));
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.f3
    /* renamed from: getValue */
    public java.lang.Object mo144003x754a37bb() {
        java.lang.Integer valueOf;
        synchronized (this) {
            java.lang.Object[] objArr = this.f391908n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            valueOf = java.lang.Integer.valueOf(((java.lang.Number) objArr[((int) ((this.f391909o + ((int) ((p() + this.f391911q) - this.f391909o))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
