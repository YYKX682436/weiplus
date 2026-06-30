package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther */
/* loaded from: classes.dex */
public class ActivityC18588x97356fb7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254426d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f254427e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254428f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f254429g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cmb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        int i17;
        int i18;
        int i19;
        int i27;
        super.onCreate(bundle);
        java.lang.String str2 = "";
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f254426d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.h7s);
        this.f254427e = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) findViewById(com.p314xaae8f345.mm.R.id.gnd);
        this.f254428f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f254429g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cut);
        int intExtra = getIntent().getIntExtra("biz_type", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainOther", "type:%s", java.lang.Integer.valueOf(intExtra));
        int i28 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g;
        int i29 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac;
        switch (intExtra) {
            case 1:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsp);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572579bp2);
                i17 = com.p314xaae8f345.mm.R.raw.f80213xebd7e02b;
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7;
                break;
            case 2:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsd);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bou);
                i18 = com.p314xaae8f345.mm.R.raw.f80299x17270aab;
                int i37 = i29;
                i27 = i18;
                i28 = i37;
                int i38 = i27;
                i19 = i28;
                i17 = i38;
                break;
            case 3:
                this.f254426d.setVisibility(8);
                this.f254427e.setVisibility(0);
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsh);
                str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bow);
                i17 = -1;
                i19 = -1;
                java.lang.String str3 = str;
                string2 = str2;
                string = str3;
                break;
            case 4:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsj);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.box);
                i27 = com.p314xaae8f345.mm.R.raw.f80209x555689d7;
                int i382 = i27;
                i19 = i28;
                i17 = i382;
                break;
            case 5:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsn);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572577bp0);
                i27 = com.p314xaae8f345.mm.R.raw.f80304x8f6ba4ae;
                int i3822 = i27;
                i19 = i28;
                i17 = i3822;
                break;
            case 6:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jso);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572578bp1);
                i18 = com.p314xaae8f345.mm.R.raw.f80309xebda304e;
                int i372 = i29;
                i27 = i18;
                i28 = i372;
                int i38222 = i27;
                i19 = i28;
                i17 = i38222;
                break;
            case 7:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsq);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572580bp3);
                i18 = com.p314xaae8f345.mm.R.raw.f80381x596f0571;
                i29 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m;
                int i3722 = i29;
                i27 = i18;
                i28 = i3722;
                int i382222 = i27;
                i19 = i28;
                i17 = i382222;
                break;
            case 8:
                if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
                    string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsl);
                    string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.boz);
                } else {
                    string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsk);
                    string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.boy);
                }
                i27 = com.p314xaae8f345.mm.R.raw.f80153xa6084cda;
                int i3822222 = i27;
                i19 = i28;
                i17 = i3822222;
                break;
            case 9:
                this.f254426d.setImageDrawable(i65.a.i(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80126x44e50e13));
                this.f254426d.m82040x7541828(i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560961yz));
                this.f254428f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jsg);
                this.f254429g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bov));
                this.f254429g.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bov));
                str = "";
                i17 = -1;
                i19 = -1;
                java.lang.String str32 = str;
                string2 = str2;
                string = str32;
                break;
            case 10:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jse);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrm);
                i17 = com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee;
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7;
                break;
            case 11:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrt);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jru);
                i17 = com.p314xaae8f345.mm.R.raw.f79999x1807af9f;
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7;
                break;
            case 12:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsz);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574872jt0);
                i17 = com.p314xaae8f345.mm.R.raw.f80062x6472e4d;
                i19 = -1;
                break;
            case 13:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsf);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574869js2);
                i17 = com.p314xaae8f345.mm.R.raw.f80119x628f1c9a;
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7;
                break;
            case 14:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5_);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f99);
                i18 = com.p314xaae8f345.mm.R.raw.f80699x4a9ebf82;
                i29 = com.p314xaae8f345.mm.R.C30859x5a72f63.af8;
                int i37222 = i29;
                i27 = i18;
                i28 = i37222;
                int i38222222 = i27;
                i19 = i28;
                i17 = i38222222;
                break;
            case 15:
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.pil);
                string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.oak);
                i18 = com.p314xaae8f345.mm.R.raw.f81422x77dccf21;
                int i372222 = i29;
                i27 = i18;
                i28 = i372222;
                int i382222222 = i27;
                i19 = i28;
                i17 = i382222222;
                break;
            default:
                str = "";
                i17 = -1;
                i19 = -1;
                java.lang.String str322 = str;
                string2 = str2;
                string = str322;
                break;
        }
        if (i17 > 0 && this.f254426d.getVisibility() == 0) {
            this.f254426d.setImageDrawable(i65.a.i(mo55332x76847179(), i17));
            if (i19 != -1) {
                this.f254426d.m82040x7541828(i65.a.d(mo55332x76847179(), i19));
            } else {
                this.f254426d.m82037xa10c26f6(false);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            this.f254428f.setText(string);
            this.f254428f.setContentDescription(string);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            this.f254429g.setText(string2);
            this.f254429g.setContentDescription(string2);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.q5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
