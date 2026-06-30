package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f221347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.b f221348e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.b bVar, boolean z17) {
        this.f221348e = bVar;
        this.f221347d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f221347d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.b bVar = this.f221348e;
        if (z17) {
            bVar.f221349a.A.setVisibility(0);
        } else {
            bVar.f221349a.A.setVisibility(8);
        }
    }
}
