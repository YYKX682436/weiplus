package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public final class w4 implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd f243217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243218b;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd activityC17398x2eb064cd, java.lang.String str) {
        this.f243217a = activityC17398x2eb064cd;
        this.f243218b = str;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingMessageRingtoneUI", "SoundPool load error pathId " + this.f243218b + " status " + i18);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd activityC17398x2eb064cd = this.f243217a;
        activityC17398x2eb064cd.f241776i = valueOf;
        android.media.SoundPool soundPool2 = activityC17398x2eb064cd.f241772e;
        if (soundPool2 != null) {
            soundPool2.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
}
