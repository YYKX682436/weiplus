package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n6 f184635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(android.content.Context context, so2.n6 n6Var) {
        super(1);
        this.f184634d = context;
        this.f184635e = n6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Context context = this.f184634d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sr2.w0 w0Var = (sr2.w0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sr2.w0.class);
        w0Var.getClass();
        so2.n6 modModel = this.f184635e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modModel, "modModel");
        r45.gb4 gb4Var = modModel.f492042i;
        java.lang.String m75945x2fec8307 = gb4Var != null ? gb4Var.m75945x2fec8307(2) : null;
        java.lang.String m75945x2fec83072 = gb4Var != null ? gb4Var.m75945x2fec8307(0) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[openProfileUI] nickName:" + m75945x2fec8307 + " userName:" + m75945x2fec83072);
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            java.lang.String string = w0Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573651o33);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.app.Activity m80379x76847179 = w0Var.m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
        } else {
            android.app.Activity m80379x768471792 = w0Var.m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m80379x768471792 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471792 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", m75945x2fec83072);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = w0Var.I;
                if (c15336x844a2f32 != null) {
                    c15336x844a2f32.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m3.f183914a.b(abstractActivityC21394xb3d2c0cf, intent, lk5.s.a(abstractActivityC21394xb3d2c0cf), false, new sr2.p0(w0Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
