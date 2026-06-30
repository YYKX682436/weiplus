package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19388xf5a51ba6 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 {
    public int Z4;

    /* renamed from: a5, reason: collision with root package name */
    public android.view.View f265853a5;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627, tj5.n
    public boolean G0() {
        this.J4.f();
        android.view.View view = this.f265853a5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        va(true);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    public int S6() {
        if (!fp.h.c(23)) {
            return mo78508x85b50c3c();
        }
        u75.d.g();
        return getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627, tj5.n
    public void U1(boolean z17) {
        super.U1(z17);
        if (!z17) {
            android.view.View view = this.F4;
            view.setPadding(this.Z4, 0, view.getPaddingRight(), 0);
            this.J4.g();
        }
        this.J4.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cv9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r3 = r5.optString("hotword");
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ia() {
        /*
            r7 = this;
            int r0 = r7.f265777a4
            r1 = 2
            r2 = 8
            if (r0 != r2) goto Lf
            boolean r3 = r7.S3
            if (r3 == 0) goto Lf
            r0 = 2131768623(0x7f10352f, float:1.9168498E38)
            goto L57
        Lf:
            r3 = 1
            if (r0 == r3) goto L54
            if (r0 == r1) goto L50
            if (r0 == r2) goto L4c
            r2 = 16
            if (r0 == r2) goto L48
            r2 = 64
            if (r0 == r2) goto L44
            r2 = 128(0x80, float:1.8E-43)
            if (r0 == r2) goto L40
            r2 = 256(0x100, float:3.59E-43)
            if (r0 == r2) goto L3c
            r2 = 384(0x180, float:5.38E-43)
            if (r0 == r2) goto L3c
            r2 = 512(0x200, float:7.17E-43)
            if (r0 == r2) goto L38
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 == r2) goto L34
            r0 = -1
            goto L57
        L34:
            r0 = 2131768619(0x7f10352b, float:1.916849E38)
            goto L57
        L38:
            r0 = 2131768618(0x7f10352a, float:1.9168487E38)
            goto L57
        L3c:
            r0 = 2131768607(0x7f10351f, float:1.9168465E38)
            goto L57
        L40:
            r0 = 2131768608(0x7f103520, float:1.9168467E38)
            goto L57
        L44:
            r0 = 2131755635(0x7f100273, float:1.9142155E38)
            goto L57
        L48:
            r0 = 2131768620(0x7f10352c, float:1.9168492E38)
            goto L57
        L4c:
            r0 = 2131768622(0x7f10352e, float:1.9168496E38)
            goto L57
        L50:
            r0 = 2131774955(0x7f104deb, float:1.918134E38)
            goto L57
        L54:
            r0 = 2131774956(0x7f104dec, float:1.9181342E38)
        L57:
            if (r0 >= 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131756275(0x7f1004f3, float:1.9143453E38)
            java.lang.String r2 = r2.getString(r3)
            r0.append(r2)
            int r2 = r7.f265777a4
            java.lang.String r3 = ""
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Exception -> Lc1
            r4.<init>()     // Catch: java.lang.Exception -> Lc1
            java.lang.String r5 = "key"
            java.lang.String r6 = "educationTab"
            r4.putString(r5, r6)     // Catch: java.lang.Exception -> Lc1
            com.tencent.mm.plugin.webview.stub.v0 r5 = r7.K1     // Catch: java.lang.Exception -> Lc1
            android.os.Bundle r1 = r5.tb(r1, r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r4 = "result"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r5 = "result_1"
            java.lang.String r1 = r1.getString(r5)     // Catch: java.lang.Exception -> Lc1
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc1
            if (r1 != 0) goto L97
            goto L98
        L97:
            r4 = r1
        L98:
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r1 = "items"
            org.json.JSONArray r1 = r5.optJSONArray(r1)     // Catch: java.lang.Exception -> Lc1
            if (r1 != 0) goto La4
            goto Lc1
        La4:
            r4 = 0
        La5:
            int r5 = r1.length()     // Catch: java.lang.Exception -> Lc1
            if (r4 >= r5) goto Lc1
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r6 = "businessType"
            int r6 = r5.optInt(r6)     // Catch: java.lang.Exception -> Lc1
            if (r6 != r2) goto Lbe
            java.lang.String r1 = "hotword"
            java.lang.String r3 = r5.optString(r1)     // Catch: java.lang.Exception -> Lc1
            goto Lc1
        Lbe:
            int r4 = r4 + 1
            goto La5
        Lc1:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
        Lc9:
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r1 = r1.getResources()
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r0 = r2.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 2131774954(0x7f104dea, float:1.9181338E38)
            java.lang.String r0 = r1.getString(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19388xf5a51ba6.ia():java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627
    public void oa() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f265853a5 = findViewById(com.p314xaae8f345.mm.R.id.pil);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = this.J4;
        c19227x8f71d8b3.m80966xdb574fcd().setOnFocusChangeListener(c19227x8f71d8b3.H);
        this.J4.f();
        this.J4.g();
        this.Z4 = i65.a.b(this, 48);
        if (this.Y3 == 24) {
            android.view.View view = this.f265853a5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById(com.p314xaae8f345.mm.R.id.m7g).setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p2(this));
        if (getIntent() != null && getIntent().getBooleanExtra("ftsneedkeyboard", false)) {
            m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.q2(this), 128L);
        }
        Q8(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), !com.p314xaae8f345.mm.ui.bk.C());
        android.widget.ImageButton m80965xaaf4ce45 = this.J4.m80965xaaf4ce45();
        if (m80965xaaf4ce45 != null) {
            m80965xaaf4ce45.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627
    public void sa() {
        super.sa();
        android.view.View view = this.f265853a5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onWebViewPageLoaded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI", "onWebViewPageLoaded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
