package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class xb implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc f155853e;

    public xb(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc, boolean[] zArr) {
        this.f155853e = activityC11453xa58e34bc;
        this.f155852d = zArr;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            this.f155852d[0] = true;
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.W;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155853e;
        boolean X6 = activityC11453xa58e34bc.X6();
        fo3.s sVar = fo3.s.INSTANCE;
        if (X6) {
            sVar.E7("ie_reg_eu");
        }
        if (activityC11453xa58e34bc.W6()) {
            sVar.E7("ie_login");
        }
    }
}
