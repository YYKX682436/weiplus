package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui;

/* renamed from: com.tencent.mm.plugin.sport.ui.SportBlackListUI */
/* loaded from: classes11.dex */
public class ActivityC18458x8428a09d extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f253363d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f253364e;

    /* renamed from: f, reason: collision with root package name */
    public final r35.d2 f253365f = new we4.b(this);

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576494cr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList P1;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 0 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        ((java.util.ArrayList) this.f253364e).addAll(P1);
        this.f253363d.Q(this.f253364e);
        lz.f fVar = this.f253363d.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.h();
        }
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            c01.e2.w0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n((java.lang.String) it.next(), true));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ve4.g.a(39);
        java.util.List a17 = k35.c.a();
        if (this.f253364e == null) {
            this.f253364e = new java.util.ArrayList();
        }
        android.database.Cursor x17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).x("@werun.black.android", "", null);
        while (x17.moveToNext()) {
            java.lang.String string = x17.getString(x17.getColumnIndex(dm.i4.f66875xa013b0d5));
            if (!((java.util.ArrayList) a17).contains(string)) {
                ((java.util.ArrayList) this.f253364e).add(string);
            }
        }
        x17.close();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("black_contact_list_pref");
        this.f253363d = c19662x4f7a67f3;
        c19662x4f7a67f3.R(m79336x8b97809d(), this.f253363d.f279313q);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f253363d;
        c19662x4f7a67f32.T(true);
        c19662x4f7a67f32.V(true);
        this.f253363d.Q(this.f253364e);
        this.f253363d.Z(this.f253365f);
        this.f253363d.G(com.p314xaae8f345.mm.R.C30867xcad56011.c5m);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c48));
        mo54448x9c8c0d33(new we4.a(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }
}
