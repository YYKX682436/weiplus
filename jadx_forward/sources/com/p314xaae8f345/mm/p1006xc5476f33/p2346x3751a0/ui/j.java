package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f258494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f258495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f258496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18913x27f6fc61 f258497g;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18913x27f6fc61 activityC18913x27f6fc61, int i17, int i18, boolean z17) {
        this.f258497g = activityC18913x27f6fc61;
        this.f258494d = i17;
        this.f258495e = i18;
        this.f258496f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18913x27f6fc61 activityC18913x27f6fc61 = this.f258497g;
        int i17 = this.f258494d;
        java.lang.String string = i17 == 0 ? "" : activityC18913x27f6fc61.getString(i17);
        int i18 = this.f258495e;
        db5.e1.H(this.f258497g, string, i18 != 0 ? activityC18913x27f6fc61.getString(i18) : "", this.f258496f, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.h(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.i(this));
    }
}
