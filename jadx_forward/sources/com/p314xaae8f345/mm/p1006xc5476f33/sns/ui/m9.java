package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class m9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6216x1b036291 f251433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 f251434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6216x1b036291 c6216x1b036291, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 n9Var) {
        super(0);
        this.f251433d = c6216x1b036291;
        this.f251434e = n9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6216x1b036291 c6216x1b036291 = this.f251433d;
        am.l00 l00Var = c6216x1b036291.f136465g;
        int i17 = l00Var.f88737a;
        java.lang.String str = l00Var.f88738b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "remux event return >> code: " + i17 + ", workTagId: " + str);
        am.l00 l00Var2 = c6216x1b036291.f136465g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 n9Var = this.f251434e;
        if (i17 == 4001) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9.a(n9Var);
            if (a17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                a17.c(str, l00Var2.f88740d);
            }
        } else if (i17 != 4007) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightWidgetBackgroundVideoHandler", "background remux is error, " + i17 + ", " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 a18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9.a(n9Var);
            if (a18 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                a18.d(3, null, str);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "background remux done, " + str);
            n55.f fVar = (n55.f) i95.n0.c(n55.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((wp4.x) fVar).wi(str, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l9(str, n9Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a.e(l00Var2.f88739c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        return f0Var;
    }
}
