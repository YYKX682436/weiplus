package bs3;

/* loaded from: classes4.dex */
public final class b implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs3.h f105520d;

    public b(bs3.h hVar) {
        this.f105520d = hVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        e21.f0 f0Var = (e21.f0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Received op log result: " + f0Var);
        xg3.q0 q0Var = f0Var.f328049a;
        bs3.h hVar = this.f105520d;
        hVar.getClass();
        if (q0Var.b() == 72) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hVar.m11131x6bf53a6c(), true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Callback processing for contact: ");
            sb6.append(n17 != null ? n17.d1() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", sb6.toString());
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PermissionSettingUIC", "Contact not found for userName: " + hVar.m11131x6bf53a6c());
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = hVar.m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5) m158354x19263085 : null;
                if (activityC16863xc0e4ffb5 != null) {
                    int i17 = f0Var.f328050b;
                    if (i17 == -3400) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PermissionSettingUIC", "Reached only chat friend limit, ret: " + i17);
                        activityC16863xc0e4ffb5.f235280i = true;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                        n17.i3();
                        c01.e2.h0(n17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Modified social black list contact locally");
                        java.lang.String str = f0Var.f328052d;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            android.view.View findViewById = activityC16863xc0e4ffb5.findViewById(com.p314xaae8f345.mm.R.id.nxr);
                            android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Updated UI hint with content: " + str);
                        }
                        activityC16863xc0e4ffb5.W6();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Updated activity state");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC16863xc0e4ffb5);
                        u1Var.g(str);
                        u1Var.a(true);
                        u1Var.j(activityC16863xc0e4ffb5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
                        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
                        u1Var.b(new bs3.f(activityC16863xc0e4ffb5));
                        u1Var.q(false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Showed limit warning dialog");
                    } else if (i17 != 0 || n17.y2()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionSettingUIC", "opcode result: %d", java.lang.Integer.valueOf(i17));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Operation successful, resetting friend limit flag");
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                    }
                    ai4.m0.f86706a.P(hVar.m11131x6bf53a6c());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Triggered status update for user: " + hVar.m11131x6bf53a6c());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
