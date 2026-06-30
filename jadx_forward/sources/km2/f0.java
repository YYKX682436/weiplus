package km2;

/* loaded from: classes3.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f390630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f390631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f390632c;

    public f0(km2.g0 g0Var, com.p314xaae8f345.mm.p944x882e457a.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f390630a = g0Var;
        this.f390631b = iVar;
        this.f390632c = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        long j17;
        r45.vr1 vr1Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        lm2.x xVar = (lm2.x) this.f390630a;
        xVar.getClass();
        com.p314xaae8f345.mm.p944x882e457a.i cgi = this.f390631b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (vr1Var = (r45.vr1) fVar.f152151d) != null) {
            j17 = vr1Var.f469994d;
            lm2.p pVar = lm2.h0.f400925i;
            java.util.LinkedList box_readdot_list = vr1Var.f469995e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(box_readdot_list, "box_readdot_list");
            java.lang.String str = "polling reddot resp, ".concat(kz5.n0.g0(box_readdot_list, null, null, null, 0, null, lm2.u.f400985d, 31, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "redDotFlowLog ".concat(str));
            if (box_readdot_list.size() > 0) {
                p3325xe03a0797.p3326xc267989b.l.f(null, new lm2.w(vr1Var, xVar.f400995c, cgi, null), 1, null);
            }
        } else {
            j17 = 1000;
        }
        this.f390632c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new km2.j0(true, j17)));
        return jz5.f0.f384359a;
    }
}
