package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f154218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154219e;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, int i17) {
        this.f154219e = activityC11351x975a7907;
        this.f154218d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f154219e.O1.smoothScrollBy(0, this.f154218d);
    }
}
