package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f255842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d f255843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255844g;

    public t3(android.view.View view, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d c18621x6d4c961d, android.view.View view2) {
        this.f255841d = view;
        this.f255842e = z17;
        this.f255843f = c18621x6d4c961d;
        this.f255844g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f255842e;
        android.view.View view = this.f255844g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d c18621x6d4c961d = this.f255843f;
        if (z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d.f255004i;
            c18621x6d4c961d.d(view);
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18621x6d4c961d.f255004i;
            c18621x6d4c961d.c(view);
        }
    }
}
