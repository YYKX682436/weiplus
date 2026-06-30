package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p32.l f181064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f181065e;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7, p32.l lVar) {
        this.f181065e = activityC13477xb2a3ecd7;
        this.f181064d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = this.f181065e;
        activityC13477xb2a3ecd7.f180867e.f181038e = activityC13477xb2a3ecd7.B;
        p32.l lVar = this.f181064d;
        if (lVar.H() != null) {
            activityC13477xb2a3ecd7.Q = ((r45.tq3) lVar.H()).f468233w;
            activityC13477xb2a3ecd7.f180867e.g(activityC13477xb2a3ecd7.Q);
        }
        activityC13477xb2a3ecd7.f180867e.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7.V6(activityC13477xb2a3ecd7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7.U6(activityC13477xb2a3ecd7, activityC13477xb2a3ecd7.R);
    }
}
