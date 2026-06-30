package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288128e;

    public aa(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8, java.lang.String str) {
        this.f288128e = activityC22325x8baa24f8;
        this.f288127d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f288127d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288128e;
        if (K0) {
            str = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.htw);
        }
        db5.e1.y(activityC22325x8baa24f8, str, "", activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new com.p314xaae8f345.mm.ui.p2690x38b72420.z9(this));
    }
}
