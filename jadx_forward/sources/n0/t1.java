package n0;

/* loaded from: classes13.dex */
public final class t1 implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f415236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f415237e;

    public t1(p3325xe03a0797.p3326xc267989b.q qVar, yz5.l lVar) {
        this.f415236d = qVar;
        this.f415237e = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        java.lang.Object m143895xf1229813;
        n0.u1 u1Var = n0.u1.f415247d;
        yz5.l lVar = this.f415237e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lVar.mo146xb9724478(java.lang.Long.valueOf(j17)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        ((p3325xe03a0797.p3326xc267989b.r) this.f415236d).mo48700xdecd0e93(m143895xf1229813);
    }
}
