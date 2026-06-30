package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288224d;

    public ea(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288224d = activityC22325x8baa24f8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288224d;
        int height = activityC22325x8baa24f8.f288084p0.getHeight();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC22325x8baa24f8.f287979d.getLayoutParams();
        marginLayoutParams.bottomMargin = height;
        activityC22325x8baa24f8.f287979d.setLayoutParams(marginLayoutParams);
    }
}
