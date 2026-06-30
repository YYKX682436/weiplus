package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 */
/* loaded from: classes3.dex */
public final class ActivityC14121xff3e46f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    public static final /* synthetic */ int C = 0;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 A;
    public boolean B;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f191148v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.op(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f191149w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hp(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f191150x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ep(this));

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f191151y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final bm2.w7 f191152z;

    public ActivityC14121xff3e46f() {
        bm2.w7 w7Var = new bm2.w7(this);
        w7Var.f103952g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.cp(this);
        this.f191152z = w7Var;
    }

    public final java.lang.Object d7(int i17, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        new db2.a2(i17, xy2.c.e(this), linkedList).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gp(nVar, this, i17));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 e7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f191149w).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) mo141623x754a37bb;
    }

    public final void f7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj(str, str2, kz5.b1.e(new jz5.l("sensitive_word", str3)));
    }

    public final void g7(int i17) {
        jz5.g gVar = this.f191150x;
        if (i17 <= 0) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb).setVisibility(4);
        } else {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb2).setVisibility(0);
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb3).setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eck, java.lang.String.valueOf(i17)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570510az1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jz5.g gVar = this.f191148v;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb).mo7960x6cab2c8d(this.f191152z);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SENSITIVE_WORDS_LIMIT_INT, null);
        zl2.r4.f555483a.Z2(e7(), null, 20, 10, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, null);
        e7().setHint(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecm, m17));
        e7().setInputType(1);
        e7().setImeOptions(6);
        e7().setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ip(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jp(this));
        f7("live_sensitive_word_search", "view_exp", "");
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecn));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kp(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lp(this, null), 3, null);
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.np(this));
    }
}
