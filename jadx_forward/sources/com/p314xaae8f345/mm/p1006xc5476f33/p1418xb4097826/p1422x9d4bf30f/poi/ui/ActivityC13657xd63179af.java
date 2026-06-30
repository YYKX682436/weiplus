package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI;", "Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.activity.poi.ui.FInderPoiMediaLbsListUI */
/* loaded from: classes10.dex */
public final class ActivityC13657xd63179af extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 {
    public static final /* synthetic */ int T = 0;
    public boolean R;
    public java.lang.String Q = "";
    public ka2.f S = ka2.f.f387562e;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    /* renamed from: e7, reason: from getter */
    public ka2.f getS() {
        return this.S;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public ka2.f g7() {
        return ka2.f.f387562e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public ha2.a h7() {
        return new ha2.a(new r45.hd1(), 7, false, null, null, (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) getIntent().getParcelableExtra("key_media_item"), false, 92, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public java.lang.String i7() {
        if (this.R) {
            java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public ka2.f j7() {
        return ka2.f.f387562e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public void k7() {
        super.k7();
        java.lang.String stringExtra = getIntent().getStringExtra("key_media_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.Q = stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_video", false);
        this.R = booleanExtra;
        jz5.l f17 = booleanExtra ? hc2.l.f(this.Q) : hc2.l.c(this.Q);
        ka2.d dVar = this.L;
        if (f17 != null) {
            r45.gd1 gd1Var = new r45.gd1();
            gd1Var.set(1, java.lang.Float.valueOf((float) ((java.lang.Number) f17.f384366d).doubleValue()));
            gd1Var.set(0, java.lang.Float.valueOf((float) ((java.lang.Number) f17.f384367e).doubleValue()));
            dVar.f387555g = gd1Var;
        }
        dVar.f387550b.add(h7());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public void l7() {
        super.l7();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qvz);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.uqs);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new ka2.a(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4
    public void o7(ka2.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        this.S = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        mo48674x36654fab();
        p7();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo55426xe0085496() {
        p7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.n7(this, null, false, false, true, this.S, this.R ? 4 : 2, 7, null);
    }

    public final void p7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        u1Var.g(string);
        u1Var.a(true);
        u1Var.j(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571541ib);
        u1Var.k(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        u1Var.l(new ka2.b(this));
        u1Var.q(false);
    }
}
