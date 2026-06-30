package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI */
/* loaded from: classes5.dex */
public final class ActivityC12864xc0eb7555 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174314d = "MicroMsg.PermissionRegainUI";

    /* renamed from: e, reason: collision with root package name */
    public po1.d f174315e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 296 && i18 == -1) {
            if (!(intent == null)) {
                android.net.Uri data = intent.getData();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(data);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174314d, "Selected uri = " + data);
                jz5.l e17 = to1.g.f502444a.e(data);
                if (e17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f174314d, "Fail to parse uuid and path from uri, uri=" + data);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxs);
                    e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                    e4Var.c();
                    return;
                }
                java.lang.String str = (java.lang.String) e17.f384366d;
                java.lang.String str2 = (java.lang.String) e17.f384367e;
                po1.d dVar = this.f174315e;
                if (dVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                    throw null;
                }
                po1.d a17 = po1.d.a(dVar, null, null, null, null, null, null, null, 127, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                a17.f438833f = str;
                a17.d(str2);
                java.lang.String uri = data.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
                a17.f438834g = uri;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174314d, "try to save old device async. targetDevice=" + a17 + ", uri=" + data);
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                ((ku5.t0) ku5.t0.f394148d).q(new yo1.f(data, a17, this, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, string, false, 3, null)));
                return;
            }
        }
        java.lang.String str3 = this.f174314d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestCode=");
        sb6.append(i17);
        sb6.append(" resultCode=");
        sb6.append(i18);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        mo54448x9c8c0d33(new yo1.c(this));
        java.lang.String stringExtra = getIntent().getStringExtra("actitity_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        mo54450xbf7c1df6(stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("deviceInfo");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f174314d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "deviceId is empty");
            finish();
            return;
        }
        po1.d b17 = po1.d.f438827i.b(str);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "Fail to parse deviceInfo from str = ".concat(str));
            finish();
            return;
        }
        this.f174315e = b17;
        if (b17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        if (b17.f438829b != po1.g.f438843h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Device type error, type = ");
            po1.d dVar = this.f174315e;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                throw null;
            }
            sb6.append(dVar.f438829b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, sb6.toString());
            finish();
            return;
        }
        ro1.v vVar = ro1.v.f479547a;
        if (b17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        if (vVar.f(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "New device need bind before reauthorization.");
            finish();
            return;
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rgi)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rgg);
        textView.setVisibility(0);
        po1.d dVar2 = this.f174315e;
        if (dVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        textView.setText(dVar2.f438832e);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.rgf);
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvl);
        button.setOnClickListener(new yo1.d(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ro1.v vVar = ro1.v.f479547a;
        po1.d dVar = this.f174315e;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        po1.d e17 = vVar.e(dVar.f438828a);
        if (e17 == null && (e17 = this.f174315e) == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        this.f174315e = e17;
        if (to1.g.f502444a.a(this, e17)) {
            finish();
        }
    }
}
