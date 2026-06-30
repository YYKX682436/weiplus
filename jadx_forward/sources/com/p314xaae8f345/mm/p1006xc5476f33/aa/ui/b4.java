package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4 f154116f;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4 d4Var, java.lang.String str, java.lang.String str2) {
        this.f154116f = d4Var;
        this.f154114d = str;
        this.f154115e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4 d4Var = this.f154116f;
        if (!d4Var.f154137a) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = d4Var.f154144h;
            activityC11351x975a7907.v7(d4Var.f154138b, d4Var.f154139c, d4Var.f154140d, d4Var.f154141e, d4Var.f154142f, activityC11351x975a7907.H, this.f154114d, this.f154115e);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a79072 = d4Var.f154144h;
        android.content.Context context = d4Var.f154138b;
        java.lang.String str = d4Var.f154139c;
        int i17 = d4Var.f154140d;
        java.lang.String str2 = d4Var.f154141e;
        double d17 = d4Var.f154142f;
        java.util.ArrayList arrayList = d4Var.f154143g;
        java.lang.String str3 = this.f154114d;
        java.lang.String str4 = this.f154115e;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.S1;
        activityC11351x975a79072.v7(context, str, i17, str2, d17, arrayList, str3, str4);
    }
}
