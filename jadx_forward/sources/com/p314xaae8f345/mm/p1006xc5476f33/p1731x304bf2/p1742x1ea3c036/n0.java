package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f221389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f221390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 f221392g;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825, android.view.View view, android.view.View view2, java.lang.String str) {
        this.f221392g = activityC15876x18f56825;
        this.f221389d = view;
        this.f221390e = view2;
        this.f221391f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f221389d;
        android.view.View view = this.f221390e;
        frameLayout.addView(view);
        this.f221392g.f221031h.put(this.f221391f, view);
    }
}
