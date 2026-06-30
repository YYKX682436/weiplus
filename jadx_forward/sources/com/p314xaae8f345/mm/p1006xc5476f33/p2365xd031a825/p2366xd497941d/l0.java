package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f260940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 f260942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.m74 f260943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ot0.q qVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, r45.m74 m74Var) {
        super(1);
        this.f260940d = qVar;
        this.f260941e = str;
        this.f260942f = activityC19073xb523d43;
        this.f260943g = m74Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.util.Pair wi6 = ((ez.w0) ot0.j1.a()).wi(this.f260940d, "", "", this.f260941e, "", (byte[]) obj, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "sent liteapp appmsg, result: " + wi6.first);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43 = this.f260942f;
        activityC19073xb523d43.setResult(-1);
        activityC19073xb523d43.finish();
        java.lang.Integer num = (java.lang.Integer) wi6.first;
        if (num == null || num.intValue() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.E;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19073xb523d43.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x.a(xVar, mo55332x76847179);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa c5873x7f10cbaa = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa();
        java.lang.Integer num2 = (java.lang.Integer) wi6.first;
        am.pp ppVar = c5873x7f10cbaa.f136181g;
        if (num2 != null && num2.intValue() == 0) {
            ppVar.f89177a = 1;
            r45.m74 m74Var = this.f260943g;
            ppVar.f89178b = m74Var.f461719i;
            ppVar.f89179c = m74Var.f461720m;
            ppVar.f89180d = m74Var.f461721n;
        } else {
            ppVar.f89177a = 0;
        }
        return java.lang.Boolean.valueOf(c5873x7f10cbaa.e());
    }
}
