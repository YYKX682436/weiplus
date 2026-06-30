package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 f255448e;

    public ge(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 activityC18656x65fa26e6) {
        this.f255447d = str;
        this.f255448e = activityC18656x65fa26e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6131xf75dfaeb c6131xf75dfaeb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6131xf75dfaeb();
        am.ay ayVar = c6131xf75dfaeb.f136403g;
        java.lang.String str = this.f255447d;
        ayVar.f87727a = str;
        if (!(str == null || r26.n0.N(str))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ce ceVar = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.f255189z;
            android.view.View findViewWithTag = this.f255448e.W6().findViewWithTag("status_avatar_" + str);
            if (findViewWithTag != null) {
                int[] iArr = new int[2];
                findViewWithTag.getLocationInWindow(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                ayVar.f87728b = i17;
                ayVar.f87729c = i18;
            }
        }
        c6131xf75dfaeb.e();
    }
}
