package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public class k implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 f159949e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9, java.lang.String str) {
        this.f159949e = activityC11883xd41f5bb9;
        this.f159948d = str;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f159948d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9 = this.f159949e;
        if (!K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m mVar = activityC11883xd41f5bb9.f159889o;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC11883xd41f5bb9.f159888n;
            mVar.a(-3);
            dialogInterface.dismiss();
        }
        activityC11883xd41f5bb9.T6(null);
        return false;
    }
}
