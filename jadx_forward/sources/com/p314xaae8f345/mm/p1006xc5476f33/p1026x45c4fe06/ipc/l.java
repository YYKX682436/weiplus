package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 f159950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 f159951e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        this.f159951e = activityC11883xd41f5bb9;
        this.f159950d = abstractC11888x1a859600;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9 = this.f159951e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v vVar = activityC11883xd41f5bb9.f159882e;
        if (vVar == null || vVar.m50426xa07c53db()) {
            int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(activityC11883xd41f5bb9.getIntent(), "key_running_mode", 0);
            if (g17 == 2 || g17 == 3) {
                activityC11883xd41f5bb9.finish();
            }
        } else {
            activityC11883xd41f5bb9.finish();
        }
        activityC11883xd41f5bb9.U6(this.f159950d);
    }
}
