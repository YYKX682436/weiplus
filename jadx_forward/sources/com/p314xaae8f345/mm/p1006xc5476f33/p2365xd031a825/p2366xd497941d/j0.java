package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f260927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 f260929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.fo f260930g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ot0.q qVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, r45.fo foVar) {
        super(1);
        this.f260927d = qVar;
        this.f260928e = str;
        this.f260929f = activityC19073xb523d43;
        this.f260930g = foVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.util.Pair wi6 = ((ez.w0) ot0.j1.a()).wi(this.f260927d, "", "", this.f260928e, "", (byte[]) obj, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "sent appmsg, result: " + wi6.first);
        this.f260929f.setResult(-1);
        this.f260929f.finish();
        java.lang.Integer num = (java.lang.Integer) wi6.first;
        if (num != null && num.intValue() == 0) {
            return ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.i0(this.f260930g));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.E;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f260929f.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x.a(xVar, mo55332x76847179);
        return jz5.f0.f384359a;
    }
}
