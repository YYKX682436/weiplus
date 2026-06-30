package ik1;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f373382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f373383e;

    public z(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f373382d = qVar;
        this.f373383e = c22633x83752a59;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f373382d;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(this.f373383e.mo120162x95a6d12e())));
        }
    }
}
