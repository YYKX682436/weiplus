package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class hi implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f290416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f290417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f290418c;

    public hi(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2, android.widget.CheckBox checkBox, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f290418c = activityC21437xf483c2;
        this.f290416a = checkBox;
        this.f290417b = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f290418c;
        boolean W4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.W4(activityC21437xf483c2.f278604e.d1());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f290417b;
        if (!W4) {
            com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.V6(activityC21437xf483c2);
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String str = activityC21437xf483c2.f278610n;
            ((ce0.e) jVar).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.I(str, 16);
            z2Var.B();
            return;
        }
        android.widget.CheckBox checkBox = this.f290416a;
        if (checkBox.isChecked()) {
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ni(activityC21437xf483c2.f278610n);
            activityC21437xf483c2.W6("yuanbao_msg_clear_meta_storage_open", null);
        } else {
            activityC21437xf483c2.W6("yuanbao_msg_clear_meta_storage_close", null);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(activityC21437xf483c2.f278610n)) {
            ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(activityC21437xf483c2.f278610n, 158);
        }
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.V6(activityC21437xf483c2);
        de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str2 = activityC21437xf483c2.f278610n;
        ((ce0.e) jVar2).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(str2, 16);
        z2Var.B();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("if_meta_storage_clean", java.lang.Integer.valueOf(checkBox.isChecked() ? 1 : 0));
        activityC21437xf483c2.W6("yuanbao_msg_clear_suc", hashMap);
    }
}
