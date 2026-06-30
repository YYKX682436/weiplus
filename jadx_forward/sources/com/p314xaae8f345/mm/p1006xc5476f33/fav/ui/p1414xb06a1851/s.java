package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182323d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d) {
        this.f182323d = activityC13590x9555381d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        o72.k3 k3Var = o72.k3.LeavelFullScreen;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182323d;
        o72.o3.b(k3Var, activityC13590x9555381d.E);
        u82.a aVar = activityC13590x9555381d.U;
        if (aVar != null && aVar.U(1, false)) {
            return true;
        }
        p82.a aVar2 = activityC13590x9555381d.T;
        if (aVar2 != null && aVar2.m0(1)) {
            return true;
        }
        activityC13590x9555381d.finish();
        return true;
    }
}
