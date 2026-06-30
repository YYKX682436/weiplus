package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f154266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n3 f154267e;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n3 n3Var, android.graphics.Bitmap bitmap) {
        this.f154267e = n3Var;
        this.f154266d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n3 n3Var = this.f154267e;
        android.graphics.Bitmap bitmap = this.f154266d;
        if (bitmap != null) {
            n3Var.f154278a.A.setImageBitmap(bitmap);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = n3Var.f154278a;
        activityC11351x975a7907.f154039l1 = 2;
        activityC11351x975a7907.A.setVisibility(8);
        n3Var.f154278a.f154056y.setVisibility(0);
        n3Var.f154278a.f154059z.setVisibility(0);
    }
}
