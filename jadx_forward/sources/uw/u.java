package uw;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f513045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f513046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p3325xe03a0797.p3326xc267989b.q qVar, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(1);
        this.f513045d = qVar;
        this.f513046e = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        if (((p3325xe03a0797.p3326xc267989b.r) this.f513045d).n() && p3325xe03a0797.p3326xc267989b.z0.h(this.f513046e)) {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f513045d;
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f513046e;
            synchronized (qVar) {
                try {
                    p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) qVar;
                    if (rVar.n() && p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                        rVar.mo48700xdecd0e93(value);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBSGetPoiHelper", "Callback exception: " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
