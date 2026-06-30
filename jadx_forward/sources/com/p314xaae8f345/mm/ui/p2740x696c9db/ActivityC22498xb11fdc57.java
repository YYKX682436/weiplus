package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.CountryCodeUI */
/* loaded from: classes15.dex */
public class ActivityC22498xb11fdc57 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f291518d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.p1 f291519e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 f291520f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f291521g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f291522h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291523i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291524m;

    /* renamed from: n, reason: collision with root package name */
    public db5.o9 f291525n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f291526o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291527p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String[] f291528q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f291529r = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570228a33 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570227a32;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291529r)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571468fy);
        } else {
            mo54450xbf7c1df6(this.f291529r);
        }
        java.util.List b17 = u11.b.b(true);
        this.f291521g = b17;
        java.lang.String[] strArr = this.f291528q;
        if (strArr != null && strArr.length > 0) {
            for (int size = ((java.util.ArrayList) b17).size() - 1; size >= 0; size--) {
                java.lang.String str = ((u11.a) ((java.util.ArrayList) this.f291521g).get(size)).f505260a;
                java.lang.String[] strArr2 = this.f291528q;
                int length = strArr2.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        z17 = false;
                        break;
                    } else {
                        if (strArr2[i17].equals(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CountryCodeUI", "exclude country: %s", str);
                            z17 = true;
                            break;
                        }
                        i17++;
                    }
                }
                if (z17) {
                    ((java.util.ArrayList) this.f291521g).remove(size);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
            java.util.Collections.sort(this.f291521g, new com.p314xaae8f345.mm.ui.p2740x696c9db.r1(this));
        } else {
            java.util.Collections.sort(this.f291521g, new com.p314xaae8f345.mm.ui.p2740x696c9db.q1(this));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        this.f291526o = c9Var;
        c9Var.f291857i = new com.p314xaae8f345.mm.ui.p2740x696c9db.s1(this);
        m78489xd6d59aa8(true, c9Var);
        this.f291518d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
        com.p314xaae8f345.mm.ui.p2740x696c9db.p1 p1Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.p1(this, this.f291521g);
        this.f291519e = p1Var;
        p1Var.f292167i = this.f291527p;
        this.f291518d.setAdapter((android.widget.ListAdapter) p1Var);
        this.f291518d.setVisibility(0);
        this.f291520f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10) findViewById(com.p314xaae8f345.mm.R.id.f564281mx);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
            this.f291525n = new com.p314xaae8f345.mm.ui.p2740x696c9db.u1(this);
        } else {
            this.f291525n = new com.p314xaae8f345.mm.ui.p2740x696c9db.t1(this);
        }
        this.f291520f.m79298x40d747ee(this.f291525n);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2740x696c9db.v1(this));
        this.f291518d.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.w1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f291522h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f291523i = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        this.f291524m = stringExtra3 != null ? stringExtra3 : "";
        this.f291527p = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
        this.f291528q = getIntent().getStringArrayExtra("exclude_countries_iso");
        this.f291529r = getIntent().getStringExtra("ui_title");
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", this.f291522h);
        intent.putExtra("couttry_code", this.f291523i);
        intent.putExtra("iso_code", this.f291524m);
        setResult(100, intent);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f291526o;
        if (c9Var != null) {
            c9Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(la5.y.class);
    }
}
