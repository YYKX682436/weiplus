package bs3;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f105529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f105529d = jz5.h.b(new bs3.g(this));
    }

    public final void O6(boolean z17) {
        if (m11131x6bf53a6c() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "modContactSocialBlackList start, userName: " + m11131x6bf53a6c() + ", talkOnly: " + z17);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(m11131x6bf53a6c(), true);
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PermissionSettingUIC", "Contact not found for userName: " + m11131x6bf53a6c());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Found contact: " + n17.d1() + ", contactID: " + ((int) n17.E2));
            if (((int) n17.E2) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Contact has no ID, inserting...");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(n17.d1());
            }
            if (z17) {
                n17.i3();
            } else {
                n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-8388609));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(m11131x6bf53a6c(), n17);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5) m158354x19263085 : null;
            if (activityC16863xc0e4ffb5 != null) {
                activityC16863xc0e4ffb5.W6();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Updated contact social black list status");
            r45.zo4 zo4Var = new r45.zo4();
            zo4Var.f473784d = m11131x6bf53a6c();
            if (z17) {
                zo4Var.f473785e = 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Setting ModType to MODSOCIALBLACKLIST_ADD");
            } else {
                zo4Var.f473785e = 2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Setting ModType to MODSOCIALBLACKLIST_DEL");
            }
            xg3.p0 p0Var = new xg3.p0(72, zo4Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "Sending op log operation for social black list modification");
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m158354x19263085()), null, null, new bs3.a(p0Var, null), 3, null);
        }
    }

    /* renamed from: getUserName */
    public final java.lang.String m11131x6bf53a6c() {
        return (java.lang.String) ((jz5.n) this.f105529d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionSettingUIC", "onCreateAfter called, starting to collect oplog SharedFlow");
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(m158354x19263085());
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new bs3.e(this, null), 2, null);
    }
}
