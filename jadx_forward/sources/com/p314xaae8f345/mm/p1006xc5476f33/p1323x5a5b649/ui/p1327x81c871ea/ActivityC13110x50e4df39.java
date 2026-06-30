package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "cw1/s1", "cw1/t1", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI */
/* loaded from: classes7.dex */
public final class ActivityC13110x50e4df39 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f177217d;

    /* renamed from: e, reason: collision with root package name */
    public cw1.s1 f177218e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f177219f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f177220g;

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17;
        java.util.ArrayList arrayList;
        if (this.f177220g) {
            cw1.s1 s1Var = this.f177218e;
            if (s1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            boolean[] zArr = s1Var.f304836e;
            int length = zArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z17 = true;
                    break;
                } else {
                    if (!zArr[i17]) {
                        z17 = false;
                        break;
                    }
                    i17++;
                }
            }
            cw1.s1 s1Var2 = this.f177218e;
            if (s1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            int i18 = 0;
            long j17 = 0;
            for (java.lang.Object obj : s1Var2.f304835d) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) obj;
                if (s1Var2.f304836e[i18]) {
                    j17 += m0Var.f157801d;
                }
                i18 = i19;
            }
            if (z17) {
                arrayList = null;
            } else {
                cw1.s1 s1Var3 = this.f177218e;
                if (s1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                arrayList = new java.util.ArrayList();
                int i27 = 0;
                for (java.lang.Object obj2 : s1Var3.f304835d) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) obj2;
                    if (s1Var3.f304836e[i27]) {
                        arrayList.add(m0Var2.f157798a);
                    }
                    i27 = i28;
                }
            }
            cw1.s1 s1Var4 = this.f177218e;
            if (s1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            int i29 = 0;
            long j18 = 0;
            for (java.lang.Object obj3 : s1Var4.f304835d) {
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) obj3;
                if (s1Var4.f304836e[i29]) {
                    if (m0Var3.f157798a.length() > 0) {
                        j18 += m0Var3.f157801d;
                    }
                }
                i29 = i37;
            }
            setResult(-1, new android.content.Intent().putExtra("checked", z17).putExtra("checkedSize", j17).putExtra("appIds", arrayList != null ? (java.lang.String[]) arrayList.toArray(new java.lang.String[0]) : null).putExtra("appSize", j18));
            java.lang.Long[] lArr = new java.lang.Long[2];
            lArr[0] = java.lang.Long.valueOf(j17);
            lArr[1] = java.lang.Long.valueOf(arrayList != null ? arrayList.size() : 0L);
            mt1.b0.s(33, 0L, lArr);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e2m;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.n8e);
        mo54448x9c8c0d33(new cw1.x1(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.i3p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f177217d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        cw1.s1 s1Var = new cw1.s1(this);
        this.f177218e = s1Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f177217d;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(s1Var);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.iml);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f177219f = findViewById2;
        android.content.Intent intent = getIntent();
        long longExtra = intent.getLongExtra("size", 0L);
        boolean booleanExtra = intent.getBooleanExtra("checked", true);
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("appIds");
        java.util.Set D0 = stringArrayExtra != null ? kz5.z.D0(stringArrayExtra) : kz5.r0.f395535d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f177217d;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        c1163xf1deaba42.setVisibility(8);
        android.view.View view = this.f177219f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI", "loadAppBrandList", "(JZLjava/util/Set;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI", "loadAppBrandList", "(JZLjava/util/Set;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ((ku5.t0) ku5.t0.f394148d).a(new cw1.w1(longExtra, booleanExtra, D0, string, this));
    }
}
