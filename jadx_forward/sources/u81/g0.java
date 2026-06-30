package u81;

/* loaded from: classes7.dex */
public class g0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u81.h0 f506962a;

    public g0(u81.h0 h0Var) {
        this.f506962a = h0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb2;
        if (intent == null || !"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandUIHomePressReceiver", "[home_pressed] action: %s, reason: %s", intent.getAction(), stringExtra);
        boolean equals = stringExtra.equals("homekey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e1 e1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e1.f170549a;
        if (!equals) {
            if (stringExtra.equals("recentapps") || stringExtra.equals("assist")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h8 h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h8) this.f506962a;
                if (h8Var.f171287b.f171312d.mo78538xecd98af8()) {
                    return;
                }
                e1Var.a(h8Var.f171287b.f171312d, "onRecentAppsPressed");
                c11529x5d7a34bb = h8Var.f171287b.f171312d.f35293x1829ba16;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = c11529x5d7a34bb.mo48805xd384d23c();
                if (mo48805xd384d23c == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(mo48805xd384d23c.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.RECENT_APPS_PRESSED);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h8 h8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h8) this.f506962a;
        if (h8Var2.f171287b.f171312d.mo78538xecd98af8()) {
            return;
        }
        e1Var.a(h8Var2.f171287b.f171312d, "onHomePressed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = h8Var2.f171287b.f171312d;
        activityC12666xc288131a.C = true;
        c11529x5d7a34bb2 = activityC12666xc288131a.f35293x1829ba16;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c2 = c11529x5d7a34bb2.mo48805xd384d23c();
        if (mo48805xd384d23c2 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = mo48805xd384d23c2.f156329e;
        if (hcVar != null && hcVar.mo48805xd384d23c() == mo48805xd384d23c2) {
            mo48805xd384d23c2.h0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(mo48805xd384d23c2.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HOME_PRESSED);
    }
}
