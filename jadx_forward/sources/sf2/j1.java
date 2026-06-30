package sf2;

/* loaded from: classes10.dex */
public final class j1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.m1 f488709d;

    public j1(sf2.m1 m1Var) {
        this.f488709d = m1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams;
        sf2.m1 m1Var = this.f488709d;
        mm2.m6 m6Var = m1Var.f488736b;
        mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m6Var.f410784s).mo144003x754a37bb();
        if (j6Var instanceof mm2.i6) {
            ah2.b bVar = m1Var.f488737c;
            if (bVar != null) {
                ((dh2.x) bVar).f();
            }
            r45.z22 z22Var = ((mm2.i6) j6Var).f410674a;
            r45.g94 g94Var = new r45.g94();
            long j17 = m1Var.f488740f + 1;
            m1Var.f488740f = j17;
            g94Var.f456549d = j17;
            java.lang.String str = z22Var.f473165i;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            g94Var.f456550e = str;
            java.lang.String str3 = z22Var.f473162f;
            if (str3 == null) {
                str3 = "";
            }
            g94Var.f456554i = str3;
            g94Var.f456551f = m6Var.F;
            r45.e94 e94Var = new r45.e94();
            e94Var.f454695d = m6Var.A;
            e94Var.f454696e = m6Var.B;
            g94Var.f456552g = e94Var;
            r45.f94 f94Var = new r45.f94();
            f94Var.f455645d = m6Var.C;
            f94Var.f455646e = m6Var.D;
            g94Var.f456553h = f94Var;
            g94Var.f456556n = 1;
            g94Var.f456555m = m6Var.E;
            mm2.e1 e1Var = m1Var.f488739e;
            java.lang.String str4 = e1Var.f410520q.f461834n;
            java.lang.String str5 = null;
            if (java.lang.Boolean.valueOf(str4 == null || str4.length() == 0).booleanValue()) {
                str4 = null;
            }
            if (str4 == null) {
                kn0.i iVar = e1Var.f410523t;
                if (iVar != null && (tRTCParams = iVar.f391090a) != null) {
                    str5 = tRTCParams.f57083xce2b2e46;
                }
                if (str5 != null) {
                    str2 = str5;
                }
            } else {
                str2 = str4;
            }
            g94Var.f456557o = str2;
            r45.fa4 fa4Var = new r45.fa4();
            hn0.u uVar = hn0.u.f363970e;
            fa4Var.f455676d = 1024;
            fa4Var.f455677e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(g94Var.mo14344x5f01b1f6());
            com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = m1Var.f488735a;
            if (abstractC26786xbe57dcc8 != null) {
                abstractC26786xbe57dcc8.mo30315x1a3ef952(fa4Var.mo14344x5f01b1f6(), 1);
            }
            int i17 = m1Var.f488741g + 1;
            m1Var.f488741g = i17;
            if (i17 >= 50) {
                m1Var.f488741g = 0;
            }
        }
        return true;
    }
}
