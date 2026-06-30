package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI */
/* loaded from: classes11.dex */
public class ActivityC17372xbab57478 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f241674p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 f241675d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f241676e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f241677f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f241678g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f241679h;

    /* renamed from: i, reason: collision with root package name */
    public int f241680i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f241681m;

    /* renamed from: n, reason: collision with root package name */
    public int f241682n;

    /* renamed from: o, reason: collision with root package name */
    public float f241683o;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478 activityC17372xbab57478) {
        activityC17372xbab57478.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "jump to launcher");
        activityC17372xbab57478.f241679h.d();
        try {
            android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(activityC17372xbab57478.m78510xe15784dd());
            java.lang.String str = com.p314xaae8f345.mm.ui.p2.f291023a;
            com.p314xaae8f345.mm.vfs.w6.h(str);
            if (b07 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FakeSwitchAccountUI", "getBitmap from AccountGrid null!");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FakeSwitchAccountUI", "getBitmap from AccountGrid failed! %s", e17.getMessage());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC17372xbab57478, "com.tencent.mm.ui.LauncherUI");
        intent.addFlags(268468224);
        intent.putExtra("LauncherUI.jump_switch_account", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17372xbab57478, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI", "jumpToLauncher", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17372xbab57478.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17372xbab57478, "com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI", "jumpToLauncher", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17372xbab57478.finish();
        db5.f.h(activityC17372xbab57478);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570987cm3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a48));
        m78560xe21cbbf(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "FakeSwitchAccount onCreate");
        this.f241676e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nt9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 c17660x9d61a64 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64) findViewById(com.p314xaae8f345.mm.R.id.nt7);
        this.f241675d = c17660x9d61a64;
        c17660x9d61a64.setClickable(false);
        this.f241680i = getIntent().getIntExtra("key_mm_process_pid", 0);
        this.f241677f = getIntent().getStringExtra("key_switch_from_wx_username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "title %s", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574626iz5));
        this.f241676e.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574626iz5));
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_switch_account_users");
        java.util.Map map = this.f241678g;
        if (parcelableArrayListExtra != null) {
            java.util.Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70 c17358xfe5b6e70 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70) it.next();
                ((java.util.HashMap) map).put(c17358xfe5b6e70.f241580d, c17358xfe5b6e70);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "account count %d", java.lang.Integer.valueOf(((java.util.HashMap) map).size()));
        this.f241675d.m69121xe20ea950(true);
        this.f241675d.a(map);
        this.f241675d.m69114x863869e8(this.f241677f);
        this.f241675d.m69116xd6ad5f65(true);
        this.f241675d.b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.myLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m1(this), true);
        this.f241679h = b4Var;
        b4Var.c(1500L, 500L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f241681m = getIntent().getStringExtra("key_langauage_code");
            this.f241683o = getIntent().getFloatExtra("key_font_scale_size", 1.0f);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241681m)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "country %s", this.f241681m);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.e8.a("language_key", this.f241681m);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78473x26f04c88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f241681m);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "fontScale %f", java.lang.Float.valueOf(this.f241683o));
            i65.a.F(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f241683o);
            mo43517x10010bd5();
        } catch (java.lang.Throwable unused) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "fake switch account destroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "fake switch account resume");
        android.content.Intent intent = new android.content.Intent("action_kill_mm_process");
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        sendBroadcast(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeSwitchAccountUI", "fake switch account stop");
    }
}
