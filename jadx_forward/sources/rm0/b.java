package rm0;

/* loaded from: classes4.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f478933a;

    public b(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f478933a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f478933a;
        if (i17 == 0 && fVar.f152149b == 0 && fVar.f152151d != null) {
            fVar.f152153f.mo10668x2efc64();
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(fVar.f152151d));
        } else {
            java.lang.String str = fVar.f152153f.f152179f.f152245c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUri(...)");
            int i18 = fVar.f152148a;
            int i19 = fVar.f152149b;
            java.lang.String str2 = fVar.f152150c;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            rm0.j jVar = new rm0.j(str, i18, i19, str2, resp);
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(jVar)));
            fVar.f152153f.mo10668x2efc64();
        }
        return jz5.f0.f384359a;
    }
}
