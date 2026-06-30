package dk2;

/* loaded from: classes.dex */
public final class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f315171b;

    public j4(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f315170a = h0Var;
        this.f315171b = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        az2.f fVar2 = (az2.f) this.f315170a.f391656d;
        if (fVar2 != null) {
            fVar2.b();
        }
        int i17 = fVar.f152148a;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f315171b;
        if (i17 == 0 && fVar.f152149b == 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(((r45.rr1) fVar.f152151d).m75942xfb822ef2(1))));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-1L));
        }
        return jz5.f0.f384359a;
    }
}
