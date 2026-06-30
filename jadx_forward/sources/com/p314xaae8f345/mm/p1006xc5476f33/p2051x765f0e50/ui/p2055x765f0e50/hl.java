package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class hl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.RunnableC17457x5e8caa59 f242651d;

    public hl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.RunnableC17457x5e8caa59 runnableC17457x5e8caa59) {
        this.f242651d = runnableC17457x5e8caa59;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.RunnableC17457x5e8caa59 runnableC17457x5e8caa59 = this.f242651d;
        android.content.SharedPreferences.Editor edit = runnableC17457x5e8caa59.getSharedPreferences(e17, 0).edit();
        int i17 = runnableC17457x5e8caa59.f242164i;
        if (i17 != 0) {
            android.net.Uri ringtoneUri = runnableC17457x5e8caa59.f242159d.getRingtoneUri(i17 - 1);
            java.util.Objects.toString(ringtoneUri);
            if (ringtoneUri != null) {
                str = ringtoneUri.toString();
                edit.putString("settings.ringtone.name", android.media.RingtoneManager.getRingtone(runnableC17457x5e8caa59, ringtoneUri).getTitle(runnableC17457x5e8caa59));
                edit.commit();
                ip.b.v().edit().putString("settings.ringtone", str).commit();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", str);
                runnableC17457x5e8caa59.finish();
                return true;
            }
            edit.putString("settings.ringtone.name", runnableC17457x5e8caa59.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iui));
        } else {
            edit.putString("settings.ringtone.name", runnableC17457x5e8caa59.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iui));
        }
        str = null;
        edit.commit();
        ip.b.v().edit().putString("settings.ringtone", str).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", str);
        runnableC17457x5e8caa59.finish();
        return true;
    }
}
