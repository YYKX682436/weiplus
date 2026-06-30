package rk4;

/* loaded from: classes2.dex */
public final class i4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f478250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f478251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478252c;

    public i4(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f478250a = c0Var;
        this.f478251b = qVar;
        this.f478252c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f478250a;
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCoroutineCGIService", "fetchTingItem callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
            int i17 = fVar.f152148a;
            p3325xe03a0797.p3326xc267989b.q qVar = this.f478251b;
            if (i17 == 0 && fVar.f152149b == 0) {
                try {
                    bw5.z70 mo11468x92b714fd = new bw5.z70().mo11468x92b714fd(((qk.t9) fVar.f152151d).f445871d);
                    java.lang.String str = this.f478252c;
                    if (mo11468x92b714fd.f117382d.size() > 0) {
                        bw5.y70 y70Var = (bw5.y70) mo11468x92b714fd.f117382d.get(0);
                        bw5.v70 v70Var = y70Var.f116928g[2] ? y70Var.f116926e : new bw5.v70();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCoroutineCGIService", "fetchTingItem callback type: " + v70Var.f115722e + ", name: " + v70Var.m13171x7531c8a2());
                        bw5.lp0 lp0Var = new bw5.lp0();
                        lp0Var.j(v70Var);
                        lp0Var.g(str + '_' + lp0Var.d().m13170xcc16feb8());
                        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lp0Var));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingCoroutineCGIService", "fetchTingItem failed itemsCount == 0");
                        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingCoroutineCGIService", th6, "fetchTingItem callback exception", new java.lang.Object[0]);
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingCoroutineCGIService", "getCategoryItem failed");
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
        }
        return jz5.f0.f384359a;
    }
}
