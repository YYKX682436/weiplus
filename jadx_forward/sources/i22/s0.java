package i22;

/* loaded from: classes.dex */
public final class s0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f369559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f369560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f369561f;

    public s0(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f369559d = m1Var;
        this.f369560e = h0Var;
        this.f369561f = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = this.f369559d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, m1Var2)) {
            gm0.j1.n().f354821b.q(m1Var2.mo808xfb85f7b0(), (com.p314xaae8f345.mm.p944x882e457a.u0) this.f369560e.f391656d);
            p3325xe03a0797.p3326xc267989b.q qVar = this.f369561f;
            if (i17 == 0 && i18 == 0) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(m1Var2));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new i22.r0(i17, i18, str))));
            }
        }
    }
}
