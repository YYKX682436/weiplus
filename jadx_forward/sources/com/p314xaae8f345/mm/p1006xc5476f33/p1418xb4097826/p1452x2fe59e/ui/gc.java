package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class gc implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e f191615d;

    public gc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e activityC14025xcad1379e) {
        this.f191615d = activityC14025xcad1379e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e activityC14025xcad1379e = this.f191615d;
        activityC14025xcad1379e.D--;
        activityC14025xcad1379e.f7();
        if (activityC14025xcad1379e.D > 0) {
            return true;
        }
        android.widget.Button button = activityC14025xcad1379e.f190938x;
        if (button == null) {
            return false;
        }
        button.setEnabled(true);
        return false;
    }
}
