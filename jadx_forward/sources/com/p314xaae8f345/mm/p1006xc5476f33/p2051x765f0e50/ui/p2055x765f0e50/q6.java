package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class q6 implements android.app.TimePickerDialog.OnTimeSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17410x62ce94aa f242997a;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17410x62ce94aa activityC17410x62ce94aa) {
        this.f242997a = activityC17410x62ce94aa;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public void onTimeSet(android.widget.TimePicker timePicker, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17410x62ce94aa activityC17410x62ce94aa = this.f242997a;
        if (activityC17410x62ce94aa.f241833i) {
            activityC17410x62ce94aa.f241829e = i17;
            activityC17410x62ce94aa.f241830f = i18;
            android.content.SharedPreferences v17 = ip.b.v();
            v17.edit().putInt("settings_active_end_time_hour", i17).commit();
            v17.edit().putInt("settings_active_end_time_min", i18).commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveActiveEnd: %d:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            activityC17410x62ce94aa.f241831g = i17;
            activityC17410x62ce94aa.f241832h = i18;
            android.content.SharedPreferences v18 = ip.b.v();
            v18.edit().putInt("settings_active_begin_time_hour", i17).commit();
            v18.edit().putInt("settings_active_begin_time_min", i18).commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveActiveBegine: %d:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        activityC17410x62ce94aa.mo43517x10010bd5();
    }
}
