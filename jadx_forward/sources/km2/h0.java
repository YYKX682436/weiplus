package km2;

/* loaded from: classes3.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km2.i0 f390638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f390639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f390640c;

    public h0(km2.i0 i0Var, com.p314xaae8f345.mm.p944x882e457a.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f390638a = i0Var;
        this.f390639b = iVar;
        this.f390640c = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        long j17;
        r45.p61 p61Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        lm2.s sVar = (lm2.s) this.f390638a;
        sVar.getClass();
        com.p314xaae8f345.mm.p944x882e457a.i cgi = this.f390639b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (p61Var = (r45.p61) fVar.f152151d) != null) {
            j17 = p61Var.f464317f;
            java.util.LinkedList<r45.ch1> app_msg_list = p61Var.f464316e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(app_msg_list, "app_msg_list");
            for (r45.ch1 ch1Var : app_msg_list) {
                if (((r45.qm1) ch1Var.m75936x14adae67(8)) == null) {
                    java.lang.String m75945x2fec8307 = ((db2.u0) cgi).f309718t.m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.qm1 qm1Var = new r45.qm1();
                    int i17 = qs5.v.f448005a;
                    qm1Var.set(0, 1);
                    qm1Var.set(1, m75945x2fec8307);
                    ch1Var.set(8, qm1Var);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : app_msg_list) {
                if (lm2.h0.f400926j.contains(java.lang.Integer.valueOf(((r45.ch1) obj2).m75939xb282bd08(1)))) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : app_msg_list) {
                if (((r45.ch1) obj3).m75939xb282bd08(1) == 20062) {
                    arrayList2.add(obj3);
                }
            }
            p3325xe03a0797.p3326xc267989b.l.f(null, new lm2.r(sVar, p61Var.f464319h, p61Var.f464315d, arrayList, arrayList2, kz5.p0.f395529d, null), 1, null);
        } else {
            j17 = 1000;
        }
        this.f390640c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new km2.j0(true, j17)));
        return jz5.f0.f384359a;
    }
}
