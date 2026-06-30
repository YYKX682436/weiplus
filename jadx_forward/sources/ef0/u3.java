package ef0;

/* loaded from: classes8.dex */
public final class u3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f333868d;

    public u3(ef0.z3 z3Var) {
        this.f333868d = z3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.xs2 xs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        ef0.z3 z3Var = this.f333868d;
        z3Var.getClass();
        if (aVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTingTaskBarRecommendData path: ");
        sb6.append(aVar.f186864e);
        sb6.append(", ctrlType: ");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = aVar.f186862c;
        sb6.append(jbVar != null ? java.lang.Integer.valueOf(jbVar.f65875xb5fc3ab6) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRedDotFeatureService", sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f186864e, "Listen.SlideOver")) {
            qk.h9 h9Var = (qk.h9) i95.n0.c(qk.h9.class);
            if (jbVar != null && (xs2Var = jbVar.N) != null) {
                gVar = xs2Var.m75934xbce7f2f(7);
            }
            z3Var.f333914f.mo7808x76db6cb1(((ef0.d4) h9Var).Ai(gVar));
        }
    }
}
