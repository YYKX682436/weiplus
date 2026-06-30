package iu1;

/* loaded from: classes9.dex */
public final class c1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e f376378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f376379b;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e, boolean z17) {
        this.f376378a = activityC13068x5a32e52e;
        this.f376379b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e = this.f376378a;
        activityC13068x5a32e52e.f176755q = false;
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            if (activityC13068x5a32e52e.f176756r) {
                activityC13068x5a32e52e.f176756r = false;
            }
            lu1.a0.q(activityC13068x5a32e52e, "");
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        r45.xi3 xi3Var = (r45.xi3) fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "retCode: %s", java.lang.Integer.valueOf(xi3Var.f471670d));
        if (xi3Var.f471670d != 0) {
            lu1.a0.r(activityC13068x5a32e52e, xi3Var.f471671e);
            if (!activityC13068x5a32e52e.f176756r) {
                return fVar2;
            }
            activityC13068x5a32e52e.f176756r = false;
            return fVar2;
        }
        activityC13068x5a32e52e.f176752n = xi3Var.f471672f;
        boolean z17 = xi3Var.f471673g == 1;
        activityC13068x5a32e52e.f176754p = z17;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = activityC13068x5a32e52e.f176750i;
            if (c12808x5de4409f == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
                throw null;
            }
            c12808x5de4409f.m1(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = activityC13068x5a32e52e.f176750i;
            if (c12808x5de4409f2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
                throw null;
            }
            c12808x5de4409f2.m1(true);
        }
        if (activityC13068x5a32e52e.f176756r || this.f376379b) {
            activityC13068x5a32e52e.f176760v.clear();
            activityC13068x5a32e52e.f176758t.clear();
            activityC13068x5a32e52e.f176759u.clear();
            activityC13068x5a32e52e.f176761w = null;
            activityC13068x5a32e52e.f176756r = false;
        }
        activityC13068x5a32e52e.a7(xi3Var.f471674h, xi3Var.f471675i, xi3Var.f471676m, xi3Var.f471677n);
        return fVar2;
    }
}
