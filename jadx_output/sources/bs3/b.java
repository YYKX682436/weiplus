package bs3;

/* loaded from: classes4.dex */
public final class b implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs3.h f23987d;

    public b(bs3.h hVar) {
        this.f23987d = hVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        e21.f0 f0Var = (e21.f0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Received op log result: " + f0Var);
        xg3.q0 q0Var = f0Var.f246516a;
        bs3.h hVar = this.f23987d;
        hVar.getClass();
        if (q0Var.b() == 72) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hVar.getUserName(), true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Callback processing for contact: ");
            sb6.append(n17 != null ? n17.d1() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", sb6.toString());
            if (n17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PermissionSettingUIC", "Contact not found for userName: " + hVar.getUserName());
            } else {
                androidx.appcompat.app.AppCompatActivity activity = hVar.getActivity();
                com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI = activity instanceof com.tencent.mm.plugin.profile.ui.PermissionSettingUI ? (com.tencent.mm.plugin.profile.ui.PermissionSettingUI) activity : null;
                if (permissionSettingUI != null) {
                    int i17 = f0Var.f246517b;
                    if (i17 == -3400) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.PermissionSettingUIC", "Reached only chat friend limit, ret: " + i17);
                        permissionSettingUI.f153747i = true;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                        n17.i3();
                        c01.e2.h0(n17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Modified social black list contact locally");
                        java.lang.String str = f0Var.f246519d;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            android.view.View findViewById = permissionSettingUI.findViewById(com.tencent.mm.R.id.nxr);
                            android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Updated UI hint with content: " + str);
                        }
                        permissionSettingUI.W6();
                        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Updated activity state");
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(permissionSettingUI);
                        u1Var.g(str);
                        u1Var.a(true);
                        u1Var.j(permissionSettingUI.getString(com.tencent.mm.R.string.hmr));
                        u1Var.m(com.tencent.mm.R.string.hms);
                        u1Var.b(new bs3.f(permissionSettingUI));
                        u1Var.q(false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Showed limit warning dialog");
                    } else if (i17 != 0 || n17.y2()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PermissionSettingUIC", "opcode result: %d", java.lang.Integer.valueOf(i17));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Operation successful, resetting friend limit flag");
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                    }
                    ai4.m0.f5173a.P(hVar.getUserName());
                    com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Triggered status update for user: " + hVar.getUserName());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
