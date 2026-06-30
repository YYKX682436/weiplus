package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI */
/* loaded from: classes15.dex */
public class ActivityC16133x8935f7ee extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f224111d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h1 f224112e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88 f224113f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f224114g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224115h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224116i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f224118n;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f224121q;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f224117m = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f224119o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f224120p = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h1 h1Var = activityC16133x8935f7ee.f224112e;
        if (h1Var == null || (str = activityC16133x8935f7ee.f224117m) == null) {
            return;
        }
        h1Var.f224379g = str.trim();
        java.util.List list = h1Var.f224377e;
        list.clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) h1Var.f224376d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) arrayList.get(i17)).f224274a.toUpperCase().contains(h1Var.f224379g.toUpperCase()) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) arrayList.get(i17)).f224277d.toUpperCase().contains(h1Var.f224379g.toUpperCase()) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) arrayList.get(i17)).f224275b.contains(h1Var.f224379g)) {
                list.add((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) arrayList.get(i17));
            }
        }
        h1Var.c();
        int size2 = list.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee2 = h1Var.f224378f;
        if (size2 == 0) {
            activityC16133x8935f7ee2.f224121q.setVisibility(0);
        } else {
            activityC16133x8935f7ee2.f224121q.setVisibility(8);
        }
        h1Var.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blo;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571468fy);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        this.f224118n = c9Var;
        c9Var.f291857i = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l1(this);
        m78489xd6d59aa8(true, c9Var);
        this.f224113f = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88) findViewById(com.p314xaae8f345.mm.R.id.f564281mx);
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a();
        if (!a17.f224006c) {
            a17.b(false);
        }
        java.util.Iterator it = a17.f224004a.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (i17 >= 5) {
                break;
            }
            java.lang.String f17 = t83.c.f(intValue + "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17) && !com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().e(intValue)) {
                ((java.util.ArrayList) this.f224114g).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a(f17, intValue + "", 0, "0"));
                i17++;
            }
        }
        if (i17 > 0) {
            this.f224120p = true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            java.util.HashMap hashMap = t83.c.f497945b;
            if (hashMap.size() == 0) {
                t83.c.k();
            }
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                t83.d dVar = (t83.d) entry.getValue();
                java.lang.String str = dVar.f497952c;
                if (str != null && !"".equals(str.trim())) {
                    char[] charArray = str.toCharArray();
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    int length = charArray.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        java.lang.String a18 = com.p314xaae8f345.mm.p1004x2137b148.C11326x85391f34.a(charArray[i18]);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                            stringBuffer.append(charArray[i18]);
                        } else {
                            stringBuffer.append(a18);
                        }
                    }
                    str = stringBuffer.toString();
                }
                java.lang.String upperCase = str.toUpperCase();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upperCase)) {
                    upperCase = " ";
                }
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.f497951b, 0))) {
                    ((java.util.ArrayList) this.f224114g).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a(dVar.f497952c, dVar.f497951b, upperCase.charAt(0), upperCase));
                }
            }
        } else {
            java.util.HashMap hashMap2 = t83.c.f497945b;
            if (hashMap2.size() == 0) {
                t83.c.k();
            }
            for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                t83.d dVar2 = (t83.d) entry2.getValue();
                java.lang.String upperCase2 = dVar2.f497952c.toUpperCase();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upperCase2)) {
                    upperCase2 = " ";
                }
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar2.f497951b, 0))) {
                    ((java.util.ArrayList) this.f224114g).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a(dVar2.f497952c, dVar2.f497951b, upperCase2.charAt(0), upperCase2));
                }
            }
        }
        java.util.Collections.sort(this.f224114g, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p1(this));
        java.util.Iterator it6 = ((java.util.ArrayList) this.f224114g).iterator();
        while (it6.hasNext()) {
            int a19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) it6.next()).a();
            if (a19 != 0) {
                java.lang.String valueOf = java.lang.String.valueOf((char) a19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88 c16132x1cb7ea88 = this.f224113f;
                c16132x1cb7ea88.getClass();
                java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88.f224099r;
                boolean z17 = false;
                for (int i19 = 0; i19 < 26; i19++) {
                    if (strArr[i19].equals(valueOf)) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    valueOf = "#";
                }
                java.lang.String[] strArr2 = c16132x1cb7ea88.f224102f;
                int length2 = strArr2.length + 1;
                java.lang.String[] strArr3 = new java.lang.String[length2];
                int length3 = strArr2.length;
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    if (i27 >= length3) {
                        strArr3[length2 - 1] = valueOf;
                        c16132x1cb7ea88.f224102f = strArr3;
                        break;
                    }
                    java.lang.String str2 = strArr2[i27];
                    if (str2.equals(valueOf)) {
                        break;
                    }
                    strArr3[i28] = str2;
                    i28++;
                    i27++;
                }
            }
        }
        java.lang.System.currentTimeMillis();
        this.f224121q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564287n3);
        this.f224111d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h1(this, this.f224114g);
        this.f224112e = h1Var;
        h1Var.f224381i = this.f224119o;
        h1Var.f224382m = this.f224120p;
        this.f224111d.setAdapter((android.widget.ListAdapter) h1Var);
        this.f224111d.setVisibility(0);
        this.f224113f.m65177x40d747ee(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m1(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n1(this));
        this.f224111d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f224114g = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f224115h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        this.f224116i = stringExtra2 != null ? stringExtra2 : "";
        this.f224119o = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k1(this));
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", this.f224115h);
        intent.putExtra("couttry_code", this.f224116i);
        setResult(100, intent);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f224118n;
        if (c9Var != null) {
            c9Var.b();
        }
    }
}
