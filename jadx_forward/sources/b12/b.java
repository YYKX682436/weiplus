package b12;

/* loaded from: classes4.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f98572a;

    public b(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f98572a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar2.f152148a;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f98572a;
        if (i17 == 0 && fVar2.f152149b == 0 && (fVar = fVar2.f152151d) != null) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(fVar));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new b12.a(fVar2.f152148a, fVar2.f152149b, "", fVar2.f152151d))));
        }
        return jz5.f0.f384359a;
    }
}
