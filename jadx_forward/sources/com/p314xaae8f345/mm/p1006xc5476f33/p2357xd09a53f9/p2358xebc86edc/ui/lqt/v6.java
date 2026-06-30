package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259945d;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb) {
        this.f259945d = activityC19020x7623dbfb;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259945d;
        activityC19020x7623dbfb.findViewById(com.p314xaae8f345.mm.R.id.ixo).getLocationInWindow(iArr);
        activityC19020x7623dbfb.H.getLocationInWindow(iArr2);
        activityC19020x7623dbfb.H.scrollBy(0, iArr[1] - iArr2[1]);
    }
}
