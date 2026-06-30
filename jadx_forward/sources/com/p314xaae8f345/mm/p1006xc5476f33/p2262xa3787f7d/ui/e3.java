package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class e3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f254511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 f254512b;

    public e3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 activityC18578x68ca6165) {
        this.f254511a = u3Var;
        this.f254512b = activityC18578x68ca6165;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f254511a.dismiss();
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            return null;
        }
        r45.m20 m20Var = (r45.m20) fVar.f152151d;
        boolean z17 = m20Var.f461620d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 activityC18578x68ca6165 = this.f254512b;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(activityC18578x68ca6165.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
            intent.putExtra("intent_process", 1);
            activityC18578x68ca6165.startActivityForResult(intent, 100);
            return null;
        }
        if (m20Var.f461621e) {
            activityC18578x68ca6165.startActivityForResult(new android.content.Intent(activityC18578x68ca6165.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b.class), 101);
            return null;
        }
        activityC18578x68ca6165.startActivityForResult(new android.content.Intent(activityC18578x68ca6165.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b.class), 101);
        return null;
    }
}
