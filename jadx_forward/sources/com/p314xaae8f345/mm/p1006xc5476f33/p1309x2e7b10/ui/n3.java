package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class n3 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176624b;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365, int i17) {
        this.f176624b = activityC13057x768a6365;
        this.f176623a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176624b;
        xt1.k kVar = (xt1.k) activityC13057x768a6365.f176428e.getItem(this.f176623a);
        if (kVar != null) {
            xt1.t0.Ui().b(kVar.f68130x6583d7e);
            activityC13057x768a6365.T6();
            activityC13057x768a6365.f176428e.f();
        }
    }
}
