package s14;

/* loaded from: classes.dex */
public final class f implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17495x8f22559e f483680a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17495x8f22559e activityC17495x8f22559e) {
        this.f483680a = activityC17495x8f22559e;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17495x8f22559e.f242971f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17495x8f22559e activityC17495x8f22559e = this.f483680a;
        if (z17) {
            activityC17495x8f22559e.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 1);
        } else {
            activityC17495x8f22559e.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 2);
        }
    }
}
