package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class gi implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f290234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f290235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f290236c;

    public gi(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, android.widget.CheckBox checkBox) {
        this.f290236c = activityC21437xf483c2;
        this.f290234a = z2Var;
        this.f290235b = checkBox;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        this.f290234a.B();
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f290236c;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.W4(activityC21437xf483c2.f278604e.d1())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("if_meta_storage_clean", java.lang.Integer.valueOf(this.f290235b.isChecked() ? 1 : 0));
            activityC21437xf483c2.W6("yuanbao_msg_clear_cancel", hashMap);
        }
    }
}
