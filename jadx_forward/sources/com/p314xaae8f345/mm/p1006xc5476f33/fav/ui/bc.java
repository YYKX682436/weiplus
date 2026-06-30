package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class bc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f182064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.dc f182065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182066h;

    public bc(java.util.List list, int i17, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.dc dcVar, android.app.Dialog dialog) {
        this.f182062d = list;
        this.f182063e = i17;
        this.f182064f = map;
        this.f182065g = dcVar;
        this.f182066h = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.x1.n(this.f182062d, this.f182063e, this.f182064f);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.dc dcVar = this.f182065g;
        if (dcVar != null) {
            dcVar.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ac(this));
    }
}
