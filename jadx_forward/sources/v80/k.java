package v80;

@j95.b
/* loaded from: classes10.dex */
public final class k extends i95.w implements w80.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f515588d = new java.util.HashMap();

    public void Ai(java.lang.String currentTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentTalker, "currentTalker");
    }

    public void Bi(long j17, java.lang.String roomId, cn0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        java.lang.Integer num = (java.lang.Integer) this.f515588d.get(java.lang.Long.valueOf(j17));
        if (num == null || num.intValue() != 1) {
            if (aVar != null) {
                aVar.a(j17, 0);
            }
        } else if (aVar != null) {
            aVar.a(j17, num.intValue());
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveLogicFeatureService", "#onAccountInitialized beauty " + ko0.l.f391403a.b());
        ((ku5.t0) ku5.t0.f394148d).g(v80.j.f515587d);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            i95.m c17 = i95.n0.c(zy.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((bz.a) zy.u.p3((zy.u) c17, null, 1, null)).b().f118252e = ko0.q0.f391434d;
            ko0.c0 c0Var = ko0.c0.f391358a;
            pm0.v.K(null, ko0.v.f391441d);
            ko0.l0 l0Var = ko0.l0.f391411a;
            pm0.v.K(null, ko0.f0.f391385d);
        }
    }

    public oo0.c wi() {
        java.lang.String[] strArr = oo0.e.f428651f;
        gm0.j1.i();
        gm0.j1.b().c();
        if (oo0.e.f428652g == null) {
            oo0.e.f428652g = new oo0.e(gm0.j1.u().f354686f);
        }
        return oo0.e.f428652g;
    }
}
