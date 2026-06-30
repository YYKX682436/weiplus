package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class vc implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f f243174d;

    public vc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f activityC17426xe0b6118f) {
        this.f243174d = activityC17426xe0b6118f;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus onPause: loss focus，canDuck is " + z17);
        android.content.Intent intent = new android.content.Intent("hearing_aid_message");
        intent.putExtra("isGetFocus", false);
        b4.d.a(this.f243174d.mo55332x76847179()).c(intent);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus onResume: gain focus");
        android.content.Intent intent = new android.content.Intent("hearing_aid_message");
        intent.putExtra("isGetFocus", true);
        b4.d.a(this.f243174d.mo55332x76847179()).c(intent);
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus onStop: loss focus");
    }
}
