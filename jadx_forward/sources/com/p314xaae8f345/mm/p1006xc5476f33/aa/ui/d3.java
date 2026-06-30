package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f154134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154136f;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, p13.c cVar, java.util.ArrayList arrayList) {
        this.f154136f = activityC11351x975a7907;
        this.f154134d = cVar;
        this.f154135e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154136f;
        if (activityC11351x975a7907.B1) {
            android.app.Dialog dialog = activityC11351x975a7907.A1;
            if (dialog != null && dialog.isShowing()) {
                activityC11351x975a7907.A1.dismiss();
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f154134d);
            activityC11351x975a7907.B1 = false;
            java.util.ArrayList arrayList = this.f154135e;
            arrayList.clear();
            activityC11351x975a7907.o7(arrayList);
        }
    }
}
