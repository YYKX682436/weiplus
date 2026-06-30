package zx4;

/* loaded from: classes7.dex */
public final class j0 implements al5.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f558685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f558686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f558687f;

    public j0(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.Runnable runnable) {
        this.f558685d = qVar;
        this.f558686e = c22633x83752a59;
        this.f558687f = runnable;
    }

    @Override // al5.o2
    public void F3(int i17, int i18, int i19, int i27) {
        p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) this.f558685d;
        if (rVar.n()) {
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(i18)));
        }
        this.f558686e.C.remove(this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f558687f);
    }
}
