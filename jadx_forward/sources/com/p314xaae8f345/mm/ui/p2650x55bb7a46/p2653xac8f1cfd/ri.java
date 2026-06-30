package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class ri implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f281391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.si f281392b;

    public ri(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.si siVar, android.content.Intent intent) {
        this.f281392b = siVar;
        this.f281391a = intent;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        android.content.Intent intent2 = this.f281391a;
        intent2.removeExtra("SendAppMessageWrapper_Scene");
        if (i17 == 228) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.si siVar = this.f281392b;
            if (i18 != -1) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(siVar.f280113d.g(), com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(intent2.getExtras(), 0), true, true);
                if (siVar.f280113d.g().isFinishing()) {
                    return;
                }
                siVar.f280113d.g().finish();
                return;
            }
            if (intent != null && intent.getBooleanExtra("Select_stay_in_wx", false)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.d(false, 0);
            } else {
                if (siVar.f280113d.g().isFinishing()) {
                    return;
                }
                siVar.f280113d.g().finish();
            }
        }
    }
}
