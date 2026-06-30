package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class fb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f182390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f182391e;

    public fb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, java.util.ArrayList arrayList) {
        this.f182391e = activityC13579xef51058a;
        this.f182390d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182391e.f181800e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d4.b(this.f182390d);
    }
}
