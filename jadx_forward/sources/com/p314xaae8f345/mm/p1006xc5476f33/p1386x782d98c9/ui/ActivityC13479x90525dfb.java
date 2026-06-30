package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI */
/* loaded from: classes4.dex */
public class ActivityC13479x90525dfb extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f180893d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180894e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f180895f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f180896g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f180897h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f180898i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f180899m;

    public final void V6() {
        this.f180896g.O((this.f180893d & 1) == 1);
        this.f180897h.O((this.f180893d & 2) == 2);
        this.f180898i.O((this.f180893d & 8) == 8);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576403ac;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ve4.g.a(38);
        gm0.j1.n().f354821b.a(1044, this);
        this.f180896g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("notify_rank");
        this.f180897h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("notify_like");
        this.f180898i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("join_rank");
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(397310, 0);
        if (num == null || num.intValue() == 0) {
            this.f180894e = false;
            this.f180896g.O(true);
            this.f180897h.O(true);
            this.f180898i.O(true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
            this.f180895f = android.app.ProgressDialog.show(this, "", "", true, false);
        } else {
            this.f180894e = true;
            this.f180893d = num.intValue();
            V6();
        }
        gm0.j1.n().f354821b.g(new p32.q(2, 0));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hw9);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.y6(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(1044, this);
        android.app.ProgressDialog progressDialog = this.f180895f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f180895f.dismiss();
        }
        if (this.f180894e) {
            if (this.f180896g.N()) {
                this.f180893d |= 1;
            } else {
                this.f180893d &= -2;
            }
            if (this.f180897h.N()) {
                this.f180893d |= 2;
            } else {
                this.f180893d &= -3;
            }
            if (this.f180898i.N()) {
                this.f180893d |= 8;
            } else {
                this.f180893d &= -9;
            }
            gm0.j1.u().c().w(397310, java.lang.Integer.valueOf(this.f180893d));
            gm0.j1.n().f354821b.g(new p32.q(1, this.f180893d));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.equals("black_contact_list")) {
            j45.l.h(this, "sport", ".ui.SportBlackListUI");
            return false;
        }
        this.f180899m = true;
        return false;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            android.app.ProgressDialog progressDialog = this.f180895f;
            if (progressDialog != null && progressDialog.isShowing()) {
                runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a7(this));
            }
            dp.a.m125854x26a183b(this, "scene error", 0).show();
            finish();
            return;
        }
        p32.q qVar = (p32.q) m1Var;
        int i19 = qVar.f433048f;
        if (i19 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceSettingUI", "It isn't a GET_FLAG opType(%d).", java.lang.Integer.valueOf(i19));
            return;
        }
        android.app.ProgressDialog progressDialog2 = this.f180895f;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.z6(this));
        }
        this.f180894e = true;
        int i27 = this.f180893d;
        int i28 = qVar.f433049g;
        if (i27 == i28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceSettingUI", "flag has not changed.(%s)", java.lang.Integer.valueOf(i27));
            return;
        }
        this.f180893d = i28;
        gm0.j1.u().c().w(397310, java.lang.Integer.valueOf(this.f180893d));
        if (this.f180899m) {
            return;
        }
        V6();
    }
}
