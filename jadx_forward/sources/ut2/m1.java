package ut2;

/* loaded from: classes.dex */
public final class m1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f512534a;

    public m1(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f512534a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.du5 du5Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = fVar != null && fVar.f152148a == 0;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f512534a;
        if (z17 && fVar.f152149b == 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.TRUE, "")));
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            r45.ie ieVar = (r45.ie) ((r45.nd2) fVar.f152151d).m75936x14adae67(0);
            java.lang.String str = (ieVar == null || (du5Var = ieVar.f458493e) == null) ? null : du5Var.f454289d;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(bool, str != null ? str : "")));
        }
        return jz5.f0.f384359a;
    }
}
