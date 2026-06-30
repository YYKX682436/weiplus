package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class b4 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c4 f160949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f160950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f160951c;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c4 c4Var, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f160949a = c4Var;
        this.f160950b = qVar;
        this.f160951c = f0Var;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f160950b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c4 c4Var = this.f160949a;
        if (i17 != 1 && i17 != 2) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l3(c4Var.f161072d, "fail auth cancel", jc1.f.f380455k, null, 8, null)));
            return;
        }
        if (resultData.isEmpty()) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l3(c4Var.f161072d, null, jc1.f.f380448d, null, 10, null)));
            return;
        }
        r45.m24 a17 = c4Var.f161072d.a(true);
        a17.f461624f = (java.lang.String) kz5.n0.X(resultData);
        a17.f461625g = i17;
        a17.f461628m = i18;
        a17.f461630o = this.f160951c.f391649d;
        a17.f461631p = z17;
        if (2 == i17) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a4(c4Var, a17, null), 2, null);
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l3(c4Var.f161072d, "fail auth deny", jc1.f.f380454j, null, 8, null)));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q3(c4Var.f161072d, a17)));
        }
    }
}
