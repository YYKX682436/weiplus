package qr3;

/* loaded from: classes4.dex */
public final class o extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements qr3.a0 {

    /* renamed from: m, reason: collision with root package name */
    public static r45.n14 f447635m;

    /* renamed from: d, reason: collision with root package name */
    public int f447636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f447637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f447638f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f447639g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f447640h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f447641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f447640h = jz5.h.b(new qr3.m(activity));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 O6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323) ((jz5.n) this.f447640h).mo141623x754a37bb();
    }

    public final void P6(boolean z17, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        if (!z17) {
            if (rVar != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).w("preference_key_tip");
            }
            if (rVar != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(m80379x76847179());
        c21560x1fce98fb.f279318v = false;
        c21560x1fce98fb.C("preference_key_tip");
        c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569542eb;
        java.lang.String string = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bc7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{this.f447637e}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        c21560x1fce98fb.L(format);
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).w("preference_key_tip");
        }
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).d(c21560x1fce98fb, -1);
        }
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "create");
        if (!O6().f235708e.r2()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) O6().f235707d).t();
        }
        if (O6().f235708e.l2()) {
            return;
        }
        if (O6().f235709f != null && !x51.t1.b(O6().f235709f.f66730x28d45f97)) {
            this.f447639g = O6().f235709f.f66730x28d45f97;
        }
        this.f447638f = m158359x1e885992().getStringExtra("Contact_User");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Contact_Nick");
        this.f447637e = stringExtra;
        if (stringExtra == null) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f447638f;
            ((sg3.a) v0Var).getClass();
            this.f447637e = c01.a2.e(str);
        }
        java.lang.String str2 = this.f447638f;
        r45.m14 m14Var = new r45.m14();
        m14Var.f461603d = str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = m14Var;
        lVar.f152198b = new r45.n14();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/jsapi-getalluseuserinfo";
        lVar.f152200d = 4975;
        o01.c cVar = o01.d.f423424a;
        qr3.e eVar = new qr3.e(cVar.a(lVar.a()));
        java.lang.String str3 = this.f447638f;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        r45.o14 o14Var = new r45.o14();
        o14Var.f463352d = str3;
        o14Var.f463353e = currentTimeMillis;
        o14Var.f463354f = 10;
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = o14Var;
        lVar2.f152198b = new r45.p14();
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/jsapi-getbizuseuserinforecordlist";
        lVar2.f152200d = 1850;
        qr3.h hVar = new qr3.h(cVar.a(lVar2.a()));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(um3.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        v65.i.b(((um3.b) a17).O6(), null, new qr3.l(eVar, hVar, this, null), 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "finish");
        f447635m = null;
    }
}
