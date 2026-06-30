package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b f260137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f260138e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar, android.view.View view) {
        this.f260137d = bVar;
        this.f260138e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b bVar = this.f260137d;
        bVar.f260140a.getLocationInWindow(iArr);
        int i17 = iArr[0];
        bVar.f260147h.getLocationInWindow(iArr);
        bVar.f260140a.setMaxWidth((iArr[0] - i17) - i65.a.b(this.f260138e.getContext(), 16));
    }
}
