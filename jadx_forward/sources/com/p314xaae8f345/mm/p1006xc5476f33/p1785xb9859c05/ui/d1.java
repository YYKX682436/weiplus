package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f f224311d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f) {
        this.f224311d = activityC16130xc9e2940f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224311d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w wVar = activityC16130xc9e2940f.f224085g;
        if (wVar == null || activityC16130xc9e2940f.f224084f == null || wVar.f224586v) {
            return;
        }
        java.lang.String str = activityC16130xc9e2940f.f224091p;
        wVar.f224584t = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            wVar.f224585u = false;
        } else {
            wVar.f224585u = true;
        }
        ((java.util.HashMap) wVar.f294143g).clear();
        wVar.q();
        wVar.notifyDataSetChanged();
        activityC16130xc9e2940f.f224098w.mo50305x3d8a09a2(2);
        activityC16130xc9e2940f.f224084f.invalidateViews();
    }
}
