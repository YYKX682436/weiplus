package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI */
/* loaded from: classes11.dex */
public class ActivityC17410x62ce94aa extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241828d;

    /* renamed from: e, reason: collision with root package name */
    public int f241829e;

    /* renamed from: f, reason: collision with root package name */
    public int f241830f;

    /* renamed from: g, reason: collision with root package name */
    public int f241831g;

    /* renamed from: h, reason: collision with root package name */
    public int f241832h;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f241834m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f241835n;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241833i = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241836o = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.app.TimePickerDialog.OnTimeSetListener f241837p = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.q6(this);

    public static java.lang.String V6(android.content.Context context, int i17, int i18) {
        java.lang.String p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), context);
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        if (!p17.equalsIgnoreCase("zh_CN") && (!p17.equalsIgnoreCase("language_default") || !"zh_CN".equalsIgnoreCase(d17))) {
            return java.text.DateFormat.getTimeInstance(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(p17)).format((java.util.Date) new java.sql.Time(i17, i18, 0));
        }
        return ((java.lang.Object) k35.m1.c(context, (i17 * 3600000) + (i18 * 60000))) + java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(i17 > 12 ? i17 - 12 : i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576468c3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f241828d = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).g(com.p314xaae8f345.mm.R.xml.f576468c3);
        this.f241836o = !ip.b.r();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).h("settings_active_silence_time")).O(this.f241836o);
        this.f241835n = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).h("settings_active_begin_time");
        this.f241829e = ip.b.v().getInt("settings_active_end_time_hour", 23);
        int i17 = ip.b.v().getInt("settings_active_end_time_min", 0);
        this.f241830f = i17;
        this.f241835n.H(V6(this, this.f241829e, i17));
        this.f241834m = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).h("settings_active_end_time");
        this.f241831g = ip.b.v().getInt("settings_active_begin_time_hour", 8);
        int i18 = ip.b.v().getInt("settings_active_begin_time_min", 0);
        this.f241832h = i18;
        this.f241834m.H(V6(this, this.f241831g, i18));
        if (this.f241836o) {
            this.f241835n.w(true);
            this.f241834m.w(true);
        } else {
            this.f241835n.w(false);
            this.f241834m.w(false);
        }
        if (!this.f241836o) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).v(this.f241835n);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).v(this.f241834m);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574555ip4);
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p6(this));
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            return null;
        }
        boolean z17 = this.f241833i;
        android.app.TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f241837p;
        return z17 ? new android.app.TimePickerDialog(mo55332x76847179(), onTimeSetListener, this.f241829e, this.f241830f, false) : new android.app.TimePickerDialog(mo55332x76847179(), onTimeSetListener, this.f241831g, this.f241832h, false);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.a9.a(2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.equals("settings_active_begin_time")) {
            this.f241833i = true;
            showDialog(1);
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("settings_active_end_time")) {
            this.f241833i = false;
            showDialog(1);
            return true;
        }
        if (!c21560x1fce98fb.f279313q.equals("settings_active_silence_time")) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241828d).h("settings_active_silence_time");
        boolean z17 = !c21541x1c1b08fe.N();
        ip.b.v().edit().putBoolean("settings_active_time_full", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsActiveTime: %B", java.lang.Boolean.valueOf(z17));
        if (fp.h.c(26)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
            if (notificationManager.getNotificationChannel("message_dnd_mode_channel_id") == null) {
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("message_dnd_mode_channel_id", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hb7), 4);
                notificationChannel.setDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hb6));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound(null, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                mo3.g.wi(notificationManager, notificationChannel);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 0;
        objArr[1] = java.lang.Integer.valueOf(c21541x1c1b08fe.N() ? 1 : 2);
        g0Var.d(11351, objArr);
        mo43517x10010bd5();
        return true;
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i17, android.app.Dialog dialog) {
        if (i17 != 1) {
            return;
        }
        if (this.f241833i) {
            ((android.app.TimePickerDialog) dialog).updateTime(this.f241829e, this.f241830f);
        } else {
            ((android.app.TimePickerDialog) dialog).updateTime(this.f241831g, this.f241832h);
        }
    }
}
