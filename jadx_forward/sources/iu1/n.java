package iu1;

/* loaded from: classes9.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376457b;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, java.lang.String str) {
        this.f376456a = activityC13064xaf775f76;
        this.f376457b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376456a;
        if (i17 != 0 || fVar.f152149b != 0) {
            lu1.a0.q(activityC13064xaf775f76, "");
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        r45.kd0 kd0Var = (r45.kd0) fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s", java.lang.Integer.valueOf(kd0Var.f460131d));
        if (kd0Var.f460131d != 0) {
            lu1.a0.r(activityC13064xaf775f76, kd0Var.f460132e);
            return fVar2;
        }
        iu1.c cVar = activityC13064xaf775f76.f176717m;
        if (cVar != null) {
            cVar.z(this.f376457b);
            return fVar2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
        throw null;
    }
}
