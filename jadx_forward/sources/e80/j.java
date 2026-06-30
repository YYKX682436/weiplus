package e80;

/* loaded from: classes12.dex */
public final class j implements k70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f331557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f331558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m11.d f331559c;

    public j(com.p314xaae8f345.mm.p944x882e457a.f fVar, p3325xe03a0797.p3326xc267989b.q qVar, m11.d dVar) {
        this.f331557a = fVar;
        this.f331558b = qVar;
        this.f331559c = dVar;
    }

    public final void a(long j17, int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f331557a;
        fVar.f152148a = i18;
        fVar.f152149b = i19;
        r45.mu6 mu6Var = new r45.mu6();
        mu6Var.set(9, java.lang.Long.valueOf(j17));
        mu6Var.set(12, str);
        mu6Var.set(8, java.lang.Integer.valueOf(i17));
        r45.lu6 lu6Var = this.f331559c.f404199q;
        mu6Var.set(2, lu6Var != null ? (r45.du5) lu6Var.m75936x14adae67(1) : null);
        fVar.f152151d = mu6Var;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f331558b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(fVar));
    }
}
