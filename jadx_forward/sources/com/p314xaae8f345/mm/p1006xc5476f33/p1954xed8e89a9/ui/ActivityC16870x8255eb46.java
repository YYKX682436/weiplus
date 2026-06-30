package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/SayHiPictureUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiPictureUI */
/* loaded from: classes5.dex */
public final class ActivityC16870x8255eb46 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f235340h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f235341d = jz5.h.b(new hr3.vd(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f235342e = jz5.h.b(new hr3.xd(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f235343f = jz5.h.b(new hr3.wd(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f235344g = jz5.h.b(new hr3.yd(this));

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 U6() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222) ((jz5.n) this.f235341d).mo141623x754a37bb();
    }

    public final android.widget.TextView V6() {
        return (android.widget.TextView) ((jz5.n) this.f235343f).mo141623x754a37bb();
    }

    public final android.widget.TextView W6() {
        return (android.widget.TextView) ((jz5.n) this.f235342e).mo141623x754a37bb();
    }

    public final java.lang.String X6() {
        return (java.lang.String) ((jz5.n) this.f235344g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emx;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.dz3 dz3Var;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ocf);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        mo74406x9c8c0d33(new hr3.sd(this), com.p314xaae8f345.mm.R.raw.f81445xd56bca2);
        U6().b(new hr3.td(this));
        android.widget.TextView textView = (android.widget.TextView) U6().findViewById(com.p314xaae8f345.mm.R.id.d6q);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(textView);
        aVar.pk(textView, "greet_text_float");
        aVar.fk(textView, "add_username", X6());
        aVar.ik(textView, 8, 33926);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.Mj(U6().m79045x484a3591());
        aVar2.pk(U6().m79045x484a3591(), "greet_photo_float");
        aVar2.fk(U6().m79045x484a3591(), "add_username", X6());
        aVar2.ik(U6().m79045x484a3591(), 8, 33926);
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.Mj(W6());
        aVar3.pk(W6(), "greet_context_set_float");
        aVar3.fk(W6(), "add_username", X6());
        aVar3.ik(W6(), 8, 33926);
        V6().setOnClickListener(new hr3.ud(this));
        cy1.a aVar4 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar4.Mj(V6());
        aVar4.pk(V6(), "greet_send_float");
        aVar4.fk(V6(), "add_username", X6());
        aVar4.ik(V6(), 8, 33926);
        hr3.pf pfVar = (hr3.pf) m80391xac8f1cfd(hr3.pf.class);
        pfVar.getClass();
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        pfVar.f365432r = v17;
        java.lang.String v18 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(v18)) {
            dz3Var = null;
        } else {
            dz3Var = new r45.dz3();
            try {
                dz3Var.mo11468x92b714fd(j34.d.a(v18, 0));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SayHiPictureUIC", th6, "parseImgInfo() err", new java.lang.Object[0]);
            }
        }
        boolean U6 = pfVar.U6(dz3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "initCommonSayHiDirectly() called commonSayHiContent:" + java.lang.Integer.valueOf(v17.length()) + " hasPic:" + U6);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17) || U6) {
            java.lang.String e17 = ck5.f.e(v17, 100);
            java.lang.String str = e17 != null ? e17 : "";
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 S6 = pfVar.S6();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = pfVar.m158354x19263085();
            float m79030x40077844 = pfVar.S6().m79030x40077844();
            ((ke0.e) xVar).getClass();
            S6.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(m158354x19263085, str, m79030x40077844));
            pfVar.S6().m79037xf579a34a(str.length());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "[initCommonSayHiDirectly] input:".concat(str));
            p012xc85e97e9.p093xedfae76a.q a17 = p012xc85e97e9.p093xedfae76a.z.a(pfVar.m158354x19263085());
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(a17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new hr3.ne(pfVar, dz3Var, null), 2, null);
        }
        if (r26.n0.N(v17) && !U6) {
            ((android.widget.Button) ((jz5.n) pfVar.f365425h).mo141623x754a37bb()).setEnabled(false);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, kz5.c1.k(new jz5.l("view_id", "greet_context_setting_float"), new jz5.l("add_username", X6())), 33926);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(hr3.pf.class);
        set.add(hr3.rd.class);
    }
}
