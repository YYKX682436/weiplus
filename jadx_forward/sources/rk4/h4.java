package rk4;

/* loaded from: classes2.dex */
public final class h4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f478220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f478221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478222c;

    public h4(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f478220a = c0Var;
        this.f478221b = qVar;
        this.f478222c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f478220a;
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCoroutineCGIService", "getCategoryItem callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
            int i17 = fVar.f152148a;
            p3325xe03a0797.p3326xc267989b.q qVar = this.f478221b;
            if (i17 == 0 && fVar.f152149b == 0) {
                try {
                    bw5.e50 mo11468x92b714fd = new bw5.e50().mo11468x92b714fd(((qk.t9) fVar.f152151d).f445871d);
                    java.lang.String str = this.f478222c;
                    if (mo11468x92b714fd.f108265d.size() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingCoroutineCGIService", "getCategoryItem failed itemsCount == 0");
                        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                    } else {
                        bw5.o50 o50Var = (bw5.o50) mo11468x92b714fd.f108265d.get(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o50Var.c(), str)) {
                            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(o50Var));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingCoroutineCGIService", "getCategoryItem categoryId not equal");
                            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingCoroutineCGIService", th6, "getCategoryItem callback exception", new java.lang.Object[0]);
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
