package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d f167290c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f167291a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.String f167292b = "";

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.C12415x1bea70a9 c12415x1bea70a9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.C12415x1bea70a9();
        c12415x1bea70a9.f167287f = str;
        if (c12415x1bea70a9.s()) {
            return c12415x1bea70a9.f167288g;
        }
        return false;
    }

    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicClientService", "notifyAction, currentPlayAppId:%s, action:%d", this.f167292b, java.lang.Integer.valueOf(i17));
        for (java.util.Map.Entry entry : this.f167291a.entrySet()) {
            if (entry != null) {
                java.lang.String str = (java.lang.String) entry.getKey();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.b) entry.getValue();
                if (!android.text.TextUtils.isEmpty(this.f167292b) && this.f167292b.equalsIgnoreCase(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicClientService", "current play music appId is %s", this.f167292b);
                    if (bVar != null) {
                        if (i17 == 10) {
                            ((u81.c) bVar).f506941a.f506965a.s(u81.u.ON_BACKGROUND_AUDIO_PREEMPTED, null);
                        } else if (i17 == 2) {
                            ((u81.c) bVar).f506941a.f506965a.s(u81.u.ON_BACKGROUND_AUDIO_STOPPED, null);
                        } else if (i17 != 7 && i17 == 1) {
                            ((u81.c) bVar).f506941a.f506965a.s(u81.u.ON_BACKGROUND_AUDIO_RESUMED, null);
                        }
                    }
                }
            }
        }
    }

    public boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equalsIgnoreCase(this.f167292b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.C12416xdf328581 c12416xdf328581 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.C12416xdf328581();
        c12416xdf328581.f167289f = str;
        c12416xdf328581.d();
        return true;
    }
}
