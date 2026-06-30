package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f182249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182251g;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d, boolean z17, boolean z18, int i17) {
        this.f182251g = activityC13590x9555381d;
        this.f182248d = z17;
        this.f182249e = z18;
        this.f182250f = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17 = this.f182248d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182251g;
        if ((!z17 || activityC13590x9555381d.H.b(activityC13590x9555381d.F, false, false) || activityC13590x9555381d.F.X1 != 0) && !this.f182249e) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13590x9555381d.mo55332x76847179(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a0(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.e0(this);
        k0Var.v();
        return true;
    }
}
