package sf2;

/* loaded from: classes10.dex */
public final class k1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.m1 f488720d;

    public k1(sf2.m1 m1Var) {
        this.f488720d = m1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        java.lang.String str2;
        mm2.j6 j6Var = (mm2.j6) obj;
        boolean z17 = j6Var instanceof mm2.i6;
        rn0.a aVar = rn0.a.f479142a;
        sf2.m1 m1Var = this.f488720d;
        if (z17) {
            m1Var.f488744j = ((mm2.i6) j6Var).f410674a;
            if (!m1Var.f488742h) {
                mm2.j6 j6Var2 = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m1Var.f488736b.f410784s).mo144003x754a37bb();
                if (j6Var2 instanceof mm2.i6) {
                    m1Var.f488740f = 0L;
                    m1Var.f488741g = 0;
                    java.util.UUID.randomUUID().toString();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = m1Var.f488745k;
                    b4Var.d();
                    b4Var.c(20L, 20L);
                    m1Var.f488742h = true;
                    if (in0.q.f374302b2 == null) {
                        in0.q.f374302b2 = new in0.q(aVar.a());
                    }
                    in0.q qVar = in0.q.f374302b2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
                    qVar.P = 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomSEIUploader", "startUpload: uniquePlayId=" + ((mm2.i6) j6Var2).f410674a.f473165i);
                }
            }
        } else {
            boolean z18 = m1Var.f488742h;
            if (z18 && z18) {
                com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8 = m1Var.f488735a;
                if (abstractC26786xbe57dcc8 != null) {
                    r45.fa4 fa4Var = new r45.fa4();
                    hn0.u uVar = hn0.u.f363970e;
                    long j17 = 1024;
                    fa4Var.f455676d = j17;
                    r45.g94 g94Var = new r45.g94();
                    g94Var.f456549d = (-1) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                    r45.z22 z22Var = m1Var.f488744j;
                    if (z22Var == null || (str = z22Var.f473165i) == null) {
                        str = "";
                    }
                    g94Var.f456550e = str;
                    if (z22Var == null || (str2 = z22Var.f473162f) == null) {
                        str2 = "";
                    }
                    g94Var.f456554i = str2;
                    g94Var.f456556n = 0;
                    fa4Var.f455677e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(g94Var.mo14344x5f01b1f6());
                    r45.fa4 fa4Var2 = new r45.fa4();
                    fa4Var2.f455676d = j17;
                    r45.g94 g94Var2 = new r45.g94();
                    long j18 = m1Var.f488740f + 1;
                    m1Var.f488740f = j18;
                    g94Var2.f456549d = j18;
                    g94Var2.f456550e = "";
                    g94Var2.f456554i = "";
                    g94Var2.f456556n = 0;
                    fa4Var2.f455677e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(g94Var2.mo14344x5f01b1f6());
                    abstractC26786xbe57dcc8.mo30315x1a3ef952(fa4Var.mo14344x5f01b1f6(), 1);
                    abstractC26786xbe57dcc8.mo30315x1a3ef952(fa4Var2.mo14344x5f01b1f6(), 1);
                }
                if (in0.q.f374302b2 == null) {
                    in0.q.f374302b2 = new in0.q(aVar.a());
                }
                in0.q qVar2 = in0.q.f374302b2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
                qVar2.P = 0;
                m1Var.f488745k.d();
                m1Var.f488742h = false;
                m1Var.f488736b.getClass();
                m1Var.f488740f = 0L;
                m1Var.f488741g = 0;
            }
            m1Var.f488744j = null;
        }
        return jz5.f0.f384359a;
    }
}
