package bs3;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f23996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f23996d = jz5.h.b(new bs3.g(this));
    }

    public final void O6(boolean z17) {
        if (getUserName() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "modContactSocialBlackList start, userName: " + getUserName() + ", talkOnly: " + z17);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(getUserName(), true);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PermissionSettingUIC", "Contact not found for userName: " + getUserName());
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Found contact: " + n17.d1() + ", contactID: " + ((int) n17.E2));
            if (((int) n17.E2) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Contact has no ID, inserting...");
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(n17.d1());
            }
            if (z17) {
                n17.i3();
            } else {
                n17.setType(n17.getType() & (-8388609));
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(getUserName(), n17);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI = activity instanceof com.tencent.mm.plugin.profile.ui.PermissionSettingUI ? (com.tencent.mm.plugin.profile.ui.PermissionSettingUI) activity : null;
            if (permissionSettingUI != null) {
                permissionSettingUI.W6();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Updated contact social black list status");
            r45.zo4 zo4Var = new r45.zo4();
            zo4Var.f392251d = getUserName();
            if (z17) {
                zo4Var.f392252e = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Setting ModType to MODSOCIALBLACKLIST_ADD");
            } else {
                zo4Var.f392252e = 2;
                com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Setting ModType to MODSOCIALBLACKLIST_DEL");
            }
            xg3.p0 p0Var = new xg3.p0(72, zo4Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "Sending op log operation for social black list modification");
            kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new bs3.a(p0Var, null), 3, null);
        }
    }

    public final java.lang.String getUserName() {
        return (java.lang.String) ((jz5.n) this.f23996d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionSettingUIC", "onCreateAfter called, starting to collect oplog SharedFlow");
        kotlinx.coroutines.y0 b17 = v65.m.b(getActivity());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new bs3.e(this, null), 2, null);
    }
}
