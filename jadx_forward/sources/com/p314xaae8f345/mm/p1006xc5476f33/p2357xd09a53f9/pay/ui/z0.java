package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class z0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f260355a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var) {
        this.f260355a = j0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.widget.Button f17 = this.f260355a.f(-2);
        if (z17) {
            f17.setEnabled(false);
        } else {
            f17.setEnabled(true);
        }
    }
}
