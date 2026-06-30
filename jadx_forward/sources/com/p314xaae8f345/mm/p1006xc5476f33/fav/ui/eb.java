package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f182372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f182373e;

    public eb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, java.util.ArrayList arrayList) {
        this.f182373e = activityC13579xef51058a;
        this.f182372d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182373e.f181800e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d4.b(this.f182372d);
    }
}
