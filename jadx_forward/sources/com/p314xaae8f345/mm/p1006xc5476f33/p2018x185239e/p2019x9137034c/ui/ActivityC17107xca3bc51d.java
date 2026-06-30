package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI */
/* loaded from: classes9.dex */
public class ActivityC17107xca3bc51d extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f238066d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f238067e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f238068f;

    /* renamed from: g, reason: collision with root package name */
    public int f238069g;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569719jw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f238066d = m79336x8b97809d();
        java.util.List list = this.f238067e;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f238068f = new java.util.ArrayList();
        for (int i17 = 0; i17 < this.f238067e.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e c17099x4fad1e0e = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e) this.f238067e.get(i17);
            int i18 = c17099x4fad1e0e.f237998d;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569718jv;
            c21560x1fce98fb.f279318v = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            int i19 = c17099x4fad1e0e.f237998d;
            sb6.append(i19);
            c21560x1fce98fb.C(sb6.toString());
            c21560x1fce98fb.L(c17099x4fad1e0e.f237999e);
            if (i19 == this.f238069g) {
                c21560x1fce98fb.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
            } else {
                c21560x1fce98fb.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
            }
            if (c17099x4fad1e0e.f238001g == 0) {
                java.lang.String str = c17099x4fad1e0e.f238000f;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    c21560x1fce98fb.H(str);
                }
                c21560x1fce98fb.w(false);
            }
            c21560x1fce98fb.i().putParcelable("arrive_time", c17099x4fad1e0e);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f238066d).d(c21560x1fce98fb, -1);
            this.f238068f.add(c21560x1fce98fb);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560239en)));
        android.view.View j17 = mo2533x106ab264().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            }
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560239en));
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce.f238030d;
        getWindow().getDecorView().setSystemUiVisibility(8192);
        m78513xc2a54588().setFitsSystemWindows(true);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aer);
        this.f238067e = getIntent().getParcelableArrayListExtra("key_arrive_time_parcel_list");
        this.f238069g = getIntent().getIntExtra("key_select_arrive_time", -1);
        mo43517x10010bd5();
        findViewById(android.R.id.list).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560239en));
        mo74406x9c8c0d33(new qw3.f1(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.util.Iterator it = ((java.util.ArrayList) this.f238068f).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) it.next();
            if (c21560x1fce98fb2 == c21560x1fce98fb) {
                c21560x1fce98fb2.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
            } else {
                c21560x1fce98fb2.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f238066d).notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e c17099x4fad1e0e = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e) c21560x1fce98fb.i().getParcelable("arrive_time");
        if (c17099x4fad1e0e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectArriveTimeUI", "is header");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_time_scene", c17099x4fad1e0e.f237998d);
        setResult(-1, intent);
        finish();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(qw3.i1.class);
    }
}
