package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI */
/* loaded from: classes9.dex */
public class RunnableC17457x5e8caa59 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements java.lang.Runnable, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.media.RingtoneManager f242159d;

    /* renamed from: e, reason: collision with root package name */
    public android.database.Cursor f242160e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.LayoutInflater f242161f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f242162g;

    /* renamed from: h, reason: collision with root package name */
    public int f242163h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f242164i = -1;

    /* renamed from: m, reason: collision with root package name */
    public android.media.Ringtone f242165m;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242162g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f242161f = android.view.LayoutInflater.from(this);
        android.media.RingtoneManager ringtoneManager = new android.media.RingtoneManager((android.app.Activity) this);
        this.f242159d = ringtoneManager;
        ringtoneManager.setType(2);
        setVolumeControlStream(5);
        this.f242165m = android.media.RingtoneManager.getRingtone(this, android.media.RingtoneManager.getDefaultUri(2));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iuj);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gl(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.irq), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hl(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mq7);
        android.view.View view = new android.view.View(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, dimensionPixelSize));
        android.view.View view2 = new android.view.View(this);
        view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, dimensionPixelSize));
        view.setClickable(false);
        view2.setClickable(false);
        listView.addHeaderView(view);
        listView.addFooterView(view2);
        this.f242160e = this.f242159d.getCursor();
        listView.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.il(this, this.f242160e));
        listView.setItemsCanFocus(false);
        listView.setOnItemClickListener(this);
        java.lang.String str = (java.lang.String) ip.l.i().second;
        if (str != null) {
            int ringtonePosition = this.f242159d.getRingtonePosition(android.net.Uri.parse(str));
            int i17 = ringtonePosition > -1 ? ringtonePosition + 2 : 1;
            this.f242163h = i17;
            if (i17 == 1) {
                getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putString("settings.ringtone.name", getString(com.p314xaae8f345.mm.R.C30867xcad56011.iui)).commit();
            }
            this.f242164i = this.f242163h - 1;
        } else {
            this.f242163h = 1;
        }
        listView.setItemChecked(this.f242163h, true);
        listView.setSelection(this.f242163h);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f242162g.mo50300x3fa464aa(this);
        android.database.Cursor cursor = this.f242160e;
        if (cursor != null && !cursor.isClosed()) {
            this.f242160e.close();
            this.f242160e = null;
        }
        android.media.RingtoneManager ringtoneManager = this.f242159d;
        if (ringtoneManager != null) {
            try {
                java.lang.reflect.Field declaredField = ringtoneManager.getClass().getDeclaredField("mActivity");
                tx1.a.a(declaredField);
                declaredField.setAccessible(true);
                declaredField.set(ringtoneManager, null);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsRingtoneUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f242162g.mo50300x3fa464aa(this);
        this.f242164i = i17 - 1;
        this.f242162g.mo50297x7c4d7ca2(this, 300);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsRingtoneUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return (i17 == 24 || i17 == 25) ? super.onKeyUp(i17, keyEvent) : super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        this.f242159d.stopPreviousRingtone();
        super.onStop();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isFinishing()) {
            return;
        }
        int i17 = this.f242164i;
        android.media.Ringtone ringtone = i17 == 0 ? this.f242165m : this.f242159d.getRingtone(i17 - 1);
        if (ringtone != null) {
            try {
                ringtone.play();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RingtonePickerActivity", e17, "play ringtone error", new java.lang.Object[0]);
            }
        }
    }
}
