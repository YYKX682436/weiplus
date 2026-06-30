package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class i6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d f242679d;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d activityC17404xbaa82c2d) {
        this.f242679d = activityC17404xbaa82c2d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d activityC17404xbaa82c2d = this.f242679d;
        activityC17404xbaa82c2d.m79333x58c0be88().edit().putBoolean("settings_voicerecorder_mode", true).commit();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17404xbaa82c2d.f241809g).h("settings_voicerecorder_mode")).O(true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17404xbaa82c2d.f241809g).notifyDataSetChanged();
    }
}
