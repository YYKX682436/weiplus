package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* renamed from: com.tencent.mm.plugin.address.ui.WalletMultiRcptSelectUI */
/* loaded from: classes15.dex */
public class ActivityC11496x43941465 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f156015i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f156016d;

    /* renamed from: e, reason: collision with root package name */
    public int f156017e = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 f156018f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 f156019g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f156020h;

    public final void V6(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiRptSelectUI", "initData intent is null");
            return;
        }
        this.f156017e = intent.getIntExtra("key_stage", 0);
        this.f156018f = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) intent.getParcelableExtra("key_province");
        this.f156019g = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) intent.getParcelableExtra("key_city");
        java.lang.String stringExtra = intent.getStringExtra("extra_province");
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c82 = null;
        if (stringExtra != null) {
            o71.l.wi();
            q71.f0 Bi = o71.l.Bi();
            Bi.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                java.util.Iterator it = ((java.util.ArrayList) Bi.d(0)).iterator();
                while (it.hasNext()) {
                    c11485x80cda4c8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it.next();
                    if (c11485x80cda4c8.f155904d.startsWith(stringExtra)) {
                        break;
                    }
                }
            }
            c11485x80cda4c8 = null;
            this.f156018f = c11485x80cda4c8;
            if (c11485x80cda4c8 != null) {
                this.f156017e = 1;
            }
        }
        java.lang.String stringExtra2 = intent.getStringExtra("extra_city");
        if (stringExtra2 == null || 1 != this.f156017e) {
            return;
        }
        o71.l.wi();
        java.util.ArrayList arrayList = (java.util.ArrayList) o71.l.Bi().e(this.f156018f.f155905e);
        if (arrayList.size() != 0) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c83 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it6.next();
                if (c11485x80cda4c83.f155904d.startsWith(stringExtra2)) {
                    c11485x80cda4c82 = c11485x80cda4c83;
                    break;
                }
            }
        }
        this.f156019g = c11485x80cda4c82;
        if (c11485x80cda4c82 != null) {
            this.f156017e = 2;
        }
    }

    public final void W6() {
        int i17 = this.f156017e;
        if (i17 == 1) {
            this.f156018f = null;
            this.f156017e = 0;
        } else if (i17 == 2) {
            this.f156019g = null;
            this.f156017e = 1;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_stage", this.f156017e);
        intent.putExtra("key_province", this.f156018f);
        intent.putExtra("key_city", this.f156019g);
        setResult(0, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576452bl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 != 2) goto L25;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11496x43941465.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            return;
        }
        if (i18 != -1) {
            V6(intent);
        } else {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f156016d = m79336x8b97809d();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11493x8ade0ad0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11493x8ade0ad0) c21560x1fce98fb).L;
            if (c11485x80cda4c8 != null) {
                java.lang.String str = c11485x80cda4c8.f155904d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    int i17 = c11485x80cda4c8.f155907g;
                    if (!(i17 == 0)) {
                        if (!(i17 == 1)) {
                            this.f156017e = 2;
                        }
                    }
                    int i18 = this.f156017e;
                    if (i18 == 0) {
                        this.f156018f = c11485x80cda4c8;
                        this.f156017e = 1;
                    } else if (i18 == 1) {
                        this.f156019g = c11485x80cda4c8;
                        this.f156017e = 2;
                    } else if (i18 == 2) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c82 = this.f156018f;
                        if (c11485x80cda4c82 != null) {
                            sb6.append(c11485x80cda4c82.f155904d);
                            sb6.append(" ");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c83 = this.f156019g;
                        if (c11485x80cda4c83 != null) {
                            sb6.append(c11485x80cda4c83.f155904d);
                            sb6.append(" ");
                        }
                        sb6.append(str);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("karea_result", sb6.toString());
                        intent.putExtra("kpost_code", c11485x80cda4c8.f155906f);
                        intent.putExtra("kwcode", c11485x80cda4c8.f155905e);
                        setResult(-1, intent);
                        finish();
                    }
                    android.content.Intent intent2 = getIntent();
                    int intExtra = intent2 != null ? intent2.getIntExtra("ui_title", -1) : -1;
                    android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11496x43941465.class);
                    intent3.putExtra("key_stage", this.f156017e);
                    intent3.putExtra("key_province", this.f156018f);
                    intent3.putExtra("key_city", this.f156019g);
                    if (-1 != intExtra) {
                        intent3.putExtra("ui_title", intExtra);
                    }
                    startActivityForResult(intent3, 1);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiRptSelectUI", "onPreferenceTreeClick error item, item is null or item.name isNullOrNil");
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
